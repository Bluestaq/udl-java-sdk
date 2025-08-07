// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeraDataNavigationServiceAsync.list */
class SeraDataNavigationListPageAsync
private constructor(
    private val service: SeraDataNavigationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeraDataNavigationListParams,
    private val items: List<SeraDataNavigationListResponse>,
) : PageAsync<SeraDataNavigationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeraDataNavigationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SeraDataNavigationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeraDataNavigationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SeraDataNavigationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeraDataNavigationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeraDataNavigationListPageAsync].
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

    /** A builder for [SeraDataNavigationListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeraDataNavigationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeraDataNavigationListParams? = null
        private var items: List<SeraDataNavigationListResponse>? = null

        @JvmSynthetic
        internal fun from(seraDataNavigationListPageAsync: SeraDataNavigationListPageAsync) =
            apply {
                service = seraDataNavigationListPageAsync.service
                streamHandlerExecutor = seraDataNavigationListPageAsync.streamHandlerExecutor
                params = seraDataNavigationListPageAsync.params
                items = seraDataNavigationListPageAsync.items
            }

        fun service(service: SeraDataNavigationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SeraDataNavigationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeraDataNavigationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeraDataNavigationListPageAsync].
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
        fun build(): SeraDataNavigationListPageAsync =
            SeraDataNavigationListPageAsync(
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

        return /* spotless:off */ other is SeraDataNavigationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SeraDataNavigationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
