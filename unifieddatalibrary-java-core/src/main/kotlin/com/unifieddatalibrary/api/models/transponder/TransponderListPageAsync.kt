// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.transponder

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.TransponderServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see TransponderServiceAsync.list */
class TransponderListPageAsync
private constructor(
    private val service: TransponderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TransponderListParams,
    private val items: List<TransponderListResponse>,
) : PageAsync<TransponderListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransponderListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TransponderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TransponderListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TransponderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TransponderListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransponderListPageAsync].
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

    /** A builder for [TransponderListPageAsync]. */
    class Builder internal constructor() {

        private var service: TransponderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TransponderListParams? = null
        private var items: List<TransponderListResponse>? = null

        @JvmSynthetic
        internal fun from(transponderListPageAsync: TransponderListPageAsync) = apply {
            service = transponderListPageAsync.service
            streamHandlerExecutor = transponderListPageAsync.streamHandlerExecutor
            params = transponderListPageAsync.params
            items = transponderListPageAsync.items
        }

        fun service(service: TransponderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TransponderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TransponderListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TransponderListPageAsync].
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
        fun build(): TransponderListPageAsync =
            TransponderListPageAsync(
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

        return other is TransponderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "TransponderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
