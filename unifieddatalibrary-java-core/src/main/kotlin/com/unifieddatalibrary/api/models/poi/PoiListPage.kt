// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.poi.PoiListParams
import com.unifieddatalibrary.api.models.poi.PoiListResponse
import com.unifieddatalibrary.api.services.blocking.PoiService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see PoiService.list */
class PoiListPage private constructor(
    private val service: PoiService,
    private val params: PoiListParams,
    private val items: List<PoiListResponse>,

) : Page<PoiListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PoiListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): PoiListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PoiListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PoiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PoiListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PoiListPage].
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

    /** A builder for [PoiListPage]. */
    class Builder internal constructor() {

        private var service: PoiService? = null
        private var params: PoiListParams? = null
        private var items: List<PoiListResponse>? = null

        @JvmSynthetic
        internal fun from(poiListPage: PoiListPage) =
            apply {
                service = poiListPage.service
                params = poiListPage.params
                items = poiListPage.items
            }

        fun service(service: PoiService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: PoiListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<PoiListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [PoiListPage].
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
        fun build(): PoiListPage =
            PoiListPage(
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

      return /* spotless:off */ other is PoiListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "PoiListPage{service=$service, params=$params, items=$items}"
}
