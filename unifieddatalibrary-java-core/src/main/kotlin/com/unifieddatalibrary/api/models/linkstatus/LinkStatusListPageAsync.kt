// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LinkStatusServiceAsync.list */
class LinkStatusListPageAsync
private constructor(
    private val service: LinkStatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LinkStatusListParams,
    private val items: List<LinkStatusListResponse>,
) : PageAsync<LinkStatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LinkStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LinkStatusListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LinkStatusListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LinkStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LinkStatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LinkStatusListPageAsync].
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

    /** A builder for [LinkStatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: LinkStatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LinkStatusListParams? = null
        private var items: List<LinkStatusListResponse>? = null

        @JvmSynthetic
        internal fun from(linkStatusListPageAsync: LinkStatusListPageAsync) = apply {
            service = linkStatusListPageAsync.service
            streamHandlerExecutor = linkStatusListPageAsync.streamHandlerExecutor
            params = linkStatusListPageAsync.params
            items = linkStatusListPageAsync.items
        }

        fun service(service: LinkStatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LinkStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LinkStatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LinkStatusListPageAsync].
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
        fun build(): LinkStatusListPageAsync =
            LinkStatusListPageAsync(
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

        return /* spotless:off */ other is LinkStatusListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "LinkStatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
