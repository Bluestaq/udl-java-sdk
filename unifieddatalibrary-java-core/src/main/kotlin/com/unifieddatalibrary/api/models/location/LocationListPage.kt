// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.location

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.LocationAbridged
import com.unifieddatalibrary.api.services.blocking.LocationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LocationService.list */
class LocationListPage
private constructor(
    private val service: LocationService,
    private val params: LocationListParams,
    private val items: List<LocationAbridged>,
) : Page<LocationAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LocationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LocationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LocationAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LocationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LocationAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LocationListPage].
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

    /** A builder for [LocationListPage]. */
    class Builder internal constructor() {

        private var service: LocationService? = null
        private var params: LocationListParams? = null
        private var items: List<LocationAbridged>? = null

        @JvmSynthetic
        internal fun from(locationListPage: LocationListPage) = apply {
            service = locationListPage.service
            params = locationListPage.params
            items = locationListPage.items
        }

        fun service(service: LocationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LocationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LocationAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LocationListPage].
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
        fun build(): LocationListPage =
            LocationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "LocationListPage{service=$service, params=$params, items=$items}"
}
