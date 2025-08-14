// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunitremark

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OperatingunitremarkServiceAsync.list */
class OperatingunitremarkListPageAsync
private constructor(
    private val service: OperatingunitremarkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OperatingunitremarkListParams,
    private val items: List<OperatingunitremarkListResponse>,
) : PageAsync<OperatingunitremarkListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OperatingunitremarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OperatingunitremarkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OperatingunitremarkListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OperatingunitremarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OperatingunitremarkListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OperatingunitremarkListPageAsync].
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

    /** A builder for [OperatingunitremarkListPageAsync]. */
    class Builder internal constructor() {

        private var service: OperatingunitremarkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OperatingunitremarkListParams? = null
        private var items: List<OperatingunitremarkListResponse>? = null

        @JvmSynthetic
        internal fun from(operatingunitremarkListPageAsync: OperatingunitremarkListPageAsync) =
            apply {
                service = operatingunitremarkListPageAsync.service
                streamHandlerExecutor = operatingunitremarkListPageAsync.streamHandlerExecutor
                params = operatingunitremarkListPageAsync.params
                items = operatingunitremarkListPageAsync.items
            }

        fun service(service: OperatingunitremarkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OperatingunitremarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OperatingunitremarkListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OperatingunitremarkListPageAsync].
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
        fun build(): OperatingunitremarkListPageAsync =
            OperatingunitremarkListPageAsync(
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

        return other is OperatingunitremarkListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "OperatingunitremarkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
