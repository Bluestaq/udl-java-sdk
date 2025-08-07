// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airloadplans

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirLoadPlanServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirLoadPlanServiceAsync.list */
class AirLoadPlanListPageAsync
private constructor(
    private val service: AirLoadPlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirLoadPlanListParams,
    private val items: List<AirloadplanAbridged>,
) : PageAsync<AirloadplanAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirLoadPlanListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirLoadPlanListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirloadplanAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirLoadPlanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirloadplanAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirLoadPlanListPageAsync].
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

    /** A builder for [AirLoadPlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirLoadPlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirLoadPlanListParams? = null
        private var items: List<AirloadplanAbridged>? = null

        @JvmSynthetic
        internal fun from(airLoadPlanListPageAsync: AirLoadPlanListPageAsync) = apply {
            service = airLoadPlanListPageAsync.service
            streamHandlerExecutor = airLoadPlanListPageAsync.streamHandlerExecutor
            params = airLoadPlanListPageAsync.params
            items = airLoadPlanListPageAsync.items
        }

        fun service(service: AirLoadPlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirLoadPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirloadplanAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirLoadPlanListPageAsync].
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
        fun build(): AirLoadPlanListPageAsync =
            AirLoadPlanListPageAsync(
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

        return /* spotless:off */ other is AirLoadPlanListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AirLoadPlanListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
