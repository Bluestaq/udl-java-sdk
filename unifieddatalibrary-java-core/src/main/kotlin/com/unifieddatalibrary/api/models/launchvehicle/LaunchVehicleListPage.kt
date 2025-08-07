// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicle

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchVehicleService.list */
class LaunchVehicleListPage
private constructor(
    private val service: LaunchVehicleService,
    private val params: LaunchVehicleListParams,
    private val items: List<LaunchVehicleListResponse>,
) : Page<LaunchVehicleListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchVehicleListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaunchVehicleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaunchVehicleListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaunchVehicleListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchVehicleListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchVehicleListPage].
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

    /** A builder for [LaunchVehicleListPage]. */
    class Builder internal constructor() {

        private var service: LaunchVehicleService? = null
        private var params: LaunchVehicleListParams? = null
        private var items: List<LaunchVehicleListResponse>? = null

        @JvmSynthetic
        internal fun from(launchVehicleListPage: LaunchVehicleListPage) = apply {
            service = launchVehicleListPage.service
            params = launchVehicleListPage.params
            items = launchVehicleListPage.items
        }

        fun service(service: LaunchVehicleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchVehicleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchVehicleListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchVehicleListPage].
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
        fun build(): LaunchVehicleListPage =
            LaunchVehicleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LaunchVehicleListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "LaunchVehicleListPage{service=$service, params=$params, items=$items}"
}
