// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.TrackRouteService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see TrackRouteService.list */
class TrackRouteListPage
private constructor(
    private val service: TrackRouteService,
    private val params: TrackRouteListParams,
    private val items: List<TrackRouteListResponse>,
) : Page<TrackRouteListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackRouteListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): TrackRouteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TrackRouteListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrackRouteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TrackRouteListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackRouteListPage].
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

    /** A builder for [TrackRouteListPage]. */
    class Builder internal constructor() {

        private var service: TrackRouteService? = null
        private var params: TrackRouteListParams? = null
        private var items: List<TrackRouteListResponse>? = null

        @JvmSynthetic
        internal fun from(trackRouteListPage: TrackRouteListPage) = apply {
            service = trackRouteListPage.service
            params = trackRouteListPage.params
            items = trackRouteListPage.items
        }

        fun service(service: TrackRouteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrackRouteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TrackRouteListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TrackRouteListPage].
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
        fun build(): TrackRouteListPage =
            TrackRouteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackRouteListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "TrackRouteListPage{service=$service, params=$params, items=$items}"
}
