// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onboardnavigation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnboardnavigationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnboardnavigationService.list */
class OnboardnavigationListPage
private constructor(
    private val service: OnboardnavigationService,
    private val params: OnboardnavigationListParams,
    private val items: List<OnboardnavigationListResponse>,
) : Page<OnboardnavigationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnboardnavigationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnboardnavigationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnboardnavigationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnboardnavigationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnboardnavigationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnboardnavigationListPage].
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

    /** A builder for [OnboardnavigationListPage]. */
    class Builder internal constructor() {

        private var service: OnboardnavigationService? = null
        private var params: OnboardnavigationListParams? = null
        private var items: List<OnboardnavigationListResponse>? = null

        @JvmSynthetic
        internal fun from(onboardnavigationListPage: OnboardnavigationListPage) = apply {
            service = onboardnavigationListPage.service
            params = onboardnavigationListPage.params
            items = onboardnavigationListPage.items
        }

        fun service(service: OnboardnavigationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnboardnavigationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnboardnavigationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnboardnavigationListPage].
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
        fun build(): OnboardnavigationListPage =
            OnboardnavigationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnboardnavigationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "OnboardnavigationListPage{service=$service, params=$params, items=$items}"
}
