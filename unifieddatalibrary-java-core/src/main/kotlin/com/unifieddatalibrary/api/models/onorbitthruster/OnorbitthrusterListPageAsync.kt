// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthruster

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListResponse
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitthrusterServiceAsync.list */
class OnorbitthrusterListPageAsync private constructor(
    private val service: OnorbitthrusterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitthrusterListParams,
    private val items: List<OnorbitthrusterListResponse>,

) : PageAsync<OnorbitthrusterListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitthrusterListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<OnorbitthrusterListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitthrusterListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): OnorbitthrusterListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitthrusterListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitthrusterListPageAsync].
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

    /** A builder for [OnorbitthrusterListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitthrusterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitthrusterListParams? = null
        private var items: List<OnorbitthrusterListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitthrusterListPageAsync: OnorbitthrusterListPageAsync) =
            apply {
                service = onorbitthrusterListPageAsync.service
                streamHandlerExecutor = onorbitthrusterListPageAsync.streamHandlerExecutor
                params = onorbitthrusterListPageAsync.params
                items = onorbitthrusterListPageAsync.items
            }

        fun service(service: OnorbitthrusterServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitthrusterListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitthrusterListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OnorbitthrusterListPageAsync].
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
        fun build(): OnorbitthrusterListPageAsync =
            OnorbitthrusterListPageAsync(
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

      return /* spotless:off */ other is OnorbitthrusterListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "OnorbitthrusterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
