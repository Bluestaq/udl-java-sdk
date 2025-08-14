// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherreport

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.WeatherReportService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see WeatherReportService.list */
class WeatherReportListPage
private constructor(
    private val service: WeatherReportService,
    private val params: WeatherReportListParams,
    private val items: List<WeatherReportListResponse>,
) : Page<WeatherReportListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): WeatherReportListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): WeatherReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WeatherReportListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WeatherReportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<WeatherReportListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WeatherReportListPage].
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

    /** A builder for [WeatherReportListPage]. */
    class Builder internal constructor() {

        private var service: WeatherReportService? = null
        private var params: WeatherReportListParams? = null
        private var items: List<WeatherReportListResponse>? = null

        @JvmSynthetic
        internal fun from(weatherReportListPage: WeatherReportListPage) = apply {
            service = weatherReportListPage.service
            params = weatherReportListPage.params
            items = weatherReportListPage.items
        }

        fun service(service: WeatherReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WeatherReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<WeatherReportListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [WeatherReportListPage].
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
        fun build(): WeatherReportListPage =
            WeatherReportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WeatherReportListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "WeatherReportListPage{service=$service, params=$params, items=$items}"
}
