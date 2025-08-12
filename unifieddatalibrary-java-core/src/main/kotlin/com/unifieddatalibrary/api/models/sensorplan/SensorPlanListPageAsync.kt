// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorplan

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListResponse
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SensorPlanServiceAsync.list */
class SensorPlanListPageAsync private constructor(
    private val service: SensorPlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorPlanListParams,
    private val items: List<SensorPlanListResponse>,

) : PageAsync<SensorPlanListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorPlanListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<SensorPlanListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorPlanListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): SensorPlanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorPlanListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorPlanListPageAsync].
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

    /** A builder for [SensorPlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorPlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorPlanListParams? = null
        private var items: List<SensorPlanListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorPlanListPageAsync: SensorPlanListPageAsync) =
            apply {
                service = sensorPlanListPageAsync.service
                streamHandlerExecutor = sensorPlanListPageAsync.streamHandlerExecutor
                params = sensorPlanListPageAsync.params
                items = sensorPlanListPageAsync.items
            }

        fun service(service: SensorPlanServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: SensorPlanListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorPlanListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SensorPlanListPageAsync].
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
        fun build(): SensorPlanListPageAsync =
            SensorPlanListPageAsync(
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

      return /* spotless:off */ other is SensorPlanListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "SensorPlanListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
