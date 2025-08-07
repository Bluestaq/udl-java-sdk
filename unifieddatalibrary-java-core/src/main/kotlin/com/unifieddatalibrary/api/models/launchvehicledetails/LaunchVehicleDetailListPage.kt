// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicledetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleDetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchVehicleDetailService.list */
class LaunchVehicleDetailListPage
private constructor(
    private val service: LaunchVehicleDetailService,
    private val params: LaunchVehicleDetailListParams,
    private val items: List<LaunchVehicleDetailListResponse>,
) : Page<LaunchVehicleDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchVehicleDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaunchVehicleDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaunchVehicleDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaunchVehicleDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchVehicleDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchVehicleDetailListPage].
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

    /** A builder for [LaunchVehicleDetailListPage]. */
    class Builder internal constructor() {

        private var service: LaunchVehicleDetailService? = null
        private var params: LaunchVehicleDetailListParams? = null
        private var items: List<LaunchVehicleDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(launchVehicleDetailListPage: LaunchVehicleDetailListPage) = apply {
            service = launchVehicleDetailListPage.service
            params = launchVehicleDetailListPage.params
            items = launchVehicleDetailListPage.items
        }

        fun service(service: LaunchVehicleDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchVehicleDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchVehicleDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchVehicleDetailListPage].
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
        fun build(): LaunchVehicleDetailListPage =
            LaunchVehicleDetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LaunchVehicleDetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "LaunchVehicleDetailListPage{service=$service, params=$params, items=$items}"
}
