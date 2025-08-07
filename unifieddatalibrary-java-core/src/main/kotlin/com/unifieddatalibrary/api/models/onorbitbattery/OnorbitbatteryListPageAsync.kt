// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitbattery

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitbatteryServiceAsync.list */
class OnorbitbatteryListPageAsync
private constructor(
    private val service: OnorbitbatteryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitbatteryListParams,
    private val items: List<OnorbitbatteryListResponse>,
) : PageAsync<OnorbitbatteryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitbatteryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbitbatteryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitbatteryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitbatteryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitbatteryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitbatteryListPageAsync].
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

    /** A builder for [OnorbitbatteryListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitbatteryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitbatteryListParams? = null
        private var items: List<OnorbitbatteryListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitbatteryListPageAsync: OnorbitbatteryListPageAsync) = apply {
            service = onorbitbatteryListPageAsync.service
            streamHandlerExecutor = onorbitbatteryListPageAsync.streamHandlerExecutor
            params = onorbitbatteryListPageAsync.params
            items = onorbitbatteryListPageAsync.items
        }

        fun service(service: OnorbitbatteryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitbatteryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitbatteryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitbatteryListPageAsync].
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
        fun build(): OnorbitbatteryListPageAsync =
            OnorbitbatteryListPageAsync(
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

        return /* spotless:off */ other is OnorbitbatteryListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "OnorbitbatteryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
