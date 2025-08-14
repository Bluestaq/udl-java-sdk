// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatusremarks

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftStatusRemarkService.list */
class AircraftStatusRemarkListPage
private constructor(
    private val service: AircraftStatusRemarkService,
    private val params: AircraftStatusRemarkListParams,
    private val items: List<AircraftstatusremarkAbridged>,
) : Page<AircraftstatusremarkAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftStatusRemarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AircraftStatusRemarkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AircraftstatusremarkAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AircraftStatusRemarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftstatusremarkAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftStatusRemarkListPage].
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

    /** A builder for [AircraftStatusRemarkListPage]. */
    class Builder internal constructor() {

        private var service: AircraftStatusRemarkService? = null
        private var params: AircraftStatusRemarkListParams? = null
        private var items: List<AircraftstatusremarkAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftStatusRemarkListPage: AircraftStatusRemarkListPage) = apply {
            service = aircraftStatusRemarkListPage.service
            params = aircraftStatusRemarkListPage.params
            items = aircraftStatusRemarkListPage.items
        }

        fun service(service: AircraftStatusRemarkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftStatusRemarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftstatusremarkAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftStatusRemarkListPage].
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
        fun build(): AircraftStatusRemarkListPage =
            AircraftStatusRemarkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AircraftStatusRemarkListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AircraftStatusRemarkListPage{service=$service, params=$params, items=$items}"
}
