// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SensorMaintenanceService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SensorMaintenanceService.listCurrent */
class SensorMaintenanceListCurrentPage
private constructor(
    private val service: SensorMaintenanceService,
    private val params: SensorMaintenanceListCurrentParams,
    private val items: List<SensorMaintenanceListCurrentResponse>,
) : Page<SensorMaintenanceListCurrentResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorMaintenanceListCurrentParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SensorMaintenanceListCurrentPage =
        service.listCurrent(nextPageParams())

    fun autoPager(): AutoPager<SensorMaintenanceListCurrentResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorMaintenanceListCurrentParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorMaintenanceListCurrentResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SensorMaintenanceListCurrentPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SensorMaintenanceListCurrentPage]. */
    class Builder internal constructor() {

        private var service: SensorMaintenanceService? = null
        private var params: SensorMaintenanceListCurrentParams? = null
        private var items: List<SensorMaintenanceListCurrentResponse>? = null

        @JvmSynthetic
        internal fun from(sensorMaintenanceListCurrentPage: SensorMaintenanceListCurrentPage) =
            apply {
                service = sensorMaintenanceListCurrentPage.service
                params = sensorMaintenanceListCurrentPage.params
                items = sensorMaintenanceListCurrentPage.items
            }

        fun service(service: SensorMaintenanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SensorMaintenanceListCurrentParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorMaintenanceListCurrentResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorMaintenanceListCurrentPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SensorMaintenanceListCurrentPage =
            SensorMaintenanceListCurrentPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorMaintenanceListCurrentPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "SensorMaintenanceListCurrentPage{service=$service, params=$params, items=$items}"
}
