// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SiteRemarkService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SiteRemarkService.list */
class SiteRemarkListPage
private constructor(
    private val service: SiteRemarkService,
    private val params: SiteRemarkListParams,
    private val items: List<SiteRemarkListResponse>,
) : Page<SiteRemarkListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SiteRemarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SiteRemarkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SiteRemarkListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SiteRemarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SiteRemarkListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SiteRemarkListPage].
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

    /** A builder for [SiteRemarkListPage]. */
    class Builder internal constructor() {

        private var service: SiteRemarkService? = null
        private var params: SiteRemarkListParams? = null
        private var items: List<SiteRemarkListResponse>? = null

        @JvmSynthetic
        internal fun from(siteRemarkListPage: SiteRemarkListPage) = apply {
            service = siteRemarkListPage.service
            params = siteRemarkListPage.params
            items = siteRemarkListPage.items
        }

        fun service(service: SiteRemarkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SiteRemarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SiteRemarkListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SiteRemarkListPage].
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
        fun build(): SiteRemarkListPage =
            SiteRemarkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SiteRemarkListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SiteRemarkListPage{service=$service, params=$params, items=$items}"
}
