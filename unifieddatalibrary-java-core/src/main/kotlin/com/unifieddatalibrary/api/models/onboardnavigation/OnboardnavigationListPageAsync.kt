// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onboardnavigation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see OnboardnavigationServiceAsync.list */
class OnboardnavigationListPageAsync
private constructor(
    private val service: OnboardnavigationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnboardnavigationListParams,
    private val items: List<OnboardnavigationListResponse>,
) : PageAsync<OnboardnavigationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnboardnavigationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnboardnavigationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnboardnavigationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnboardnavigationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnboardnavigationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OnboardnavigationListPageAsync].
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

    /** A builder for [OnboardnavigationListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnboardnavigationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnboardnavigationListParams? = null
        private var items: List<OnboardnavigationListResponse>? = null

        @JvmSynthetic
        internal fun from(onboardnavigationListPageAsync: OnboardnavigationListPageAsync) = apply {
            service = onboardnavigationListPageAsync.service
            streamHandlerExecutor = onboardnavigationListPageAsync.streamHandlerExecutor
            params = onboardnavigationListPageAsync.params
            items = onboardnavigationListPageAsync.items
        }

        fun service(service: OnboardnavigationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnboardnavigationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnboardnavigationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnboardnavigationListPageAsync].
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
        fun build(): OnboardnavigationListPageAsync =
            OnboardnavigationListPageAsync(
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

        return other is OnboardnavigationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "OnboardnavigationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
