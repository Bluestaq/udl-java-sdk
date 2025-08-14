// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airtransportmissions

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirTransportMissionServiceAsync.list */
class AirTransportMissionListPageAsync
private constructor(
    private val service: AirTransportMissionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirTransportMissionListParams,
    private val items: List<AirTransportMissionAbridged>,
) : PageAsync<AirTransportMissionAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirTransportMissionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirTransportMissionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirTransportMissionAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirTransportMissionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirTransportMissionAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AirTransportMissionListPageAsync].
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

    /** A builder for [AirTransportMissionListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirTransportMissionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirTransportMissionListParams? = null
        private var items: List<AirTransportMissionAbridged>? = null

        @JvmSynthetic
        internal fun from(airTransportMissionListPageAsync: AirTransportMissionListPageAsync) =
            apply {
                service = airTransportMissionListPageAsync.service
                streamHandlerExecutor = airTransportMissionListPageAsync.streamHandlerExecutor
                params = airTransportMissionListPageAsync.params
                items = airTransportMissionListPageAsync.items
            }

        fun service(service: AirTransportMissionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirTransportMissionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirTransportMissionAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirTransportMissionListPageAsync].
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
        fun build(): AirTransportMissionListPageAsync =
            AirTransportMissionListPageAsync(
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

        return other is AirTransportMissionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AirTransportMissionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
