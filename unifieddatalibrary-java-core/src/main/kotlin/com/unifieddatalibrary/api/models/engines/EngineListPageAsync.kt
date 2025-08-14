// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EngineServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EngineServiceAsync.list */
class EngineListPageAsync
private constructor(
    private val service: EngineServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EngineListParams,
    private val items: List<EngineAbridged>,
) : PageAsync<EngineAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EngineListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EngineListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EngineAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EngineListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EngineAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EngineListPageAsync].
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

    /** A builder for [EngineListPageAsync]. */
    class Builder internal constructor() {

        private var service: EngineServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EngineListParams? = null
        private var items: List<EngineAbridged>? = null

        @JvmSynthetic
        internal fun from(engineListPageAsync: EngineListPageAsync) = apply {
            service = engineListPageAsync.service
            streamHandlerExecutor = engineListPageAsync.streamHandlerExecutor
            params = engineListPageAsync.params
            items = engineListPageAsync.items
        }

        fun service(service: EngineServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EngineListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EngineAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EngineListPageAsync].
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
        fun build(): EngineListPageAsync =
            EngineListPageAsync(
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

        return other is EngineListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EngineListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
