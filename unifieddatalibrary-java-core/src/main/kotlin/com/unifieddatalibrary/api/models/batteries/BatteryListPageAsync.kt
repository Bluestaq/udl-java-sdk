// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.BatteryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see BatteryServiceAsync.list */
class BatteryListPageAsync
private constructor(
    private val service: BatteryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BatteryListParams,
    private val items: List<BatteryAbridged>,
) : PageAsync<BatteryAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BatteryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<BatteryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BatteryAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BatteryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BatteryAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatteryListPageAsync].
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

    /** A builder for [BatteryListPageAsync]. */
    class Builder internal constructor() {

        private var service: BatteryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BatteryListParams? = null
        private var items: List<BatteryAbridged>? = null

        @JvmSynthetic
        internal fun from(batteryListPageAsync: BatteryListPageAsync) = apply {
            service = batteryListPageAsync.service
            streamHandlerExecutor = batteryListPageAsync.streamHandlerExecutor
            params = batteryListPageAsync.params
            items = batteryListPageAsync.items
        }

        fun service(service: BatteryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BatteryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BatteryAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BatteryListPageAsync].
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
        fun build(): BatteryListPageAsync =
            BatteryListPageAsync(
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

        return other is BatteryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "BatteryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
