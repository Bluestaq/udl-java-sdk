// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.site.operations.OperationListParams
import com.unifieddatalibrary.api.models.site.operations.OperationListResponse
import com.unifieddatalibrary.api.services.async.site.OperationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OperationServiceAsync.list */
class OperationListPageAsync private constructor(
    private val service: OperationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OperationListParams,
    private val items: List<OperationListResponse>,

) : PageAsync<OperationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OperationListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<OperationListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OperationListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): OperationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OperationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OperationListPageAsync].
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

    /** A builder for [OperationListPageAsync]. */
    class Builder internal constructor() {

        private var service: OperationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OperationListParams? = null
        private var items: List<OperationListResponse>? = null

        @JvmSynthetic
        internal fun from(operationListPageAsync: OperationListPageAsync) =
            apply {
                service = operationListPageAsync.service
                streamHandlerExecutor = operationListPageAsync.streamHandlerExecutor
                params = operationListPageAsync.params
                items = operationListPageAsync.items
            }

        fun service(service: OperationServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: OperationListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OperationListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OperationListPageAsync].
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
        fun build(): OperationListPageAsync =
            OperationListPageAsync(
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

      return /* spotless:off */ other is OperationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "OperationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
