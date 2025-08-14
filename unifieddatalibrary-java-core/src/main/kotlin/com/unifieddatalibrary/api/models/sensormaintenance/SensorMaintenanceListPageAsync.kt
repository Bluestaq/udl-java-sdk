// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SensorMaintenanceServiceAsync.list */
class SensorMaintenanceListPageAsync
private constructor(
    private val service: SensorMaintenanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorMaintenanceListParams,
    private val items: List<SensorMaintenanceListResponse>,
) : PageAsync<SensorMaintenanceListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorMaintenanceListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SensorMaintenanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorMaintenanceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SensorMaintenanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorMaintenanceListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SensorMaintenanceListPageAsync].
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

    /** A builder for [SensorMaintenanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorMaintenanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorMaintenanceListParams? = null
        private var items: List<SensorMaintenanceListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorMaintenanceListPageAsync: SensorMaintenanceListPageAsync) = apply {
            service = sensorMaintenanceListPageAsync.service
            streamHandlerExecutor = sensorMaintenanceListPageAsync.streamHandlerExecutor
            params = sensorMaintenanceListPageAsync.params
            items = sensorMaintenanceListPageAsync.items
        }

        fun service(service: SensorMaintenanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SensorMaintenanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorMaintenanceListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorMaintenanceListPageAsync].
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
        fun build(): SensorMaintenanceListPageAsync =
            SensorMaintenanceListPageAsync(
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

        return other is SensorMaintenanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SensorMaintenanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
