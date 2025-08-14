// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RfBandTypeServiceAsync.list */
class RfBandTypeListPageAsync
private constructor(
    private val service: RfBandTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RfBandTypeListParams,
    private val items: List<RfBandTypeListResponse>,
) : PageAsync<RfBandTypeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfBandTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RfBandTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RfBandTypeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RfBandTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfBandTypeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfBandTypeListPageAsync].
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

    /** A builder for [RfBandTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: RfBandTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RfBandTypeListParams? = null
        private var items: List<RfBandTypeListResponse>? = null

        @JvmSynthetic
        internal fun from(rfBandTypeListPageAsync: RfBandTypeListPageAsync) = apply {
            service = rfBandTypeListPageAsync.service
            streamHandlerExecutor = rfBandTypeListPageAsync.streamHandlerExecutor
            params = rfBandTypeListPageAsync.params
            items = rfBandTypeListPageAsync.items
        }

        fun service(service: RfBandTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RfBandTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfBandTypeListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfBandTypeListPageAsync].
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
        fun build(): RfBandTypeListPageAsync =
            RfBandTypeListPageAsync(
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

        return other is RfBandTypeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "RfBandTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
