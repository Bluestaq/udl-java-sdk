// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararraydetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SolarArrayDetailServiceAsync.list */
class SolarArrayDetailListPageAsync
private constructor(
    private val service: SolarArrayDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SolarArrayDetailListParams,
    private val items: List<SolarArrayDetailListResponse>,
) : PageAsync<SolarArrayDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SolarArrayDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SolarArrayDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SolarArrayDetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SolarArrayDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SolarArrayDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SolarArrayDetailListPageAsync].
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

    /** A builder for [SolarArrayDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: SolarArrayDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SolarArrayDetailListParams? = null
        private var items: List<SolarArrayDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(solarArrayDetailListPageAsync: SolarArrayDetailListPageAsync) = apply {
            service = solarArrayDetailListPageAsync.service
            streamHandlerExecutor = solarArrayDetailListPageAsync.streamHandlerExecutor
            params = solarArrayDetailListPageAsync.params
            items = solarArrayDetailListPageAsync.items
        }

        fun service(service: SolarArrayDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SolarArrayDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SolarArrayDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SolarArrayDetailListPageAsync].
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
        fun build(): SolarArrayDetailListPageAsync =
            SolarArrayDetailListPageAsync(
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

        return /* spotless:off */ other is SolarArrayDetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SolarArrayDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
