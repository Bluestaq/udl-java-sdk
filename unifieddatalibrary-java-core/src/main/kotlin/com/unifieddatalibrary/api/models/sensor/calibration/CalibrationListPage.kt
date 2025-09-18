// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor.calibration

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.sensor.CalibrationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see CalibrationService.list */
class CalibrationListPage
private constructor(
    private val service: CalibrationService,
    private val params: CalibrationListParams,
    private val items: List<CalibrationListResponse>,
) : Page<CalibrationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CalibrationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CalibrationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CalibrationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CalibrationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CalibrationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CalibrationListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalibrationListPage]. */
    class Builder internal constructor() {

        private var service: CalibrationService? = null
        private var params: CalibrationListParams? = null
        private var items: List<CalibrationListResponse>? = null

        @JvmSynthetic
        internal fun from(calibrationListPage: CalibrationListPage) = apply {
            service = calibrationListPage.service
            params = calibrationListPage.params
            items = calibrationListPage.items
        }

        fun service(service: CalibrationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CalibrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CalibrationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CalibrationListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CalibrationListPage =
            CalibrationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalibrationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "CalibrationListPage{service=$service, params=$params, items=$items}"
}
