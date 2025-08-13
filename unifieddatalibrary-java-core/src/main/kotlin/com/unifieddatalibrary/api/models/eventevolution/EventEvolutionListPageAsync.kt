// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EventEvolutionServiceAsync.list */
class EventEvolutionListPageAsync
private constructor(
    private val service: EventEvolutionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EventEvolutionListParams,
    private val items: List<EventEvolutionListResponse>,
) : PageAsync<EventEvolutionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EventEvolutionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EventEvolutionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EventEvolutionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EventEvolutionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EventEvolutionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventEvolutionListPageAsync].
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

    /** A builder for [EventEvolutionListPageAsync]. */
    class Builder internal constructor() {

        private var service: EventEvolutionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EventEvolutionListParams? = null
        private var items: List<EventEvolutionListResponse>? = null

        @JvmSynthetic
        internal fun from(eventEvolutionListPageAsync: EventEvolutionListPageAsync) = apply {
            service = eventEvolutionListPageAsync.service
            streamHandlerExecutor = eventEvolutionListPageAsync.streamHandlerExecutor
            params = eventEvolutionListPageAsync.params
            items = eventEvolutionListPageAsync.items
        }

        fun service(service: EventEvolutionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EventEvolutionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EventEvolutionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EventEvolutionListPageAsync].
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
        fun build(): EventEvolutionListPageAsync =
            EventEvolutionListPageAsync(
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

        return other is EventEvolutionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EventEvolutionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
