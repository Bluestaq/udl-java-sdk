// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EquipmentRemarkService.list */
class EquipmentRemarkListPage
private constructor(
    private val service: EquipmentRemarkService,
    private val params: EquipmentRemarkListParams,
    private val items: List<EquipmentRemarkAbridged>,
) : Page<EquipmentRemarkAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EquipmentRemarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EquipmentRemarkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EquipmentRemarkAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EquipmentRemarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EquipmentRemarkAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EquipmentRemarkListPage].
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

    /** A builder for [EquipmentRemarkListPage]. */
    class Builder internal constructor() {

        private var service: EquipmentRemarkService? = null
        private var params: EquipmentRemarkListParams? = null
        private var items: List<EquipmentRemarkAbridged>? = null

        @JvmSynthetic
        internal fun from(equipmentRemarkListPage: EquipmentRemarkListPage) = apply {
            service = equipmentRemarkListPage.service
            params = equipmentRemarkListPage.params
            items = equipmentRemarkListPage.items
        }

        fun service(service: EquipmentRemarkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EquipmentRemarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EquipmentRemarkAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EquipmentRemarkListPage].
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
        fun build(): EquipmentRemarkListPage =
            EquipmentRemarkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EquipmentRemarkListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "EquipmentRemarkListPage{service=$service, params=$params, items=$items}"
}
