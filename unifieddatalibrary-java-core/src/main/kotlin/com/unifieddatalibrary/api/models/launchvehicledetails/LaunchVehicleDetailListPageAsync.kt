// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicledetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchVehicleDetailServiceAsync.list */
class LaunchVehicleDetailListPageAsync
private constructor(
    private val service: LaunchVehicleDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaunchVehicleDetailListParams,
    private val items: List<LaunchVehicleDetailListResponse>,
) : PageAsync<LaunchVehicleDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchVehicleDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LaunchVehicleDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaunchVehicleDetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LaunchVehicleDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchVehicleDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LaunchVehicleDetailListPageAsync].
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

    /** A builder for [LaunchVehicleDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaunchVehicleDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaunchVehicleDetailListParams? = null
        private var items: List<LaunchVehicleDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(launchVehicleDetailListPageAsync: LaunchVehicleDetailListPageAsync) =
            apply {
                service = launchVehicleDetailListPageAsync.service
                streamHandlerExecutor = launchVehicleDetailListPageAsync.streamHandlerExecutor
                params = launchVehicleDetailListPageAsync.params
                items = launchVehicleDetailListPageAsync.items
            }

        fun service(service: LaunchVehicleDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchVehicleDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchVehicleDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchVehicleDetailListPageAsync].
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
        fun build(): LaunchVehicleDetailListPageAsync =
            LaunchVehicleDetailListPageAsync(
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

        return other is LaunchVehicleDetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "LaunchVehicleDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
