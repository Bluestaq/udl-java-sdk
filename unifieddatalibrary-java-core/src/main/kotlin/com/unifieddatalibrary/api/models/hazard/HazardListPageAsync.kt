// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.hazard

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see HazardServiceAsync.list */
class HazardListPageAsync
private constructor(
    private val service: HazardServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HazardListParams,
    private val items: List<HazardListResponse>,
) : PageAsync<HazardListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HazardListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<HazardListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<HazardListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HazardListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<HazardListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HazardListPageAsync].
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

    /** A builder for [HazardListPageAsync]. */
    class Builder internal constructor() {

        private var service: HazardServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HazardListParams? = null
        private var items: List<HazardListResponse>? = null

        @JvmSynthetic
        internal fun from(hazardListPageAsync: HazardListPageAsync) = apply {
            service = hazardListPageAsync.service
            streamHandlerExecutor = hazardListPageAsync.streamHandlerExecutor
            params = hazardListPageAsync.params
            items = hazardListPageAsync.items
        }

        fun service(service: HazardServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HazardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<HazardListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HazardListPageAsync].
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
        fun build(): HazardListPageAsync =
            HazardListPageAsync(
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

        return /* spotless:off */ other is HazardListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "HazardListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
