// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AntennaService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AntennaService.list */
class AntennaListPage
private constructor(
    private val service: AntennaService,
    private val params: AntennaListParams,
    private val items: List<AntennaAbridged>,
) : Page<AntennaAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AntennaListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AntennaListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AntennaAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AntennaListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AntennaAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AntennaListPage].
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

    /** A builder for [AntennaListPage]. */
    class Builder internal constructor() {

        private var service: AntennaService? = null
        private var params: AntennaListParams? = null
        private var items: List<AntennaAbridged>? = null

        @JvmSynthetic
        internal fun from(antennaListPage: AntennaListPage) = apply {
            service = antennaListPage.service
            params = antennaListPage.params
            items = antennaListPage.items
        }

        fun service(service: AntennaService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AntennaListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AntennaAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AntennaListPage].
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
        fun build(): AntennaListPage =
            AntennaListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AntennaListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AntennaListPage{service=$service, params=$params, items=$items}"
}
