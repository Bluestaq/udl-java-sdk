// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SortiePprServiceAsync.list */
class SortiePprListPageAsync
private constructor(
    private val service: SortiePprServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SortiePprListParams,
    private val items: List<SortiePprListResponse>,
) : PageAsync<SortiePprListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SortiePprListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SortiePprListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SortiePprListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SortiePprListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SortiePprListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SortiePprListPageAsync].
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

    /** A builder for [SortiePprListPageAsync]. */
    class Builder internal constructor() {

        private var service: SortiePprServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SortiePprListParams? = null
        private var items: List<SortiePprListResponse>? = null

        @JvmSynthetic
        internal fun from(sortiePprListPageAsync: SortiePprListPageAsync) = apply {
            service = sortiePprListPageAsync.service
            streamHandlerExecutor = sortiePprListPageAsync.streamHandlerExecutor
            params = sortiePprListPageAsync.params
            items = sortiePprListPageAsync.items
        }

        fun service(service: SortiePprServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SortiePprListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SortiePprListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SortiePprListPageAsync].
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
        fun build(): SortiePprListPageAsync =
            SortiePprListPageAsync(
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

        return other is SortiePprListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SortiePprListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
