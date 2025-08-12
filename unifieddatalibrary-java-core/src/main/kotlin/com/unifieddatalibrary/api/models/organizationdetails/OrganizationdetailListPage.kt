// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organizationdetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListResponse
import com.unifieddatalibrary.api.services.blocking.OrganizationdetailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see OrganizationdetailService.list */
class OrganizationdetailListPage private constructor(
    private val service: OrganizationdetailService,
    private val params: OrganizationdetailListParams,
    private val items: List<OrganizationdetailListResponse>,

) : Page<OrganizationdetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrganizationdetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): OrganizationdetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OrganizationdetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OrganizationdetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrganizationdetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationdetailListPage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [OrganizationdetailListPage]. */
    class Builder internal constructor() {

        private var service: OrganizationdetailService? = null
        private var params: OrganizationdetailListParams? = null
        private var items: List<OrganizationdetailListResponse>? = null

        @JvmSynthetic
        internal fun from(organizationdetailListPage: OrganizationdetailListPage) =
            apply {
                service = organizationdetailListPage.service
                params = organizationdetailListPage.params
                items = organizationdetailListPage.items
            }

        fun service(service: OrganizationdetailService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: OrganizationdetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OrganizationdetailListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OrganizationdetailListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationdetailListPage =
            OrganizationdetailListPage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "items", items
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is OrganizationdetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OrganizationdetailListPage{service=$service, params=$params, items=$items}"
}
