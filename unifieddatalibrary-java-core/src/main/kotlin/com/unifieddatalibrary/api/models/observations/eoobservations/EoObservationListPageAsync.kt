// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.eoobservations

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EoObservationServiceAsync.list */
class EoObservationListPageAsync
private constructor(
    private val service: EoObservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EoObservationListParams,
    private val items: List<EoObservationAbridged>,
) : PageAsync<EoObservationAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EoObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EoObservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EoObservationAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EoObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EoObservationAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EoObservationListPageAsync].
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

    /** A builder for [EoObservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: EoObservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EoObservationListParams? = null
        private var items: List<EoObservationAbridged>? = null

        @JvmSynthetic
        internal fun from(eoObservationListPageAsync: EoObservationListPageAsync) = apply {
            service = eoObservationListPageAsync.service
            streamHandlerExecutor = eoObservationListPageAsync.streamHandlerExecutor
            params = eoObservationListPageAsync.params
            items = eoObservationListPageAsync.items
        }

        fun service(service: EoObservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EoObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EoObservationAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EoObservationListPageAsync].
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
        fun build(): EoObservationListPageAsync =
            EoObservationListPageAsync(
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

        return other is EoObservationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EoObservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
