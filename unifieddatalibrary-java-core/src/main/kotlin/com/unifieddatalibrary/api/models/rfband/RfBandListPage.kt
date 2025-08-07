// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.RfBandService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see RfBandService.list */
class RfBandListPage
private constructor(
    private val service: RfBandService,
    private val params: RfBandListParams,
    private val items: List<RfBandListResponse>,
) : Page<RfBandListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfBandListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): RfBandListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RfBandListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RfBandListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfBandListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfBandListPage].
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

    /** A builder for [RfBandListPage]. */
    class Builder internal constructor() {

        private var service: RfBandService? = null
        private var params: RfBandListParams? = null
        private var items: List<RfBandListResponse>? = null

        @JvmSynthetic
        internal fun from(rfBandListPage: RfBandListPage) = apply {
            service = rfBandListPage.service
            params = rfBandListPage.params
            items = rfBandListPage.items
        }

        fun service(service: RfBandService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RfBandListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfBandListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfBandListPage].
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
        fun build(): RfBandListPage =
            RfBandListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RfBandListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "RfBandListPage{service=$service, params=$params, items=$items}"
}
