// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraft

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AircraftService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftService.list */
class AircraftListPage
private constructor(
    private val service: AircraftService,
    private val params: AircraftListParams,
    private val items: List<AircraftAbridged>,
) : Page<AircraftAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AircraftListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AircraftAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AircraftListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftListPage].
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

    /** A builder for [AircraftListPage]. */
    class Builder internal constructor() {

        private var service: AircraftService? = null
        private var params: AircraftListParams? = null
        private var items: List<AircraftAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftListPage: AircraftListPage) = apply {
            service = aircraftListPage.service
            params = aircraftListPage.params
            items = aircraftListPage.items
        }

        fun service(service: AircraftService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftListPage].
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
        fun build(): AircraftListPage =
            AircraftListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AircraftListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "AircraftListPage{service=$service, params=$params, items=$items}"
}
