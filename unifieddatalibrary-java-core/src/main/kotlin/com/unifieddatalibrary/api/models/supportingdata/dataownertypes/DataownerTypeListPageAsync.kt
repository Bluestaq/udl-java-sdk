// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.dataownertypes

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerTypeServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull
import kotlin.jvm.optionals.toList

/** @see DataownerTypeServiceAsync.list */
class DataownerTypeListPageAsync
private constructor(
    private val service: DataownerTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DataownerTypeListParams,
    private val items: List<String>,
) : PageAsync<String> {

    /** Delegates to [List<String>], but gracefully handles missing data. */
    override fun items(): List<String> = items.flatMap { it.toList() }.getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DataownerTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DataownerTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<String> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DataownerTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<String> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataownerTypeListPageAsync].
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

    /** A builder for [DataownerTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: DataownerTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DataownerTypeListParams? = null
        private var items: List<String>? = null

        @JvmSynthetic
        internal fun from(dataownerTypeListPageAsync: DataownerTypeListPageAsync) = apply {
            service = dataownerTypeListPageAsync.service
            streamHandlerExecutor = dataownerTypeListPageAsync.streamHandlerExecutor
            params = dataownerTypeListPageAsync.params
            items = dataownerTypeListPageAsync.items
        }

        fun service(service: DataownerTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DataownerTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<String>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DataownerTypeListPageAsync].
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
        fun build(): DataownerTypeListPageAsync =
            DataownerTypeListPageAsync(
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

        return /* spotless:off */ other is DataownerTypeListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "DataownerTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
