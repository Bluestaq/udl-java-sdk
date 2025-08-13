// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.BatteryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see BatteryService.list */
class BatteryListPage
private constructor(
    private val service: BatteryService,
    private val params: BatteryListParams,
    private val items: List<BatteryAbridged>,
) : Page<BatteryAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BatteryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): BatteryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BatteryAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BatteryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BatteryAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatteryListPage].
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

    /** A builder for [BatteryListPage]. */
    class Builder internal constructor() {

        private var service: BatteryService? = null
        private var params: BatteryListParams? = null
        private var items: List<BatteryAbridged>? = null

        @JvmSynthetic
        internal fun from(batteryListPage: BatteryListPage) = apply {
            service = batteryListPage.service
            params = batteryListPage.params
            items = batteryListPage.items
        }

        fun service(service: BatteryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BatteryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BatteryAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BatteryListPage].
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
        fun build(): BatteryListPage =
            BatteryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatteryListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "BatteryListPage{service=$service, params=$params, items=$items}"
}
