// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SeraDataNavigationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SeraDataNavigationService.list */
class SeraDataNavigationListPage
private constructor(
    private val service: SeraDataNavigationService,
    private val params: SeraDataNavigationListParams,
    private val items: List<SeraDataNavigationListResponse>,
) : Page<SeraDataNavigationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeraDataNavigationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SeraDataNavigationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeraDataNavigationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeraDataNavigationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeraDataNavigationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeraDataNavigationListPage].
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

    /** A builder for [SeraDataNavigationListPage]. */
    class Builder internal constructor() {

        private var service: SeraDataNavigationService? = null
        private var params: SeraDataNavigationListParams? = null
        private var items: List<SeraDataNavigationListResponse>? = null

        @JvmSynthetic
        internal fun from(seraDataNavigationListPage: SeraDataNavigationListPage) = apply {
            service = seraDataNavigationListPage.service
            params = seraDataNavigationListPage.params
            items = seraDataNavigationListPage.items
        }

        fun service(service: SeraDataNavigationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SeraDataNavigationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeraDataNavigationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeraDataNavigationListPage].
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
        fun build(): SeraDataNavigationListPage =
            SeraDataNavigationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SeraDataNavigationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "SeraDataNavigationListPage{service=$service, params=$params, items=$items}"
}
