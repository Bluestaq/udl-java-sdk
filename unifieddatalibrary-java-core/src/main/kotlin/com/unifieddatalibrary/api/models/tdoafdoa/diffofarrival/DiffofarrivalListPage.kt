// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.tdoafdoa.DiffofarrivalService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DiffofarrivalService.list */
class DiffofarrivalListPage
private constructor(
    private val service: DiffofarrivalService,
    private val params: DiffofarrivalListParams,
    private val items: List<DiffofarrivalAbridged>,
) : Page<DiffofarrivalAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DiffofarrivalListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DiffofarrivalListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DiffofarrivalAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DiffofarrivalListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DiffofarrivalAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiffofarrivalListPage].
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

    /** A builder for [DiffofarrivalListPage]. */
    class Builder internal constructor() {

        private var service: DiffofarrivalService? = null
        private var params: DiffofarrivalListParams? = null
        private var items: List<DiffofarrivalAbridged>? = null

        @JvmSynthetic
        internal fun from(diffofarrivalListPage: DiffofarrivalListPage) = apply {
            service = diffofarrivalListPage.service
            params = diffofarrivalListPage.params
            items = diffofarrivalListPage.items
        }

        fun service(service: DiffofarrivalService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DiffofarrivalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DiffofarrivalAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DiffofarrivalListPage].
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
        fun build(): DiffofarrivalListPage =
            DiffofarrivalListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DiffofarrivalListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DiffofarrivalListPage{service=$service, params=$params, items=$items}"
}
