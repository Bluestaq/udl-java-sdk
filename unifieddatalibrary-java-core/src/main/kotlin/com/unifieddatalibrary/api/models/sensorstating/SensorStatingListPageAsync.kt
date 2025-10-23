// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SensorStatingServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SensorStatingServiceAsync.list */
class SensorStatingListPageAsync
private constructor(
    private val service: SensorStatingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorStatingListParams,
    private val items: List<SensorStatingListResponse>,
) : PageAsync<SensorStatingListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorStatingListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SensorStatingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorStatingListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SensorStatingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorStatingListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorStatingListPageAsync].
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

    /** A builder for [SensorStatingListPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorStatingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorStatingListParams? = null
        private var items: List<SensorStatingListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorStatingListPageAsync: SensorStatingListPageAsync) = apply {
            service = sensorStatingListPageAsync.service
            streamHandlerExecutor = sensorStatingListPageAsync.streamHandlerExecutor
            params = sensorStatingListPageAsync.params
            items = sensorStatingListPageAsync.items
        }

        fun service(service: SensorStatingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SensorStatingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorStatingListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorStatingListPageAsync].
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
        fun build(): SensorStatingListPageAsync =
            SensorStatingListPageAsync(
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

        return other is SensorStatingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SensorStatingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
