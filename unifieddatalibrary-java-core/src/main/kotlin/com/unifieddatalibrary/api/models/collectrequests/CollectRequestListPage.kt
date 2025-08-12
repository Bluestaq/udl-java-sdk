// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectrequests

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestAbridged
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListParams
import com.unifieddatalibrary.api.services.blocking.CollectRequestService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see CollectRequestService.list */
class CollectRequestListPage private constructor(
    private val service: CollectRequestService,
    private val params: CollectRequestListParams,
    private val items: List<CollectRequestAbridged>,

) : Page<CollectRequestAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CollectRequestListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CollectRequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CollectRequestAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CollectRequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CollectRequestAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CollectRequestListPage].
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

    /** A builder for [CollectRequestListPage]. */
    class Builder internal constructor() {

        private var service: CollectRequestService? = null
        private var params: CollectRequestListParams? = null
        private var items: List<CollectRequestAbridged>? = null

        @JvmSynthetic
        internal fun from(collectRequestListPage: CollectRequestListPage) =
            apply {
                service = collectRequestListPage.service
                params = collectRequestListPage.params
                items = collectRequestListPage.items
            }

        fun service(service: CollectRequestService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: CollectRequestListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<CollectRequestAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [CollectRequestListPage].
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
        fun build(): CollectRequestListPage =
            CollectRequestListPage(
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

      return /* spotless:off */ other is CollectRequestListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "CollectRequestListPage{service=$service, params=$params, items=$items}"
}
