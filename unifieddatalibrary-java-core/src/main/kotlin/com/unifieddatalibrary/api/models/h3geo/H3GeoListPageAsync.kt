// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geo

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see H3GeoServiceAsync.list */
class H3GeoListPageAsync
private constructor(
    private val service: H3GeoServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: H3GeoListParams,
    private val items: List<H3GeoListResponse>,
) : PageAsync<H3GeoListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): H3GeoListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<H3GeoListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<H3GeoListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): H3GeoListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<H3GeoListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [H3GeoListPageAsync].
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

    /** A builder for [H3GeoListPageAsync]. */
    class Builder internal constructor() {

        private var service: H3GeoServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: H3GeoListParams? = null
        private var items: List<H3GeoListResponse>? = null

        @JvmSynthetic
        internal fun from(h3GeoListPageAsync: H3GeoListPageAsync) = apply {
            service = h3GeoListPageAsync.service
            streamHandlerExecutor = h3GeoListPageAsync.streamHandlerExecutor
            params = h3GeoListPageAsync.params
            items = h3GeoListPageAsync.items
        }

        fun service(service: H3GeoServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: H3GeoListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<H3GeoListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [H3GeoListPageAsync].
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
        fun build(): H3GeoListPageAsync =
            H3GeoListPageAsync(
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

        return other is H3GeoListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "H3GeoListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
