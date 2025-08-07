// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitevent

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbiteventService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbiteventService.list */
class OnorbiteventListPage
private constructor(
    private val service: OnorbiteventService,
    private val params: OnorbiteventListParams,
    private val items: List<OnorbiteventListResponse>,
) : Page<OnorbiteventListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbiteventListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbiteventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbiteventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbiteventListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbiteventListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbiteventListPage].
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

    /** A builder for [OnorbiteventListPage]. */
    class Builder internal constructor() {

        private var service: OnorbiteventService? = null
        private var params: OnorbiteventListParams? = null
        private var items: List<OnorbiteventListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbiteventListPage: OnorbiteventListPage) = apply {
            service = onorbiteventListPage.service
            params = onorbiteventListPage.params
            items = onorbiteventListPage.items
        }

        fun service(service: OnorbiteventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbiteventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbiteventListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbiteventListPage].
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
        fun build(): OnorbiteventListPage =
            OnorbiteventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnorbiteventListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "OnorbiteventListPage{service=$service, params=$params, items=$items}"
}
