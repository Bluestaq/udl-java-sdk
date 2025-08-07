// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbittrack

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OrbittrackServiceAsync.list */
class OrbittrackListPageAsync
private constructor(
    private val service: OrbittrackServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OrbittrackListParams,
    private val items: List<OrbittrackListResponse>,
) : PageAsync<OrbittrackListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrbittrackListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OrbittrackListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OrbittrackListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OrbittrackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrbittrackListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrbittrackListPageAsync].
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

    /** A builder for [OrbittrackListPageAsync]. */
    class Builder internal constructor() {

        private var service: OrbittrackServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OrbittrackListParams? = null
        private var items: List<OrbittrackListResponse>? = null

        @JvmSynthetic
        internal fun from(orbittrackListPageAsync: OrbittrackListPageAsync) = apply {
            service = orbittrackListPageAsync.service
            streamHandlerExecutor = orbittrackListPageAsync.streamHandlerExecutor
            params = orbittrackListPageAsync.params
            items = orbittrackListPageAsync.items
        }

        fun service(service: OrbittrackServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OrbittrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OrbittrackListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OrbittrackListPageAsync].
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
        fun build(): OrbittrackListPageAsync =
            OrbittrackListPageAsync(
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

        return /* spotless:off */ other is OrbittrackListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "OrbittrackListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
