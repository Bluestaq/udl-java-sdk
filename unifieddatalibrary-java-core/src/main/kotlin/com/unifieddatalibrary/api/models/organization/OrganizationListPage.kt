// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OrganizationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OrganizationService.list */
class OrganizationListPage
private constructor(
    private val service: OrganizationService,
    private val params: OrganizationListParams,
    private val items: List<OrganizationListResponse>,
) : Page<OrganizationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrganizationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OrganizationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OrganizationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OrganizationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrganizationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationListPage].
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

    /** A builder for [OrganizationListPage]. */
    class Builder internal constructor() {

        private var service: OrganizationService? = null
        private var params: OrganizationListParams? = null
        private var items: List<OrganizationListResponse>? = null

        @JvmSynthetic
        internal fun from(organizationListPage: OrganizationListPage) = apply {
            service = organizationListPage.service
            params = organizationListPage.params
            items = organizationListPage.items
        }

        fun service(service: OrganizationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OrganizationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OrganizationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OrganizationListPage].
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
        fun build(): OrganizationListPage =
            OrganizationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OrganizationListPage{service=$service, params=$params, items=$items}"
}
