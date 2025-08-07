// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbittrack

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OrbittrackService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OrbittrackService.list */
class OrbittrackListPage
private constructor(
    private val service: OrbittrackService,
    private val params: OrbittrackListParams,
    private val items: List<OrbittrackListResponse>,
) : Page<OrbittrackListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OrbittrackListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OrbittrackListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OrbittrackListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OrbittrackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OrbittrackListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrbittrackListPage].
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

    /** A builder for [OrbittrackListPage]. */
    class Builder internal constructor() {

        private var service: OrbittrackService? = null
        private var params: OrbittrackListParams? = null
        private var items: List<OrbittrackListResponse>? = null

        @JvmSynthetic
        internal fun from(orbittrackListPage: OrbittrackListPage) = apply {
            service = orbittrackListPage.service
            params = orbittrackListPage.params
            items = orbittrackListPage.items
        }

        fun service(service: OrbittrackService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OrbittrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OrbittrackListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OrbittrackListPage].
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
        fun build(): OrbittrackListPage =
            OrbittrackListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrbittrackListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OrbittrackListPage{service=$service, params=$params, items=$items}"
}
