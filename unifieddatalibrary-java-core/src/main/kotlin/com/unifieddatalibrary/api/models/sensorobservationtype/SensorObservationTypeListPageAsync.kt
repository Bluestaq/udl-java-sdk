// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SensorObservationTypeServiceAsync.list */
class SensorObservationTypeListPageAsync
private constructor(
    private val service: SensorObservationTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorObservationTypeListParams,
    private val items: List<SensorObservationTypeListResponse>,
) : PageAsync<SensorObservationTypeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorObservationTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SensorObservationTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorObservationTypeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SensorObservationTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorObservationTypeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SensorObservationTypeListPageAsync].
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

    /** A builder for [SensorObservationTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorObservationTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorObservationTypeListParams? = null
        private var items: List<SensorObservationTypeListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorObservationTypeListPageAsync: SensorObservationTypeListPageAsync) =
            apply {
                service = sensorObservationTypeListPageAsync.service
                streamHandlerExecutor = sensorObservationTypeListPageAsync.streamHandlerExecutor
                params = sensorObservationTypeListPageAsync.params
                items = sensorObservationTypeListPageAsync.items
            }

        fun service(service: SensorObservationTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SensorObservationTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorObservationTypeListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorObservationTypeListPageAsync].
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
        fun build(): SensorObservationTypeListPageAsync =
            SensorObservationTypeListPageAsync(
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

        return /* spotless:off */ other is SensorObservationTypeListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SensorObservationTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
