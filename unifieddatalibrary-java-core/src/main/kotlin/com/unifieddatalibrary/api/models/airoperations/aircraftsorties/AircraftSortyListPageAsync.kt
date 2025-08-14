// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.aircraftsorties

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortyServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftSortyServiceAsync.list */
class AircraftSortyListPageAsync
private constructor(
    private val service: AircraftSortyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AircraftSortyListParams,
    private val items: List<AircraftsortieAbridged>,
) : PageAsync<AircraftsortieAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftSortyListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AircraftSortyListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AircraftsortieAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AircraftSortyListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftsortieAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftSortyListPageAsync].
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

    /** A builder for [AircraftSortyListPageAsync]. */
    class Builder internal constructor() {

        private var service: AircraftSortyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AircraftSortyListParams? = null
        private var items: List<AircraftsortieAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftSortyListPageAsync: AircraftSortyListPageAsync) = apply {
            service = aircraftSortyListPageAsync.service
            streamHandlerExecutor = aircraftSortyListPageAsync.streamHandlerExecutor
            params = aircraftSortyListPageAsync.params
            items = aircraftSortyListPageAsync.items
        }

        fun service(service: AircraftSortyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftSortyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftsortieAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftSortyListPageAsync].
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
        fun build(): AircraftSortyListPageAsync =
            AircraftSortyListPageAsync(
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

        return other is AircraftSortyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AircraftSortyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
