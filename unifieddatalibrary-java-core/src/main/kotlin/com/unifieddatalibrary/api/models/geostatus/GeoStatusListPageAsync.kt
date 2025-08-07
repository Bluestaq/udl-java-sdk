// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see GeoStatusServiceAsync.list */
class GeoStatusListPageAsync
private constructor(
    private val service: GeoStatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GeoStatusListParams,
    private val items: List<GeoStatusListResponse>,
) : PageAsync<GeoStatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GeoStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<GeoStatusListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GeoStatusListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GeoStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GeoStatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GeoStatusListPageAsync].
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

    /** A builder for [GeoStatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: GeoStatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GeoStatusListParams? = null
        private var items: List<GeoStatusListResponse>? = null

        @JvmSynthetic
        internal fun from(geoStatusListPageAsync: GeoStatusListPageAsync) = apply {
            service = geoStatusListPageAsync.service
            streamHandlerExecutor = geoStatusListPageAsync.streamHandlerExecutor
            params = geoStatusListPageAsync.params
            items = geoStatusListPageAsync.items
        }

        fun service(service: GeoStatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GeoStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GeoStatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GeoStatusListPageAsync].
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
        fun build(): GeoStatusListPageAsync =
            GeoStatusListPageAsync(
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

        return /* spotless:off */ other is GeoStatusListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "GeoStatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
