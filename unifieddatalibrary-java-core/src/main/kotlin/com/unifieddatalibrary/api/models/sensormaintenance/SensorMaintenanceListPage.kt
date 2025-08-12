// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListResponse
import com.unifieddatalibrary.api.services.blocking.SensorMaintenanceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SensorMaintenanceService.list */
class SensorMaintenanceListPage private constructor(
    private val service: SensorMaintenanceService,
    private val params: SensorMaintenanceListParams,
    private val items: List<SensorMaintenanceListResponse>,

) : Page<SensorMaintenanceListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorMaintenanceListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SensorMaintenanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SensorMaintenanceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorMaintenanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorMaintenanceListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorMaintenanceListPage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SensorMaintenanceListPage]. */
    class Builder internal constructor() {

        private var service: SensorMaintenanceService? = null
        private var params: SensorMaintenanceListParams? = null
        private var items: List<SensorMaintenanceListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorMaintenanceListPage: SensorMaintenanceListPage) =
            apply {
                service = sensorMaintenanceListPage.service
                params = sensorMaintenanceListPage.params
                items = sensorMaintenanceListPage.items
            }

        fun service(service: SensorMaintenanceService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SensorMaintenanceListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorMaintenanceListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SensorMaintenanceListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SensorMaintenanceListPage =
            SensorMaintenanceListPage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "items", items
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SensorMaintenanceListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SensorMaintenanceListPage{service=$service, params=$params, items=$items}"
}
