// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.airtaskingorders

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.airoperations.AirTaskingOrderService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirTaskingOrderService.list */
class AirTaskingOrderListPage
private constructor(
    private val service: AirTaskingOrderService,
    private val params: AirTaskingOrderListParams,
    private val items: List<AirtaskingorderAbridged>,
) : Page<AirtaskingorderAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirTaskingOrderListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirTaskingOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirtaskingorderAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirTaskingOrderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirtaskingorderAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirTaskingOrderListPage].
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

    /** A builder for [AirTaskingOrderListPage]. */
    class Builder internal constructor() {

        private var service: AirTaskingOrderService? = null
        private var params: AirTaskingOrderListParams? = null
        private var items: List<AirtaskingorderAbridged>? = null

        @JvmSynthetic
        internal fun from(airTaskingOrderListPage: AirTaskingOrderListPage) = apply {
            service = airTaskingOrderListPage.service
            params = airTaskingOrderListPage.params
            items = airTaskingOrderListPage.items
        }

        fun service(service: AirTaskingOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirTaskingOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirtaskingorderAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirTaskingOrderListPage].
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
        fun build(): AirTaskingOrderListPage =
            AirTaskingOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AirTaskingOrderListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "AirTaskingOrderListPage{service=$service, params=$params, items=$items}"
}
