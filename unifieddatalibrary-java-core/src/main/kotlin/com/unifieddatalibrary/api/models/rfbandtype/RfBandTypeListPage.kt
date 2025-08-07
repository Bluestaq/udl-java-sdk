// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.RfBandTypeService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see RfBandTypeService.list */
class RfBandTypeListPage
private constructor(
    private val service: RfBandTypeService,
    private val params: RfBandTypeListParams,
    private val items: List<RfBandTypeListResponse>,
) : Page<RfBandTypeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfBandTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): RfBandTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RfBandTypeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RfBandTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfBandTypeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfBandTypeListPage].
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

    /** A builder for [RfBandTypeListPage]. */
    class Builder internal constructor() {

        private var service: RfBandTypeService? = null
        private var params: RfBandTypeListParams? = null
        private var items: List<RfBandTypeListResponse>? = null

        @JvmSynthetic
        internal fun from(rfBandTypeListPage: RfBandTypeListPage) = apply {
            service = rfBandTypeListPage.service
            params = rfBandTypeListPage.params
            items = rfBandTypeListPage.items
        }

        fun service(service: RfBandTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RfBandTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfBandTypeListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfBandTypeListPage].
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
        fun build(): RfBandTypeListPage =
            RfBandTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RfBandTypeListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "RfBandTypeListPage{service=$service, params=$params, items=$items}"
}
