// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airevents

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airevents.AirEventListParams
import com.unifieddatalibrary.api.models.airevents.AirEventListResponse
import com.unifieddatalibrary.api.services.async.AirEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirEventServiceAsync.list */
class AirEventListPageAsync private constructor(
    private val service: AirEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirEventListParams,
    private val items: List<AirEventListResponse>,

) : PageAsync<AirEventListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirEventListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<AirEventListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirEventListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): AirEventListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirEventListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirEventListPageAsync].
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

    /** A builder for [AirEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirEventListParams? = null
        private var items: List<AirEventListResponse>? = null

        @JvmSynthetic
        internal fun from(airEventListPageAsync: AirEventListPageAsync) =
            apply {
                service = airEventListPageAsync.service
                streamHandlerExecutor = airEventListPageAsync.streamHandlerExecutor
                params = airEventListPageAsync.params
                items = airEventListPageAsync.items
            }

        fun service(service: AirEventServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: AirEventListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AirEventListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AirEventListPageAsync].
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
        fun build(): AirEventListPageAsync =
            AirEventListPageAsync(
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

      return /* spotless:off */ other is AirEventListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "AirEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
