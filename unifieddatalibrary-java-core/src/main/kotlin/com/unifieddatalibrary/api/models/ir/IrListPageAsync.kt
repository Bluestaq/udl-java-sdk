// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ir

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.IrServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see IrServiceAsync.list */
class IrListPageAsync
private constructor(
    private val service: IrServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IrListParams,
    private val items: List<IrListResponse>,
) : PageAsync<IrListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IrListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<IrListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IrListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IrListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IrListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IrListPageAsync].
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

    /** A builder for [IrListPageAsync]. */
    class Builder internal constructor() {

        private var service: IrServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IrListParams? = null
        private var items: List<IrListResponse>? = null

        @JvmSynthetic
        internal fun from(irListPageAsync: IrListPageAsync) = apply {
            service = irListPageAsync.service
            streamHandlerExecutor = irListPageAsync.streamHandlerExecutor
            params = irListPageAsync.params
            items = irListPageAsync.items
        }

        fun service(service: IrServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IrListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IrListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IrListPageAsync].
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
        fun build(): IrListPageAsync =
            IrListPageAsync(
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

        return other is IrListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "IrListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
