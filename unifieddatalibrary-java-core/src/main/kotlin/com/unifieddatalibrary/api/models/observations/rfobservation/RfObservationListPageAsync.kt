// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.rfobservation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.RfObservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RfObservationServiceAsync.list */
class RfObservationListPageAsync
private constructor(
    private val service: RfObservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RfObservationListParams,
    private val items: List<RfObservationListResponse>,
) : PageAsync<RfObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RfObservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RfObservationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RfObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfObservationListPageAsync].
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

    /** A builder for [RfObservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: RfObservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RfObservationListParams? = null
        private var items: List<RfObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(rfObservationListPageAsync: RfObservationListPageAsync) = apply {
            service = rfObservationListPageAsync.service
            streamHandlerExecutor = rfObservationListPageAsync.streamHandlerExecutor
            params = rfObservationListPageAsync.params
            items = rfObservationListPageAsync.items
        }

        fun service(service: RfObservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RfObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfObservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfObservationListPageAsync].
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
        fun build(): RfObservationListPageAsync =
            RfObservationListPageAsync(
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

        return other is RfObservationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "RfObservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
