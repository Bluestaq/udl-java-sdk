// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RouteStatServiceAsync.list */
class RouteStatListPageAsync
private constructor(
    private val service: RouteStatServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RouteStatListParams,
    private val items: List<RouteStatListResponse>,
) : PageAsync<RouteStatListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RouteStatListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RouteStatListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RouteStatListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RouteStatListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RouteStatListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RouteStatListPageAsync].
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

    /** A builder for [RouteStatListPageAsync]. */
    class Builder internal constructor() {

        private var service: RouteStatServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RouteStatListParams? = null
        private var items: List<RouteStatListResponse>? = null

        @JvmSynthetic
        internal fun from(routeStatListPageAsync: RouteStatListPageAsync) = apply {
            service = routeStatListPageAsync.service
            streamHandlerExecutor = routeStatListPageAsync.streamHandlerExecutor
            params = routeStatListPageAsync.params
            items = routeStatListPageAsync.items
        }

        fun service(service: RouteStatServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RouteStatListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RouteStatListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RouteStatListPageAsync].
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
        fun build(): RouteStatListPageAsync =
            RouteStatListPageAsync(
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

        return other is RouteStatListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "RouteStatListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
