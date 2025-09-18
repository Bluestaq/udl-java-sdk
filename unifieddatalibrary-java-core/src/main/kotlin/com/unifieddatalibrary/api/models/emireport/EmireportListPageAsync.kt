// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emireport

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EmireportServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EmireportServiceAsync.list */
class EmireportListPageAsync
private constructor(
    private val service: EmireportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmireportListParams,
    private val items: List<EmireportListResponse>,
) : PageAsync<EmireportListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EmireportListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EmireportListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmireportListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmireportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EmireportListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmireportListPageAsync].
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

    /** A builder for [EmireportListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmireportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmireportListParams? = null
        private var items: List<EmireportListResponse>? = null

        @JvmSynthetic
        internal fun from(emireportListPageAsync: EmireportListPageAsync) = apply {
            service = emireportListPageAsync.service
            streamHandlerExecutor = emireportListPageAsync.streamHandlerExecutor
            params = emireportListPageAsync.params
            items = emireportListPageAsync.items
        }

        fun service(service: EmireportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmireportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EmireportListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EmireportListPageAsync].
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
        fun build(): EmireportListPageAsync =
            EmireportListPageAsync(
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

        return other is EmireportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EmireportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
