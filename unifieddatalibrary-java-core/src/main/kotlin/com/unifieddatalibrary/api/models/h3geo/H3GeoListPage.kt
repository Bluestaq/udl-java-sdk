// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geo

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.H3GeoService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see H3GeoService.list */
class H3GeoListPage
private constructor(
    private val service: H3GeoService,
    private val params: H3GeoListParams,
    private val items: List<H3GeoListResponse>,
) : Page<H3GeoListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): H3GeoListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): H3GeoListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<H3GeoListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): H3GeoListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<H3GeoListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [H3GeoListPage].
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

    /** A builder for [H3GeoListPage]. */
    class Builder internal constructor() {

        private var service: H3GeoService? = null
        private var params: H3GeoListParams? = null
        private var items: List<H3GeoListResponse>? = null

        @JvmSynthetic
        internal fun from(h3GeoListPage: H3GeoListPage) = apply {
            service = h3GeoListPage.service
            params = h3GeoListPage.params
            items = h3GeoListPage.items
        }

        fun service(service: H3GeoService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: H3GeoListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<H3GeoListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [H3GeoListPage].
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
        fun build(): H3GeoListPage =
            H3GeoListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is H3GeoListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "H3GeoListPage{service=$service, params=$params, items=$items}"
}
