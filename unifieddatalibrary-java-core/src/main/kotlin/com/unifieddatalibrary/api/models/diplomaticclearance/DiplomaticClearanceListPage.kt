// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airoperations.diplomaticclearance.DiplomaticclearanceAbridged
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DiplomaticClearanceService.list */
class DiplomaticClearanceListPage
private constructor(
    private val service: DiplomaticClearanceService,
    private val params: DiplomaticClearanceListParams,
    private val items: List<DiplomaticclearanceAbridged>,
) : Page<DiplomaticclearanceAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DiplomaticClearanceListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DiplomaticClearanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DiplomaticclearanceAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DiplomaticClearanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DiplomaticclearanceAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiplomaticClearanceListPage].
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

    /** A builder for [DiplomaticClearanceListPage]. */
    class Builder internal constructor() {

        private var service: DiplomaticClearanceService? = null
        private var params: DiplomaticClearanceListParams? = null
        private var items: List<DiplomaticclearanceAbridged>? = null

        @JvmSynthetic
        internal fun from(diplomaticClearanceListPage: DiplomaticClearanceListPage) = apply {
            service = diplomaticClearanceListPage.service
            params = diplomaticClearanceListPage.params
            items = diplomaticClearanceListPage.items
        }

        fun service(service: DiplomaticClearanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DiplomaticClearanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DiplomaticclearanceAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DiplomaticClearanceListPage].
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
        fun build(): DiplomaticClearanceListPage =
            DiplomaticClearanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiplomaticClearanceListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "DiplomaticClearanceListPage{service=$service, params=$params, items=$items}"
}
