// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets.current

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.elsets.ElsetAbridged
import com.unifieddatalibrary.api.models.elsets.current.CurrentListParams
import com.unifieddatalibrary.api.services.blocking.elsets.CurrentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see CurrentService.list */
class CurrentListPage private constructor(
    private val service: CurrentService,
    private val params: CurrentListParams,
    private val items: List<ElsetAbridged>,

) : Page<ElsetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CurrentListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CurrentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ElsetAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CurrentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ElsetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CurrentListPage].
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

    /** A builder for [CurrentListPage]. */
    class Builder internal constructor() {

        private var service: CurrentService? = null
        private var params: CurrentListParams? = null
        private var items: List<ElsetAbridged>? = null

        @JvmSynthetic
        internal fun from(currentListPage: CurrentListPage) =
            apply {
                service = currentListPage.service
                params = currentListPage.params
                items = currentListPage.items
            }

        fun service(service: CurrentService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: CurrentListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<ElsetAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [CurrentListPage].
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
        fun build(): CurrentListPage =
            CurrentListPage(
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

      return /* spotless:off */ other is CurrentListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "CurrentListPage{service=$service, params=$params, items=$items}"
}
