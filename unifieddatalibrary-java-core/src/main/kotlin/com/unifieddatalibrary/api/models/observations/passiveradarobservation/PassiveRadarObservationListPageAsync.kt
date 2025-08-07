// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.passiveradarobservation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.PassiveRadarObservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see PassiveRadarObservationServiceAsync.list */
class PassiveRadarObservationListPageAsync
private constructor(
    private val service: PassiveRadarObservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PassiveRadarObservationListParams,
    private val items: List<PassiveRadarObservationListResponse>,
) : PageAsync<PassiveRadarObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PassiveRadarObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<PassiveRadarObservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PassiveRadarObservationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PassiveRadarObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PassiveRadarObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PassiveRadarObservationListPageAsync].
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

    /** A builder for [PassiveRadarObservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: PassiveRadarObservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PassiveRadarObservationListParams? = null
        private var items: List<PassiveRadarObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(
            passiveRadarObservationListPageAsync: PassiveRadarObservationListPageAsync
        ) = apply {
            service = passiveRadarObservationListPageAsync.service
            streamHandlerExecutor = passiveRadarObservationListPageAsync.streamHandlerExecutor
            params = passiveRadarObservationListPageAsync.params
            items = passiveRadarObservationListPageAsync.items
        }

        fun service(service: PassiveRadarObservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PassiveRadarObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PassiveRadarObservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PassiveRadarObservationListPageAsync].
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
        fun build(): PassiveRadarObservationListPageAsync =
            PassiveRadarObservationListPageAsync(
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

        return /* spotless:off */ other is PassiveRadarObservationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "PassiveRadarObservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
