// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sigact

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SigactServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SigactServiceAsync.list */
class SigactListPageAsync
private constructor(
    private val service: SigactServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SigactListParams,
    private val items: List<SigactListResponse>,
) : PageAsync<SigactListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SigactListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SigactListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SigactListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SigactListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SigactListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SigactListPageAsync].
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

    /** A builder for [SigactListPageAsync]. */
    class Builder internal constructor() {

        private var service: SigactServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SigactListParams? = null
        private var items: List<SigactListResponse>? = null

        @JvmSynthetic
        internal fun from(sigactListPageAsync: SigactListPageAsync) = apply {
            service = sigactListPageAsync.service
            streamHandlerExecutor = sigactListPageAsync.streamHandlerExecutor
            params = sigactListPageAsync.params
            items = sigactListPageAsync.items
        }

        fun service(service: SigactServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SigactListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SigactListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SigactListPageAsync].
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
        fun build(): SigactListPageAsync =
            SigactListPageAsync(
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

        return /* spotless:off */ other is SigactListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SigactListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
