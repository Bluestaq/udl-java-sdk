// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.CollectResponseService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see CollectResponseService.list */
class CollectResponseListPage
private constructor(
    private val service: CollectResponseService,
    private val params: CollectResponseListParams,
    private val items: List<CollectResponseAbridged>,
) : Page<CollectResponseAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CollectResponseListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CollectResponseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CollectResponseAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CollectResponseListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CollectResponseAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CollectResponseListPage].
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

    /** A builder for [CollectResponseListPage]. */
    class Builder internal constructor() {

        private var service: CollectResponseService? = null
        private var params: CollectResponseListParams? = null
        private var items: List<CollectResponseAbridged>? = null

        @JvmSynthetic
        internal fun from(collectResponseListPage: CollectResponseListPage) = apply {
            service = collectResponseListPage.service
            params = collectResponseListPage.params
            items = collectResponseListPage.items
        }

        fun service(service: CollectResponseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CollectResponseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CollectResponseAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CollectResponseListPage].
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
        fun build(): CollectResponseListPage =
            CollectResponseListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectResponseListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "CollectResponseListPage{service=$service, params=$params, items=$items}"
}
