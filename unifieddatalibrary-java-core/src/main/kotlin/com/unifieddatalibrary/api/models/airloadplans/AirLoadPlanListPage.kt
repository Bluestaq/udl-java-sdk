// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airloadplans

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirloadPlanService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirloadPlanService.list */
class AirloadPlanListPage
private constructor(
    private val service: AirloadPlanService,
    private val params: AirloadPlanListParams,
    private val items: List<AirloadplanAbridged>,
) : Page<AirloadplanAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirloadPlanListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirloadPlanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirloadplanAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirloadPlanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirloadplanAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirloadPlanListPage].
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

    /** A builder for [AirloadPlanListPage]. */
    class Builder internal constructor() {

        private var service: AirloadPlanService? = null
        private var params: AirloadPlanListParams? = null
        private var items: List<AirloadplanAbridged>? = null

        @JvmSynthetic
        internal fun from(airloadPlanListPage: AirloadPlanListPage) = apply {
            service = airloadPlanListPage.service
            params = airloadPlanListPage.params
            items = airloadPlanListPage.items
        }

        fun service(service: AirloadPlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirloadPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirloadplanAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirloadPlanListPage].
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
        fun build(): AirloadPlanListPage =
            AirloadPlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AirloadPlanListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AirloadPlanListPage{service=$service, params=$params, items=$items}"
}
