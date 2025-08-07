// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslotconsumptions

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldSlotConsumptionServiceAsync.list */
class AirfieldSlotConsumptionListPageAsync
private constructor(
    private val service: AirfieldSlotConsumptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirfieldSlotConsumptionListParams,
    private val items: List<AirfieldslotconsumptionAbridged>,
) : PageAsync<AirfieldslotconsumptionAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldSlotConsumptionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirfieldSlotConsumptionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirfieldslotconsumptionAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldSlotConsumptionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldslotconsumptionAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AirfieldSlotConsumptionListPageAsync].
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

    /** A builder for [AirfieldSlotConsumptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirfieldSlotConsumptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirfieldSlotConsumptionListParams? = null
        private var items: List<AirfieldslotconsumptionAbridged>? = null

        @JvmSynthetic
        internal fun from(
            airfieldSlotConsumptionListPageAsync: AirfieldSlotConsumptionListPageAsync
        ) = apply {
            service = airfieldSlotConsumptionListPageAsync.service
            streamHandlerExecutor = airfieldSlotConsumptionListPageAsync.streamHandlerExecutor
            params = airfieldSlotConsumptionListPageAsync.params
            items = airfieldSlotConsumptionListPageAsync.items
        }

        fun service(service: AirfieldSlotConsumptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldSlotConsumptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldslotconsumptionAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirfieldSlotConsumptionListPageAsync].
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
        fun build(): AirfieldSlotConsumptionListPageAsync =
            AirfieldSlotConsumptionListPageAsync(
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

        return /* spotless:off */ other is AirfieldSlotConsumptionListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AirfieldSlotConsumptionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
