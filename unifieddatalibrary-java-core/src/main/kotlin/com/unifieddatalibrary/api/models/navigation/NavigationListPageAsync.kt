// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.NavigationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see NavigationServiceAsync.list */
class NavigationListPageAsync
private constructor(
    private val service: NavigationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NavigationListParams,
    private val items: List<NavigationListResponse>,
) : PageAsync<NavigationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): NavigationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<NavigationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NavigationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NavigationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<NavigationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NavigationListPageAsync].
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

    /** A builder for [NavigationListPageAsync]. */
    class Builder internal constructor() {

        private var service: NavigationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NavigationListParams? = null
        private var items: List<NavigationListResponse>? = null

        @JvmSynthetic
        internal fun from(navigationListPageAsync: NavigationListPageAsync) = apply {
            service = navigationListPageAsync.service
            streamHandlerExecutor = navigationListPageAsync.streamHandlerExecutor
            params = navigationListPageAsync.params
            items = navigationListPageAsync.items
        }

        fun service(service: NavigationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NavigationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<NavigationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [NavigationListPageAsync].
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
        fun build(): NavigationListPageAsync =
            NavigationListPageAsync(
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

        return other is NavigationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "NavigationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
