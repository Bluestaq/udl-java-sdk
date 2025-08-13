// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missionassignment

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see MissionAssignmentServiceAsync.list */
class MissionAssignmentListPageAsync
private constructor(
    private val service: MissionAssignmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MissionAssignmentListParams,
    private val items: List<MissionAssignmentListResponse>,
) : PageAsync<MissionAssignmentListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MissionAssignmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<MissionAssignmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MissionAssignmentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MissionAssignmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MissionAssignmentListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MissionAssignmentListPageAsync].
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

    /** A builder for [MissionAssignmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: MissionAssignmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MissionAssignmentListParams? = null
        private var items: List<MissionAssignmentListResponse>? = null

        @JvmSynthetic
        internal fun from(missionAssignmentListPageAsync: MissionAssignmentListPageAsync) = apply {
            service = missionAssignmentListPageAsync.service
            streamHandlerExecutor = missionAssignmentListPageAsync.streamHandlerExecutor
            params = missionAssignmentListPageAsync.params
            items = missionAssignmentListPageAsync.items
        }

        fun service(service: MissionAssignmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MissionAssignmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MissionAssignmentListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MissionAssignmentListPageAsync].
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
        fun build(): MissionAssignmentListPageAsync =
            MissionAssignmentListPageAsync(
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

        return other is MissionAssignmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "MissionAssignmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
