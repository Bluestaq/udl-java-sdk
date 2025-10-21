// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitassessmentService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitassessmentService.list */
class OnorbitassessmentListPage
private constructor(
    private val service: OnorbitassessmentService,
    private val params: OnorbitassessmentListParams,
    private val items: List<OnorbitassessmentListResponse>,
) : Page<OnorbitassessmentListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitassessmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitassessmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitassessmentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitassessmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitassessmentListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitassessmentListPage].
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

    /** A builder for [OnorbitassessmentListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitassessmentService? = null
        private var params: OnorbitassessmentListParams? = null
        private var items: List<OnorbitassessmentListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitassessmentListPage: OnorbitassessmentListPage) = apply {
            service = onorbitassessmentListPage.service
            params = onorbitassessmentListPage.params
            items = onorbitassessmentListPage.items
        }

        fun service(service: OnorbitassessmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitassessmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitassessmentListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitassessmentListPage].
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
        fun build(): OnorbitassessmentListPage =
            OnorbitassessmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitassessmentListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OnorbitassessmentListPage{service=$service, params=$params, items=$items}"
}
