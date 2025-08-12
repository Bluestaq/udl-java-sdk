// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sitestatus

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListResponse
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SiteStatusServiceAsync.list */
class SiteStatusListPageAsync private constructor(
    private val service: SiteStatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SiteStatusListParams,
    private val items: List<SiteStatusListResponse>,

) : PageAsync<SiteStatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SiteStatusListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<SiteStatusListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SiteStatusListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): SiteStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SiteStatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SiteStatusListPageAsync].
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

    /** A builder for [SiteStatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: SiteStatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SiteStatusListParams? = null
        private var items: List<SiteStatusListResponse>? = null

        @JvmSynthetic
        internal fun from(siteStatusListPageAsync: SiteStatusListPageAsync) =
            apply {
                service = siteStatusListPageAsync.service
                streamHandlerExecutor = siteStatusListPageAsync.streamHandlerExecutor
                params = siteStatusListPageAsync.params
                items = siteStatusListPageAsync.items
            }

        fun service(service: SiteStatusServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: SiteStatusListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SiteStatusListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SiteStatusListPageAsync].
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
        fun build(): SiteStatusListPageAsync =
            SiteStatusListPageAsync(
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

      return /* spotless:off */ other is SiteStatusListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "SiteStatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
