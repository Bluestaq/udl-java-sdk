// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.datalink

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.linkstatus.DatalinkServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DatalinkServiceAsync.list */
class DatalinkListPageAsync
private constructor(
    private val service: DatalinkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatalinkListParams,
    private val items: List<DatalinkListResponse>,
) : PageAsync<DatalinkListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatalinkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DatalinkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DatalinkListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatalinkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatalinkListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatalinkListPageAsync].
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

    /** A builder for [DatalinkListPageAsync]. */
    class Builder internal constructor() {

        private var service: DatalinkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatalinkListParams? = null
        private var items: List<DatalinkListResponse>? = null

        @JvmSynthetic
        internal fun from(datalinkListPageAsync: DatalinkListPageAsync) = apply {
            service = datalinkListPageAsync.service
            streamHandlerExecutor = datalinkListPageAsync.streamHandlerExecutor
            params = datalinkListPageAsync.params
            items = datalinkListPageAsync.items
        }

        fun service(service: DatalinkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatalinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatalinkListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatalinkListPageAsync].
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
        fun build(): DatalinkListPageAsync =
            DatalinkListPageAsync(
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

        return /* spotless:off */ other is DatalinkListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "DatalinkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
