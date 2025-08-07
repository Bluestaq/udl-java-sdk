// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.drifthistory

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.DriftHistoryAbridged
import com.unifieddatalibrary.api.services.blocking.DriftHistoryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DriftHistoryService.list */
class DriftHistoryListPage
private constructor(
    private val service: DriftHistoryService,
    private val params: DriftHistoryListParams,
    private val items: List<DriftHistoryAbridged>,
) : Page<DriftHistoryAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DriftHistoryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DriftHistoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DriftHistoryAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DriftHistoryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DriftHistoryAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DriftHistoryListPage].
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

    /** A builder for [DriftHistoryListPage]. */
    class Builder internal constructor() {

        private var service: DriftHistoryService? = null
        private var params: DriftHistoryListParams? = null
        private var items: List<DriftHistoryAbridged>? = null

        @JvmSynthetic
        internal fun from(driftHistoryListPage: DriftHistoryListPage) = apply {
            service = driftHistoryListPage.service
            params = driftHistoryListPage.params
            items = driftHistoryListPage.items
        }

        fun service(service: DriftHistoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DriftHistoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DriftHistoryAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DriftHistoryListPage].
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
        fun build(): DriftHistoryListPage =
            DriftHistoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DriftHistoryListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "DriftHistoryListPage{service=$service, params=$params, items=$items}"
}
