// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SensorService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SensorService.list */
class SensorListPage
private constructor(
    private val service: SensorService,
    private val params: SensorListParams,
    private val items: List<SensorListResponse>,
) : Page<SensorListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SensorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SensorListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorListPage].
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

    /** A builder for [SensorListPage]. */
    class Builder internal constructor() {

        private var service: SensorService? = null
        private var params: SensorListParams? = null
        private var items: List<SensorListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorListPage: SensorListPage) = apply {
            service = sensorListPage.service
            params = sensorListPage.params
            items = sensorListPage.items
        }

        fun service(service: SensorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SensorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorListPage].
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
        fun build(): SensorListPage =
            SensorListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SensorListPage{service=$service, params=$params, items=$items}"
}
