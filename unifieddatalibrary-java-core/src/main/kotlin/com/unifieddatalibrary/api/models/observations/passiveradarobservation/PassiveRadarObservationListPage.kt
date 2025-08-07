// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.passiveradarobservation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.observations.PassiveRadarObservationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see PassiveRadarObservationService.list */
class PassiveRadarObservationListPage
private constructor(
    private val service: PassiveRadarObservationService,
    private val params: PassiveRadarObservationListParams,
    private val items: List<PassiveRadarObservationListResponse>,
) : Page<PassiveRadarObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PassiveRadarObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): PassiveRadarObservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PassiveRadarObservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PassiveRadarObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PassiveRadarObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PassiveRadarObservationListPage].
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

    /** A builder for [PassiveRadarObservationListPage]. */
    class Builder internal constructor() {

        private var service: PassiveRadarObservationService? = null
        private var params: PassiveRadarObservationListParams? = null
        private var items: List<PassiveRadarObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(passiveRadarObservationListPage: PassiveRadarObservationListPage) =
            apply {
                service = passiveRadarObservationListPage.service
                params = passiveRadarObservationListPage.params
                items = passiveRadarObservationListPage.items
            }

        fun service(service: PassiveRadarObservationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PassiveRadarObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PassiveRadarObservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PassiveRadarObservationListPage].
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
        fun build(): PassiveRadarObservationListPage =
            PassiveRadarObservationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PassiveRadarObservationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "PassiveRadarObservationListPage{service=$service, params=$params, items=$items}"
}
