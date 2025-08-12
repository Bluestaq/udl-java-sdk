// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.poi.PoiListParams
import com.unifieddatalibrary.api.models.poi.PoiListResponse
import com.unifieddatalibrary.api.services.async.PoiServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see PoiServiceAsync.list */
class PoiListPageAsync private constructor(
    private val service: PoiServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PoiListParams,
    private val items: List<PoiListResponse>,

) : PageAsync<PoiListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PoiListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<PoiListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PoiListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): PoiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PoiListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PoiListPageAsync].
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

    /** A builder for [PoiListPageAsync]. */
    class Builder internal constructor() {

        private var service: PoiServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PoiListParams? = null
        private var items: List<PoiListResponse>? = null

        @JvmSynthetic
        internal fun from(poiListPageAsync: PoiListPageAsync) =
            apply {
                service = poiListPageAsync.service
                streamHandlerExecutor = poiListPageAsync.streamHandlerExecutor
                params = poiListPageAsync.params
                items = poiListPageAsync.items
            }

        fun service(service: PoiServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: PoiListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<PoiListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [PoiListPageAsync].
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
        fun build(): PoiListPageAsync =
            PoiListPageAsync(
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

      return /* spotless:off */ other is PoiListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "PoiListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
