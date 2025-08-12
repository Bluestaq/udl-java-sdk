// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitsolararray

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListResponse
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitsolararrayServiceAsync.list */
class OnorbitsolararrayListPageAsync private constructor(
    private val service: OnorbitsolararrayServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitsolararrayListParams,
    private val items: List<OnorbitsolararrayListResponse>,

) : PageAsync<OnorbitsolararrayListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitsolararrayListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<OnorbitsolararrayListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitsolararrayListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): OnorbitsolararrayListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitsolararrayListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitsolararrayListPageAsync].
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

    /** A builder for [OnorbitsolararrayListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitsolararrayServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitsolararrayListParams? = null
        private var items: List<OnorbitsolararrayListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitsolararrayListPageAsync: OnorbitsolararrayListPageAsync) =
            apply {
                service = onorbitsolararrayListPageAsync.service
                streamHandlerExecutor = onorbitsolararrayListPageAsync.streamHandlerExecutor
                params = onorbitsolararrayListPageAsync.params
                items = onorbitsolararrayListPageAsync.items
            }

        fun service(service: OnorbitsolararrayServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitsolararrayListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitsolararrayListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OnorbitsolararrayListPageAsync].
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
        fun build(): OnorbitsolararrayListPageAsync =
            OnorbitsolararrayListPageAsync(
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

      return /* spotless:off */ other is OnorbitsolararrayListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "OnorbitsolararrayListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
