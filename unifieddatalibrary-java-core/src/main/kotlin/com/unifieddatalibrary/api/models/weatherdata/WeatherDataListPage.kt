// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherdata

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListResponse
import com.unifieddatalibrary.api.services.blocking.WeatherDataService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see WeatherDataService.list */
class WeatherDataListPage private constructor(
    private val service: WeatherDataService,
    private val params: WeatherDataListParams,
    private val items: List<WeatherDataListResponse>,

) : Page<WeatherDataListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): WeatherDataListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): WeatherDataListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WeatherDataListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WeatherDataListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<WeatherDataListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WeatherDataListPage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [WeatherDataListPage]. */
    class Builder internal constructor() {

        private var service: WeatherDataService? = null
        private var params: WeatherDataListParams? = null
        private var items: List<WeatherDataListResponse>? = null

        @JvmSynthetic
        internal fun from(weatherDataListPage: WeatherDataListPage) =
            apply {
                service = weatherDataListPage.service
                params = weatherDataListPage.params
                items = weatherDataListPage.items
            }

        fun service(service: WeatherDataService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: WeatherDataListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<WeatherDataListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [WeatherDataListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WeatherDataListPage =
            WeatherDataListPage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "items", items
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is WeatherDataListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "WeatherDataListPage{service=$service, params=$params, items=$items}"
}
