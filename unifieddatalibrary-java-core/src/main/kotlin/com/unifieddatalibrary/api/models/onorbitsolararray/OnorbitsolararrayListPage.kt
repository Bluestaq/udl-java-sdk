// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitsolararray

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitsolararrayService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitsolararrayService.list */
class OnorbitsolararrayListPage
private constructor(
    private val service: OnorbitsolararrayService,
    private val params: OnorbitsolararrayListParams,
    private val items: List<OnorbitsolararrayListResponse>,
) : Page<OnorbitsolararrayListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitsolararrayListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitsolararrayListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitsolararrayListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitsolararrayListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitsolararrayListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitsolararrayListPage].
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

    /** A builder for [OnorbitsolararrayListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitsolararrayService? = null
        private var params: OnorbitsolararrayListParams? = null
        private var items: List<OnorbitsolararrayListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitsolararrayListPage: OnorbitsolararrayListPage) = apply {
            service = onorbitsolararrayListPage.service
            params = onorbitsolararrayListPage.params
            items = onorbitsolararrayListPage.items
        }

        fun service(service: OnorbitsolararrayService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitsolararrayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitsolararrayListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitsolararrayListPage].
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
        fun build(): OnorbitsolararrayListPage =
            OnorbitsolararrayListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnorbitsolararrayListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "OnorbitsolararrayListPage{service=$service, params=$params, items=$items}"
}
