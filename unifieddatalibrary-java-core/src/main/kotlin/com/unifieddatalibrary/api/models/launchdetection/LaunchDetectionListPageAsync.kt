// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchDetectionServiceAsync.list */
class LaunchDetectionListPageAsync
private constructor(
    private val service: LaunchDetectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LaunchDetectionListParams,
    private val items: List<LaunchDetectionListResponse>,
) : PageAsync<LaunchDetectionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchDetectionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LaunchDetectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LaunchDetectionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LaunchDetectionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchDetectionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchDetectionListPageAsync].
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

    /** A builder for [LaunchDetectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: LaunchDetectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LaunchDetectionListParams? = null
        private var items: List<LaunchDetectionListResponse>? = null

        @JvmSynthetic
        internal fun from(launchDetectionListPageAsync: LaunchDetectionListPageAsync) = apply {
            service = launchDetectionListPageAsync.service
            streamHandlerExecutor = launchDetectionListPageAsync.streamHandlerExecutor
            params = launchDetectionListPageAsync.params
            items = launchDetectionListPageAsync.items
        }

        fun service(service: LaunchDetectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchDetectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchDetectionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchDetectionListPageAsync].
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
        fun build(): LaunchDetectionListPageAsync =
            LaunchDetectionListPageAsync(
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

        return /* spotless:off */ other is LaunchDetectionListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "LaunchDetectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
