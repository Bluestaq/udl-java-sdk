// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.PortServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see PortServiceAsync.list */
class PortListPageAsync
private constructor(
    private val service: PortServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PortListParams,
    private val items: List<PortListResponse>,
) : PageAsync<PortListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PortListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<PortListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PortListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PortListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortListPageAsync].
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

    /** A builder for [PortListPageAsync]. */
    class Builder internal constructor() {

        private var service: PortServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PortListParams? = null
        private var items: List<PortListResponse>? = null

        @JvmSynthetic
        internal fun from(portListPageAsync: PortListPageAsync) = apply {
            service = portListPageAsync.service
            streamHandlerExecutor = portListPageAsync.streamHandlerExecutor
            params = portListPageAsync.params
            items = portListPageAsync.items
        }

        fun service(service: PortServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PortListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PortListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PortListPageAsync].
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
        fun build(): PortListPageAsync =
            PortListPageAsync(
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

        return /* spotless:off */ other is PortListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "PortListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
