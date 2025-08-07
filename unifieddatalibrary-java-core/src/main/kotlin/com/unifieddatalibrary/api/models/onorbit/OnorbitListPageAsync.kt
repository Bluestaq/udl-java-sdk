// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitServiceAsync.list */
class OnorbitListPageAsync
private constructor(
    private val service: OnorbitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitListParams,
    private val items: List<OnorbitListResponse>,
) : PageAsync<OnorbitListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbitListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitListPageAsync].
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

    /** A builder for [OnorbitListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitListParams? = null
        private var items: List<OnorbitListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitListPageAsync: OnorbitListPageAsync) = apply {
            service = onorbitListPageAsync.service
            streamHandlerExecutor = onorbitListPageAsync.streamHandlerExecutor
            params = onorbitListPageAsync.params
            items = onorbitListPageAsync.items
        }

        fun service(service: OnorbitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitListPageAsync].
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
        fun build(): OnorbitListPageAsync =
            OnorbitListPageAsync(
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

        return /* spotless:off */ other is OnorbitListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "OnorbitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
