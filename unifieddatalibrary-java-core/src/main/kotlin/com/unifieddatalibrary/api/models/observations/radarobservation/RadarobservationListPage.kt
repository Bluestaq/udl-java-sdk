// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.radarobservation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.observations.RadarobservationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see RadarobservationService.list */
class RadarobservationListPage
private constructor(
    private val service: RadarobservationService,
    private val params: RadarobservationListParams,
    private val items: List<RadarobservationListResponse>,
) : Page<RadarobservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RadarobservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): RadarobservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RadarobservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RadarobservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RadarobservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RadarobservationListPage].
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

    /** A builder for [RadarobservationListPage]. */
    class Builder internal constructor() {

        private var service: RadarobservationService? = null
        private var params: RadarobservationListParams? = null
        private var items: List<RadarobservationListResponse>? = null

        @JvmSynthetic
        internal fun from(radarobservationListPage: RadarobservationListPage) = apply {
            service = radarobservationListPage.service
            params = radarobservationListPage.params
            items = radarobservationListPage.items
        }

        fun service(service: RadarobservationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RadarobservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RadarobservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RadarobservationListPage].
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
        fun build(): RadarobservationListPage =
            RadarobservationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RadarobservationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "RadarobservationListPage{service=$service, params=$params, items=$items}"
}
