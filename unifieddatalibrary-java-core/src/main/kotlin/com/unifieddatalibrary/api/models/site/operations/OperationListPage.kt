// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.site.OperationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OperationService.list */
class OperationListPage
private constructor(
    private val service: OperationService,
    private val params: OperationListParams,
    private val items: List<OperationListResponse>,
) : Page<OperationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OperationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OperationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OperationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OperationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OperationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OperationListPage].
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

    /** A builder for [OperationListPage]. */
    class Builder internal constructor() {

        private var service: OperationService? = null
        private var params: OperationListParams? = null
        private var items: List<OperationListResponse>? = null

        @JvmSynthetic
        internal fun from(operationListPage: OperationListPage) = apply {
            service = operationListPage.service
            params = operationListPage.params
            items = operationListPage.items
        }

        fun service(service: OperationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OperationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OperationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OperationListPage].
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
        fun build(): OperationListPage =
            OperationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OperationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OperationListPage{service=$service, params=$params, items=$items}"
}
