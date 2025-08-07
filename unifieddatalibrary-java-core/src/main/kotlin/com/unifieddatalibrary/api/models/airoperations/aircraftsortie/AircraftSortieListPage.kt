// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.aircraftsortie

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.airoperations.AircraftSortieService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftSortieService.list */
class AircraftSortieListPage
private constructor(
    private val service: AircraftSortieService,
    private val params: AircraftSortieListParams,
    private val items: List<AircraftsortieAbridged>,
) : Page<AircraftsortieAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftSortieListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AircraftSortieListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AircraftsortieAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AircraftSortieListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftsortieAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftSortieListPage].
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

    /** A builder for [AircraftSortieListPage]. */
    class Builder internal constructor() {

        private var service: AircraftSortieService? = null
        private var params: AircraftSortieListParams? = null
        private var items: List<AircraftsortieAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftSortieListPage: AircraftSortieListPage) = apply {
            service = aircraftSortieListPage.service
            params = aircraftSortieListPage.params
            items = aircraftSortieListPage.items
        }

        fun service(service: AircraftSortieService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftSortieListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftsortieAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftSortieListPage].
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
        fun build(): AircraftSortieListPage =
            AircraftSortieListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AircraftSortieListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "AircraftSortieListPage{service=$service, params=$params, items=$items}"
}
