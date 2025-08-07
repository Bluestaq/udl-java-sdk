// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airloadplans

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirLoadPlanService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirLoadPlanService.list */
class AirLoadPlanListPage
private constructor(
    private val service: AirLoadPlanService,
    private val params: AirLoadPlanListParams,
    private val items: List<AirloadplanAbridged>,
) : Page<AirloadplanAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirLoadPlanListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirLoadPlanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirloadplanAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirLoadPlanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirloadplanAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirLoadPlanListPage].
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

    /** A builder for [AirLoadPlanListPage]. */
    class Builder internal constructor() {

        private var service: AirLoadPlanService? = null
        private var params: AirLoadPlanListParams? = null
        private var items: List<AirloadplanAbridged>? = null

        @JvmSynthetic
        internal fun from(airLoadPlanListPage: AirLoadPlanListPage) = apply {
            service = airLoadPlanListPage.service
            params = airLoadPlanListPage.params
            items = airLoadPlanListPage.items
        }

        fun service(service: AirLoadPlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirLoadPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirloadplanAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirLoadPlanListPage].
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
        fun build(): AirLoadPlanListPage =
            AirLoadPlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AirLoadPlanListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AirLoadPlanListPage{service=$service, params=$params, items=$items}"
}
