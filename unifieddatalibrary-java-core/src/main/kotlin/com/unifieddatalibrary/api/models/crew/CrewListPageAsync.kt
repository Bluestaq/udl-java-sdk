// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.crew

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.crew.CrewAbridged
import com.unifieddatalibrary.api.models.crew.CrewListParams
import com.unifieddatalibrary.api.services.async.CrewServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CrewServiceAsync.list */
class CrewListPageAsync private constructor(
    private val service: CrewServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CrewListParams,
    private val items: List<CrewAbridged>,

) : PageAsync<CrewAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CrewListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<CrewListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CrewAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): CrewListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CrewAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CrewListPageAsync].
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

    /** A builder for [CrewListPageAsync]. */
    class Builder internal constructor() {

        private var service: CrewServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CrewListParams? = null
        private var items: List<CrewAbridged>? = null

        @JvmSynthetic
        internal fun from(crewListPageAsync: CrewListPageAsync) =
            apply {
                service = crewListPageAsync.service
                streamHandlerExecutor = crewListPageAsync.streamHandlerExecutor
                params = crewListPageAsync.params
                items = crewListPageAsync.items
            }

        fun service(service: CrewServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: CrewListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<CrewAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [CrewListPageAsync].
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
        fun build(): CrewListPageAsync =
            CrewListPageAsync(
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

      return /* spotless:off */ other is CrewListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "CrewListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
