// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListResponse
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SensorObservationTypeService.list */
class SensorObservationTypeListPage private constructor(
    private val service: SensorObservationTypeService,
    private val params: SensorObservationTypeListParams,
    private val items: List<SensorObservationTypeListResponse>,

) : Page<SensorObservationTypeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorObservationTypeListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SensorObservationTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SensorObservationTypeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorObservationTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorObservationTypeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorObservationTypeListPage].
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

    /** A builder for [SensorObservationTypeListPage]. */
    class Builder internal constructor() {

        private var service: SensorObservationTypeService? = null
        private var params: SensorObservationTypeListParams? = null
        private var items: List<SensorObservationTypeListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorObservationTypeListPage: SensorObservationTypeListPage) =
            apply {
                service = sensorObservationTypeListPage.service
                params = sensorObservationTypeListPage.params
                items = sensorObservationTypeListPage.items
            }

        fun service(service: SensorObservationTypeService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SensorObservationTypeListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorObservationTypeListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SensorObservationTypeListPage].
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
        fun build(): SensorObservationTypeListPage =
            SensorObservationTypeListPage(
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

      return /* spotless:off */ other is SensorObservationTypeListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SensorObservationTypeListPage{service=$service, params=$params, items=$items}"
}
