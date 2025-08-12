// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.GnssRawIfService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see GnssRawIfService.list */
class GnssRawIfListPage
private constructor(
    private val service: GnssRawIfService,
    private val params: GnssRawIfListParams,
    private val items: List<GnssRawIfListResponse>,
) : Page<GnssRawIfListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GnssRawIfListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): GnssRawIfListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GnssRawIfListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GnssRawIfListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GnssRawIfListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GnssRawIfListPage].
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

    /** A builder for [GnssRawIfListPage]. */
    class Builder internal constructor() {

        private var service: GnssRawIfService? = null
        private var params: GnssRawIfListParams? = null
        private var items: List<GnssRawIfListResponse>? = null

        @JvmSynthetic
        internal fun from(gnssRawIfListPage: GnssRawIfListPage) = apply {
            service = gnssRawIfListPage.service
            params = gnssRawIfListPage.params
            items = gnssRawIfListPage.items
        }

        fun service(service: GnssRawIfService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GnssRawIfListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GnssRawIfListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GnssRawIfListPage].
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
        fun build(): GnssRawIfListPage =
            GnssRawIfListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GnssRawIfListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "GnssRawIfListPage{service=$service, params=$params, items=$items}"
}
