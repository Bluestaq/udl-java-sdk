// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ElsetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ElsetServiceAsync.list */
class ElsetListPageAsync
private constructor(
    private val service: ElsetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ElsetListParams,
    private val items: List<ElsetAbridged>,
) : PageAsync<ElsetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ElsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ElsetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ElsetAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ElsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ElsetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ElsetListPageAsync].
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

    /** A builder for [ElsetListPageAsync]. */
    class Builder internal constructor() {

        private var service: ElsetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ElsetListParams? = null
        private var items: List<ElsetAbridged>? = null

        @JvmSynthetic
        internal fun from(elsetListPageAsync: ElsetListPageAsync) = apply {
            service = elsetListPageAsync.service
            streamHandlerExecutor = elsetListPageAsync.streamHandlerExecutor
            params = elsetListPageAsync.params
            items = elsetListPageAsync.items
        }

        fun service(service: ElsetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ElsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ElsetAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ElsetListPageAsync].
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
        fun build(): ElsetListPageAsync =
            ElsetListPageAsync(
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

        return other is ElsetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "ElsetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
