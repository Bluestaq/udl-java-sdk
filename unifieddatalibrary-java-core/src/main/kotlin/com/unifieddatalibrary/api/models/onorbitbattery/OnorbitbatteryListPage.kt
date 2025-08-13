// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitbattery

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitbatteryService.list */
class OnorbitbatteryListPage
private constructor(
    private val service: OnorbitbatteryService,
    private val params: OnorbitbatteryListParams,
    private val items: List<OnorbitbatteryListResponse>,
) : Page<OnorbitbatteryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitbatteryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitbatteryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitbatteryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitbatteryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitbatteryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitbatteryListPage].
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

    /** A builder for [OnorbitbatteryListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitbatteryService? = null
        private var params: OnorbitbatteryListParams? = null
        private var items: List<OnorbitbatteryListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitbatteryListPage: OnorbitbatteryListPage) = apply {
            service = onorbitbatteryListPage.service
            params = onorbitbatteryListPage.params
            items = onorbitbatteryListPage.items
        }

        fun service(service: OnorbitbatteryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitbatteryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitbatteryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitbatteryListPage].
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
        fun build(): OnorbitbatteryListPage =
            OnorbitbatteryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitbatteryListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OnorbitbatteryListPage{service=$service, params=$params, items=$items}"
}
