// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see StarCatalogServiceAsync.list */
class StarCatalogListPageAsync
private constructor(
    private val service: StarCatalogServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StarCatalogListParams,
    private val items: List<StarCatalogListResponse>,
) : PageAsync<StarCatalogListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StarCatalogListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<StarCatalogListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StarCatalogListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): StarCatalogListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StarCatalogListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StarCatalogListPageAsync].
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

    /** A builder for [StarCatalogListPageAsync]. */
    class Builder internal constructor() {

        private var service: StarCatalogServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StarCatalogListParams? = null
        private var items: List<StarCatalogListResponse>? = null

        @JvmSynthetic
        internal fun from(starCatalogListPageAsync: StarCatalogListPageAsync) = apply {
            service = starCatalogListPageAsync.service
            streamHandlerExecutor = starCatalogListPageAsync.streamHandlerExecutor
            params = starCatalogListPageAsync.params
            items = starCatalogListPageAsync.items
        }

        fun service(service: StarCatalogServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: StarCatalogListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StarCatalogListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StarCatalogListPageAsync].
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
        fun build(): StarCatalogListPageAsync =
            StarCatalogListPageAsync(
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

        return other is StarCatalogListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "StarCatalogListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
