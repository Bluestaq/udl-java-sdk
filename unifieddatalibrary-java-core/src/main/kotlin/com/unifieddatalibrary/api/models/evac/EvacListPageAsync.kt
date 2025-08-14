// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.evac

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EvacServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EvacServiceAsync.list */
class EvacListPageAsync
private constructor(
    private val service: EvacServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EvacListParams,
    private val items: List<EvacAbridged>,
) : PageAsync<EvacAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EvacListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EvacListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EvacAbridged> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EvacListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EvacAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvacListPageAsync].
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

    /** A builder for [EvacListPageAsync]. */
    class Builder internal constructor() {

        private var service: EvacServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EvacListParams? = null
        private var items: List<EvacAbridged>? = null

        @JvmSynthetic
        internal fun from(evacListPageAsync: EvacListPageAsync) = apply {
            service = evacListPageAsync.service
            streamHandlerExecutor = evacListPageAsync.streamHandlerExecutor
            params = evacListPageAsync.params
            items = evacListPageAsync.items
        }

        fun service(service: EvacServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EvacListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EvacAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EvacListPageAsync].
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
        fun build(): EvacListPageAsync =
            EvacListPageAsync(
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

        return other is EvacListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EvacListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
