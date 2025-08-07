// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.airtaskingorders

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.airoperations.AirTaskingOrderServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirTaskingOrderServiceAsync.list */
class AirTaskingOrderListPageAsync
private constructor(
    private val service: AirTaskingOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirTaskingOrderListParams,
    private val items: List<AirtaskingorderAbridged>,
) : PageAsync<AirtaskingorderAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirTaskingOrderListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirTaskingOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirtaskingorderAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirTaskingOrderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirtaskingorderAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirTaskingOrderListPageAsync].
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

    /** A builder for [AirTaskingOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirTaskingOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirTaskingOrderListParams? = null
        private var items: List<AirtaskingorderAbridged>? = null

        @JvmSynthetic
        internal fun from(airTaskingOrderListPageAsync: AirTaskingOrderListPageAsync) = apply {
            service = airTaskingOrderListPageAsync.service
            streamHandlerExecutor = airTaskingOrderListPageAsync.streamHandlerExecutor
            params = airTaskingOrderListPageAsync.params
            items = airTaskingOrderListPageAsync.items
        }

        fun service(service: AirTaskingOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirTaskingOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirtaskingorderAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirTaskingOrderListPageAsync].
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
        fun build(): AirTaskingOrderListPageAsync =
            AirTaskingOrderListPageAsync(
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

        return /* spotless:off */ other is AirTaskingOrderListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AirTaskingOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
