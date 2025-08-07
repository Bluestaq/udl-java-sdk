// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.vessel

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.VesselServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see VesselServiceAsync.list */
class VesselListPageAsync
private constructor(
    private val service: VesselServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VesselListParams,
    private val items: List<VesselListResponse>,
) : PageAsync<VesselListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): VesselListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<VesselListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VesselListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VesselListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VesselListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VesselListPageAsync].
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

    /** A builder for [VesselListPageAsync]. */
    class Builder internal constructor() {

        private var service: VesselServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VesselListParams? = null
        private var items: List<VesselListResponse>? = null

        @JvmSynthetic
        internal fun from(vesselListPageAsync: VesselListPageAsync) = apply {
            service = vesselListPageAsync.service
            streamHandlerExecutor = vesselListPageAsync.streamHandlerExecutor
            params = vesselListPageAsync.params
            items = vesselListPageAsync.items
        }

        fun service(service: VesselServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VesselListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<VesselListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VesselListPageAsync].
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
        fun build(): VesselListPageAsync =
            VesselListPageAsync(
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

        return /* spotless:off */ other is VesselListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "VesselListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
