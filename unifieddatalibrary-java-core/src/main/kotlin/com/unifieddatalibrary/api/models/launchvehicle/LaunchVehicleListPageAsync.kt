// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicle

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListResponse
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchVehicleServiceAsync.list */
class LaunchVehicleListPageAsync private constructor(
    private val service: LaunchVehicleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaunchVehicleListParams,
    private val items: List<LaunchVehicleListResponse>,

) : PageAsync<LaunchVehicleListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchVehicleListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<LaunchVehicleListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaunchVehicleListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): LaunchVehicleListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchVehicleListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchVehicleListPageAsync].
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

    /** A builder for [LaunchVehicleListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaunchVehicleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaunchVehicleListParams? = null
        private var items: List<LaunchVehicleListResponse>? = null

        @JvmSynthetic
        internal fun from(launchVehicleListPageAsync: LaunchVehicleListPageAsync) =
            apply {
                service = launchVehicleListPageAsync.service
                streamHandlerExecutor = launchVehicleListPageAsync.streamHandlerExecutor
                params = launchVehicleListPageAsync.params
                items = launchVehicleListPageAsync.items
            }

        fun service(service: LaunchVehicleServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchVehicleListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchVehicleListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [LaunchVehicleListPageAsync].
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
        fun build(): LaunchVehicleListPageAsync =
            LaunchVehicleListPageAsync(
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

      return /* spotless:off */ other is LaunchVehicleListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "LaunchVehicleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
