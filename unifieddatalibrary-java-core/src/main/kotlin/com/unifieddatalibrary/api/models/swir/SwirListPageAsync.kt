// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.swir

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SwirServiceAsync.list */
class SwirListPageAsync
private constructor(
    private val service: SwirServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SwirListParams,
    private val items: List<SwirListResponse>,
) : PageAsync<SwirListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SwirListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SwirListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SwirListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SwirListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SwirListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SwirListPageAsync].
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

    /** A builder for [SwirListPageAsync]. */
    class Builder internal constructor() {

        private var service: SwirServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SwirListParams? = null
        private var items: List<SwirListResponse>? = null

        @JvmSynthetic
        internal fun from(swirListPageAsync: SwirListPageAsync) = apply {
            service = swirListPageAsync.service
            streamHandlerExecutor = swirListPageAsync.streamHandlerExecutor
            params = swirListPageAsync.params
            items = swirListPageAsync.items
        }

        fun service(service: SwirServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SwirListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SwirListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SwirListPageAsync].
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
        fun build(): SwirListPageAsync =
            SwirListPageAsync(
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

        return /* spotless:off */ other is SwirListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SwirListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
