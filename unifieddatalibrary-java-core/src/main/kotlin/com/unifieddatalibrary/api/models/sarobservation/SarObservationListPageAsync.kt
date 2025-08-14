// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sarobservation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SarObservationServiceAsync.list */
class SarObservationListPageAsync
private constructor(
    private val service: SarObservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SarObservationListParams,
    private val items: List<SarObservationListResponse>,
) : PageAsync<SarObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SarObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SarObservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SarObservationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SarObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SarObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SarObservationListPageAsync].
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

    /** A builder for [SarObservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: SarObservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SarObservationListParams? = null
        private var items: List<SarObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(sarObservationListPageAsync: SarObservationListPageAsync) = apply {
            service = sarObservationListPageAsync.service
            streamHandlerExecutor = sarObservationListPageAsync.streamHandlerExecutor
            params = sarObservationListPageAsync.params
            items = sarObservationListPageAsync.items
        }

        fun service(service: SarObservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SarObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SarObservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SarObservationListPageAsync].
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
        fun build(): SarObservationListPageAsync =
            SarObservationListPageAsync(
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

        return other is SarObservationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SarObservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
