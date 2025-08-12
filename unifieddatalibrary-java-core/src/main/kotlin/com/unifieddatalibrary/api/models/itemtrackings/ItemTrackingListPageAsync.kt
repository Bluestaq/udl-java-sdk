// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListResponse
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ItemTrackingServiceAsync.list */
class ItemTrackingListPageAsync private constructor(
    private val service: ItemTrackingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ItemTrackingListParams,
    private val items: List<ItemTrackingListResponse>,

) : PageAsync<ItemTrackingListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ItemTrackingListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<ItemTrackingListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ItemTrackingListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): ItemTrackingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ItemTrackingListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemTrackingListPageAsync].
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

    /** A builder for [ItemTrackingListPageAsync]. */
    class Builder internal constructor() {

        private var service: ItemTrackingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ItemTrackingListParams? = null
        private var items: List<ItemTrackingListResponse>? = null

        @JvmSynthetic
        internal fun from(itemTrackingListPageAsync: ItemTrackingListPageAsync) =
            apply {
                service = itemTrackingListPageAsync.service
                streamHandlerExecutor = itemTrackingListPageAsync.streamHandlerExecutor
                params = itemTrackingListPageAsync.params
                items = itemTrackingListPageAsync.items
            }

        fun service(service: ItemTrackingServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: ItemTrackingListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<ItemTrackingListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [ItemTrackingListPageAsync].
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
        fun build(): ItemTrackingListPageAsync =
            ItemTrackingListPageAsync(
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

      return /* spotless:off */ other is ItemTrackingListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "ItemTrackingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
