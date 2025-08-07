// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.item

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ItemService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ItemService.list */
class ItemListPage
private constructor(
    private val service: ItemService,
    private val params: ItemListParams,
    private val items: List<ItemListResponse>,
) : Page<ItemListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ItemListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ItemListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ItemListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemListPage].
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

    /** A builder for [ItemListPage]. */
    class Builder internal constructor() {

        private var service: ItemService? = null
        private var params: ItemListParams? = null
        private var items: List<ItemListResponse>? = null

        @JvmSynthetic
        internal fun from(itemListPage: ItemListPage) = apply {
            service = itemListPage.service
            params = itemListPage.params
            items = itemListPage.items
        }

        fun service(service: ItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ItemListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ItemListPage].
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
        fun build(): ItemListPage =
            ItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "ItemListPage{service=$service, params=$params, items=$items}"
}
