// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SubstatusServiceAsync.list */
class SubstatusListPageAsync
private constructor(
    private val service: SubstatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SubstatusListParams,
    private val items: List<SubstatusListResponse>,
) : PageAsync<SubstatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SubstatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SubstatusListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubstatusListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SubstatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SubstatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubstatusListPageAsync].
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

    /** A builder for [SubstatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubstatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SubstatusListParams? = null
        private var items: List<SubstatusListResponse>? = null

        @JvmSynthetic
        internal fun from(substatusListPageAsync: SubstatusListPageAsync) = apply {
            service = substatusListPageAsync.service
            streamHandlerExecutor = substatusListPageAsync.streamHandlerExecutor
            params = substatusListPageAsync.params
            items = substatusListPageAsync.items
        }

        fun service(service: SubstatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SubstatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SubstatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SubstatusListPageAsync].
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
        fun build(): SubstatusListPageAsync =
            SubstatusListPageAsync(
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

        return other is SubstatusListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SubstatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
