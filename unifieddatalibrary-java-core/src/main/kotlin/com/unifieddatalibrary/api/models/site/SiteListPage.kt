// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.site.SiteListParams
import com.unifieddatalibrary.api.models.site.SiteListResponse
import com.unifieddatalibrary.api.services.blocking.SiteService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SiteService.list */
class SiteListPage private constructor(
    private val service: SiteService,
    private val params: SiteListParams,
    private val items: List<SiteListResponse>,

) : Page<SiteListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SiteListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SiteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SiteListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SiteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SiteListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SiteListPage].
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

    /** A builder for [SiteListPage]. */
    class Builder internal constructor() {

        private var service: SiteService? = null
        private var params: SiteListParams? = null
        private var items: List<SiteListResponse>? = null

        @JvmSynthetic
        internal fun from(siteListPage: SiteListPage) =
            apply {
                service = siteListPage.service
                params = siteListPage.params
                items = siteListPage.items
            }

        fun service(service: SiteService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SiteListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SiteListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SiteListPage].
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
        fun build(): SiteListPage =
            SiteListPage(
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

      return /* spotless:off */ other is SiteListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SiteListPage{service=$service, params=$params, items=$items}"
}
