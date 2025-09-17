// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.deconflictset

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.DeconflictsetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DeconflictsetServiceAsync.list */
class DeconflictsetListPageAsync
private constructor(
    private val service: DeconflictsetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DeconflictsetListParams,
    private val items: List<DeconflictsetListResponse>,
) : PageAsync<DeconflictsetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DeconflictsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DeconflictsetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DeconflictsetListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DeconflictsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DeconflictsetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeconflictsetListPageAsync].
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

    /** A builder for [DeconflictsetListPageAsync]. */
    class Builder internal constructor() {

        private var service: DeconflictsetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DeconflictsetListParams? = null
        private var items: List<DeconflictsetListResponse>? = null

        @JvmSynthetic
        internal fun from(deconflictsetListPageAsync: DeconflictsetListPageAsync) = apply {
            service = deconflictsetListPageAsync.service
            streamHandlerExecutor = deconflictsetListPageAsync.streamHandlerExecutor
            params = deconflictsetListPageAsync.params
            items = deconflictsetListPageAsync.items
        }

        fun service(service: DeconflictsetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DeconflictsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DeconflictsetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DeconflictsetListPageAsync].
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
        fun build(): DeconflictsetListPageAsync =
            DeconflictsetListPageAsync(
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

        return other is DeconflictsetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DeconflictsetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
