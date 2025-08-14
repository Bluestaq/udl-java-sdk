// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservations

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see IonoObservationServiceAsync.list */
class IonoObservationListPageAsync
private constructor(
    private val service: IonoObservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IonoObservationListParams,
    private val items: List<IonoObservationListResponse>,
) : PageAsync<IonoObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IonoObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<IonoObservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IonoObservationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IonoObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IonoObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IonoObservationListPageAsync].
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

    /** A builder for [IonoObservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: IonoObservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IonoObservationListParams? = null
        private var items: List<IonoObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(ionoObservationListPageAsync: IonoObservationListPageAsync) = apply {
            service = ionoObservationListPageAsync.service
            streamHandlerExecutor = ionoObservationListPageAsync.streamHandlerExecutor
            params = ionoObservationListPageAsync.params
            items = ionoObservationListPageAsync.items
        }

        fun service(service: IonoObservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IonoObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IonoObservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IonoObservationListPageAsync].
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
        fun build(): IonoObservationListPageAsync =
            IonoObservationListPageAsync(
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

        return other is IonoObservationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "IonoObservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
