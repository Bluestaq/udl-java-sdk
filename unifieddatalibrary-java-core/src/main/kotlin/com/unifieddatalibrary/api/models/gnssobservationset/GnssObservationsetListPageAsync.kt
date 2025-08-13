// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssobservationset

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see GnssObservationsetServiceAsync.list */
class GnssObservationsetListPageAsync
private constructor(
    private val service: GnssObservationsetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GnssObservationsetListParams,
    private val items: List<GnssObservationsetListResponse>,
) : PageAsync<GnssObservationsetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GnssObservationsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<GnssObservationsetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GnssObservationsetListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GnssObservationsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GnssObservationsetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [GnssObservationsetListPageAsync].
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

    /** A builder for [GnssObservationsetListPageAsync]. */
    class Builder internal constructor() {

        private var service: GnssObservationsetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GnssObservationsetListParams? = null
        private var items: List<GnssObservationsetListResponse>? = null

        @JvmSynthetic
        internal fun from(gnssObservationsetListPageAsync: GnssObservationsetListPageAsync) =
            apply {
                service = gnssObservationsetListPageAsync.service
                streamHandlerExecutor = gnssObservationsetListPageAsync.streamHandlerExecutor
                params = gnssObservationsetListPageAsync.params
                items = gnssObservationsetListPageAsync.items
            }

        fun service(service: GnssObservationsetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GnssObservationsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GnssObservationsetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GnssObservationsetListPageAsync].
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
        fun build(): GnssObservationsetListPageAsync =
            GnssObservationsetListPageAsync(
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

        return other is GnssObservationsetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "GnssObservationsetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
