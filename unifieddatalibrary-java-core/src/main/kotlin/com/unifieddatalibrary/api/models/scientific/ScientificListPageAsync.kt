// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scientific

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ScientificServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ScientificServiceAsync.list */
class ScientificListPageAsync
private constructor(
    private val service: ScientificServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ScientificListParams,
    private val items: List<ScientificListResponse>,
) : PageAsync<ScientificListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ScientificListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ScientificListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ScientificListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ScientificListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ScientificListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScientificListPageAsync].
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

    /** A builder for [ScientificListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScientificServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ScientificListParams? = null
        private var items: List<ScientificListResponse>? = null

        @JvmSynthetic
        internal fun from(scientificListPageAsync: ScientificListPageAsync) = apply {
            service = scientificListPageAsync.service
            streamHandlerExecutor = scientificListPageAsync.streamHandlerExecutor
            params = scientificListPageAsync.params
            items = scientificListPageAsync.items
        }

        fun service(service: ScientificServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ScientificListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ScientificListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ScientificListPageAsync].
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
        fun build(): ScientificListPageAsync =
            ScientificListPageAsync(
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

        return other is ScientificListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "ScientificListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
