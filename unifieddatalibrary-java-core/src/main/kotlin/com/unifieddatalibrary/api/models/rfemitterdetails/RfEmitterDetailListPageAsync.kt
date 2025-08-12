// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitterdetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListResponse
import com.unifieddatalibrary.api.services.async.RfEmitterDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RfEmitterDetailServiceAsync.list */
class RfEmitterDetailListPageAsync private constructor(
    private val service: RfEmitterDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RfEmitterDetailListParams,
    private val items: List<RfEmitterDetailListResponse>,

) : PageAsync<RfEmitterDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfEmitterDetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<RfEmitterDetailListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RfEmitterDetailListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): RfEmitterDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfEmitterDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfEmitterDetailListPageAsync].
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

    /** A builder for [RfEmitterDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: RfEmitterDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RfEmitterDetailListParams? = null
        private var items: List<RfEmitterDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(rfEmitterDetailListPageAsync: RfEmitterDetailListPageAsync) =
            apply {
                service = rfEmitterDetailListPageAsync.service
                streamHandlerExecutor = rfEmitterDetailListPageAsync.streamHandlerExecutor
                params = rfEmitterDetailListPageAsync.params
                items = rfEmitterDetailListPageAsync.items
            }

        fun service(service: RfEmitterDetailServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: RfEmitterDetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<RfEmitterDetailListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [RfEmitterDetailListPageAsync].
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
        fun build(): RfEmitterDetailListPageAsync =
            RfEmitterDetailListPageAsync(
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

      return /* spotless:off */ other is RfEmitterDetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "RfEmitterDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
