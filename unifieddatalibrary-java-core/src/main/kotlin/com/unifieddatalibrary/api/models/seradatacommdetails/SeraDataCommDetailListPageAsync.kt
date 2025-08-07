// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatacommdetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeraDataCommDetailServiceAsync.list */
class SeraDataCommDetailListPageAsync
private constructor(
    private val service: SeraDataCommDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeraDataCommDetailListParams,
    private val items: List<SeraDataCommDetailListResponse>,
) : PageAsync<SeraDataCommDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeraDataCommDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SeraDataCommDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeraDataCommDetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SeraDataCommDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeraDataCommDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeraDataCommDetailListPageAsync].
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

    /** A builder for [SeraDataCommDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeraDataCommDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeraDataCommDetailListParams? = null
        private var items: List<SeraDataCommDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(seraDataCommDetailListPageAsync: SeraDataCommDetailListPageAsync) =
            apply {
                service = seraDataCommDetailListPageAsync.service
                streamHandlerExecutor = seraDataCommDetailListPageAsync.streamHandlerExecutor
                params = seraDataCommDetailListPageAsync.params
                items = seraDataCommDetailListPageAsync.items
            }

        fun service(service: SeraDataCommDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SeraDataCommDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeraDataCommDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeraDataCommDetailListPageAsync].
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
        fun build(): SeraDataCommDetailListPageAsync =
            SeraDataCommDetailListPageAsync(
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

        return /* spotless:off */ other is SeraDataCommDetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SeraDataCommDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
