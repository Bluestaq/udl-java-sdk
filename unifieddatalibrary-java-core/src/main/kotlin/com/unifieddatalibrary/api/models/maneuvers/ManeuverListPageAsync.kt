// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.maneuvers

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ManeuverServiceAsync.list */
class ManeuverListPageAsync
private constructor(
    private val service: ManeuverServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ManeuverListParams,
    private val items: List<ManeuverListResponse>,
) : PageAsync<ManeuverListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManeuverListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ManeuverListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ManeuverListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ManeuverListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ManeuverListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManeuverListPageAsync].
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

    /** A builder for [ManeuverListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManeuverServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ManeuverListParams? = null
        private var items: List<ManeuverListResponse>? = null

        @JvmSynthetic
        internal fun from(maneuverListPageAsync: ManeuverListPageAsync) = apply {
            service = maneuverListPageAsync.service
            streamHandlerExecutor = maneuverListPageAsync.streamHandlerExecutor
            params = maneuverListPageAsync.params
            items = maneuverListPageAsync.items
        }

        fun service(service: ManeuverServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ManeuverListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ManeuverListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ManeuverListPageAsync].
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
        fun build(): ManeuverListPageAsync =
            ManeuverListPageAsync(
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

        return other is ManeuverListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "ManeuverListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
