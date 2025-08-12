// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.aircraftsorties

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftsortieAbridged
import com.unifieddatalibrary.api.services.blocking.airoperations.AircraftSortyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftSortyService.list */
class AircraftSortyListPage private constructor(
    private val service: AircraftSortyService,
    private val params: AircraftSortyListParams,
    private val items: List<AircraftsortieAbridged>,

) : Page<AircraftsortieAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftSortyListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): AircraftSortyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AircraftsortieAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AircraftSortyListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftsortieAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftSortyListPage].
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

    /** A builder for [AircraftSortyListPage]. */
    class Builder internal constructor() {

        private var service: AircraftSortyService? = null
        private var params: AircraftSortyListParams? = null
        private var items: List<AircraftsortieAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftSortyListPage: AircraftSortyListPage) =
            apply {
                service = aircraftSortyListPage.service
                params = aircraftSortyListPage.params
                items = aircraftSortyListPage.items
            }

        fun service(service: AircraftSortyService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftSortyListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftsortieAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AircraftSortyListPage].
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
        fun build(): AircraftSortyListPage =
            AircraftSortyListPage(
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

      return /* spotless:off */ other is AircraftSortyListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AircraftSortyListPage{service=$service, params=$params, items=$items}"
}
