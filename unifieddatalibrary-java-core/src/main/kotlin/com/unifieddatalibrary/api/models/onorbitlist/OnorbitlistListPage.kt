// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitlistService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitlistService.list */
class OnorbitlistListPage
private constructor(
    private val service: OnorbitlistService,
    private val params: OnorbitlistListParams,
    private val items: List<OnorbitlistListResponse>,
) : Page<OnorbitlistListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitlistListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitlistListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitlistListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitlistListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitlistListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitlistListPage].
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

    /** A builder for [OnorbitlistListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitlistService? = null
        private var params: OnorbitlistListParams? = null
        private var items: List<OnorbitlistListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitlistListPage: OnorbitlistListPage) = apply {
            service = onorbitlistListPage.service
            params = onorbitlistListPage.params
            items = onorbitlistListPage.items
        }

        fun service(service: OnorbitlistService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitlistListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitlistListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitlistListPage].
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
        fun build(): OnorbitlistListPage =
            OnorbitlistListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnorbitlistListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OnorbitlistListPage{service=$service, params=$params, items=$items}"
}
