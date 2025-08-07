// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackdetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see TrackDetailServiceAsync.list */
class TrackDetailListPageAsync
private constructor(
    private val service: TrackDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TrackDetailListParams,
    private val items: List<TrackDetailListResponse>,
) : PageAsync<TrackDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TrackDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrackDetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TrackDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TrackDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackDetailListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrackDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: TrackDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TrackDetailListParams? = null
        private var items: List<TrackDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(trackDetailListPageAsync: TrackDetailListPageAsync) = apply {
            service = trackDetailListPageAsync.service
            streamHandlerExecutor = trackDetailListPageAsync.streamHandlerExecutor
            params = trackDetailListPageAsync.params
            items = trackDetailListPageAsync.items
        }

        fun service(service: TrackDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TrackDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TrackDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TrackDetailListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrackDetailListPageAsync =
            TrackDetailListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TrackDetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "TrackDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
