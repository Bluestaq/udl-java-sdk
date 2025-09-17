// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.LaseremitterServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaseremitterServiceAsync.list */
class LaseremitterListPageAsync
private constructor(
    private val service: LaseremitterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaseremitterListParams,
    private val items: List<LaseremitterListResponse>,
) : PageAsync<LaseremitterListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaseremitterListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LaseremitterListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaseremitterListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LaseremitterListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaseremitterListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaseremitterListPageAsync].
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

    /** A builder for [LaseremitterListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaseremitterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaseremitterListParams? = null
        private var items: List<LaseremitterListResponse>? = null

        @JvmSynthetic
        internal fun from(laseremitterListPageAsync: LaseremitterListPageAsync) = apply {
            service = laseremitterListPageAsync.service
            streamHandlerExecutor = laseremitterListPageAsync.streamHandlerExecutor
            params = laseremitterListPageAsync.params
            items = laseremitterListPageAsync.items
        }

        fun service(service: LaseremitterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LaseremitterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaseremitterListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaseremitterListPageAsync].
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
        fun build(): LaseremitterListPageAsync =
            LaseremitterListPageAsync(
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

        return other is LaseremitterListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "LaseremitterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
