// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsite

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchSiteServiceAsync.list */
class LaunchSiteListPageAsync
private constructor(
    private val service: LaunchSiteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaunchSiteListParams,
    private val items: List<LaunchSiteListResponse>,
) : PageAsync<LaunchSiteListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchSiteListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LaunchSiteListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaunchSiteListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LaunchSiteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchSiteListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchSiteListPageAsync].
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

    /** A builder for [LaunchSiteListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaunchSiteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaunchSiteListParams? = null
        private var items: List<LaunchSiteListResponse>? = null

        @JvmSynthetic
        internal fun from(launchSiteListPageAsync: LaunchSiteListPageAsync) = apply {
            service = launchSiteListPageAsync.service
            streamHandlerExecutor = launchSiteListPageAsync.streamHandlerExecutor
            params = launchSiteListPageAsync.params
            items = launchSiteListPageAsync.items
        }

        fun service(service: LaunchSiteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchSiteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchSiteListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchSiteListPageAsync].
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
        fun build(): LaunchSiteListPageAsync =
            LaunchSiteListPageAsync(
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

        return other is LaunchSiteListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "LaunchSiteListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
