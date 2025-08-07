// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ais

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AiServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AiServiceAsync.list */
class AiListPageAsync
private constructor(
    private val service: AiServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AiListParams,
    private val items: List<AisAbridged>,
) : PageAsync<AisAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AiListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AiListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AisAbridged> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AisAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiListPageAsync].
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

    /** A builder for [AiListPageAsync]. */
    class Builder internal constructor() {

        private var service: AiServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AiListParams? = null
        private var items: List<AisAbridged>? = null

        @JvmSynthetic
        internal fun from(aiListPageAsync: AiListPageAsync) = apply {
            service = aiListPageAsync.service
            streamHandlerExecutor = aiListPageAsync.streamHandlerExecutor
            params = aiListPageAsync.params
            items = aiListPageAsync.items
        }

        fun service(service: AiServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AiListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AisAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AiListPageAsync].
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
        fun build(): AiListPageAsync =
            AiListPageAsync(
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

        return /* spotless:off */ other is AiListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AiListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
