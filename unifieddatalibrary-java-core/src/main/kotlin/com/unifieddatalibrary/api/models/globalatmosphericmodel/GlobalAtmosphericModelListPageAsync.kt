// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see GlobalAtmosphericModelServiceAsync.list */
class GlobalAtmosphericModelListPageAsync
private constructor(
    private val service: GlobalAtmosphericModelServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GlobalAtmosphericModelListParams,
    private val items: List<GlobalAtmosphericModelListResponse>,
) : PageAsync<GlobalAtmosphericModelListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GlobalAtmosphericModelListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<GlobalAtmosphericModelListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GlobalAtmosphericModelListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GlobalAtmosphericModelListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GlobalAtmosphericModelListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [GlobalAtmosphericModelListPageAsync].
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

    /** A builder for [GlobalAtmosphericModelListPageAsync]. */
    class Builder internal constructor() {

        private var service: GlobalAtmosphericModelServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GlobalAtmosphericModelListParams? = null
        private var items: List<GlobalAtmosphericModelListResponse>? = null

        @JvmSynthetic
        internal fun from(
            globalAtmosphericModelListPageAsync: GlobalAtmosphericModelListPageAsync
        ) = apply {
            service = globalAtmosphericModelListPageAsync.service
            streamHandlerExecutor = globalAtmosphericModelListPageAsync.streamHandlerExecutor
            params = globalAtmosphericModelListPageAsync.params
            items = globalAtmosphericModelListPageAsync.items
        }

        fun service(service: GlobalAtmosphericModelServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalAtmosphericModelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GlobalAtmosphericModelListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GlobalAtmosphericModelListPageAsync].
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
        fun build(): GlobalAtmosphericModelListPageAsync =
            GlobalAtmosphericModelListPageAsync(
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

        return other is GlobalAtmosphericModelListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "GlobalAtmosphericModelListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
