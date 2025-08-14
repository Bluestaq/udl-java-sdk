// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airtransportmissions

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirTransportMissionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirTransportMissionService.list */
class AirTransportMissionListPage
private constructor(
    private val service: AirTransportMissionService,
    private val params: AirTransportMissionListParams,
    private val items: List<AirTransportMissionAbridged>,
) : Page<AirTransportMissionAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirTransportMissionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirTransportMissionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirTransportMissionAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirTransportMissionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirTransportMissionAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirTransportMissionListPage].
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

    /** A builder for [AirTransportMissionListPage]. */
    class Builder internal constructor() {

        private var service: AirTransportMissionService? = null
        private var params: AirTransportMissionListParams? = null
        private var items: List<AirTransportMissionAbridged>? = null

        @JvmSynthetic
        internal fun from(airTransportMissionListPage: AirTransportMissionListPage) = apply {
            service = airTransportMissionListPage.service
            params = airTransportMissionListPage.params
            items = airTransportMissionListPage.items
        }

        fun service(service: AirTransportMissionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirTransportMissionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirTransportMissionAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirTransportMissionListPage].
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
        fun build(): AirTransportMissionListPage =
            AirTransportMissionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirTransportMissionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AirTransportMissionListPage{service=$service, params=$params, items=$items}"
}
