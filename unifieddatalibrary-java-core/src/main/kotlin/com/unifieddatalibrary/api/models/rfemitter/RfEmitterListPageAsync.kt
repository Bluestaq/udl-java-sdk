// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see RfEmitterServiceAsync.list */
class RfEmitterListPageAsync
private constructor(
    private val service: RfEmitterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RfEmitterListParams,
    private val items: List<RfEmitterListResponse>,
) : PageAsync<RfEmitterListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfEmitterListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RfEmitterListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RfEmitterListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RfEmitterListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfEmitterListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfEmitterListPageAsync].
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

    /** A builder for [RfEmitterListPageAsync]. */
    class Builder internal constructor() {

        private var service: RfEmitterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RfEmitterListParams? = null
        private var items: List<RfEmitterListResponse>? = null

        @JvmSynthetic
        internal fun from(rfEmitterListPageAsync: RfEmitterListPageAsync) = apply {
            service = rfEmitterListPageAsync.service
            streamHandlerExecutor = rfEmitterListPageAsync.streamHandlerExecutor
            params = rfEmitterListPageAsync.params
            items = rfEmitterListPageAsync.items
        }

        fun service(service: RfEmitterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RfEmitterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfEmitterListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfEmitterListPageAsync].
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
        fun build(): RfEmitterListPageAsync =
            RfEmitterListPageAsync(
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

        return /* spotless:off */ other is RfEmitterListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "RfEmitterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
