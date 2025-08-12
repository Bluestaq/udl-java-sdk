// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.antennas.AntennaAbridged
import com.unifieddatalibrary.api.models.antennas.AntennaListParams
import com.unifieddatalibrary.api.services.async.AntennaServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AntennaServiceAsync.list */
class AntennaListPageAsync private constructor(
    private val service: AntennaServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AntennaListParams,
    private val items: List<AntennaAbridged>,

) : PageAsync<AntennaAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AntennaListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<AntennaListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AntennaAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): AntennaListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AntennaAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AntennaListPageAsync].
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

    /** A builder for [AntennaListPageAsync]. */
    class Builder internal constructor() {

        private var service: AntennaServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AntennaListParams? = null
        private var items: List<AntennaAbridged>? = null

        @JvmSynthetic
        internal fun from(antennaListPageAsync: AntennaListPageAsync) =
            apply {
                service = antennaListPageAsync.service
                streamHandlerExecutor = antennaListPageAsync.streamHandlerExecutor
                params = antennaListPageAsync.params
                items = antennaListPageAsync.items
            }

        fun service(service: AntennaServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: AntennaListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AntennaAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AntennaListPageAsync].
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
        fun build(): AntennaListPageAsync =
            AntennaListPageAsync(
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

      return /* spotless:off */ other is AntennaListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "AntennaListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
