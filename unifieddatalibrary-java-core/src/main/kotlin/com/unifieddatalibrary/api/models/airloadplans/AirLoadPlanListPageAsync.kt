// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airloadplans

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirloadPlanServiceAsync.list */
class AirloadPlanListPageAsync
private constructor(
    private val service: AirloadPlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirloadPlanListParams,
    private val items: List<AirloadplanAbridged>,
) : PageAsync<AirloadplanAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirloadPlanListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirloadPlanListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirloadplanAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirloadPlanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirloadplanAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirloadPlanListPageAsync].
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

    /** A builder for [AirloadPlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirloadPlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirloadPlanListParams? = null
        private var items: List<AirloadplanAbridged>? = null

        @JvmSynthetic
        internal fun from(airloadPlanListPageAsync: AirloadPlanListPageAsync) = apply {
            service = airloadPlanListPageAsync.service
            streamHandlerExecutor = airloadPlanListPageAsync.streamHandlerExecutor
            params = airloadPlanListPageAsync.params
            items = airloadPlanListPageAsync.items
        }

        fun service(service: AirloadPlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirloadPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirloadplanAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirloadPlanListPageAsync].
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
        fun build(): AirloadPlanListPageAsync =
            AirloadPlanListPageAsync(
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

        return /* spotless:off */ other is AirloadPlanListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AirloadPlanListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
