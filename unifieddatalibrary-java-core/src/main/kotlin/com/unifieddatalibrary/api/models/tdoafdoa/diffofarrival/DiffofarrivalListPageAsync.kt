// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.tdoafdoa.DiffofarrivalServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DiffofarrivalServiceAsync.list */
class DiffofarrivalListPageAsync
private constructor(
    private val service: DiffofarrivalServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DiffofarrivalListParams,
    private val items: List<DiffofarrivalAbridged>,
) : PageAsync<DiffofarrivalAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DiffofarrivalListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DiffofarrivalListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DiffofarrivalAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DiffofarrivalListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DiffofarrivalAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiffofarrivalListPageAsync].
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

    /** A builder for [DiffofarrivalListPageAsync]. */
    class Builder internal constructor() {

        private var service: DiffofarrivalServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DiffofarrivalListParams? = null
        private var items: List<DiffofarrivalAbridged>? = null

        @JvmSynthetic
        internal fun from(diffofarrivalListPageAsync: DiffofarrivalListPageAsync) = apply {
            service = diffofarrivalListPageAsync.service
            streamHandlerExecutor = diffofarrivalListPageAsync.streamHandlerExecutor
            params = diffofarrivalListPageAsync.params
            items = diffofarrivalListPageAsync.items
        }

        fun service(service: DiffofarrivalServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DiffofarrivalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DiffofarrivalAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DiffofarrivalListPageAsync].
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
        fun build(): DiffofarrivalListPageAsync =
            DiffofarrivalListPageAsync(
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

        return /* spotless:off */ other is DiffofarrivalListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "DiffofarrivalListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
