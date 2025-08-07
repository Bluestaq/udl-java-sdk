// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SgiServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SgiServiceAsync.list */
class SgiListPageAsync
private constructor(
    private val service: SgiServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SgiListParams,
    private val items: List<SgiListResponse>,
) : PageAsync<SgiListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SgiListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SgiListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SgiListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SgiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SgiListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SgiListPageAsync].
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

    /** A builder for [SgiListPageAsync]. */
    class Builder internal constructor() {

        private var service: SgiServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SgiListParams? = null
        private var items: List<SgiListResponse>? = null

        @JvmSynthetic
        internal fun from(sgiListPageAsync: SgiListPageAsync) = apply {
            service = sgiListPageAsync.service
            streamHandlerExecutor = sgiListPageAsync.streamHandlerExecutor
            params = sgiListPageAsync.params
            items = sgiListPageAsync.items
        }

        fun service(service: SgiServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SgiListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SgiListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SgiListPageAsync].
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
        fun build(): SgiListPageAsync =
            SgiListPageAsync(
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

        return /* spotless:off */ other is SgiListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SgiListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
