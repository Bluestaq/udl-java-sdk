// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batterydetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.BatterydetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see BatterydetailService.list */
class BatterydetailListPage
private constructor(
    private val service: BatterydetailService,
    private val params: BatterydetailListParams,
    private val items: List<BatterydetailsAbridged>,
) : Page<BatterydetailsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BatterydetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): BatterydetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BatterydetailsAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BatterydetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BatterydetailsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatterydetailListPage].
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

    /** A builder for [BatterydetailListPage]. */
    class Builder internal constructor() {

        private var service: BatterydetailService? = null
        private var params: BatterydetailListParams? = null
        private var items: List<BatterydetailsAbridged>? = null

        @JvmSynthetic
        internal fun from(batterydetailListPage: BatterydetailListPage) = apply {
            service = batterydetailListPage.service
            params = batterydetailListPage.params
            items = batterydetailListPage.items
        }

        fun service(service: BatterydetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BatterydetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BatterydetailsAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BatterydetailListPage].
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
        fun build(): BatterydetailListPage =
            BatterydetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatterydetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "BatterydetailListPage{service=$service, params=$params, items=$items}"
}
