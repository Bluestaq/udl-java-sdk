// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airevents

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirEventService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirEventService.list */
class AirEventListPage
private constructor(
    private val service: AirEventService,
    private val params: AirEventListParams,
    private val items: List<AirEventListResponse>,
) : Page<AirEventListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirEventListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirEventListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirEventListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirEventListPage].
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

    /** A builder for [AirEventListPage]. */
    class Builder internal constructor() {

        private var service: AirEventService? = null
        private var params: AirEventListParams? = null
        private var items: List<AirEventListResponse>? = null

        @JvmSynthetic
        internal fun from(airEventListPage: AirEventListPage) = apply {
            service = airEventListPage.service
            params = airEventListPage.params
            items = airEventListPage.items
        }

        fun service(service: AirEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirEventListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirEventListPage].
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
        fun build(): AirEventListPage =
            AirEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AirEventListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AirEventListPage{service=$service, params=$params, items=$items}"
}
