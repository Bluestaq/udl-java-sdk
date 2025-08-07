// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SortiePprService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SortiePprService.list */
class SortiePprListPage
private constructor(
    private val service: SortiePprService,
    private val params: SortiePprListParams,
    private val items: List<SortiePprListResponse>,
) : Page<SortiePprListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SortiePprListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SortiePprListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SortiePprListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SortiePprListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SortiePprListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SortiePprListPage].
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

    /** A builder for [SortiePprListPage]. */
    class Builder internal constructor() {

        private var service: SortiePprService? = null
        private var params: SortiePprListParams? = null
        private var items: List<SortiePprListResponse>? = null

        @JvmSynthetic
        internal fun from(sortiePprListPage: SortiePprListPage) = apply {
            service = sortiePprListPage.service
            params = sortiePprListPage.params
            items = sortiePprListPage.items
        }

        fun service(service: SortiePprService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SortiePprListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SortiePprListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SortiePprListPage].
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
        fun build(): SortiePprListPage =
            SortiePprListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SortiePprListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SortiePprListPage{service=$service, params=$params, items=$items}"
}
