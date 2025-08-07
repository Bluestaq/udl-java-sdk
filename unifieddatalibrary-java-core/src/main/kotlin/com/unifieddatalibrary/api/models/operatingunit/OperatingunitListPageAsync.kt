// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunit

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OperatingunitServiceAsync.list */
class OperatingunitListPageAsync
private constructor(
    private val service: OperatingunitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OperatingunitListParams,
    private val items: List<OperatingunitListResponse>,
) : PageAsync<OperatingunitListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OperatingunitListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OperatingunitListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OperatingunitListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OperatingunitListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OperatingunitListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OperatingunitListPageAsync].
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

    /** A builder for [OperatingunitListPageAsync]. */
    class Builder internal constructor() {

        private var service: OperatingunitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OperatingunitListParams? = null
        private var items: List<OperatingunitListResponse>? = null

        @JvmSynthetic
        internal fun from(operatingunitListPageAsync: OperatingunitListPageAsync) = apply {
            service = operatingunitListPageAsync.service
            streamHandlerExecutor = operatingunitListPageAsync.streamHandlerExecutor
            params = operatingunitListPageAsync.params
            items = operatingunitListPageAsync.items
        }

        fun service(service: OperatingunitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OperatingunitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OperatingunitListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OperatingunitListPageAsync].
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
        fun build(): OperatingunitListPageAsync =
            OperatingunitListPageAsync(
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

        return /* spotless:off */ other is OperatingunitListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "OperatingunitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
