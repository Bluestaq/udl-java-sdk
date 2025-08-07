// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SensorServiceAsync.list */
class SensorListPageAsync
private constructor(
    private val service: SensorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorListParams,
    private val items: List<SensorListResponse>,
) : PageAsync<SensorListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SensorListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SensorListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorListPageAsync].
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

    /** A builder for [SensorListPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorListParams? = null
        private var items: List<SensorListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorListPageAsync: SensorListPageAsync) = apply {
            service = sensorListPageAsync.service
            streamHandlerExecutor = sensorListPageAsync.streamHandlerExecutor
            params = sensorListPageAsync.params
            items = sensorListPageAsync.items
        }

        fun service(service: SensorServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SensorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorListPageAsync].
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
        fun build(): SensorListPageAsync =
            SensorListPageAsync(
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

        return /* spotless:off */ other is SensorListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SensorListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
