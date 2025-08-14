// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitthrusterstatusServiceAsync.list */
class OnorbitthrusterstatusListPageAsync
private constructor(
    private val service: OnorbitthrusterstatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitthrusterstatusListParams,
    private val items: List<OnorbitthrusterstatusListResponse>,
) : PageAsync<OnorbitthrusterstatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitthrusterstatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbitthrusterstatusListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitthrusterstatusListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitthrusterstatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitthrusterstatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OnorbitthrusterstatusListPageAsync].
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

    /** A builder for [OnorbitthrusterstatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitthrusterstatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitthrusterstatusListParams? = null
        private var items: List<OnorbitthrusterstatusListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitthrusterstatusListPageAsync: OnorbitthrusterstatusListPageAsync) =
            apply {
                service = onorbitthrusterstatusListPageAsync.service
                streamHandlerExecutor = onorbitthrusterstatusListPageAsync.streamHandlerExecutor
                params = onorbitthrusterstatusListPageAsync.params
                items = onorbitthrusterstatusListPageAsync.items
            }

        fun service(service: OnorbitthrusterstatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitthrusterstatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitthrusterstatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitthrusterstatusListPageAsync].
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
        fun build(): OnorbitthrusterstatusListPageAsync =
            OnorbitthrusterstatusListPageAsync(
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

        return other is OnorbitthrusterstatusListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "OnorbitthrusterstatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
