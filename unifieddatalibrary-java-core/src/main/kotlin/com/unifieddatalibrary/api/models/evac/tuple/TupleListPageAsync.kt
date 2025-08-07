// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.evac.tuple

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.EvacFull
import com.unifieddatalibrary.api.services.async.evac.TupleServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see TupleServiceAsync.list */
class TupleListPageAsync
private constructor(
    private val service: TupleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TupleListParams,
    private val items: List<EvacFull>,
) : PageAsync<EvacFull> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TupleListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<TupleListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EvacFull> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TupleListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EvacFull> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TupleListPageAsync].
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

    /** A builder for [TupleListPageAsync]. */
    class Builder internal constructor() {

        private var service: TupleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TupleListParams? = null
        private var items: List<EvacFull>? = null

        @JvmSynthetic
        internal fun from(tupleListPageAsync: TupleListPageAsync) = apply {
            service = tupleListPageAsync.service
            streamHandlerExecutor = tupleListPageAsync.streamHandlerExecutor
            params = tupleListPageAsync.params
            items = tupleListPageAsync.items
        }

        fun service(service: TupleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TupleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EvacFull>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TupleListPageAsync].
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
        fun build(): TupleListPageAsync =
            TupleListPageAsync(
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

        return /* spotless:off */ other is TupleListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "TupleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
