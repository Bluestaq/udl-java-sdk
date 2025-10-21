// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnorbitassessmentServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitassessmentServiceAsync.list */
class OnorbitassessmentListPageAsync
private constructor(
    private val service: OnorbitassessmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnorbitassessmentListParams,
    private val items: List<OnorbitassessmentListResponse>,
) : PageAsync<OnorbitassessmentListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitassessmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnorbitassessmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnorbitassessmentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitassessmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitassessmentListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OnorbitassessmentListPageAsync].
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

    /** A builder for [OnorbitassessmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnorbitassessmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnorbitassessmentListParams? = null
        private var items: List<OnorbitassessmentListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitassessmentListPageAsync: OnorbitassessmentListPageAsync) = apply {
            service = onorbitassessmentListPageAsync.service
            streamHandlerExecutor = onorbitassessmentListPageAsync.streamHandlerExecutor
            params = onorbitassessmentListPageAsync.params
            items = onorbitassessmentListPageAsync.items
        }

        fun service(service: OnorbitassessmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitassessmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitassessmentListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitassessmentListPageAsync].
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
        fun build(): OnorbitassessmentListPageAsync =
            OnorbitassessmentListPageAsync(
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

        return other is OnorbitassessmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "OnorbitassessmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
