// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunit

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OperatingunitService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OperatingunitService.list */
class OperatingunitListPage
private constructor(
    private val service: OperatingunitService,
    private val params: OperatingunitListParams,
    private val items: List<OperatingunitListResponse>,
) : Page<OperatingunitListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OperatingunitListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OperatingunitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OperatingunitListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OperatingunitListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OperatingunitListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OperatingunitListPage].
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

    /** A builder for [OperatingunitListPage]. */
    class Builder internal constructor() {

        private var service: OperatingunitService? = null
        private var params: OperatingunitListParams? = null
        private var items: List<OperatingunitListResponse>? = null

        @JvmSynthetic
        internal fun from(operatingunitListPage: OperatingunitListPage) = apply {
            service = operatingunitListPage.service
            params = operatingunitListPage.params
            items = operatingunitListPage.items
        }

        fun service(service: OperatingunitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OperatingunitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OperatingunitListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OperatingunitListPage].
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
        fun build(): OperatingunitListPage =
            OperatingunitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OperatingunitListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OperatingunitListPage{service=$service, params=$params, items=$items}"
}
