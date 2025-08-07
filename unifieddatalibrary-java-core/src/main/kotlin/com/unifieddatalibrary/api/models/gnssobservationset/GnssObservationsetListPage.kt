// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssobservationset

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see GnssObservationsetService.list */
class GnssObservationsetListPage
private constructor(
    private val service: GnssObservationsetService,
    private val params: GnssObservationsetListParams,
    private val items: List<GnssObservationsetListResponse>,
) : Page<GnssObservationsetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GnssObservationsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): GnssObservationsetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GnssObservationsetListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GnssObservationsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GnssObservationsetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GnssObservationsetListPage].
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

    /** A builder for [GnssObservationsetListPage]. */
    class Builder internal constructor() {

        private var service: GnssObservationsetService? = null
        private var params: GnssObservationsetListParams? = null
        private var items: List<GnssObservationsetListResponse>? = null

        @JvmSynthetic
        internal fun from(gnssObservationsetListPage: GnssObservationsetListPage) = apply {
            service = gnssObservationsetListPage.service
            params = gnssObservationsetListPage.params
            items = gnssObservationsetListPage.items
        }

        fun service(service: GnssObservationsetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GnssObservationsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GnssObservationsetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GnssObservationsetListPage].
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
        fun build(): GnssObservationsetListPage =
            GnssObservationsetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GnssObservationsetListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "GnssObservationsetListPage{service=$service, params=$params, items=$items}"
}
