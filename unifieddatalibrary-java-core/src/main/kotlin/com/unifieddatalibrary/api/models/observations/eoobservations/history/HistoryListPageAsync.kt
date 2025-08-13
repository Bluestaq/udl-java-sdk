// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.eoobservations.history

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.EoObservationFull
import com.unifieddatalibrary.api.services.async.observations.eoobservations.HistoryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see HistoryServiceAsync.list */
class HistoryListPageAsync
private constructor(
    private val service: HistoryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HistoryListParams,
    private val items: List<EoObservationFull>,
) : PageAsync<EoObservationFull> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HistoryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<HistoryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EoObservationFull> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HistoryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EoObservationFull> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HistoryListPageAsync].
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

    /** A builder for [HistoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: HistoryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HistoryListParams? = null
        private var items: List<EoObservationFull>? = null

        @JvmSynthetic
        internal fun from(historyListPageAsync: HistoryListPageAsync) = apply {
            service = historyListPageAsync.service
            streamHandlerExecutor = historyListPageAsync.streamHandlerExecutor
            params = historyListPageAsync.params
            items = historyListPageAsync.items
        }

        fun service(service: HistoryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HistoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EoObservationFull>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HistoryListPageAsync].
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
        fun build(): HistoryListPageAsync =
            HistoryListPageAsync(
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

        return other is HistoryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "HistoryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
