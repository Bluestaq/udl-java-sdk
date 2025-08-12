// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryAbridged
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryListParams
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AnalyticImageryServiceAsync.list */
class AnalyticImageryListPageAsync private constructor(
    private val service: AnalyticImageryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AnalyticImageryListParams,
    private val items: List<AnalyticImageryAbridged>,

) : PageAsync<AnalyticImageryAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AnalyticImageryListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<AnalyticImageryListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AnalyticImageryAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): AnalyticImageryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AnalyticImageryAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AnalyticImageryListPageAsync].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AnalyticImageryListPageAsync]. */
    class Builder internal constructor() {

        private var service: AnalyticImageryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AnalyticImageryListParams? = null
        private var items: List<AnalyticImageryAbridged>? = null

        @JvmSynthetic
        internal fun from(analyticImageryListPageAsync: AnalyticImageryListPageAsync) =
            apply {
                service = analyticImageryListPageAsync.service
                streamHandlerExecutor = analyticImageryListPageAsync.streamHandlerExecutor
                params = analyticImageryListPageAsync.params
                items = analyticImageryListPageAsync.items
            }

        fun service(service: AnalyticImageryServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: AnalyticImageryListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AnalyticImageryAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AnalyticImageryListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticImageryListPageAsync =
            AnalyticImageryListPageAsync(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "streamHandlerExecutor", streamHandlerExecutor
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

      return /* spotless:off */ other is AnalyticImageryListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "AnalyticImageryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
