// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslots

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldSlotServiceAsync.list */
class AirfieldSlotListPageAsync
private constructor(
    private val service: AirfieldSlotServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirfieldSlotListParams,
    private val items: List<AirfieldslotAbridged>,
) : PageAsync<AirfieldslotAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldSlotListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirfieldSlotListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirfieldslotAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldSlotListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldslotAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirfieldSlotListPageAsync].
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

    /** A builder for [AirfieldSlotListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirfieldSlotServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirfieldSlotListParams? = null
        private var items: List<AirfieldslotAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldSlotListPageAsync: AirfieldSlotListPageAsync) = apply {
            service = airfieldSlotListPageAsync.service
            streamHandlerExecutor = airfieldSlotListPageAsync.streamHandlerExecutor
            params = airfieldSlotListPageAsync.params
            items = airfieldSlotListPageAsync.items
        }

        fun service(service: AirfieldSlotServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldSlotListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldslotAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirfieldSlotListPageAsync].
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
        fun build(): AirfieldSlotListPageAsync =
            AirfieldSlotListPageAsync(
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

        return /* spotless:off */ other is AirfieldSlotListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AirfieldSlotListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
