// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipment

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EquipmentServiceAsync.list */
class EquipmentListPageAsync
private constructor(
    private val service: EquipmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EquipmentListParams,
    private val items: List<EquipmentAbridged>,
) : PageAsync<EquipmentAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EquipmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EquipmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EquipmentAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EquipmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EquipmentAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EquipmentListPageAsync].
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

    /** A builder for [EquipmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: EquipmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EquipmentListParams? = null
        private var items: List<EquipmentAbridged>? = null

        @JvmSynthetic
        internal fun from(equipmentListPageAsync: EquipmentListPageAsync) = apply {
            service = equipmentListPageAsync.service
            streamHandlerExecutor = equipmentListPageAsync.streamHandlerExecutor
            params = equipmentListPageAsync.params
            items = equipmentListPageAsync.items
        }

        fun service(service: EquipmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EquipmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EquipmentAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EquipmentListPageAsync].
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
        fun build(): EquipmentListPageAsync =
            EquipmentListPageAsync(
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

        return other is EquipmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EquipmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
