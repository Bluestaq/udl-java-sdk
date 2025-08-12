// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListResponse
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SurfaceObstructionServiceAsync.list */
class SurfaceObstructionListPageAsync private constructor(
    private val service: SurfaceObstructionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SurfaceObstructionListParams,
    private val items: List<SurfaceObstructionListResponse>,

) : PageAsync<SurfaceObstructionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SurfaceObstructionListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<SurfaceObstructionListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SurfaceObstructionListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): SurfaceObstructionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SurfaceObstructionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SurfaceObstructionListPageAsync].
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

    /** A builder for [SurfaceObstructionListPageAsync]. */
    class Builder internal constructor() {

        private var service: SurfaceObstructionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SurfaceObstructionListParams? = null
        private var items: List<SurfaceObstructionListResponse>? = null

        @JvmSynthetic
        internal fun from(surfaceObstructionListPageAsync: SurfaceObstructionListPageAsync) =
            apply {
                service = surfaceObstructionListPageAsync.service
                streamHandlerExecutor = surfaceObstructionListPageAsync.streamHandlerExecutor
                params = surfaceObstructionListPageAsync.params
                items = surfaceObstructionListPageAsync.items
            }

        fun service(service: SurfaceObstructionServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: SurfaceObstructionListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SurfaceObstructionListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SurfaceObstructionListPageAsync].
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
        fun build(): SurfaceObstructionListPageAsync =
            SurfaceObstructionListPageAsync(
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

      return /* spotless:off */ other is SurfaceObstructionListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "SurfaceObstructionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
