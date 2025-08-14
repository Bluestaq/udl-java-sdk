// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RfBandServiceAsync.list */
class RfBandListPageAsync
private constructor(
    private val service: RfBandServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RfBandListParams,
    private val items: List<RfBandListResponse>,
) : PageAsync<RfBandListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfBandListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RfBandListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RfBandListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RfBandListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfBandListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfBandListPageAsync].
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

    /** A builder for [RfBandListPageAsync]. */
    class Builder internal constructor() {

        private var service: RfBandServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RfBandListParams? = null
        private var items: List<RfBandListResponse>? = null

        @JvmSynthetic
        internal fun from(rfBandListPageAsync: RfBandListPageAsync) = apply {
            service = rfBandListPageAsync.service
            streamHandlerExecutor = rfBandListPageAsync.streamHandlerExecutor
            params = rfBandListPageAsync.params
            items = rfBandListPageAsync.items
        }

        fun service(service: RfBandServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RfBandListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfBandListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfBandListPageAsync].
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
        fun build(): RfBandListPageAsync =
            RfBandListPageAsync(
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

        return other is RfBandListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "RfBandListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
