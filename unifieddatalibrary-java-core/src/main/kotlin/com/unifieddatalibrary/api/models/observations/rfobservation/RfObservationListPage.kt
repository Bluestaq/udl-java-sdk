// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.rfobservation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see RfObservationService.list */
class RfObservationListPage
private constructor(
    private val service: RfObservationService,
    private val params: RfObservationListParams,
    private val items: List<RfObservationListResponse>,
) : Page<RfObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfObservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): RfObservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RfObservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RfObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfObservationListPage].
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

    /** A builder for [RfObservationListPage]. */
    class Builder internal constructor() {

        private var service: RfObservationService? = null
        private var params: RfObservationListParams? = null
        private var items: List<RfObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(rfObservationListPage: RfObservationListPage) = apply {
            service = rfObservationListPage.service
            params = rfObservationListPage.params
            items = rfObservationListPage.items
        }

        fun service(service: RfObservationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RfObservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfObservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfObservationListPage].
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
        fun build(): RfObservationListPage =
            RfObservationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RfObservationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "RfObservationListPage{service=$service, params=$params, items=$items}"
}
