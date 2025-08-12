// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.navigation.NavigationListParams
import com.unifieddatalibrary.api.models.navigation.NavigationListResponse
import com.unifieddatalibrary.api.services.blocking.NavigationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see NavigationService.list */
class NavigationListPage private constructor(
    private val service: NavigationService,
    private val params: NavigationListParams,
    private val items: List<NavigationListResponse>,

) : Page<NavigationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): NavigationListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): NavigationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NavigationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NavigationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<NavigationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NavigationListPage].
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

    /** A builder for [NavigationListPage]. */
    class Builder internal constructor() {

        private var service: NavigationService? = null
        private var params: NavigationListParams? = null
        private var items: List<NavigationListResponse>? = null

        @JvmSynthetic
        internal fun from(navigationListPage: NavigationListPage) =
            apply {
                service = navigationListPage.service
                params = navigationListPage.params
                items = navigationListPage.items
            }

        fun service(service: NavigationService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: NavigationListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<NavigationListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [NavigationListPage].
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
        fun build(): NavigationListPage =
            NavigationListPage(
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

      return /* spotless:off */ other is NavigationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "NavigationListPage{service=$service, params=$params, items=$items}"
}
