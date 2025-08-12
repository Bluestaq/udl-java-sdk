// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airoperations.diplomaticclearance.DiplomaticclearanceAbridged
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DiplomaticClearanceServiceAsync.list */
class DiplomaticClearanceListPageAsync private constructor(
    private val service: DiplomaticClearanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DiplomaticClearanceListParams,
    private val items: List<DiplomaticclearanceAbridged>,

) : PageAsync<DiplomaticclearanceAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DiplomaticClearanceListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<DiplomaticClearanceListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DiplomaticclearanceAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): DiplomaticClearanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DiplomaticclearanceAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiplomaticClearanceListPageAsync].
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

    /** A builder for [DiplomaticClearanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: DiplomaticClearanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DiplomaticClearanceListParams? = null
        private var items: List<DiplomaticclearanceAbridged>? = null

        @JvmSynthetic
        internal fun from(diplomaticClearanceListPageAsync: DiplomaticClearanceListPageAsync) =
            apply {
                service = diplomaticClearanceListPageAsync.service
                streamHandlerExecutor = diplomaticClearanceListPageAsync.streamHandlerExecutor
                params = diplomaticClearanceListPageAsync.params
                items = diplomaticClearanceListPageAsync.items
            }

        fun service(service: DiplomaticClearanceServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: DiplomaticClearanceListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<DiplomaticclearanceAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [DiplomaticClearanceListPageAsync].
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
        fun build(): DiplomaticClearanceListPageAsync =
            DiplomaticClearanceListPageAsync(
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

      return /* spotless:off */ other is DiplomaticClearanceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "DiplomaticClearanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
