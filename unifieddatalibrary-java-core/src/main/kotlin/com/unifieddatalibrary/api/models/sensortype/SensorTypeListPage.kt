// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensortype

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListResponse
import com.unifieddatalibrary.api.services.blocking.SensorTypeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SensorTypeService.list */
class SensorTypeListPage private constructor(
    private val service: SensorTypeService,
    private val params: SensorTypeListParams,
    private val items: List<SensorTypeListResponse>,

) : Page<SensorTypeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorTypeListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SensorTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SensorTypeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorTypeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorTypeListPage].
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

    /** A builder for [SensorTypeListPage]. */
    class Builder internal constructor() {

        private var service: SensorTypeService? = null
        private var params: SensorTypeListParams? = null
        private var items: List<SensorTypeListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorTypeListPage: SensorTypeListPage) =
            apply {
                service = sensorTypeListPage.service
                params = sensorTypeListPage.params
                items = sensorTypeListPage.items
            }

        fun service(service: SensorTypeService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SensorTypeListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorTypeListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SensorTypeListPage].
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
        fun build(): SensorTypeListPage =
            SensorTypeListPage(
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

      return /* spotless:off */ other is SensorTypeListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SensorTypeListPage{service=$service, params=$params, items=$items}"
}
