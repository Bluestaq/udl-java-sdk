// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see GroundImageryServiceAsync.list */
class GroundImageryListPageAsync
private constructor(
    private val service: GroundImageryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GroundImageryListParams,
    private val items: List<GroundImageryListResponse>,
) : PageAsync<GroundImageryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GroundImageryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<GroundImageryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GroundImageryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GroundImageryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GroundImageryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroundImageryListPageAsync].
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

    /** A builder for [GroundImageryListPageAsync]. */
    class Builder internal constructor() {

        private var service: GroundImageryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GroundImageryListParams? = null
        private var items: List<GroundImageryListResponse>? = null

        @JvmSynthetic
        internal fun from(groundImageryListPageAsync: GroundImageryListPageAsync) = apply {
            service = groundImageryListPageAsync.service
            streamHandlerExecutor = groundImageryListPageAsync.streamHandlerExecutor
            params = groundImageryListPageAsync.params
            items = groundImageryListPageAsync.items
        }

        fun service(service: GroundImageryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GroundImageryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GroundImageryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GroundImageryListPageAsync].
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
        fun build(): GroundImageryListPageAsync =
            GroundImageryListPageAsync(
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

        return other is GroundImageryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "GroundImageryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
