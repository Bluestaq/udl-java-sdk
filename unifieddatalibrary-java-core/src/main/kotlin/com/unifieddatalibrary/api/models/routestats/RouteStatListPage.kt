// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.RouteStatService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see RouteStatService.list */
class RouteStatListPage
private constructor(
    private val service: RouteStatService,
    private val params: RouteStatListParams,
    private val items: List<RouteStatListResponse>,
) : Page<RouteStatListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RouteStatListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): RouteStatListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RouteStatListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RouteStatListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RouteStatListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RouteStatListPage].
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

    /** A builder for [RouteStatListPage]. */
    class Builder internal constructor() {

        private var service: RouteStatService? = null
        private var params: RouteStatListParams? = null
        private var items: List<RouteStatListResponse>? = null

        @JvmSynthetic
        internal fun from(routeStatListPage: RouteStatListPage) = apply {
            service = routeStatListPage.service
            params = routeStatListPage.params
            items = routeStatListPage.items
        }

        fun service(service: RouteStatService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RouteStatListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RouteStatListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RouteStatListPage].
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
        fun build(): RouteStatListPage =
            RouteStatListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RouteStatListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "RouteStatListPage{service=$service, params=$params, items=$items}"
}
