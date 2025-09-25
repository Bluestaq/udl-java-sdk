// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.staging

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.rfemitter.StagingServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see StagingServiceAsync.list */
class StagingListPageAsync
private constructor(
    private val service: StagingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StagingListParams,
    private val items: List<StagingListResponse>,
) : PageAsync<StagingListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StagingListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<StagingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StagingListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): StagingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StagingListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StagingListPageAsync].
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

    /** A builder for [StagingListPageAsync]. */
    class Builder internal constructor() {

        private var service: StagingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StagingListParams? = null
        private var items: List<StagingListResponse>? = null

        @JvmSynthetic
        internal fun from(stagingListPageAsync: StagingListPageAsync) = apply {
            service = stagingListPageAsync.service
            streamHandlerExecutor = stagingListPageAsync.streamHandlerExecutor
            params = stagingListPageAsync.params
            items = stagingListPageAsync.items
        }

        fun service(service: StagingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: StagingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StagingListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StagingListPageAsync].
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
        fun build(): StagingListPageAsync =
            StagingListPageAsync(
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

        return other is StagingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "StagingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
