// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatuses

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AircraftStatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftStatusService.list */
class AircraftStatusListPage
private constructor(
    private val service: AircraftStatusService,
    private val params: AircraftStatusListParams,
    private val items: List<AircraftstatusAbridged>,
) : Page<AircraftstatusAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AircraftStatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AircraftstatusAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AircraftStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftstatusAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftStatusListPage].
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

    /** A builder for [AircraftStatusListPage]. */
    class Builder internal constructor() {

        private var service: AircraftStatusService? = null
        private var params: AircraftStatusListParams? = null
        private var items: List<AircraftstatusAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftStatusListPage: AircraftStatusListPage) = apply {
            service = aircraftStatusListPage.service
            params = aircraftStatusListPage.params
            items = aircraftStatusListPage.items
        }

        fun service(service: AircraftStatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftstatusAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftStatusListPage].
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
        fun build(): AircraftStatusListPage =
            AircraftStatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AircraftStatusListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AircraftStatusListPage{service=$service, params=$params, items=$items}"
}
