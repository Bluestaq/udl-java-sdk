// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emireport

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EmireportService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EmireportService.list */
class EmireportListPage
private constructor(
    private val service: EmireportService,
    private val params: EmireportListParams,
    private val items: List<EmireportListResponse>,
) : Page<EmireportListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EmireportListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EmireportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmireportListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmireportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EmireportListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmireportListPage].
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

    /** A builder for [EmireportListPage]. */
    class Builder internal constructor() {

        private var service: EmireportService? = null
        private var params: EmireportListParams? = null
        private var items: List<EmireportListResponse>? = null

        @JvmSynthetic
        internal fun from(emireportListPage: EmireportListPage) = apply {
            service = emireportListPage.service
            params = emireportListPage.params
            items = emireportListPage.items
        }

        fun service(service: EmireportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmireportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EmireportListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EmireportListPage].
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
        fun build(): EmireportListPage =
            EmireportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmireportListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "EmireportListPage{service=$service, params=$params, items=$items}"
}
