// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.vessel

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.VesselService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see VesselService.list */
class VesselListPage
private constructor(
    private val service: VesselService,
    private val params: VesselListParams,
    private val items: List<VesselListResponse>,
) : Page<VesselListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): VesselListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): VesselListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VesselListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VesselListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VesselListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VesselListPage].
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

    /** A builder for [VesselListPage]. */
    class Builder internal constructor() {

        private var service: VesselService? = null
        private var params: VesselListParams? = null
        private var items: List<VesselListResponse>? = null

        @JvmSynthetic
        internal fun from(vesselListPage: VesselListPage) = apply {
            service = vesselListPage.service
            params = vesselListPage.params
            items = vesselListPage.items
        }

        fun service(service: VesselService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VesselListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<VesselListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VesselListPage].
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
        fun build(): VesselListPage =
            VesselListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VesselListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "VesselListPage{service=$service, params=$params, items=$items}"
}
