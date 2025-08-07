// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.GroundImageryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see GroundImageryService.list */
class GroundImageryListPage
private constructor(
    private val service: GroundImageryService,
    private val params: GroundImageryListParams,
    private val items: List<GroundImageryListResponse>,
) : Page<GroundImageryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GroundImageryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): GroundImageryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GroundImageryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GroundImageryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GroundImageryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroundImageryListPage].
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

    /** A builder for [GroundImageryListPage]. */
    class Builder internal constructor() {

        private var service: GroundImageryService? = null
        private var params: GroundImageryListParams? = null
        private var items: List<GroundImageryListResponse>? = null

        @JvmSynthetic
        internal fun from(groundImageryListPage: GroundImageryListPage) = apply {
            service = groundImageryListPage.service
            params = groundImageryListPage.params
            items = groundImageryListPage.items
        }

        fun service(service: GroundImageryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GroundImageryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GroundImageryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GroundImageryListPage].
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
        fun build(): GroundImageryListPage =
            GroundImageryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroundImageryListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "GroundImageryListPage{service=$service, params=$params, items=$items}"
}
