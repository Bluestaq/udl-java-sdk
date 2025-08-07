// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.GeoStatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see GeoStatusService.list */
class GeoStatusListPage
private constructor(
    private val service: GeoStatusService,
    private val params: GeoStatusListParams,
    private val items: List<GeoStatusListResponse>,
) : Page<GeoStatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GeoStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): GeoStatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GeoStatusListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GeoStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GeoStatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GeoStatusListPage].
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

    /** A builder for [GeoStatusListPage]. */
    class Builder internal constructor() {

        private var service: GeoStatusService? = null
        private var params: GeoStatusListParams? = null
        private var items: List<GeoStatusListResponse>? = null

        @JvmSynthetic
        internal fun from(geoStatusListPage: GeoStatusListPage) = apply {
            service = geoStatusListPage.service
            params = geoStatusListPage.params
            items = geoStatusListPage.items
        }

        fun service(service: GeoStatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GeoStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GeoStatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GeoStatusListPage].
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
        fun build(): GeoStatusListPage =
            GeoStatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeoStatusListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "GeoStatusListPage{service=$service, params=$params, items=$items}"
}
