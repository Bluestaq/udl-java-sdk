// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airspacecontrolorders

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirspaceControlOrderService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirspaceControlOrderService.list */
class AirspaceControlOrderListPage
private constructor(
    private val service: AirspaceControlOrderService,
    private val params: AirspaceControlOrderListParams,
    private val items: List<AirspacecontrolorderAbridged>,
) : Page<AirspacecontrolorderAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirspaceControlOrderListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirspaceControlOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirspacecontrolorderAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirspaceControlOrderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirspacecontrolorderAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirspaceControlOrderListPage].
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

    /** A builder for [AirspaceControlOrderListPage]. */
    class Builder internal constructor() {

        private var service: AirspaceControlOrderService? = null
        private var params: AirspaceControlOrderListParams? = null
        private var items: List<AirspacecontrolorderAbridged>? = null

        @JvmSynthetic
        internal fun from(airspaceControlOrderListPage: AirspaceControlOrderListPage) = apply {
            service = airspaceControlOrderListPage.service
            params = airspaceControlOrderListPage.params
            items = airspaceControlOrderListPage.items
        }

        fun service(service: AirspaceControlOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirspaceControlOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirspacecontrolorderAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirspaceControlOrderListPage].
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
        fun build(): AirspaceControlOrderListPage =
            AirspaceControlOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AirspaceControlOrderListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "AirspaceControlOrderListPage{service=$service, params=$params, items=$items}"
}
