// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitService.list */
class OnorbitListPage
private constructor(
    private val service: OnorbitService,
    private val params: OnorbitListParams,
    private val items: List<OnorbitListResponse>,
) : Page<OnorbitListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitListPage].
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

    /** A builder for [OnorbitListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitService? = null
        private var params: OnorbitListParams? = null
        private var items: List<OnorbitListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitListPage: OnorbitListPage) = apply {
            service = onorbitListPage.service
            params = onorbitListPage.params
            items = onorbitListPage.items
        }

        fun service(service: OnorbitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitListPage].
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
        fun build(): OnorbitListPage =
            OnorbitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "OnorbitListPage{service=$service, params=$params, items=$items}"
}
