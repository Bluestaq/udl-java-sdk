// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EcpedrServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EcpedrServiceAsync.list */
class EcpedrListPageAsync
private constructor(
    private val service: EcpedrServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EcpedrListParams,
    private val items: List<EcpedrListResponse>,
) : PageAsync<EcpedrListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EcpedrListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EcpedrListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EcpedrListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EcpedrListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EcpedrListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EcpedrListPageAsync].
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

    /** A builder for [EcpedrListPageAsync]. */
    class Builder internal constructor() {

        private var service: EcpedrServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EcpedrListParams? = null
        private var items: List<EcpedrListResponse>? = null

        @JvmSynthetic
        internal fun from(ecpedrListPageAsync: EcpedrListPageAsync) = apply {
            service = ecpedrListPageAsync.service
            streamHandlerExecutor = ecpedrListPageAsync.streamHandlerExecutor
            params = ecpedrListPageAsync.params
            items = ecpedrListPageAsync.items
        }

        fun service(service: EcpedrServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EcpedrListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EcpedrListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EcpedrListPageAsync].
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
        fun build(): EcpedrListPageAsync =
            EcpedrListPageAsync(
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

        return other is EcpedrListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EcpedrListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
