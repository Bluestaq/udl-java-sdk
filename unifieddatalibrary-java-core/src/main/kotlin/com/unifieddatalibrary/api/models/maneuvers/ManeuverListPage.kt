// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.maneuvers

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ManeuverService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ManeuverService.list */
class ManeuverListPage
private constructor(
    private val service: ManeuverService,
    private val params: ManeuverListParams,
    private val items: List<ManeuverListResponse>,
) : Page<ManeuverListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManeuverListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ManeuverListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ManeuverListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ManeuverListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ManeuverListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManeuverListPage].
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

    /** A builder for [ManeuverListPage]. */
    class Builder internal constructor() {

        private var service: ManeuverService? = null
        private var params: ManeuverListParams? = null
        private var items: List<ManeuverListResponse>? = null

        @JvmSynthetic
        internal fun from(maneuverListPage: ManeuverListPage) = apply {
            service = maneuverListPage.service
            params = maneuverListPage.params
            items = maneuverListPage.items
        }

        fun service(service: ManeuverService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManeuverListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ManeuverListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ManeuverListPage].
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
        fun build(): ManeuverListPage =
            ManeuverListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManeuverListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "ManeuverListPage{service=$service, params=$params, items=$items}"
}
