// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.elsets.ElsetAbridged
import com.unifieddatalibrary.api.models.elsets.ElsetListParams
import com.unifieddatalibrary.api.services.blocking.ElsetService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see ElsetService.list */
class ElsetListPage private constructor(
    private val service: ElsetService,
    private val params: ElsetListParams,
    private val items: List<ElsetAbridged>,

) : Page<ElsetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ElsetListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): ElsetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ElsetAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ElsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ElsetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ElsetListPage].
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

    /** A builder for [ElsetListPage]. */
    class Builder internal constructor() {

        private var service: ElsetService? = null
        private var params: ElsetListParams? = null
        private var items: List<ElsetAbridged>? = null

        @JvmSynthetic
        internal fun from(elsetListPage: ElsetListPage) =
            apply {
                service = elsetListPage.service
                params = elsetListPage.params
                items = elsetListPage.items
            }

        fun service(service: ElsetService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: ElsetListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<ElsetAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [ElsetListPage].
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
        fun build(): ElsetListPage =
            ElsetListPage(
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

      return /* spotless:off */ other is ElsetListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "ElsetListPage{service=$service, params=$params, items=$items}"
}
