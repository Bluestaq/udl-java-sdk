// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ManifoldService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ManifoldService.list */
class ManifoldListPage
private constructor(
    private val service: ManifoldService,
    private val params: ManifoldListParams,
    private val items: List<ManifoldListResponse>,
) : Page<ManifoldListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManifoldListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ManifoldListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ManifoldListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ManifoldListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ManifoldListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManifoldListPage].
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

    /** A builder for [ManifoldListPage]. */
    class Builder internal constructor() {

        private var service: ManifoldService? = null
        private var params: ManifoldListParams? = null
        private var items: List<ManifoldListResponse>? = null

        @JvmSynthetic
        internal fun from(manifoldListPage: ManifoldListPage) = apply {
            service = manifoldListPage.service
            params = manifoldListPage.params
            items = manifoldListPage.items
        }

        fun service(service: ManifoldService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManifoldListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ManifoldListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ManifoldListPage].
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
        fun build(): ManifoldListPage =
            ManifoldListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManifoldListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "ManifoldListPage{service=$service, params=$params, items=$items}"
}
