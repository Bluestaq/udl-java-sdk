// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitdetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitdetailServiceAsync.list */
class OnorbitdetailListPageAsync
private constructor(
    private val service: OnorbitdetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitdetailListParams,
    private val items: List<OnorbitdetailListResponse>,
) : PageAsync<OnorbitdetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitdetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbitdetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitdetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitdetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitdetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitdetailListPageAsync].
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

    /** A builder for [OnorbitdetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitdetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitdetailListParams? = null
        private var items: List<OnorbitdetailListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitdetailListPageAsync: OnorbitdetailListPageAsync) = apply {
            service = onorbitdetailListPageAsync.service
            streamHandlerExecutor = onorbitdetailListPageAsync.streamHandlerExecutor
            params = onorbitdetailListPageAsync.params
            items = onorbitdetailListPageAsync.items
        }

        fun service(service: OnorbitdetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitdetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitdetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitdetailListPageAsync].
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
        fun build(): OnorbitdetailListPageAsync =
            OnorbitdetailListPageAsync(
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

        return other is OnorbitdetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "OnorbitdetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
