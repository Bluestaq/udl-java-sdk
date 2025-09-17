// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AviationRiskManagementService.list */
class AviationRiskManagementListPage
private constructor(
    private val service: AviationRiskManagementService,
    private val params: AviationRiskManagementListParams,
    private val items: List<AviationRiskManagementListResponse>,
) : Page<AviationRiskManagementListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AviationRiskManagementListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AviationRiskManagementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AviationRiskManagementListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AviationRiskManagementListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AviationRiskManagementListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AviationRiskManagementListPage].
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

    /** A builder for [AviationRiskManagementListPage]. */
    class Builder internal constructor() {

        private var service: AviationRiskManagementService? = null
        private var params: AviationRiskManagementListParams? = null
        private var items: List<AviationRiskManagementListResponse>? = null

        @JvmSynthetic
        internal fun from(aviationRiskManagementListPage: AviationRiskManagementListPage) = apply {
            service = aviationRiskManagementListPage.service
            params = aviationRiskManagementListPage.params
            items = aviationRiskManagementListPage.items
        }

        fun service(service: AviationRiskManagementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AviationRiskManagementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AviationRiskManagementListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AviationRiskManagementListPage].
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
        fun build(): AviationRiskManagementListPage =
            AviationRiskManagementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AviationRiskManagementListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AviationRiskManagementListPage{service=$service, params=$params, items=$items}"
}
