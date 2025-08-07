// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.GnssRawifService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see GnssRawifService.list */
class GnssRawifListPage
private constructor(
    private val service: GnssRawifService,
    private val params: GnssRawifListParams,
    private val items: List<GnssRawifListResponse>,
) : Page<GnssRawifListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GnssRawifListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): GnssRawifListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GnssRawifListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GnssRawifListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GnssRawifListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GnssRawifListPage].
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

    /** A builder for [GnssRawifListPage]. */
    class Builder internal constructor() {

        private var service: GnssRawifService? = null
        private var params: GnssRawifListParams? = null
        private var items: List<GnssRawifListResponse>? = null

        @JvmSynthetic
        internal fun from(gnssRawifListPage: GnssRawifListPage) = apply {
            service = gnssRawifListPage.service
            params = gnssRawifListPage.params
            items = gnssRawifListPage.items
        }

        fun service(service: GnssRawifService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GnssRawifListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GnssRawifListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GnssRawifListPage].
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
        fun build(): GnssRawifListPage =
            GnssRawifListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GnssRawifListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "GnssRawifListPage{service=$service, params=$params, items=$items}"
}
