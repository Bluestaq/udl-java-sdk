// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.StarCatalogService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see StarCatalogService.list */
class StarCatalogListPage
private constructor(
    private val service: StarCatalogService,
    private val params: StarCatalogListParams,
    private val items: List<StarCatalogListResponse>,
) : Page<StarCatalogListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StarCatalogListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): StarCatalogListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StarCatalogListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StarCatalogListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StarCatalogListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StarCatalogListPage].
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

    /** A builder for [StarCatalogListPage]. */
    class Builder internal constructor() {

        private var service: StarCatalogService? = null
        private var params: StarCatalogListParams? = null
        private var items: List<StarCatalogListResponse>? = null

        @JvmSynthetic
        internal fun from(starCatalogListPage: StarCatalogListPage) = apply {
            service = starCatalogListPage.service
            params = starCatalogListPage.params
            items = starCatalogListPage.items
        }

        fun service(service: StarCatalogService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StarCatalogListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StarCatalogListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StarCatalogListPage].
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
        fun build(): StarCatalogListPage =
            StarCatalogListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StarCatalogListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "StarCatalogListPage{service=$service, params=$params, items=$items}"
}
