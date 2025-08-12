// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitantenna

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListResponse
import com.unifieddatalibrary.api.services.blocking.OnorbitantennaService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitantennaService.list */
class OnorbitantennaListPage private constructor(
    private val service: OnorbitantennaService,
    private val params: OnorbitantennaListParams,
    private val items: List<OnorbitantennaListResponse>,

) : Page<OnorbitantennaListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitantennaListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): OnorbitantennaListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitantennaListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitantennaListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitantennaListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitantennaListPage].
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

    /** A builder for [OnorbitantennaListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitantennaService? = null
        private var params: OnorbitantennaListParams? = null
        private var items: List<OnorbitantennaListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitantennaListPage: OnorbitantennaListPage) =
            apply {
                service = onorbitantennaListPage.service
                params = onorbitantennaListPage.params
                items = onorbitantennaListPage.items
            }

        fun service(service: OnorbitantennaService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitantennaListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitantennaListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OnorbitantennaListPage].
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
        fun build(): OnorbitantennaListPage =
            OnorbitantennaListPage(
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

      return /* spotless:off */ other is OnorbitantennaListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OnorbitantennaListPage{service=$service, params=$params, items=$items}"
}
