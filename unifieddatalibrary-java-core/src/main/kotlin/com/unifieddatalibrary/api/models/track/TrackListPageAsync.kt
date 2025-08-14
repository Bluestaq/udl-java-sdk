// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.track

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.TrackServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see TrackServiceAsync.list */
class TrackListPageAsync
private constructor(
    private val service: TrackServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TrackListParams,
    private val items: List<TrackListResponse>,
) : PageAsync<TrackListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TrackListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrackListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TrackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TrackListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackListPageAsync].
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

    /** A builder for [TrackListPageAsync]. */
    class Builder internal constructor() {

        private var service: TrackServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TrackListParams? = null
        private var items: List<TrackListResponse>? = null

        @JvmSynthetic
        internal fun from(trackListPageAsync: TrackListPageAsync) = apply {
            service = trackListPageAsync.service
            streamHandlerExecutor = trackListPageAsync.streamHandlerExecutor
            params = trackListPageAsync.params
            items = trackListPageAsync.items
        }

        fun service(service: TrackServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TrackListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TrackListPageAsync].
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
        fun build(): TrackListPageAsync =
            TrackListPageAsync(
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

        return other is TrackListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "TrackListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
