// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.statevector.current

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.statevector.StateVectorAbridged
import com.unifieddatalibrary.api.services.async.statevector.CurrentServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CurrentServiceAsync.list */
class CurrentListPageAsync
private constructor(
    private val service: CurrentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CurrentListParams,
    private val items: List<StateVectorAbridged>,
) : PageAsync<StateVectorAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CurrentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CurrentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StateVectorAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CurrentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StateVectorAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CurrentListPageAsync].
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

    /** A builder for [CurrentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CurrentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CurrentListParams? = null
        private var items: List<StateVectorAbridged>? = null

        @JvmSynthetic
        internal fun from(currentListPageAsync: CurrentListPageAsync) = apply {
            service = currentListPageAsync.service
            streamHandlerExecutor = currentListPageAsync.streamHandlerExecutor
            params = currentListPageAsync.params
            items = currentListPageAsync.items
        }

        fun service(service: CurrentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CurrentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StateVectorAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CurrentListPageAsync].
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
        fun build(): CurrentListPageAsync =
            CurrentListPageAsync(
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

        return /* spotless:off */ other is CurrentListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "CurrentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
