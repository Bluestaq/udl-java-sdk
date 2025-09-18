// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor.calibration

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.sensor.CalibrationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CalibrationServiceAsync.list */
class CalibrationListPageAsync
private constructor(
    private val service: CalibrationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CalibrationListParams,
    private val items: List<CalibrationListResponse>,
) : PageAsync<CalibrationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CalibrationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CalibrationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CalibrationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CalibrationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CalibrationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CalibrationListPageAsync].
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

    /** A builder for [CalibrationListPageAsync]. */
    class Builder internal constructor() {

        private var service: CalibrationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CalibrationListParams? = null
        private var items: List<CalibrationListResponse>? = null

        @JvmSynthetic
        internal fun from(calibrationListPageAsync: CalibrationListPageAsync) = apply {
            service = calibrationListPageAsync.service
            streamHandlerExecutor = calibrationListPageAsync.streamHandlerExecutor
            params = calibrationListPageAsync.params
            items = calibrationListPageAsync.items
        }

        fun service(service: CalibrationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CalibrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CalibrationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CalibrationListPageAsync].
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
        fun build(): CalibrationListPageAsync =
            CalibrationListPageAsync(
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

        return other is CalibrationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "CalibrationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
