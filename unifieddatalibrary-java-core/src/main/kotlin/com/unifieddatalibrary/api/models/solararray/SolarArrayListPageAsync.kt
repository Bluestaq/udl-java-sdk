// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SolarArrayServiceAsync.list */
class SolarArrayListPageAsync
private constructor(
    private val service: SolarArrayServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SolarArrayListParams,
    private val items: List<SolarArrayListResponse>,
) : PageAsync<SolarArrayListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SolarArrayListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SolarArrayListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SolarArrayListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SolarArrayListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SolarArrayListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SolarArrayListPageAsync].
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

    /** A builder for [SolarArrayListPageAsync]. */
    class Builder internal constructor() {

        private var service: SolarArrayServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SolarArrayListParams? = null
        private var items: List<SolarArrayListResponse>? = null

        @JvmSynthetic
        internal fun from(solarArrayListPageAsync: SolarArrayListPageAsync) = apply {
            service = solarArrayListPageAsync.service
            streamHandlerExecutor = solarArrayListPageAsync.streamHandlerExecutor
            params = solarArrayListPageAsync.params
            items = solarArrayListPageAsync.items
        }

        fun service(service: SolarArrayServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SolarArrayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SolarArrayListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SolarArrayListPageAsync].
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
        fun build(): SolarArrayListPageAsync =
            SolarArrayListPageAsync(
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

        return other is SolarArrayListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SolarArrayListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
