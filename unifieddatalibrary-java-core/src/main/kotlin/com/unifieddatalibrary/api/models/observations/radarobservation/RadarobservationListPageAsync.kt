// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.radarobservation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.RadarobservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RadarobservationServiceAsync.list */
class RadarobservationListPageAsync
private constructor(
    private val service: RadarobservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RadarobservationListParams,
    private val items: List<RadarobservationListResponse>,
) : PageAsync<RadarobservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RadarobservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RadarobservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RadarobservationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RadarobservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RadarobservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RadarobservationListPageAsync].
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

    /** A builder for [RadarobservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: RadarobservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RadarobservationListParams? = null
        private var items: List<RadarobservationListResponse>? = null

        @JvmSynthetic
        internal fun from(radarobservationListPageAsync: RadarobservationListPageAsync) = apply {
            service = radarobservationListPageAsync.service
            streamHandlerExecutor = radarobservationListPageAsync.streamHandlerExecutor
            params = radarobservationListPageAsync.params
            items = radarobservationListPageAsync.items
        }

        fun service(service: RadarobservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RadarobservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RadarobservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RadarobservationListPageAsync].
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
        fun build(): RadarobservationListPageAsync =
            RadarobservationListPageAsync(
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

        return other is RadarobservationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "RadarobservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
