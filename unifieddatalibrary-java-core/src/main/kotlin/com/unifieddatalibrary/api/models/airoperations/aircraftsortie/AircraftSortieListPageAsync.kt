// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.aircraftsortie

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortieServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftSortieServiceAsync.list */
class AircraftSortieListPageAsync
private constructor(
    private val service: AircraftSortieServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AircraftSortieListParams,
    private val items: List<AircraftsortieAbridged>,
) : PageAsync<AircraftsortieAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftSortieListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AircraftSortieListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AircraftsortieAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AircraftSortieListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftsortieAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftSortieListPageAsync].
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

    /** A builder for [AircraftSortieListPageAsync]. */
    class Builder internal constructor() {

        private var service: AircraftSortieServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AircraftSortieListParams? = null
        private var items: List<AircraftsortieAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftSortieListPageAsync: AircraftSortieListPageAsync) = apply {
            service = aircraftSortieListPageAsync.service
            streamHandlerExecutor = aircraftSortieListPageAsync.streamHandlerExecutor
            params = aircraftSortieListPageAsync.params
            items = aircraftSortieListPageAsync.items
        }

        fun service(service: AircraftSortieServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftSortieListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftsortieAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftSortieListPageAsync].
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
        fun build(): AircraftSortieListPageAsync =
            AircraftSortieListPageAsync(
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

        return /* spotless:off */ other is AircraftSortieListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AircraftSortieListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
