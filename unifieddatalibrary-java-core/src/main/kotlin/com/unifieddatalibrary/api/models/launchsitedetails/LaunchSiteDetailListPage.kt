// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListResponse
import com.unifieddatalibrary.api.services.blocking.LaunchSiteDetailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchSiteDetailService.list */
class LaunchSiteDetailListPage private constructor(
    private val service: LaunchSiteDetailService,
    private val params: LaunchSiteDetailListParams,
    private val items: List<LaunchSiteDetailListResponse>,

) : Page<LaunchSiteDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchSiteDetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): LaunchSiteDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaunchSiteDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaunchSiteDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchSiteDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchSiteDetailListPage].
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

    /** A builder for [LaunchSiteDetailListPage]. */
    class Builder internal constructor() {

        private var service: LaunchSiteDetailService? = null
        private var params: LaunchSiteDetailListParams? = null
        private var items: List<LaunchSiteDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(launchSiteDetailListPage: LaunchSiteDetailListPage) =
            apply {
                service = launchSiteDetailListPage.service
                params = launchSiteDetailListPage.params
                items = launchSiteDetailListPage.items
            }

        fun service(service: LaunchSiteDetailService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchSiteDetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchSiteDetailListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [LaunchSiteDetailListPage].
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
        fun build(): LaunchSiteDetailListPage =
            LaunchSiteDetailListPage(
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

      return /* spotless:off */ other is LaunchSiteDetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "LaunchSiteDetailListPage{service=$service, params=$params, items=$items}"
}
