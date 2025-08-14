// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.taiutc

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see TaiUtcServiceAsync.list */
class TaiUtcListPageAsync
private constructor(
    private val service: TaiUtcServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TaiUtcListParams,
    private val items: List<TaiUtcListResponse>,
) : PageAsync<TaiUtcListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TaiUtcListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TaiUtcListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TaiUtcListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TaiUtcListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TaiUtcListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaiUtcListPageAsync].
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

    /** A builder for [TaiUtcListPageAsync]. */
    class Builder internal constructor() {

        private var service: TaiUtcServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TaiUtcListParams? = null
        private var items: List<TaiUtcListResponse>? = null

        @JvmSynthetic
        internal fun from(taiUtcListPageAsync: TaiUtcListPageAsync) = apply {
            service = taiUtcListPageAsync.service
            streamHandlerExecutor = taiUtcListPageAsync.streamHandlerExecutor
            params = taiUtcListPageAsync.params
            items = taiUtcListPageAsync.items
        }

        fun service(service: TaiUtcServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TaiUtcListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TaiUtcListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TaiUtcListPageAsync].
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
        fun build(): TaiUtcListPageAsync =
            TaiUtcListPageAsync(
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

        return other is TaiUtcListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "TaiUtcListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
