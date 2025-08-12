// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitterdetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListResponse
import com.unifieddatalibrary.api.services.blocking.RfEmitterDetailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see RfEmitterDetailService.list */
class RfEmitterDetailListPage private constructor(
    private val service: RfEmitterDetailService,
    private val params: RfEmitterDetailListParams,
    private val items: List<RfEmitterDetailListResponse>,

) : Page<RfEmitterDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfEmitterDetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): RfEmitterDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RfEmitterDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RfEmitterDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfEmitterDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfEmitterDetailListPage].
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

    /** A builder for [RfEmitterDetailListPage]. */
    class Builder internal constructor() {

        private var service: RfEmitterDetailService? = null
        private var params: RfEmitterDetailListParams? = null
        private var items: List<RfEmitterDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(rfEmitterDetailListPage: RfEmitterDetailListPage) =
            apply {
                service = rfEmitterDetailListPage.service
                params = rfEmitterDetailListPage.params
                items = rfEmitterDetailListPage.items
            }

        fun service(service: RfEmitterDetailService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: RfEmitterDetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<RfEmitterDetailListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [RfEmitterDetailListPage].
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
        fun build(): RfEmitterDetailListPage =
            RfEmitterDetailListPage(
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

      return /* spotless:off */ other is RfEmitterDetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "RfEmitterDetailListPage{service=$service, params=$params, items=$items}"
}
