// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.details

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.rfemitter.DetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DetailService.list */
class DetailListPage
private constructor(
    private val service: DetailService,
    private val params: DetailListParams,
    private val items: List<DetailListResponse>,
) : Page<DetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailListPage].
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

    /** A builder for [DetailListPage]. */
    class Builder internal constructor() {

        private var service: DetailService? = null
        private var params: DetailListParams? = null
        private var items: List<DetailListResponse>? = null

        @JvmSynthetic
        internal fun from(detailListPage: DetailListPage) = apply {
            service = detailListPage.service
            params = detailListPage.params
            items = detailListPage.items
        }

        fun service(service: DetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DetailListPage].
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
        fun build(): DetailListPage =
            DetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "DetailListPage{service=$service, params=$params, items=$items}"
}
