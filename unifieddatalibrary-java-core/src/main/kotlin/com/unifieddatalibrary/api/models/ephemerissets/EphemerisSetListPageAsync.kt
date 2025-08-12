// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemerissets

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetAbridged
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListParams
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EphemerisSetServiceAsync.list */
class EphemerisSetListPageAsync private constructor(
    private val service: EphemerisSetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EphemerisSetListParams,
    private val items: List<EphemerisSetAbridged>,

) : PageAsync<EphemerisSetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EphemerisSetListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<EphemerisSetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EphemerisSetAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): EphemerisSetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EphemerisSetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemerisSetListPageAsync].
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

    /** A builder for [EphemerisSetListPageAsync]. */
    class Builder internal constructor() {

        private var service: EphemerisSetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EphemerisSetListParams? = null
        private var items: List<EphemerisSetAbridged>? = null

        @JvmSynthetic
        internal fun from(ephemerisSetListPageAsync: EphemerisSetListPageAsync) =
            apply {
                service = ephemerisSetListPageAsync.service
                streamHandlerExecutor = ephemerisSetListPageAsync.streamHandlerExecutor
                params = ephemerisSetListPageAsync.params
                items = ephemerisSetListPageAsync.items
            }

        fun service(service: EphemerisSetServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: EphemerisSetListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<EphemerisSetAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [EphemerisSetListPageAsync].
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
        fun build(): EphemerisSetListPageAsync =
            EphemerisSetListPageAsync(
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

      return /* spotless:off */ other is EphemerisSetListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "EphemerisSetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
