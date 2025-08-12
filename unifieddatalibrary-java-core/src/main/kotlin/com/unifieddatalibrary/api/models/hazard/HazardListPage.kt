// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.hazard

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.hazard.HazardListParams
import com.unifieddatalibrary.api.models.hazard.HazardListResponse
import com.unifieddatalibrary.api.services.blocking.HazardService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see HazardService.list */
class HazardListPage private constructor(
    private val service: HazardService,
    private val params: HazardListParams,
    private val items: List<HazardListResponse>,

) : Page<HazardListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HazardListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): HazardListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<HazardListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HazardListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<HazardListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HazardListPage].
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

    /** A builder for [HazardListPage]. */
    class Builder internal constructor() {

        private var service: HazardService? = null
        private var params: HazardListParams? = null
        private var items: List<HazardListResponse>? = null

        @JvmSynthetic
        internal fun from(hazardListPage: HazardListPage) =
            apply {
                service = hazardListPage.service
                params = hazardListPage.params
                items = hazardListPage.items
            }

        fun service(service: HazardService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: HazardListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<HazardListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [HazardListPage].
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
        fun build(): HazardListPage =
            HazardListPage(
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

      return /* spotless:off */ other is HazardListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "HazardListPage{service=$service, params=$params, items=$items}"
}
