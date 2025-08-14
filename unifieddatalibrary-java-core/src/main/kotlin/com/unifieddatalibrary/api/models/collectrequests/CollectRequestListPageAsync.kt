// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectrequests

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CollectRequestServiceAsync.list */
class CollectRequestListPageAsync
private constructor(
    private val service: CollectRequestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CollectRequestListParams,
    private val items: List<CollectRequestAbridged>,
) : PageAsync<CollectRequestAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CollectRequestListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CollectRequestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CollectRequestAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CollectRequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CollectRequestAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CollectRequestListPageAsync].
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

    /** A builder for [CollectRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: CollectRequestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CollectRequestListParams? = null
        private var items: List<CollectRequestAbridged>? = null

        @JvmSynthetic
        internal fun from(collectRequestListPageAsync: CollectRequestListPageAsync) = apply {
            service = collectRequestListPageAsync.service
            streamHandlerExecutor = collectRequestListPageAsync.streamHandlerExecutor
            params = collectRequestListPageAsync.params
            items = collectRequestListPageAsync.items
        }

        fun service(service: CollectRequestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CollectRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CollectRequestAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CollectRequestListPageAsync].
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
        fun build(): CollectRequestListPageAsync =
            CollectRequestListPageAsync(
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

        return other is CollectRequestListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "CollectRequestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
