// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.comm

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.comm.CommAbridged
import com.unifieddatalibrary.api.models.comm.CommListParams
import com.unifieddatalibrary.api.services.async.CommServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CommServiceAsync.list */
class CommListPageAsync private constructor(
    private val service: CommServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CommListParams,
    private val items: List<CommAbridged>,

) : PageAsync<CommAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CommListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<CommListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CommAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): CommListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CommAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommListPageAsync].
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

    /** A builder for [CommListPageAsync]. */
    class Builder internal constructor() {

        private var service: CommServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CommListParams? = null
        private var items: List<CommAbridged>? = null

        @JvmSynthetic
        internal fun from(commListPageAsync: CommListPageAsync) =
            apply {
                service = commListPageAsync.service
                streamHandlerExecutor = commListPageAsync.streamHandlerExecutor
                params = commListPageAsync.params
                items = commListPageAsync.items
            }

        fun service(service: CommServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: CommListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<CommAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [CommListPageAsync].
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
        fun build(): CommListPageAsync =
            CommListPageAsync(
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

      return /* spotless:off */ other is CommListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "CommListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
