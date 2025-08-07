// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.skyimagery

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SkyImageryServiceAsync.list */
class SkyImageryListPageAsync
private constructor(
    private val service: SkyImageryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SkyImageryListParams,
    private val items: List<SkyImageryListResponse>,
) : PageAsync<SkyImageryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SkyImageryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SkyImageryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SkyImageryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SkyImageryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SkyImageryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SkyImageryListPageAsync].
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

    /** A builder for [SkyImageryListPageAsync]. */
    class Builder internal constructor() {

        private var service: SkyImageryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SkyImageryListParams? = null
        private var items: List<SkyImageryListResponse>? = null

        @JvmSynthetic
        internal fun from(skyImageryListPageAsync: SkyImageryListPageAsync) = apply {
            service = skyImageryListPageAsync.service
            streamHandlerExecutor = skyImageryListPageAsync.streamHandlerExecutor
            params = skyImageryListPageAsync.params
            items = skyImageryListPageAsync.items
        }

        fun service(service: SkyImageryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SkyImageryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SkyImageryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SkyImageryListPageAsync].
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
        fun build(): SkyImageryListPageAsync =
            SkyImageryListPageAsync(
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

        return /* spotless:off */ other is SkyImageryListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SkyImageryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
