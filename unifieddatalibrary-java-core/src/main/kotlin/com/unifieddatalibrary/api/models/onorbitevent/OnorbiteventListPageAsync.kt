// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitevent

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbiteventServiceAsync.list */
class OnorbiteventListPageAsync
private constructor(
    private val service: OnorbiteventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbiteventListParams,
    private val items: List<OnorbiteventListResponse>,
) : PageAsync<OnorbiteventListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbiteventListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbiteventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbiteventListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbiteventListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbiteventListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbiteventListPageAsync].
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

    /** A builder for [OnorbiteventListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbiteventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbiteventListParams? = null
        private var items: List<OnorbiteventListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbiteventListPageAsync: OnorbiteventListPageAsync) = apply {
            service = onorbiteventListPageAsync.service
            streamHandlerExecutor = onorbiteventListPageAsync.streamHandlerExecutor
            params = onorbiteventListPageAsync.params
            items = onorbiteventListPageAsync.items
        }

        fun service(service: OnorbiteventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbiteventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbiteventListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbiteventListPageAsync].
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
        fun build(): OnorbiteventListPageAsync =
            OnorbiteventListPageAsync(
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

        return other is OnorbiteventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "OnorbiteventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
