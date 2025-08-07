// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatusremarks

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AircraftStatusRemarkServiceAsync.list */
class AircraftStatusRemarkListPageAsync
private constructor(
    private val service: AircraftStatusRemarkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AircraftStatusRemarkListParams,
    private val items: List<AircraftstatusremarkAbridged>,
) : PageAsync<AircraftstatusremarkAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AircraftStatusRemarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AircraftStatusRemarkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AircraftstatusremarkAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AircraftStatusRemarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AircraftstatusremarkAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AircraftStatusRemarkListPageAsync].
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

    /** A builder for [AircraftStatusRemarkListPageAsync]. */
    class Builder internal constructor() {

        private var service: AircraftStatusRemarkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AircraftStatusRemarkListParams? = null
        private var items: List<AircraftstatusremarkAbridged>? = null

        @JvmSynthetic
        internal fun from(aircraftStatusRemarkListPageAsync: AircraftStatusRemarkListPageAsync) =
            apply {
                service = aircraftStatusRemarkListPageAsync.service
                streamHandlerExecutor = aircraftStatusRemarkListPageAsync.streamHandlerExecutor
                params = aircraftStatusRemarkListPageAsync.params
                items = aircraftStatusRemarkListPageAsync.items
            }

        fun service(service: AircraftStatusRemarkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AircraftStatusRemarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AircraftstatusremarkAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AircraftStatusRemarkListPageAsync].
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
        fun build(): AircraftStatusRemarkListPageAsync =
            AircraftStatusRemarkListPageAsync(
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

        return /* spotless:off */ other is AircraftStatusRemarkListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AircraftStatusRemarkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
