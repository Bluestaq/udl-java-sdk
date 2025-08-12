// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslots

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldslotAbridged
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldSlotService.list */
class AirfieldSlotListPage private constructor(
    private val service: AirfieldSlotService,
    private val params: AirfieldSlotListParams,
    private val items: List<AirfieldslotAbridged>,

) : Page<AirfieldslotAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldSlotListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): AirfieldSlotListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirfieldslotAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldSlotListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldslotAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirfieldSlotListPage].
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

    /** A builder for [AirfieldSlotListPage]. */
    class Builder internal constructor() {

        private var service: AirfieldSlotService? = null
        private var params: AirfieldSlotListParams? = null
        private var items: List<AirfieldslotAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldSlotListPage: AirfieldSlotListPage) =
            apply {
                service = airfieldSlotListPage.service
                params = airfieldSlotListPage.params
                items = airfieldSlotListPage.items
            }

        fun service(service: AirfieldSlotService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldSlotListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldslotAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AirfieldSlotListPage].
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
        fun build(): AirfieldSlotListPage =
            AirfieldSlotListPage(
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

      return /* spotless:off */ other is AirfieldSlotListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AirfieldSlotListPage{service=$service, params=$params, items=$items}"
}
