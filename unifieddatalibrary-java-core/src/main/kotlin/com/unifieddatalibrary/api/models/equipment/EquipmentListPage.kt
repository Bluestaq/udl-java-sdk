// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipment

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EquipmentService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EquipmentService.list */
class EquipmentListPage
private constructor(
    private val service: EquipmentService,
    private val params: EquipmentListParams,
    private val items: List<EquipmentAbridged>,
) : Page<EquipmentAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EquipmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EquipmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EquipmentAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EquipmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EquipmentAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EquipmentListPage].
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

    /** A builder for [EquipmentListPage]. */
    class Builder internal constructor() {

        private var service: EquipmentService? = null
        private var params: EquipmentListParams? = null
        private var items: List<EquipmentAbridged>? = null

        @JvmSynthetic
        internal fun from(equipmentListPage: EquipmentListPage) = apply {
            service = equipmentListPage.service
            params = equipmentListPage.params
            items = equipmentListPage.items
        }

        fun service(service: EquipmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EquipmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EquipmentAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EquipmentListPage].
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
        fun build(): EquipmentListPage =
            EquipmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EquipmentListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EquipmentListPage{service=$service, params=$params, items=$items}"
}
