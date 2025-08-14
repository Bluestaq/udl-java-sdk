// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorplan

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SensorPlanService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SensorPlanService.list */
class SensorPlanListPage
private constructor(
    private val service: SensorPlanService,
    private val params: SensorPlanListParams,
    private val items: List<SensorPlanListResponse>,
) : Page<SensorPlanListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorPlanListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SensorPlanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SensorPlanListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorPlanListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorPlanListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorPlanListPage].
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

    /** A builder for [SensorPlanListPage]. */
    class Builder internal constructor() {

        private var service: SensorPlanService? = null
        private var params: SensorPlanListParams? = null
        private var items: List<SensorPlanListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorPlanListPage: SensorPlanListPage) = apply {
            service = sensorPlanListPage.service
            params = sensorPlanListPage.params
            items = sensorPlanListPage.items
        }

        fun service(service: SensorPlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SensorPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorPlanListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorPlanListPage].
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
        fun build(): SensorPlanListPage =
            SensorPlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorPlanListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SensorPlanListPage{service=$service, params=$params, items=$items}"
}
