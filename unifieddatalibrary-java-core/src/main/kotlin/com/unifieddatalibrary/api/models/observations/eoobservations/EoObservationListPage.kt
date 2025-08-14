// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.eoobservations

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EoObservationService.list */
class EoObservationListPage
private constructor(
    private val service: EoObservationService,
    private val params: EoObservationListParams,
    private val items: List<EoObservationAbridged>,
) : Page<EoObservationAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EoObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EoObservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EoObservationAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EoObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EoObservationAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EoObservationListPage].
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

    /** A builder for [EoObservationListPage]. */
    class Builder internal constructor() {

        private var service: EoObservationService? = null
        private var params: EoObservationListParams? = null
        private var items: List<EoObservationAbridged>? = null

        @JvmSynthetic
        internal fun from(eoObservationListPage: EoObservationListPage) = apply {
            service = eoObservationListPage.service
            params = eoObservationListPage.params
            items = eoObservationListPage.items
        }

        fun service(service: EoObservationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EoObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EoObservationAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EoObservationListPage].
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
        fun build(): EoObservationListPage =
            EoObservationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EoObservationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "EoObservationListPage{service=$service, params=$params, items=$items}"
}
