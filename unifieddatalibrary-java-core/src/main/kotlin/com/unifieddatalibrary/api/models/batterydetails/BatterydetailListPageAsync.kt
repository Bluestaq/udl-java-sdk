// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batterydetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailsAbridged
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see BatterydetailServiceAsync.list */
class BatterydetailListPageAsync private constructor(
    private val service: BatterydetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BatterydetailListParams,
    private val items: List<BatterydetailsAbridged>,

) : PageAsync<BatterydetailsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BatterydetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<BatterydetailListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BatterydetailsAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): BatterydetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BatterydetailsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatterydetailListPageAsync].
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

    /** A builder for [BatterydetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: BatterydetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BatterydetailListParams? = null
        private var items: List<BatterydetailsAbridged>? = null

        @JvmSynthetic
        internal fun from(batterydetailListPageAsync: BatterydetailListPageAsync) =
            apply {
                service = batterydetailListPageAsync.service
                streamHandlerExecutor = batterydetailListPageAsync.streamHandlerExecutor
                params = batterydetailListPageAsync.params
                items = batterydetailListPageAsync.items
            }

        fun service(service: BatterydetailServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: BatterydetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<BatterydetailsAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [BatterydetailListPageAsync].
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
        fun build(): BatterydetailListPageAsync =
            BatterydetailListPageAsync(
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

      return /* spotless:off */ other is BatterydetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "BatterydetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
