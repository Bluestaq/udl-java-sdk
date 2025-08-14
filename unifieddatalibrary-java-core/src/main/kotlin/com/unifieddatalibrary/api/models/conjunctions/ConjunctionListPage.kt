// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.conjunctions

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ConjunctionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ConjunctionService.list */
class ConjunctionListPage
private constructor(
    private val service: ConjunctionService,
    private val params: ConjunctionListParams,
    private val items: List<ConjunctionAbridged>,
) : Page<ConjunctionAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ConjunctionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ConjunctionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ConjunctionAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConjunctionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ConjunctionAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConjunctionListPage].
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

    /** A builder for [ConjunctionListPage]. */
    class Builder internal constructor() {

        private var service: ConjunctionService? = null
        private var params: ConjunctionListParams? = null
        private var items: List<ConjunctionAbridged>? = null

        @JvmSynthetic
        internal fun from(conjunctionListPage: ConjunctionListPage) = apply {
            service = conjunctionListPage.service
            params = conjunctionListPage.params
            items = conjunctionListPage.items
        }

        fun service(service: ConjunctionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConjunctionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ConjunctionAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ConjunctionListPage].
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
        fun build(): ConjunctionListPage =
            ConjunctionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConjunctionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "ConjunctionListPage{service=$service, params=$params, items=$items}"
}
