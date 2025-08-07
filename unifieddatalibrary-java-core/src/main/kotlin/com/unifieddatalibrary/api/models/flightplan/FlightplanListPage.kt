// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.flightplan

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.FlightplanService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see FlightplanService.list */
class FlightplanListPage
private constructor(
    private val service: FlightplanService,
    private val params: FlightplanListParams,
    private val items: List<FlightPlanAbridged>,
) : Page<FlightPlanAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FlightplanListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): FlightplanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FlightPlanAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FlightplanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FlightPlanAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FlightplanListPage].
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

    /** A builder for [FlightplanListPage]. */
    class Builder internal constructor() {

        private var service: FlightplanService? = null
        private var params: FlightplanListParams? = null
        private var items: List<FlightPlanAbridged>? = null

        @JvmSynthetic
        internal fun from(flightplanListPage: FlightplanListPage) = apply {
            service = flightplanListPage.service
            params = flightplanListPage.params
            items = flightplanListPage.items
        }

        fun service(service: FlightplanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FlightplanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FlightPlanAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [FlightplanListPage].
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
        fun build(): FlightplanListPage =
            FlightplanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FlightplanListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "FlightplanListPage{service=$service, params=$params, items=$items}"
}
