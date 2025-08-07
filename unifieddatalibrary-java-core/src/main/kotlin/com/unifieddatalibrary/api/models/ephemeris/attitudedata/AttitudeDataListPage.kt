// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris.attitudedata

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ephemeris.AttitudeDataService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AttitudeDataService.list */
class AttitudeDataListPage
private constructor(
    private val service: AttitudeDataService,
    private val params: AttitudeDataListParams,
    private val items: List<AttitudeDataAbridged>,
) : Page<AttitudeDataAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AttitudeDataListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AttitudeDataListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AttitudeDataAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AttitudeDataListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AttitudeDataAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttitudeDataListPage].
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

    /** A builder for [AttitudeDataListPage]. */
    class Builder internal constructor() {

        private var service: AttitudeDataService? = null
        private var params: AttitudeDataListParams? = null
        private var items: List<AttitudeDataAbridged>? = null

        @JvmSynthetic
        internal fun from(attitudeDataListPage: AttitudeDataListPage) = apply {
            service = attitudeDataListPage.service
            params = attitudeDataListPage.params
            items = attitudeDataListPage.items
        }

        fun service(service: AttitudeDataService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AttitudeDataListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AttitudeDataAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AttitudeDataListPage].
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
        fun build(): AttitudeDataListPage =
            AttitudeDataListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AttitudeDataListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AttitudeDataListPage{service=$service, params=$params, items=$items}"
}
