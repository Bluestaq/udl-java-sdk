// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EquipmentRemarkServiceAsync.list */
class EquipmentRemarkListPageAsync
private constructor(
    private val service: EquipmentRemarkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EquipmentRemarkListParams,
    private val items: List<EquipmentRemarkAbridged>,
) : PageAsync<EquipmentRemarkAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EquipmentRemarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EquipmentRemarkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EquipmentRemarkAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EquipmentRemarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EquipmentRemarkAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EquipmentRemarkListPageAsync].
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

    /** A builder for [EquipmentRemarkListPageAsync]. */
    class Builder internal constructor() {

        private var service: EquipmentRemarkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EquipmentRemarkListParams? = null
        private var items: List<EquipmentRemarkAbridged>? = null

        @JvmSynthetic
        internal fun from(equipmentRemarkListPageAsync: EquipmentRemarkListPageAsync) = apply {
            service = equipmentRemarkListPageAsync.service
            streamHandlerExecutor = equipmentRemarkListPageAsync.streamHandlerExecutor
            params = equipmentRemarkListPageAsync.params
            items = equipmentRemarkListPageAsync.items
        }

        fun service(service: EquipmentRemarkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EquipmentRemarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EquipmentRemarkAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EquipmentRemarkListPageAsync].
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
        fun build(): EquipmentRemarkListPageAsync =
            EquipmentRemarkListPageAsync(
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

        return /* spotless:off */ other is EquipmentRemarkListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "EquipmentRemarkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
