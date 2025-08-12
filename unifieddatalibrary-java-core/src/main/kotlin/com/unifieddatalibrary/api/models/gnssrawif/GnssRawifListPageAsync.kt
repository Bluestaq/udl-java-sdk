// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see GnssRawIfServiceAsync.list */
class GnssRawIfListPageAsync
private constructor(
    private val service: GnssRawIfServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GnssRawIfListParams,
    private val items: List<GnssRawIfListResponse>,
) : PageAsync<GnssRawIfListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GnssRawIfListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<GnssRawIfListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GnssRawIfListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GnssRawIfListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GnssRawIfListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GnssRawIfListPageAsync].
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

    /** A builder for [GnssRawIfListPageAsync]. */
    class Builder internal constructor() {

        private var service: GnssRawIfServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GnssRawIfListParams? = null
        private var items: List<GnssRawIfListResponse>? = null

        @JvmSynthetic
        internal fun from(gnssRawIfListPageAsync: GnssRawIfListPageAsync) = apply {
            service = gnssRawIfListPageAsync.service
            streamHandlerExecutor = gnssRawIfListPageAsync.streamHandlerExecutor
            params = gnssRawIfListPageAsync.params
            items = gnssRawIfListPageAsync.items
        }

        fun service(service: GnssRawIfServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GnssRawIfListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GnssRawIfListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GnssRawIfListPageAsync].
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
        fun build(): GnssRawIfListPageAsync =
            GnssRawIfListPageAsync(
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

        return /* spotless:off */ other is GnssRawIfListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "GnssRawIfListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
