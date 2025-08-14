// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigationalobstruction

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.NavigationalObstructionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see NavigationalObstructionService.list */
class NavigationalObstructionListPage
private constructor(
    private val service: NavigationalObstructionService,
    private val params: NavigationalObstructionListParams,
    private val items: List<NavigationalObstructionListResponse>,
) : Page<NavigationalObstructionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): NavigationalObstructionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): NavigationalObstructionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NavigationalObstructionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NavigationalObstructionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<NavigationalObstructionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NavigationalObstructionListPage].
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

    /** A builder for [NavigationalObstructionListPage]. */
    class Builder internal constructor() {

        private var service: NavigationalObstructionService? = null
        private var params: NavigationalObstructionListParams? = null
        private var items: List<NavigationalObstructionListResponse>? = null

        @JvmSynthetic
        internal fun from(navigationalObstructionListPage: NavigationalObstructionListPage) =
            apply {
                service = navigationalObstructionListPage.service
                params = navigationalObstructionListPage.params
                items = navigationalObstructionListPage.items
            }

        fun service(service: NavigationalObstructionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NavigationalObstructionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<NavigationalObstructionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [NavigationalObstructionListPage].
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
        fun build(): NavigationalObstructionListPage =
            NavigationalObstructionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NavigationalObstructionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "NavigationalObstructionListPage{service=$service, params=$params, items=$items}"
}
