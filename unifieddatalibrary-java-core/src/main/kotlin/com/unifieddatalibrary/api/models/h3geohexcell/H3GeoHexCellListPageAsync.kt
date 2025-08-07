// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see H3GeoHexCellServiceAsync.list */
class H3GeoHexCellListPageAsync
private constructor(
    private val service: H3GeoHexCellServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: H3GeoHexCellListParams,
    private val items: List<H3GeoHexCellListResponse>,
) : PageAsync<H3GeoHexCellListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): H3GeoHexCellListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<H3GeoHexCellListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<H3GeoHexCellListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): H3GeoHexCellListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<H3GeoHexCellListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [H3GeoHexCellListPageAsync].
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

    /** A builder for [H3GeoHexCellListPageAsync]. */
    class Builder internal constructor() {

        private var service: H3GeoHexCellServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: H3GeoHexCellListParams? = null
        private var items: List<H3GeoHexCellListResponse>? = null

        @JvmSynthetic
        internal fun from(h3GeoHexCellListPageAsync: H3GeoHexCellListPageAsync) = apply {
            service = h3GeoHexCellListPageAsync.service
            streamHandlerExecutor = h3GeoHexCellListPageAsync.streamHandlerExecutor
            params = h3GeoHexCellListPageAsync.params
            items = h3GeoHexCellListPageAsync.items
        }

        fun service(service: H3GeoHexCellServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: H3GeoHexCellListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<H3GeoHexCellListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [H3GeoHexCellListPageAsync].
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
        fun build(): H3GeoHexCellListPageAsync =
            H3GeoHexCellListPageAsync(
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

        return /* spotless:off */ other is H3GeoHexCellListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "H3GeoHexCellListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
