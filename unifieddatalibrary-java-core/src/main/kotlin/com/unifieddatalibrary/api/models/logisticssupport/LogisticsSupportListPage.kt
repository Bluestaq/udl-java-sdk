// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListResponse
import com.unifieddatalibrary.api.services.blocking.LogisticsSupportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see LogisticsSupportService.list */
class LogisticsSupportListPage private constructor(
    private val service: LogisticsSupportService,
    private val params: LogisticsSupportListParams,
    private val items: List<LogisticsSupportListResponse>,

) : Page<LogisticsSupportListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LogisticsSupportListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): LogisticsSupportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LogisticsSupportListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LogisticsSupportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LogisticsSupportListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LogisticsSupportListPage].
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

    /** A builder for [LogisticsSupportListPage]. */
    class Builder internal constructor() {

        private var service: LogisticsSupportService? = null
        private var params: LogisticsSupportListParams? = null
        private var items: List<LogisticsSupportListResponse>? = null

        @JvmSynthetic
        internal fun from(logisticsSupportListPage: LogisticsSupportListPage) =
            apply {
                service = logisticsSupportListPage.service
                params = logisticsSupportListPage.params
                items = logisticsSupportListPage.items
            }

        fun service(service: LogisticsSupportService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: LogisticsSupportListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<LogisticsSupportListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [LogisticsSupportListPage].
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
        fun build(): LogisticsSupportListPage =
            LogisticsSupportListPage(
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

      return /* spotless:off */ other is LogisticsSupportListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "LogisticsSupportListPage{service=$service, params=$params, items=$items}"
}
