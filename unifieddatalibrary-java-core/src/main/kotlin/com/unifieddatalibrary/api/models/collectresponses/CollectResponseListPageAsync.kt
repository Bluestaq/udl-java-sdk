// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CollectResponseServiceAsync.list */
class CollectResponseListPageAsync
private constructor(
    private val service: CollectResponseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CollectResponseListParams,
    private val items: List<CollectResponseAbridged>,
) : PageAsync<CollectResponseAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CollectResponseListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CollectResponseListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CollectResponseAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CollectResponseListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CollectResponseAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CollectResponseListPageAsync].
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

    /** A builder for [CollectResponseListPageAsync]. */
    class Builder internal constructor() {

        private var service: CollectResponseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CollectResponseListParams? = null
        private var items: List<CollectResponseAbridged>? = null

        @JvmSynthetic
        internal fun from(collectResponseListPageAsync: CollectResponseListPageAsync) = apply {
            service = collectResponseListPageAsync.service
            streamHandlerExecutor = collectResponseListPageAsync.streamHandlerExecutor
            params = collectResponseListPageAsync.params
            items = collectResponseListPageAsync.items
        }

        fun service(service: CollectResponseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CollectResponseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CollectResponseAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CollectResponseListPageAsync].
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
        fun build(): CollectResponseListPageAsync =
            CollectResponseListPageAsync(
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

        return other is CollectResponseListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "CollectResponseListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
