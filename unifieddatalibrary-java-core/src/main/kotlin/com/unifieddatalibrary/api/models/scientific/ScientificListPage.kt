// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scientific

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ScientificService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ScientificService.list */
class ScientificListPage
private constructor(
    private val service: ScientificService,
    private val params: ScientificListParams,
    private val items: List<ScientificListResponse>,
) : Page<ScientificListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ScientificListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ScientificListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ScientificListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ScientificListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ScientificListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScientificListPage].
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

    /** A builder for [ScientificListPage]. */
    class Builder internal constructor() {

        private var service: ScientificService? = null
        private var params: ScientificListParams? = null
        private var items: List<ScientificListResponse>? = null

        @JvmSynthetic
        internal fun from(scientificListPage: ScientificListPage) = apply {
            service = scientificListPage.service
            params = scientificListPage.params
            items = scientificListPage.items
        }

        fun service(service: ScientificService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ScientificListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ScientificListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ScientificListPage].
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
        fun build(): ScientificListPage =
            ScientificListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScientificListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "ScientificListPage{service=$service, params=$params, items=$items}"
}
