// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airspacecontrolorders

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirspaceControlOrderServiceAsync.list */
class AirspaceControlOrderListPageAsync
private constructor(
    private val service: AirspaceControlOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirspaceControlOrderListParams,
    private val items: List<AirspacecontrolorderAbridged>,
) : PageAsync<AirspacecontrolorderAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirspaceControlOrderListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirspaceControlOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirspacecontrolorderAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirspaceControlOrderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirspacecontrolorderAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AirspaceControlOrderListPageAsync].
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

    /** A builder for [AirspaceControlOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirspaceControlOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirspaceControlOrderListParams? = null
        private var items: List<AirspacecontrolorderAbridged>? = null

        @JvmSynthetic
        internal fun from(airspaceControlOrderListPageAsync: AirspaceControlOrderListPageAsync) =
            apply {
                service = airspaceControlOrderListPageAsync.service
                streamHandlerExecutor = airspaceControlOrderListPageAsync.streamHandlerExecutor
                params = airspaceControlOrderListPageAsync.params
                items = airspaceControlOrderListPageAsync.items
            }

        fun service(service: AirspaceControlOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirspaceControlOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirspacecontrolorderAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirspaceControlOrderListPageAsync].
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
        fun build(): AirspaceControlOrderListPageAsync =
            AirspaceControlOrderListPageAsync(
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

        return /* spotless:off */ other is AirspaceControlOrderListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AirspaceControlOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
