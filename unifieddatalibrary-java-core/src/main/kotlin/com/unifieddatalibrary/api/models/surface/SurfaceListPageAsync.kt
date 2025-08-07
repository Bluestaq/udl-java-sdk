// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surface

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SurfaceServiceAsync.list */
class SurfaceListPageAsync
private constructor(
    private val service: SurfaceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SurfaceListParams,
    private val items: List<SurfaceListResponse>,
) : PageAsync<SurfaceListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SurfaceListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SurfaceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SurfaceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SurfaceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SurfaceListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SurfaceListPageAsync].
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

    /** A builder for [SurfaceListPageAsync]. */
    class Builder internal constructor() {

        private var service: SurfaceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SurfaceListParams? = null
        private var items: List<SurfaceListResponse>? = null

        @JvmSynthetic
        internal fun from(surfaceListPageAsync: SurfaceListPageAsync) = apply {
            service = surfaceListPageAsync.service
            streamHandlerExecutor = surfaceListPageAsync.streamHandlerExecutor
            params = surfaceListPageAsync.params
            items = surfaceListPageAsync.items
        }

        fun service(service: SurfaceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SurfaceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SurfaceListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SurfaceListPageAsync].
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
        fun build(): SurfaceListPageAsync =
            SurfaceListPageAsync(
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

        return /* spotless:off */ other is SurfaceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SurfaceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
