// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eop

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EopService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EopService.list */
class EopListPage
private constructor(
    private val service: EopService,
    private val params: EopListParams,
    private val items: List<EopAbridged>,
) : Page<EopAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EopListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EopListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EopAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EopListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EopAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EopListPage].
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

    /** A builder for [EopListPage]. */
    class Builder internal constructor() {

        private var service: EopService? = null
        private var params: EopListParams? = null
        private var items: List<EopAbridged>? = null

        @JvmSynthetic
        internal fun from(eopListPage: EopListPage) = apply {
            service = eopListPage.service
            params = eopListPage.params
            items = eopListPage.items
        }

        fun service(service: EopService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EopListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EopAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EopListPage].
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
        fun build(): EopListPage =
            EopListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EopListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "EopListPage{service=$service, params=$params, items=$items}"
}
