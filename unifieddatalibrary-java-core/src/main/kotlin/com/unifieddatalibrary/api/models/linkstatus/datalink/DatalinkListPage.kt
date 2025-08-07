// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.datalink

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatalinkService.list */
class DatalinkListPage
private constructor(
    private val service: DatalinkService,
    private val params: DatalinkListParams,
    private val items: List<DatalinkListResponse>,
) : Page<DatalinkListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatalinkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DatalinkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DatalinkListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatalinkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatalinkListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatalinkListPage].
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

    /** A builder for [DatalinkListPage]. */
    class Builder internal constructor() {

        private var service: DatalinkService? = null
        private var params: DatalinkListParams? = null
        private var items: List<DatalinkListResponse>? = null

        @JvmSynthetic
        internal fun from(datalinkListPage: DatalinkListPage) = apply {
            service = datalinkListPage.service
            params = datalinkListPage.params
            items = datalinkListPage.items
        }

        fun service(service: DatalinkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatalinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatalinkListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatalinkListPage].
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
        fun build(): DatalinkListPage =
            DatalinkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatalinkListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "DatalinkListPage{service=$service, params=$params, items=$items}"
}
