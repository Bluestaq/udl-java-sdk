// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherreport

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see WeatherReportServiceAsync.list */
class WeatherReportListPageAsync
private constructor(
    private val service: WeatherReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WeatherReportListParams,
    private val items: List<WeatherReportListResponse>,
) : PageAsync<WeatherReportListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): WeatherReportListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<WeatherReportListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WeatherReportListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WeatherReportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<WeatherReportListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WeatherReportListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WeatherReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: WeatherReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WeatherReportListParams? = null
        private var items: List<WeatherReportListResponse>? = null

        @JvmSynthetic
        internal fun from(weatherReportListPageAsync: WeatherReportListPageAsync) = apply {
            service = weatherReportListPageAsync.service
            streamHandlerExecutor = weatherReportListPageAsync.streamHandlerExecutor
            params = weatherReportListPageAsync.params
            items = weatherReportListPageAsync.items
        }

        fun service(service: WeatherReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WeatherReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<WeatherReportListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [WeatherReportListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WeatherReportListPageAsync =
            WeatherReportListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WeatherReportListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "WeatherReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
