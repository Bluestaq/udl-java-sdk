// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchevent

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListResponse
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchEventServiceAsync.list */
class LaunchEventListPageAsync private constructor(
    private val service: LaunchEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaunchEventListParams,
    private val items: List<LaunchEventListResponse>,

) : PageAsync<LaunchEventListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchEventListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<LaunchEventListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaunchEventListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): LaunchEventListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchEventListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchEventListPageAsync].
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

    /** A builder for [LaunchEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaunchEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaunchEventListParams? = null
        private var items: List<LaunchEventListResponse>? = null

        @JvmSynthetic
        internal fun from(launchEventListPageAsync: LaunchEventListPageAsync) =
            apply {
                service = launchEventListPageAsync.service
                streamHandlerExecutor = launchEventListPageAsync.streamHandlerExecutor
                params = launchEventListPageAsync.params
                items = launchEventListPageAsync.items
            }

        fun service(service: LaunchEventServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchEventListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchEventListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [LaunchEventListPageAsync].
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
        fun build(): LaunchEventListPageAsync =
            LaunchEventListPageAsync(
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

      return /* spotless:off */ other is LaunchEventListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "LaunchEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
