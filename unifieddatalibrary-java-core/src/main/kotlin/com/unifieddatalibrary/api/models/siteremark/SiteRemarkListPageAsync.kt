// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SiteRemarkServiceAsync.list */
class SiteRemarkListPageAsync
private constructor(
    private val service: SiteRemarkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SiteRemarkListParams,
    private val items: List<SiteRemarkListResponse>,
) : PageAsync<SiteRemarkListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SiteRemarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SiteRemarkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SiteRemarkListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SiteRemarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SiteRemarkListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SiteRemarkListPageAsync].
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

    /** A builder for [SiteRemarkListPageAsync]. */
    class Builder internal constructor() {

        private var service: SiteRemarkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SiteRemarkListParams? = null
        private var items: List<SiteRemarkListResponse>? = null

        @JvmSynthetic
        internal fun from(siteRemarkListPageAsync: SiteRemarkListPageAsync) = apply {
            service = siteRemarkListPageAsync.service
            streamHandlerExecutor = siteRemarkListPageAsync.streamHandlerExecutor
            params = siteRemarkListPageAsync.params
            items = siteRemarkListPageAsync.items
        }

        fun service(service: SiteRemarkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SiteRemarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SiteRemarkListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SiteRemarkListPageAsync].
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
        fun build(): SiteRemarkListPageAsync =
            SiteRemarkListPageAsync(
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

        return other is SiteRemarkListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SiteRemarkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
