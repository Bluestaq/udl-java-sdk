// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.mti

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.mti.MtiListParams
import com.unifieddatalibrary.api.models.mti.MtiListResponse
import com.unifieddatalibrary.api.services.async.MtiServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see MtiServiceAsync.list */
class MtiListPageAsync private constructor(
    private val service: MtiServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MtiListParams,
    private val items: List<MtiListResponse>,

) : PageAsync<MtiListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MtiListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<MtiListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MtiListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): MtiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MtiListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MtiListPageAsync].
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

    /** A builder for [MtiListPageAsync]. */
    class Builder internal constructor() {

        private var service: MtiServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MtiListParams? = null
        private var items: List<MtiListResponse>? = null

        @JvmSynthetic
        internal fun from(mtiListPageAsync: MtiListPageAsync) =
            apply {
                service = mtiListPageAsync.service
                streamHandlerExecutor = mtiListPageAsync.streamHandlerExecutor
                params = mtiListPageAsync.params
                items = mtiListPageAsync.items
            }

        fun service(service: MtiServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: MtiListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<MtiListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [MtiListPageAsync].
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
        fun build(): MtiListPageAsync =
            MtiListPageAsync(
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

      return /* spotless:off */ other is MtiListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "MtiListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
