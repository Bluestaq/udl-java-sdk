// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.evac

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EvacService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EvacService.list */
class EvacListPage
private constructor(
    private val service: EvacService,
    private val params: EvacListParams,
    private val items: List<EvacAbridged>,
) : Page<EvacAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EvacListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EvacListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EvacAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EvacListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EvacAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvacListPage].
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

    /** A builder for [EvacListPage]. */
    class Builder internal constructor() {

        private var service: EvacService? = null
        private var params: EvacListParams? = null
        private var items: List<EvacAbridged>? = null

        @JvmSynthetic
        internal fun from(evacListPage: EvacListPage) = apply {
            service = evacListPage.service
            params = evacListPage.params
            items = evacListPage.items
        }

        fun service(service: EvacService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EvacListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EvacAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EvacListPage].
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
        fun build(): EvacListPage =
            EvacListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvacListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EvacListPage{service=$service, params=$params, items=$items}"
}
