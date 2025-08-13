// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see MissileTrackServiceAsync.list */
class MissileTrackListPageAsync
private constructor(
    private val service: MissileTrackServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MissileTrackListParams,
    private val items: List<MissileTrackListResponse>,
) : PageAsync<MissileTrackListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MissileTrackListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<MissileTrackListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MissileTrackListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MissileTrackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MissileTrackListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissileTrackListPageAsync].
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

    /** A builder for [MissileTrackListPageAsync]. */
    class Builder internal constructor() {

        private var service: MissileTrackServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MissileTrackListParams? = null
        private var items: List<MissileTrackListResponse>? = null

        @JvmSynthetic
        internal fun from(missileTrackListPageAsync: MissileTrackListPageAsync) = apply {
            service = missileTrackListPageAsync.service
            streamHandlerExecutor = missileTrackListPageAsync.streamHandlerExecutor
            params = missileTrackListPageAsync.params
            items = missileTrackListPageAsync.items
        }

        fun service(service: MissileTrackServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MissileTrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MissileTrackListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MissileTrackListPageAsync].
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
        fun build(): MissileTrackListPageAsync =
            MissileTrackListPageAsync(
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

        return other is MissileTrackListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "MissileTrackListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
