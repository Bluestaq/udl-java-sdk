// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListResponse
import com.unifieddatalibrary.api.services.blocking.H3GeoHexCellService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see H3GeoHexCellService.list */
class H3GeoHexCellListPage private constructor(
    private val service: H3GeoHexCellService,
    private val params: H3GeoHexCellListParams,
    private val items: List<H3GeoHexCellListResponse>,

) : Page<H3GeoHexCellListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): H3GeoHexCellListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): H3GeoHexCellListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<H3GeoHexCellListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): H3GeoHexCellListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<H3GeoHexCellListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [H3GeoHexCellListPage].
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

    /** A builder for [H3GeoHexCellListPage]. */
    class Builder internal constructor() {

        private var service: H3GeoHexCellService? = null
        private var params: H3GeoHexCellListParams? = null
        private var items: List<H3GeoHexCellListResponse>? = null

        @JvmSynthetic
        internal fun from(h3GeoHexCellListPage: H3GeoHexCellListPage) =
            apply {
                service = h3GeoHexCellListPage.service
                params = h3GeoHexCellListPage.params
                items = h3GeoHexCellListPage.items
            }

        fun service(service: H3GeoHexCellService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: H3GeoHexCellListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<H3GeoHexCellListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [H3GeoHexCellListPage].
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
        fun build(): H3GeoHexCellListPage =
            H3GeoHexCellListPage(
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

      return /* spotless:off */ other is H3GeoHexCellListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "H3GeoHexCellListPage{service=$service, params=$params, items=$items}"
}
