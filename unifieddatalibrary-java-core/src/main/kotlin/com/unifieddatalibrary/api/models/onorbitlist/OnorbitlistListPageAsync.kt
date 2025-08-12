// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListResponse
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitlistServiceAsync.list */
class OnorbitlistListPageAsync private constructor(
    private val service: OnorbitlistServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitlistListParams,
    private val items: List<OnorbitlistListResponse>,

) : PageAsync<OnorbitlistListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitlistListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<OnorbitlistListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitlistListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): OnorbitlistListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitlistListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitlistListPageAsync].
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

    /** A builder for [OnorbitlistListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitlistServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitlistListParams? = null
        private var items: List<OnorbitlistListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitlistListPageAsync: OnorbitlistListPageAsync) =
            apply {
                service = onorbitlistListPageAsync.service
                streamHandlerExecutor = onorbitlistListPageAsync.streamHandlerExecutor
                params = onorbitlistListPageAsync.params
                items = onorbitlistListPageAsync.items
            }

        fun service(service: OnorbitlistServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitlistListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitlistListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OnorbitlistListPageAsync].
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
        fun build(): OnorbitlistListPageAsync =
            OnorbitlistListPageAsync(
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

      return /* spotless:off */ other is OnorbitlistListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "OnorbitlistListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
