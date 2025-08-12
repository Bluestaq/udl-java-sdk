// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListResponse
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LogisticsSupportServiceAsync.list */
class LogisticsSupportListPageAsync private constructor(
    private val service: LogisticsSupportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LogisticsSupportListParams,
    private val items: List<LogisticsSupportListResponse>,

) : PageAsync<LogisticsSupportListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LogisticsSupportListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<LogisticsSupportListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LogisticsSupportListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): LogisticsSupportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LogisticsSupportListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LogisticsSupportListPageAsync].
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

    /** A builder for [LogisticsSupportListPageAsync]. */
    class Builder internal constructor() {

        private var service: LogisticsSupportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LogisticsSupportListParams? = null
        private var items: List<LogisticsSupportListResponse>? = null

        @JvmSynthetic
        internal fun from(logisticsSupportListPageAsync: LogisticsSupportListPageAsync) =
            apply {
                service = logisticsSupportListPageAsync.service
                streamHandlerExecutor = logisticsSupportListPageAsync.streamHandlerExecutor
                params = logisticsSupportListPageAsync.params
                items = logisticsSupportListPageAsync.items
            }

        fun service(service: LogisticsSupportServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
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
         * Returns an immutable instance of [LogisticsSupportListPageAsync].
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
        fun build(): LogisticsSupportListPageAsync =
            LogisticsSupportListPageAsync(
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

      return /* spotless:off */ other is LogisticsSupportListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "LogisticsSupportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
