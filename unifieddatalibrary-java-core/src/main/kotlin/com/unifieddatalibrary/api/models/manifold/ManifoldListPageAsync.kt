// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ManifoldServiceAsync.list */
class ManifoldListPageAsync
private constructor(
    private val service: ManifoldServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ManifoldListParams,
    private val items: List<ManifoldListResponse>,
) : PageAsync<ManifoldListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManifoldListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ManifoldListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ManifoldListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ManifoldListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ManifoldListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManifoldListPageAsync].
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

    /** A builder for [ManifoldListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManifoldServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ManifoldListParams? = null
        private var items: List<ManifoldListResponse>? = null

        @JvmSynthetic
        internal fun from(manifoldListPageAsync: ManifoldListPageAsync) = apply {
            service = manifoldListPageAsync.service
            streamHandlerExecutor = manifoldListPageAsync.streamHandlerExecutor
            params = manifoldListPageAsync.params
            items = manifoldListPageAsync.items
        }

        fun service(service: ManifoldServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ManifoldListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ManifoldListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ManifoldListPageAsync].
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
        fun build(): ManifoldListPageAsync =
            ManifoldListPageAsync(
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

        return /* spotless:off */ other is ManifoldListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "ManifoldListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
