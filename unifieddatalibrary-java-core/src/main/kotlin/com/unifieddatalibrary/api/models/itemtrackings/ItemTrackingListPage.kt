// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ItemTrackingService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ItemTrackingService.list */
class ItemTrackingListPage
private constructor(
    private val service: ItemTrackingService,
    private val params: ItemTrackingListParams,
    private val items: List<ItemTrackingListResponse>,
) : Page<ItemTrackingListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ItemTrackingListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ItemTrackingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ItemTrackingListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ItemTrackingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ItemTrackingListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemTrackingListPage].
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

    /** A builder for [ItemTrackingListPage]. */
    class Builder internal constructor() {

        private var service: ItemTrackingService? = null
        private var params: ItemTrackingListParams? = null
        private var items: List<ItemTrackingListResponse>? = null

        @JvmSynthetic
        internal fun from(itemTrackingListPage: ItemTrackingListPage) = apply {
            service = itemTrackingListPage.service
            params = itemTrackingListPage.params
            items = itemTrackingListPage.items
        }

        fun service(service: ItemTrackingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ItemTrackingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ItemTrackingListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ItemTrackingListPage].
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
        fun build(): ItemTrackingListPage =
            ItemTrackingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemTrackingListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "ItemTrackingListPage{service=$service, params=$params, items=$items}"
}
