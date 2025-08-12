// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfields

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airfields.AirfieldAbridged
import com.unifieddatalibrary.api.models.airfields.AirfieldListParams
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldServiceAsync.list */
class AirfieldListPageAsync private constructor(
    private val service: AirfieldServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirfieldListParams,
    private val items: List<AirfieldAbridged>,

) : PageAsync<AirfieldAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<AirfieldListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirfieldAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): AirfieldListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirfieldListPageAsync].
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

    /** A builder for [AirfieldListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirfieldServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirfieldListParams? = null
        private var items: List<AirfieldAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldListPageAsync: AirfieldListPageAsync) =
            apply {
                service = airfieldListPageAsync.service
                streamHandlerExecutor = airfieldListPageAsync.streamHandlerExecutor
                params = airfieldListPageAsync.params
                items = airfieldListPageAsync.items
            }

        fun service(service: AirfieldServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AirfieldListPageAsync].
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
        fun build(): AirfieldListPageAsync =
            AirfieldListPageAsync(
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

      return /* spotless:off */ other is AirfieldListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "AirfieldListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
