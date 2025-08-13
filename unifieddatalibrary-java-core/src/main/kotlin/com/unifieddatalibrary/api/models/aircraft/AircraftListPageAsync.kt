// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraft

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AircraftServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftServiceAsync.list */
class AircraftListPageAsync
private constructor(
    private val service: AircraftServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AircraftListParams,
    private val items: List<AircraftAbridged>,
) : PageAsync<AircraftAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AircraftListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AircraftAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AircraftListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftListPageAsync].
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

    /** A builder for [AircraftListPageAsync]. */
    class Builder internal constructor() {

        private var service: AircraftServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AircraftListParams? = null
        private var items: List<AircraftAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftListPageAsync: AircraftListPageAsync) = apply {
            service = aircraftListPageAsync.service
            streamHandlerExecutor = aircraftListPageAsync.streamHandlerExecutor
            params = aircraftListPageAsync.params
            items = aircraftListPageAsync.items
        }

        fun service(service: AircraftServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftListPageAsync].
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
        fun build(): AircraftListPageAsync =
            AircraftListPageAsync(
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

        return other is AircraftListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AircraftListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
