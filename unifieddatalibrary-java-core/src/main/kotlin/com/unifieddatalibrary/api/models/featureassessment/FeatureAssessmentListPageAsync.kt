// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see FeatureAssessmentServiceAsync.list */
class FeatureAssessmentListPageAsync
private constructor(
    private val service: FeatureAssessmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FeatureAssessmentListParams,
    private val items: List<FeatureAssessmentListResponse>,
) : PageAsync<FeatureAssessmentListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FeatureAssessmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<FeatureAssessmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FeatureAssessmentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FeatureAssessmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeatureAssessmentListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FeatureAssessmentListPageAsync].
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

    /** A builder for [FeatureAssessmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: FeatureAssessmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FeatureAssessmentListParams? = null
        private var items: List<FeatureAssessmentListResponse>? = null

        @JvmSynthetic
        internal fun from(featureAssessmentListPageAsync: FeatureAssessmentListPageAsync) = apply {
            service = featureAssessmentListPageAsync.service
            streamHandlerExecutor = featureAssessmentListPageAsync.streamHandlerExecutor
            params = featureAssessmentListPageAsync.params
            items = featureAssessmentListPageAsync.items
        }

        fun service(service: FeatureAssessmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FeatureAssessmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeatureAssessmentListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [FeatureAssessmentListPageAsync].
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
        fun build(): FeatureAssessmentListPageAsync =
            FeatureAssessmentListPageAsync(
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

        return other is FeatureAssessmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "FeatureAssessmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
