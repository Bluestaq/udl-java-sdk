// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.FeatureAssessmentService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see FeatureAssessmentService.list */
class FeatureAssessmentListPage
private constructor(
    private val service: FeatureAssessmentService,
    private val params: FeatureAssessmentListParams,
    private val items: List<FeatureAssessmentListResponse>,
) : Page<FeatureAssessmentListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FeatureAssessmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): FeatureAssessmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FeatureAssessmentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FeatureAssessmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeatureAssessmentListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeatureAssessmentListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeatureAssessmentListPage]. */
    class Builder internal constructor() {

        private var service: FeatureAssessmentService? = null
        private var params: FeatureAssessmentListParams? = null
        private var items: List<FeatureAssessmentListResponse>? = null

        @JvmSynthetic
        internal fun from(featureAssessmentListPage: FeatureAssessmentListPage) = apply {
            service = featureAssessmentListPage.service
            params = featureAssessmentListPage.params
            items = featureAssessmentListPage.items
        }

        fun service(service: FeatureAssessmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FeatureAssessmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeatureAssessmentListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [FeatureAssessmentListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeatureAssessmentListPage =
            FeatureAssessmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeatureAssessmentListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "FeatureAssessmentListPage{service=$service, params=$params, items=$items}"
}
