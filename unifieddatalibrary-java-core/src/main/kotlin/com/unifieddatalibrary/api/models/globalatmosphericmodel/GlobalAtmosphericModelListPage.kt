// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.GlobalAtmosphericModelService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see GlobalAtmosphericModelService.list */
class GlobalAtmosphericModelListPage
private constructor(
    private val service: GlobalAtmosphericModelService,
    private val params: GlobalAtmosphericModelListParams,
    private val items: List<GlobalAtmosphericModelListResponse>,
) : Page<GlobalAtmosphericModelListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GlobalAtmosphericModelListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): GlobalAtmosphericModelListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GlobalAtmosphericModelListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GlobalAtmosphericModelListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GlobalAtmosphericModelListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [GlobalAtmosphericModelListPage].
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

    /** A builder for [GlobalAtmosphericModelListPage]. */
    class Builder internal constructor() {

        private var service: GlobalAtmosphericModelService? = null
        private var params: GlobalAtmosphericModelListParams? = null
        private var items: List<GlobalAtmosphericModelListResponse>? = null

        @JvmSynthetic
        internal fun from(globalAtmosphericModelListPage: GlobalAtmosphericModelListPage) = apply {
            service = globalAtmosphericModelListPage.service
            params = globalAtmosphericModelListPage.params
            items = globalAtmosphericModelListPage.items
        }

        fun service(service: GlobalAtmosphericModelService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalAtmosphericModelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GlobalAtmosphericModelListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GlobalAtmosphericModelListPage].
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
        fun build(): GlobalAtmosphericModelListPage =
            GlobalAtmosphericModelListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalAtmosphericModelListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "GlobalAtmosphericModelListPage{service=$service, params=$params, items=$items}"
}
