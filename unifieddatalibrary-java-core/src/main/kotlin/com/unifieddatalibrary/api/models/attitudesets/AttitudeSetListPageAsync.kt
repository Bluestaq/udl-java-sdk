// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.attitudesets

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudesetAbridged
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AttitudeSetServiceAsync.list */
class AttitudeSetListPageAsync private constructor(
    private val service: AttitudeSetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AttitudeSetListParams,
    private val items: List<AttitudesetAbridged>,

) : PageAsync<AttitudesetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AttitudeSetListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<AttitudeSetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AttitudesetAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): AttitudeSetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AttitudesetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttitudeSetListPageAsync].
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

    /** A builder for [AttitudeSetListPageAsync]. */
    class Builder internal constructor() {

        private var service: AttitudeSetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AttitudeSetListParams? = null
        private var items: List<AttitudesetAbridged>? = null

        @JvmSynthetic
        internal fun from(attitudeSetListPageAsync: AttitudeSetListPageAsync) =
            apply {
                service = attitudeSetListPageAsync.service
                streamHandlerExecutor = attitudeSetListPageAsync.streamHandlerExecutor
                params = attitudeSetListPageAsync.params
                items = attitudeSetListPageAsync.items
            }

        fun service(service: AttitudeSetServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: AttitudeSetListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AttitudesetAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AttitudeSetListPageAsync].
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
        fun build(): AttitudeSetListPageAsync =
            AttitudeSetListPageAsync(
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

      return /* spotless:off */ other is AttitudeSetListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "AttitudeSetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
