// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.spaceenvobservation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListResponse
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SpaceEnvObservationServiceAsync.list */
class SpaceEnvObservationListPageAsync private constructor(
    private val service: SpaceEnvObservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SpaceEnvObservationListParams,
    private val items: List<SpaceEnvObservationListResponse>,

) : PageAsync<SpaceEnvObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SpaceEnvObservationListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<SpaceEnvObservationListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SpaceEnvObservationListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): SpaceEnvObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SpaceEnvObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpaceEnvObservationListPageAsync].
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

    /** A builder for [SpaceEnvObservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: SpaceEnvObservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SpaceEnvObservationListParams? = null
        private var items: List<SpaceEnvObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(spaceEnvObservationListPageAsync: SpaceEnvObservationListPageAsync) =
            apply {
                service = spaceEnvObservationListPageAsync.service
                streamHandlerExecutor = spaceEnvObservationListPageAsync.streamHandlerExecutor
                params = spaceEnvObservationListPageAsync.params
                items = spaceEnvObservationListPageAsync.items
            }

        fun service(service: SpaceEnvObservationServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: SpaceEnvObservationListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SpaceEnvObservationListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SpaceEnvObservationListPageAsync].
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
        fun build(): SpaceEnvObservationListPageAsync =
            SpaceEnvObservationListPageAsync(
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

      return /* spotless:off */ other is SpaceEnvObservationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "SpaceEnvObservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
