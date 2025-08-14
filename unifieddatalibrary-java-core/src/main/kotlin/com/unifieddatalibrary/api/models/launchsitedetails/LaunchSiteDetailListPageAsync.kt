// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchSiteDetailServiceAsync.list */
class LaunchSiteDetailListPageAsync
private constructor(
    private val service: LaunchSiteDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaunchSiteDetailListParams,
    private val items: List<LaunchSiteDetailListResponse>,
) : PageAsync<LaunchSiteDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchSiteDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LaunchSiteDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaunchSiteDetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LaunchSiteDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchSiteDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LaunchSiteDetailListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LaunchSiteDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaunchSiteDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaunchSiteDetailListParams? = null
        private var items: List<LaunchSiteDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(launchSiteDetailListPageAsync: LaunchSiteDetailListPageAsync) = apply {
            service = launchSiteDetailListPageAsync.service
            streamHandlerExecutor = launchSiteDetailListPageAsync.streamHandlerExecutor
            params = launchSiteDetailListPageAsync.params
            items = launchSiteDetailListPageAsync.items
        }

        fun service(service: LaunchSiteDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchSiteDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchSiteDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchSiteDetailListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LaunchSiteDetailListPageAsync =
            LaunchSiteDetailListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LaunchSiteDetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "LaunchSiteDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
