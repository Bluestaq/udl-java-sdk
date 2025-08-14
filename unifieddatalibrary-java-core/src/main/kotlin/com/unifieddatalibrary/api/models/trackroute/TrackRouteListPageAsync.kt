// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see TrackRouteServiceAsync.list */
class TrackRouteListPageAsync
private constructor(
    private val service: TrackRouteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TrackRouteListParams,
    private val items: List<TrackRouteListResponse>,
) : PageAsync<TrackRouteListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackRouteListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TrackRouteListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrackRouteListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TrackRouteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TrackRouteListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackRouteListPageAsync].
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

    /** A builder for [TrackRouteListPageAsync]. */
    class Builder internal constructor() {

        private var service: TrackRouteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TrackRouteListParams? = null
        private var items: List<TrackRouteListResponse>? = null

        @JvmSynthetic
        internal fun from(trackRouteListPageAsync: TrackRouteListPageAsync) = apply {
            service = trackRouteListPageAsync.service
            streamHandlerExecutor = trackRouteListPageAsync.streamHandlerExecutor
            params = trackRouteListPageAsync.params
            items = trackRouteListPageAsync.items
        }

        fun service(service: TrackRouteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TrackRouteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TrackRouteListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TrackRouteListPageAsync].
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
        fun build(): TrackRouteListPageAsync =
            TrackRouteListPageAsync(
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

        return other is TrackRouteListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "TrackRouteListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
