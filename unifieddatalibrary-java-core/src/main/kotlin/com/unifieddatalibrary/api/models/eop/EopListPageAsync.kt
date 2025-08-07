// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eop

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EopServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EopServiceAsync.list */
class EopListPageAsync
private constructor(
    private val service: EopServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EopListParams,
    private val items: List<EopAbridged>,
) : PageAsync<EopAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EopListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EopListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EopAbridged> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EopListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EopAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EopListPageAsync].
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

    /** A builder for [EopListPageAsync]. */
    class Builder internal constructor() {

        private var service: EopServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EopListParams? = null
        private var items: List<EopAbridged>? = null

        @JvmSynthetic
        internal fun from(eopListPageAsync: EopListPageAsync) = apply {
            service = eopListPageAsync.service
            streamHandlerExecutor = eopListPageAsync.streamHandlerExecutor
            params = eopListPageAsync.params
            items = eopListPageAsync.items
        }

        fun service(service: EopServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EopListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EopAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EopListPageAsync].
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
        fun build(): EopListPageAsync =
            EopListPageAsync(
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

        return /* spotless:off */ other is EopListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "EopListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
