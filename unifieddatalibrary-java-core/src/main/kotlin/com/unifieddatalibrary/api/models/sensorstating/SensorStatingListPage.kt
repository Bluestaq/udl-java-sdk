// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SensorStatingService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SensorStatingService.list */
class SensorStatingListPage
private constructor(
    private val service: SensorStatingService,
    private val params: SensorStatingListParams,
    private val items: List<SensorStatingListResponse>,
) : Page<SensorStatingListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SensorStatingListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SensorStatingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SensorStatingListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SensorStatingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SensorStatingListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SensorStatingListPage].
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

    /** A builder for [SensorStatingListPage]. */
    class Builder internal constructor() {

        private var service: SensorStatingService? = null
        private var params: SensorStatingListParams? = null
        private var items: List<SensorStatingListResponse>? = null

        @JvmSynthetic
        internal fun from(sensorStatingListPage: SensorStatingListPage) = apply {
            service = sensorStatingListPage.service
            params = sensorStatingListPage.params
            items = sensorStatingListPage.items
        }

        fun service(service: SensorStatingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SensorStatingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SensorStatingListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SensorStatingListPage].
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
        fun build(): SensorStatingListPage =
            SensorStatingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorStatingListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "SensorStatingListPage{service=$service, params=$params, items=$items}"
}
