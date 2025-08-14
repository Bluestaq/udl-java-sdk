// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.StatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see StatusServiceAsync.list */
class StatusListPageAsync
private constructor(
    private val service: StatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StatusListParams,
    private val items: List<StatusListResponse>,
) : PageAsync<StatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<StatusListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StatusListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): StatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StatusListPageAsync].
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

    /** A builder for [StatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StatusListParams? = null
        private var items: List<StatusListResponse>? = null

        @JvmSynthetic
        internal fun from(statusListPageAsync: StatusListPageAsync) = apply {
            service = statusListPageAsync.service
            streamHandlerExecutor = statusListPageAsync.streamHandlerExecutor
            params = statusListPageAsync.params
            items = statusListPageAsync.items
        }

        fun service(service: StatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: StatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StatusListPageAsync].
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
        fun build(): StatusListPageAsync =
            StatusListPageAsync(
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

        return other is StatusListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "StatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
