// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.enginedetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EngineDetailServiceAsync.list */
class EngineDetailListPageAsync
private constructor(
    private val service: EngineDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EngineDetailListParams,
    private val items: List<EngineDetailsAbridged>,
) : PageAsync<EngineDetailsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EngineDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EngineDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EngineDetailsAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EngineDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EngineDetailsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EngineDetailListPageAsync].
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

    /** A builder for [EngineDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: EngineDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EngineDetailListParams? = null
        private var items: List<EngineDetailsAbridged>? = null

        @JvmSynthetic
        internal fun from(engineDetailListPageAsync: EngineDetailListPageAsync) = apply {
            service = engineDetailListPageAsync.service
            streamHandlerExecutor = engineDetailListPageAsync.streamHandlerExecutor
            params = engineDetailListPageAsync.params
            items = engineDetailListPageAsync.items
        }

        fun service(service: EngineDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EngineDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EngineDetailsAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EngineDetailListPageAsync].
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
        fun build(): EngineDetailListPageAsync =
            EngineDetailListPageAsync(
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

        return other is EngineDetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EngineDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
