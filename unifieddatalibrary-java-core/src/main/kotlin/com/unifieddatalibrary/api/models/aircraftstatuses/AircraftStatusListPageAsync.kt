// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatuses

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftStatusServiceAsync.list */
class AircraftStatusListPageAsync
private constructor(
    private val service: AircraftStatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AircraftStatusListParams,
    private val items: List<AircraftstatusAbridged>,
) : PageAsync<AircraftstatusAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AircraftStatusListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AircraftstatusAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AircraftStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftstatusAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AircraftStatusListPageAsync].
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

    /** A builder for [AircraftStatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: AircraftStatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AircraftStatusListParams? = null
        private var items: List<AircraftstatusAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftStatusListPageAsync: AircraftStatusListPageAsync) = apply {
            service = aircraftStatusListPageAsync.service
            streamHandlerExecutor = aircraftStatusListPageAsync.streamHandlerExecutor
            params = aircraftStatusListPageAsync.params
            items = aircraftStatusListPageAsync.items
        }

        fun service(service: AircraftStatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftstatusAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftStatusListPageAsync].
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
        fun build(): AircraftStatusListPageAsync =
            AircraftStatusListPageAsync(
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

        return other is AircraftStatusListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AircraftStatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
