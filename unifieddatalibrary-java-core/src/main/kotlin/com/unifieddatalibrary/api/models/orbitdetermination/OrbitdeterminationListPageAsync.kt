// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbitdetermination

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OrbitdeterminationServiceAsync.list */
class OrbitdeterminationListPageAsync
private constructor(
    private val service: OrbitdeterminationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OrbitdeterminationListParams,
    private val items: List<OrbitdeterminationListResponse>,
) : PageAsync<OrbitdeterminationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrbitdeterminationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OrbitdeterminationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OrbitdeterminationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OrbitdeterminationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrbitdeterminationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OrbitdeterminationListPageAsync].
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

    /** A builder for [OrbitdeterminationListPageAsync]. */
    class Builder internal constructor() {

        private var service: OrbitdeterminationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OrbitdeterminationListParams? = null
        private var items: List<OrbitdeterminationListResponse>? = null

        @JvmSynthetic
        internal fun from(orbitdeterminationListPageAsync: OrbitdeterminationListPageAsync) =
            apply {
                service = orbitdeterminationListPageAsync.service
                streamHandlerExecutor = orbitdeterminationListPageAsync.streamHandlerExecutor
                params = orbitdeterminationListPageAsync.params
                items = orbitdeterminationListPageAsync.items
            }

        fun service(service: OrbitdeterminationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OrbitdeterminationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OrbitdeterminationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OrbitdeterminationListPageAsync].
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
        fun build(): OrbitdeterminationListPageAsync =
            OrbitdeterminationListPageAsync(
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

        return /* spotless:off */ other is OrbitdeterminationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "OrbitdeterminationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
