// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListResponse
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeraDataEarlyWarningServiceAsync.list */
class SeraDataEarlyWarningListPageAsync private constructor(
    private val service: SeraDataEarlyWarningServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeraDataEarlyWarningListParams,
    private val items: List<SeraDataEarlyWarningListResponse>,

) : PageAsync<SeraDataEarlyWarningListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeraDataEarlyWarningListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<SeraDataEarlyWarningListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeraDataEarlyWarningListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): SeraDataEarlyWarningListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeraDataEarlyWarningListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeraDataEarlyWarningListPageAsync].
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

    /** A builder for [SeraDataEarlyWarningListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeraDataEarlyWarningServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeraDataEarlyWarningListParams? = null
        private var items: List<SeraDataEarlyWarningListResponse>? = null

        @JvmSynthetic
        internal fun from(seraDataEarlyWarningListPageAsync: SeraDataEarlyWarningListPageAsync) =
            apply {
                service = seraDataEarlyWarningListPageAsync.service
                streamHandlerExecutor = seraDataEarlyWarningListPageAsync.streamHandlerExecutor
                params = seraDataEarlyWarningListPageAsync.params
                items = seraDataEarlyWarningListPageAsync.items
            }

        fun service(service: SeraDataEarlyWarningServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: SeraDataEarlyWarningListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SeraDataEarlyWarningListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SeraDataEarlyWarningListPageAsync].
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
        fun build(): SeraDataEarlyWarningListPageAsync =
            SeraDataEarlyWarningListPageAsync(
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

      return /* spotless:off */ other is SeraDataEarlyWarningListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "SeraDataEarlyWarningListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
