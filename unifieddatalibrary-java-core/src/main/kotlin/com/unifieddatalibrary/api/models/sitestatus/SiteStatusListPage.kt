// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sitestatus

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SiteStatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SiteStatusService.list */
class SiteStatusListPage
private constructor(
    private val service: SiteStatusService,
    private val params: SiteStatusListParams,
    private val items: List<SiteStatusListResponse>,
) : Page<SiteStatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SiteStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SiteStatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SiteStatusListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SiteStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SiteStatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SiteStatusListPage].
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

    /** A builder for [SiteStatusListPage]. */
    class Builder internal constructor() {

        private var service: SiteStatusService? = null
        private var params: SiteStatusListParams? = null
        private var items: List<SiteStatusListResponse>? = null

        @JvmSynthetic
        internal fun from(siteStatusListPage: SiteStatusListPage) = apply {
            service = siteStatusListPage.service
            params = siteStatusListPage.params
            items = siteStatusListPage.items
        }

        fun service(service: SiteStatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SiteStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SiteStatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SiteStatusListPage].
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
        fun build(): SiteStatusListPage =
            SiteStatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SiteStatusListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SiteStatusListPage{service=$service, params=$params, items=$items}"
}
