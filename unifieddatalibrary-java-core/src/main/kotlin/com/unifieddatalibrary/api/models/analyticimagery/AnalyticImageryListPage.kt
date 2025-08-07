// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AnalyticImageryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AnalyticImageryService.list */
class AnalyticImageryListPage
private constructor(
    private val service: AnalyticImageryService,
    private val params: AnalyticImageryListParams,
    private val items: List<AnalyticImageryAbridged>,
) : Page<AnalyticImageryAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AnalyticImageryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AnalyticImageryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AnalyticImageryAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AnalyticImageryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AnalyticImageryAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AnalyticImageryListPage].
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

    /** A builder for [AnalyticImageryListPage]. */
    class Builder internal constructor() {

        private var service: AnalyticImageryService? = null
        private var params: AnalyticImageryListParams? = null
        private var items: List<AnalyticImageryAbridged>? = null

        @JvmSynthetic
        internal fun from(analyticImageryListPage: AnalyticImageryListPage) = apply {
            service = analyticImageryListPage.service
            params = analyticImageryListPage.params
            items = analyticImageryListPage.items
        }

        fun service(service: AnalyticImageryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AnalyticImageryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AnalyticImageryAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AnalyticImageryListPage].
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
        fun build(): AnalyticImageryListPage =
            AnalyticImageryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AnalyticImageryListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "AnalyticImageryListPage{service=$service, params=$params, items=$items}"
}
