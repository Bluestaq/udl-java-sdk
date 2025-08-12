// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organizationdetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListResponse
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OrganizationdetailServiceAsync.list */
class OrganizationdetailListPageAsync private constructor(
    private val service: OrganizationdetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OrganizationdetailListParams,
    private val items: List<OrganizationdetailListResponse>,

) : PageAsync<OrganizationdetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrganizationdetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<OrganizationdetailListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OrganizationdetailListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): OrganizationdetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrganizationdetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationdetailListPageAsync].
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

    /** A builder for [OrganizationdetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: OrganizationdetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OrganizationdetailListParams? = null
        private var items: List<OrganizationdetailListResponse>? = null

        @JvmSynthetic
        internal fun from(organizationdetailListPageAsync: OrganizationdetailListPageAsync) =
            apply {
                service = organizationdetailListPageAsync.service
                streamHandlerExecutor = organizationdetailListPageAsync.streamHandlerExecutor
                params = organizationdetailListPageAsync.params
                items = organizationdetailListPageAsync.items
            }

        fun service(service: OrganizationdetailServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: OrganizationdetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<OrganizationdetailListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [OrganizationdetailListPageAsync].
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
        fun build(): OrganizationdetailListPageAsync =
            OrganizationdetailListPageAsync(
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

      return /* spotless:off */ other is OrganizationdetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "OrganizationdetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
