// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitantenna

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitantennaServiceAsync.list */
class OnorbitantennaListPageAsync
private constructor(
    private val service: OnorbitantennaServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitantennaListParams,
    private val items: List<OnorbitantennaListResponse>,
) : PageAsync<OnorbitantennaListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitantennaListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbitantennaListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitantennaListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitantennaListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitantennaListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitantennaListPageAsync].
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

    /** A builder for [OnorbitantennaListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitantennaServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitantennaListParams? = null
        private var items: List<OnorbitantennaListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitantennaListPageAsync: OnorbitantennaListPageAsync) = apply {
            service = onorbitantennaListPageAsync.service
            streamHandlerExecutor = onorbitantennaListPageAsync.streamHandlerExecutor
            params = onorbitantennaListPageAsync.params
            items = onorbitantennaListPageAsync.items
        }

        fun service(service: OnorbitantennaServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitantennaListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitantennaListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitantennaListPageAsync].
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
        fun build(): OnorbitantennaListPageAsync =
            OnorbitantennaListPageAsync(
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

        return /* spotless:off */ other is OnorbitantennaListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "OnorbitantennaListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
