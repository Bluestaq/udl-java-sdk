// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.buses

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.BusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see BusServiceAsync.list */
class BusListPageAsync
private constructor(
    private val service: BusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BusListParams,
    private val items: List<BusAbridged>,
) : PageAsync<BusAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<BusListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BusAbridged> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BusAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BusListPageAsync].
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

    /** A builder for [BusListPageAsync]. */
    class Builder internal constructor() {

        private var service: BusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BusListParams? = null
        private var items: List<BusAbridged>? = null

        @JvmSynthetic
        internal fun from(busListPageAsync: BusListPageAsync) = apply {
            service = busListPageAsync.service
            streamHandlerExecutor = busListPageAsync.streamHandlerExecutor
            params = busListPageAsync.params
            items = busListPageAsync.items
        }

        fun service(service: BusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BusAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BusListPageAsync].
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
        fun build(): BusListPageAsync =
            BusListPageAsync(
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

        return /* spotless:off */ other is BusListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "BusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
