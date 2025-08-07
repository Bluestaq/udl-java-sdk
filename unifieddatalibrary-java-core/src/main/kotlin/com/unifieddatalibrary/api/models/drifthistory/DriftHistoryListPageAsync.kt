// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.drifthistory

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.DriftHistoryAbridged
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DriftHistoryServiceAsync.list */
class DriftHistoryListPageAsync
private constructor(
    private val service: DriftHistoryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DriftHistoryListParams,
    private val items: List<DriftHistoryAbridged>,
) : PageAsync<DriftHistoryAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DriftHistoryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DriftHistoryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DriftHistoryAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DriftHistoryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DriftHistoryAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DriftHistoryListPageAsync].
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

    /** A builder for [DriftHistoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: DriftHistoryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DriftHistoryListParams? = null
        private var items: List<DriftHistoryAbridged>? = null

        @JvmSynthetic
        internal fun from(driftHistoryListPageAsync: DriftHistoryListPageAsync) = apply {
            service = driftHistoryListPageAsync.service
            streamHandlerExecutor = driftHistoryListPageAsync.streamHandlerExecutor
            params = driftHistoryListPageAsync.params
            items = driftHistoryListPageAsync.items
        }

        fun service(service: DriftHistoryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DriftHistoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DriftHistoryAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DriftHistoryListPageAsync].
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
        fun build(): DriftHistoryListPageAsync =
            DriftHistoryListPageAsync(
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

        return /* spotless:off */ other is DriftHistoryListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "DriftHistoryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
