// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherdata

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListResponse
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see WeatherDataServiceAsync.list */
class WeatherDataListPageAsync private constructor(
    private val service: WeatherDataServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WeatherDataListParams,
    private val items: List<WeatherDataListResponse>,

) : PageAsync<WeatherDataListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): WeatherDataListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<WeatherDataListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WeatherDataListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): WeatherDataListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<WeatherDataListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WeatherDataListPageAsync].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [WeatherDataListPageAsync]. */
    class Builder internal constructor() {

        private var service: WeatherDataServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WeatherDataListParams? = null
        private var items: List<WeatherDataListResponse>? = null

        @JvmSynthetic
        internal fun from(weatherDataListPageAsync: WeatherDataListPageAsync) =
            apply {
                service = weatherDataListPageAsync.service
                streamHandlerExecutor = weatherDataListPageAsync.streamHandlerExecutor
                params = weatherDataListPageAsync.params
                items = weatherDataListPageAsync.items
            }

        fun service(service: WeatherDataServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
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
         * Returns an immutable instance of [WeatherDataListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WeatherDataListPageAsync =
            WeatherDataListPageAsync(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "streamHandlerExecutor", streamHandlerExecutor
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

      return /* spotless:off */ other is WeatherDataListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "WeatherDataListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
