// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbitdetermination

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OrbitdeterminationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OrbitdeterminationService.list */
class OrbitdeterminationListPage
private constructor(
    private val service: OrbitdeterminationService,
    private val params: OrbitdeterminationListParams,
    private val items: List<OrbitdeterminationListResponse>,
) : Page<OrbitdeterminationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrbitdeterminationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OrbitdeterminationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OrbitdeterminationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OrbitdeterminationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrbitdeterminationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrbitdeterminationListPage].
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

    /** A builder for [OrbitdeterminationListPage]. */
    class Builder internal constructor() {

        private var service: OrbitdeterminationService? = null
        private var params: OrbitdeterminationListParams? = null
        private var items: List<OrbitdeterminationListResponse>? = null

        @JvmSynthetic
        internal fun from(orbitdeterminationListPage: OrbitdeterminationListPage) = apply {
            service = orbitdeterminationListPage.service
            params = orbitdeterminationListPage.params
            items = orbitdeterminationListPage.items
        }

        fun service(service: OrbitdeterminationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OrbitdeterminationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OrbitdeterminationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OrbitdeterminationListPage].
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
        fun build(): OrbitdeterminationListPage =
            OrbitdeterminationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrbitdeterminationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OrbitdeterminationListPage{service=$service, params=$params, items=$items}"
}
