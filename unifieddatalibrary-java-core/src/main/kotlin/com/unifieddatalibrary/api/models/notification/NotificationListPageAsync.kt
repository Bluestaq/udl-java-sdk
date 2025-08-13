// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.NotificationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see NotificationServiceAsync.list */
class NotificationListPageAsync
private constructor(
    private val service: NotificationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NotificationListParams,
    private val items: List<NotificationListResponse>,
) : PageAsync<NotificationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): NotificationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<NotificationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NotificationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NotificationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<NotificationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationListPageAsync].
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

    /** A builder for [NotificationListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NotificationListParams? = null
        private var items: List<NotificationListResponse>? = null

        @JvmSynthetic
        internal fun from(notificationListPageAsync: NotificationListPageAsync) = apply {
            service = notificationListPageAsync.service
            streamHandlerExecutor = notificationListPageAsync.streamHandlerExecutor
            params = notificationListPageAsync.params
            items = notificationListPageAsync.items
        }

        fun service(service: NotificationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<NotificationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [NotificationListPageAsync].
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
        fun build(): NotificationListPageAsync =
            NotificationListPageAsync(
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

        return other is NotificationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "NotificationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
