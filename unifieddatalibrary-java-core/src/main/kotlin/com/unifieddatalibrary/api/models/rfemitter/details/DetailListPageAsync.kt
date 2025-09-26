// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.details

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.rfemitter.DetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DetailServiceAsync.list */
class DetailListPageAsync
private constructor(
    private val service: DetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DetailListParams,
    private val items: List<DetailListResponse>,
) : PageAsync<DetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DetailListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailListPageAsync].
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

    /** A builder for [DetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: DetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DetailListParams? = null
        private var items: List<DetailListResponse>? = null

        @JvmSynthetic
        internal fun from(detailListPageAsync: DetailListPageAsync) = apply {
            service = detailListPageAsync.service
            streamHandlerExecutor = detailListPageAsync.streamHandlerExecutor
            params = detailListPageAsync.params
            items = detailListPageAsync.items
        }

        fun service(service: DetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DetailListPageAsync].
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
        fun build(): DetailListPageAsync =
            DetailListPageAsync(
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

        return other is DetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
