// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.datatypes

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.supportingdata.DataTypeServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DataTypeServiceAsync.list */
class DataTypeListPageAsync
private constructor(
    private val service: DataTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DataTypeListParams,
    private val items: List<String>,
) : PageAsync<String> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DataTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DataTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<String> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DataTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<String> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataTypeListPageAsync].
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

    /** A builder for [DataTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: DataTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DataTypeListParams? = null
        private var items: List<String>? = null

        @JvmSynthetic
        internal fun from(dataTypeListPageAsync: DataTypeListPageAsync) = apply {
            service = dataTypeListPageAsync.service
            streamHandlerExecutor = dataTypeListPageAsync.streamHandlerExecutor
            params = dataTypeListPageAsync.params
            items = dataTypeListPageAsync.items
        }

        fun service(service: DataTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DataTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<String>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DataTypeListPageAsync].
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
        fun build(): DataTypeListPageAsync =
            DataTypeListPageAsync(
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

        return other is DataTypeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DataTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
