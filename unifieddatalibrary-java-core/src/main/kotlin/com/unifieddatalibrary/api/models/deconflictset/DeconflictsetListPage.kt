// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.deconflictset

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.DeconflictsetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DeconflictsetService.list */
class DeconflictsetListPage
private constructor(
    private val service: DeconflictsetService,
    private val params: DeconflictsetListParams,
    private val items: List<DeconflictsetListResponse>,
) : Page<DeconflictsetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DeconflictsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DeconflictsetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DeconflictsetListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DeconflictsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DeconflictsetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeconflictsetListPage].
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

    /** A builder for [DeconflictsetListPage]. */
    class Builder internal constructor() {

        private var service: DeconflictsetService? = null
        private var params: DeconflictsetListParams? = null
        private var items: List<DeconflictsetListResponse>? = null

        @JvmSynthetic
        internal fun from(deconflictsetListPage: DeconflictsetListPage) = apply {
            service = deconflictsetListPage.service
            params = deconflictsetListPage.params
            items = deconflictsetListPage.items
        }

        fun service(service: DeconflictsetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DeconflictsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DeconflictsetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DeconflictsetListPage].
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
        fun build(): DeconflictsetListPage =
            DeconflictsetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeconflictsetListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DeconflictsetListPage{service=$service, params=$params, items=$items}"
}
