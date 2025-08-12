// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.flightplan

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.flightplan.FlightPlanAbridged
import com.unifieddatalibrary.api.models.flightplan.FlightplanListParams
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see FlightplanServiceAsync.list */
class FlightplanListPageAsync private constructor(
    private val service: FlightplanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FlightplanListParams,
    private val items: List<FlightPlanAbridged>,

) : PageAsync<FlightPlanAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FlightplanListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<FlightplanListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FlightPlanAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): FlightplanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FlightPlanAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FlightplanListPageAsync].
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

    /** A builder for [FlightplanListPageAsync]. */
    class Builder internal constructor() {

        private var service: FlightplanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FlightplanListParams? = null
        private var items: List<FlightPlanAbridged>? = null

        @JvmSynthetic
        internal fun from(flightplanListPageAsync: FlightplanListPageAsync) =
            apply {
                service = flightplanListPageAsync.service
                streamHandlerExecutor = flightplanListPageAsync.streamHandlerExecutor
                params = flightplanListPageAsync.params
                items = flightplanListPageAsync.items
            }

        fun service(service: FlightplanServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: FlightplanListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<FlightPlanAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [FlightplanListPageAsync].
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
        fun build(): FlightplanListPageAsync =
            FlightplanListPageAsync(
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

      return /* spotless:off */ other is FlightplanListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "FlightplanListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
