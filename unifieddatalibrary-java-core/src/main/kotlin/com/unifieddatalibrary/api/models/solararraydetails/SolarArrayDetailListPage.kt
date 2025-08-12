// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararraydetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListResponse
import com.unifieddatalibrary.api.services.blocking.SolarArrayDetailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SolarArrayDetailService.list */
class SolarArrayDetailListPage private constructor(
    private val service: SolarArrayDetailService,
    private val params: SolarArrayDetailListParams,
    private val items: List<SolarArrayDetailListResponse>,

) : Page<SolarArrayDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SolarArrayDetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SolarArrayDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SolarArrayDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SolarArrayDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SolarArrayDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SolarArrayDetailListPage].
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

    /** A builder for [SolarArrayDetailListPage]. */
    class Builder internal constructor() {

        private var service: SolarArrayDetailService? = null
        private var params: SolarArrayDetailListParams? = null
        private var items: List<SolarArrayDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(solarArrayDetailListPage: SolarArrayDetailListPage) =
            apply {
                service = solarArrayDetailListPage.service
                params = solarArrayDetailListPage.params
                items = solarArrayDetailListPage.items
            }

        fun service(service: SolarArrayDetailService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SolarArrayDetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SolarArrayDetailListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SolarArrayDetailListPage].
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
        fun build(): SolarArrayDetailListPage =
            SolarArrayDetailListPage(
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

      return /* spotless:off */ other is SolarArrayDetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SolarArrayDetailListPage{service=$service, params=$params, items=$items}"
}
