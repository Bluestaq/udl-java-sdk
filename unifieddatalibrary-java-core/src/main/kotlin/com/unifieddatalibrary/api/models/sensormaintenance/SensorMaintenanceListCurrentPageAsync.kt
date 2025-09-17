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

/** @see SensorMaintenanceServiceAsync.listCurrent */
class SensorMaintenanceListCurrentPageAsync
private constructor(
    private val service: SensorMaintenanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorMaintenanceListCurrentParams,
    private val items: List<SensorMaintenanceListCurrentResponse>,
) : PageAsync<SensorMaintenanceListCurrentResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorMaintenanceListCurrentParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SensorMaintenanceListCurrentPageAsync> =
        service.listCurrent(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorMaintenanceListCurrentResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SensorMaintenanceListCurrentParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorMaintenanceListCurrentResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SensorMaintenanceListCurrentPageAsync].
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

    /** A builder for [SensorMaintenanceListCurrentPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorMaintenanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorMaintenanceListCurrentParams? = null
        private var items: List<SensorMaintenanceListCurrentResponse>? = null

        @JvmSynthetic
        internal fun from(
            sensorMaintenanceListCurrentPageAsync: SensorMaintenanceListCurrentPageAsync
        ) = apply {
            service = sensorMaintenanceListCurrentPageAsync.service
            streamHandlerExecutor = sensorMaintenanceListCurrentPageAsync.streamHandlerExecutor
            params = sensorMaintenanceListCurrentPageAsync.params
            items = sensorMaintenanceListCurrentPageAsync.items
        }

        fun service(service: SensorMaintenanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SensorMaintenanceListCurrentParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorMaintenanceListCurrentResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorMaintenanceListCurrentPageAsync].
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
        fun build(): SensorMaintenanceListCurrentPageAsync =
            SensorMaintenanceListCurrentPageAsync(
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

        return other is SensorMaintenanceListCurrentPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SensorMaintenanceListCurrentPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
