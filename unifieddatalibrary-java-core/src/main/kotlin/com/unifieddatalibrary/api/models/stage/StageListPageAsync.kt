// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.stage

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.stage.StageListParams
import com.unifieddatalibrary.api.models.stage.StageListResponse
import com.unifieddatalibrary.api.services.async.StageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see StageServiceAsync.list */
class StageListPageAsync private constructor(
    private val service: StageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StageListParams,
    private val items: List<StageListResponse>,

) : PageAsync<StageListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StageListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<StageListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StageListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): StageListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StageListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StageListPageAsync].
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

    /** A builder for [StageListPageAsync]. */
    class Builder internal constructor() {

        private var service: StageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StageListParams? = null
        private var items: List<StageListResponse>? = null

        @JvmSynthetic
        internal fun from(stageListPageAsync: StageListPageAsync) =
            apply {
                service = stageListPageAsync.service
                streamHandlerExecutor = stageListPageAsync.streamHandlerExecutor
                params = stageListPageAsync.params
                items = stageListPageAsync.items
            }

        fun service(service: StageServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: StageListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<StageListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [StageListPageAsync].
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
        fun build(): StageListPageAsync =
            StageListPageAsync(
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

      return /* spotless:off */ other is StageListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "StageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
