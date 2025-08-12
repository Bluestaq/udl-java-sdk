// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensortype

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListResponse
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SensorTypeServiceAsync.list */
class SensorTypeListPageAsync private constructor(
    private val service: SensorTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SensorTypeListParams,
    private val items: List<SensorTypeListResponse>,

) : PageAsync<SensorTypeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorTypeListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<SensorTypeListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SensorTypeListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): SensorTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorTypeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorTypeListPageAsync].
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

    /** A builder for [SensorTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: SensorTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SensorTypeListParams? = null
        private var items: List<SensorTypeListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorTypeListPageAsync: SensorTypeListPageAsync) =
            apply {
                service = sensorTypeListPageAsync.service
                streamHandlerExecutor = sensorTypeListPageAsync.streamHandlerExecutor
                params = sensorTypeListPageAsync.params
                items = sensorTypeListPageAsync.items
            }

        fun service(service: SensorTypeServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: SensorTypeListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorTypeListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SensorTypeListPageAsync].
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
        fun build(): SensorTypeListPageAsync =
            SensorTypeListPageAsync(
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

      return /* spotless:off */ other is SensorTypeListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "SensorTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
