// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.ObscorrelationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ObscorrelationServiceAsync.list */
class ObscorrelationListPageAsync
private constructor(
    private val service: ObscorrelationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ObscorrelationListParams,
    private val items: List<ObscorrelationListResponse>,
) : PageAsync<ObscorrelationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ObscorrelationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ObscorrelationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ObscorrelationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ObscorrelationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ObscorrelationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObscorrelationListPageAsync].
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

    /** A builder for [ObscorrelationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ObscorrelationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ObscorrelationListParams? = null
        private var items: List<ObscorrelationListResponse>? = null

        @JvmSynthetic
        internal fun from(obscorrelationListPageAsync: ObscorrelationListPageAsync) = apply {
            service = obscorrelationListPageAsync.service
            streamHandlerExecutor = obscorrelationListPageAsync.streamHandlerExecutor
            params = obscorrelationListPageAsync.params
            items = obscorrelationListPageAsync.items
        }

        fun service(service: ObscorrelationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ObscorrelationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ObscorrelationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ObscorrelationListPageAsync].
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
        fun build(): ObscorrelationListPageAsync =
            ObscorrelationListPageAsync(
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

        return other is ObscorrelationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "ObscorrelationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
