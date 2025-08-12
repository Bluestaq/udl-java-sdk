// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.transponder

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.transponder.TransponderListParams
import com.unifieddatalibrary.api.models.transponder.TransponderListResponse
import com.unifieddatalibrary.api.services.blocking.TransponderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see TransponderService.list */
class TransponderListPage private constructor(
    private val service: TransponderService,
    private val params: TransponderListParams,
    private val items: List<TransponderListResponse>,

) : Page<TransponderListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransponderListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): TransponderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TransponderListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransponderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TransponderListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransponderListPage].
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

    /** A builder for [TransponderListPage]. */
    class Builder internal constructor() {

        private var service: TransponderService? = null
        private var params: TransponderListParams? = null
        private var items: List<TransponderListResponse>? = null

        @JvmSynthetic
        internal fun from(transponderListPage: TransponderListPage) =
            apply {
                service = transponderListPage.service
                params = transponderListPage.params
                items = transponderListPage.items
            }

        fun service(service: TransponderService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: TransponderListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<TransponderListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [TransponderListPage].
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
        fun build(): TransponderListPage =
            TransponderListPage(
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

      return /* spotless:off */ other is TransponderListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "TransponderListPage{service=$service, params=$params, items=$items}"
}
