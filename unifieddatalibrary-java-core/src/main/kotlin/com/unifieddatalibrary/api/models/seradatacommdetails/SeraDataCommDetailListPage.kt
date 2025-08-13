// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatacommdetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SeraDataCommDetailService.list */
class SeraDataCommDetailListPage
private constructor(
    private val service: SeraDataCommDetailService,
    private val params: SeraDataCommDetailListParams,
    private val items: List<SeraDataCommDetailListResponse>,
) : Page<SeraDataCommDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeraDataCommDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SeraDataCommDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeraDataCommDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeraDataCommDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeraDataCommDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeraDataCommDetailListPage].
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

    /** A builder for [SeraDataCommDetailListPage]. */
    class Builder internal constructor() {

        private var service: SeraDataCommDetailService? = null
        private var params: SeraDataCommDetailListParams? = null
        private var items: List<SeraDataCommDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(seraDataCommDetailListPage: SeraDataCommDetailListPage) = apply {
            service = seraDataCommDetailListPage.service
            params = seraDataCommDetailListPage.params
            items = seraDataCommDetailListPage.items
        }

        fun service(service: SeraDataCommDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SeraDataCommDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeraDataCommDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeraDataCommDetailListPage].
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
        fun build(): SeraDataCommDetailListPage =
            SeraDataCommDetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SeraDataCommDetailListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "SeraDataCommDetailListPage{service=$service, params=$params, items=$items}"
}
