// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitdetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitdetailService.list */
class OnorbitdetailListPage
private constructor(
    private val service: OnorbitdetailService,
    private val params: OnorbitdetailListParams,
    private val items: List<OnorbitdetailListResponse>,
) : Page<OnorbitdetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitdetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitdetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitdetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitdetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitdetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitdetailListPage].
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

    /** A builder for [OnorbitdetailListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitdetailService? = null
        private var params: OnorbitdetailListParams? = null
        private var items: List<OnorbitdetailListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitdetailListPage: OnorbitdetailListPage) = apply {
            service = onorbitdetailListPage.service
            params = onorbitdetailListPage.params
            items = onorbitdetailListPage.items
        }

        fun service(service: OnorbitdetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitdetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitdetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitdetailListPage].
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
        fun build(): OnorbitdetailListPage =
            OnorbitdetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnorbitdetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "OnorbitdetailListPage{service=$service, params=$params, items=$items}"
}
