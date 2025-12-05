// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.closelyspacedobjects

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.CloselyspacedobjectServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CloselyspacedobjectServiceAsync.list */
class CloselyspacedobjectListPageAsync
private constructor(
    private val service: CloselyspacedobjectServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CloselyspacedobjectListParams,
    private val items: List<CloselyspacedobjectsAbridged>,
) : PageAsync<CloselyspacedobjectsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CloselyspacedobjectListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CloselyspacedobjectListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CloselyspacedobjectsAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CloselyspacedobjectListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CloselyspacedobjectsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CloselyspacedobjectListPageAsync].
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

    /** A builder for [CloselyspacedobjectListPageAsync]. */
    class Builder internal constructor() {

        private var service: CloselyspacedobjectServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CloselyspacedobjectListParams? = null
        private var items: List<CloselyspacedobjectsAbridged>? = null

        @JvmSynthetic
        internal fun from(closelyspacedobjectListPageAsync: CloselyspacedobjectListPageAsync) =
            apply {
                service = closelyspacedobjectListPageAsync.service
                streamHandlerExecutor = closelyspacedobjectListPageAsync.streamHandlerExecutor
                params = closelyspacedobjectListPageAsync.params
                items = closelyspacedobjectListPageAsync.items
            }

        fun service(service: CloselyspacedobjectServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CloselyspacedobjectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CloselyspacedobjectsAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CloselyspacedobjectListPageAsync].
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
        fun build(): CloselyspacedobjectListPageAsync =
            CloselyspacedobjectListPageAsync(
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

        return other is CloselyspacedobjectListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "CloselyspacedobjectListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
