// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see IsrCollectionServiceAsync.list */
class IsrCollectionListPageAsync
private constructor(
    private val service: IsrCollectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IsrCollectionListParams,
    private val items: List<IsrCollectionListResponse>,
) : PageAsync<IsrCollectionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IsrCollectionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<IsrCollectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IsrCollectionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IsrCollectionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IsrCollectionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IsrCollectionListPageAsync].
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

    /** A builder for [IsrCollectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: IsrCollectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IsrCollectionListParams? = null
        private var items: List<IsrCollectionListResponse>? = null

        @JvmSynthetic
        internal fun from(isrCollectionListPageAsync: IsrCollectionListPageAsync) = apply {
            service = isrCollectionListPageAsync.service
            streamHandlerExecutor = isrCollectionListPageAsync.streamHandlerExecutor
            params = isrCollectionListPageAsync.params
            items = isrCollectionListPageAsync.items
        }

        fun service(service: IsrCollectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IsrCollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IsrCollectionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IsrCollectionListPageAsync].
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
        fun build(): IsrCollectionListPageAsync =
            IsrCollectionListPageAsync(
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

        return other is IsrCollectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "IsrCollectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
