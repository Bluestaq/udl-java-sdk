// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslotconsumptions

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldSlotConsumptionService.list */
class AirfieldSlotConsumptionListPage
private constructor(
    private val service: AirfieldSlotConsumptionService,
    private val params: AirfieldSlotConsumptionListParams,
    private val items: List<AirfieldslotconsumptionAbridged>,
) : Page<AirfieldslotconsumptionAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldSlotConsumptionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirfieldSlotConsumptionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirfieldslotconsumptionAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldSlotConsumptionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldslotconsumptionAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AirfieldSlotConsumptionListPage].
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

    /** A builder for [AirfieldSlotConsumptionListPage]. */
    class Builder internal constructor() {

        private var service: AirfieldSlotConsumptionService? = null
        private var params: AirfieldSlotConsumptionListParams? = null
        private var items: List<AirfieldslotconsumptionAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldSlotConsumptionListPage: AirfieldSlotConsumptionListPage) =
            apply {
                service = airfieldSlotConsumptionListPage.service
                params = airfieldSlotConsumptionListPage.params
                items = airfieldSlotConsumptionListPage.items
            }

        fun service(service: AirfieldSlotConsumptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldSlotConsumptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldslotconsumptionAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirfieldSlotConsumptionListPage].
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
        fun build(): AirfieldSlotConsumptionListPage =
            AirfieldSlotConsumptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirfieldSlotConsumptionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AirfieldSlotConsumptionListPage{service=$service, params=$params, items=$items}"
}
