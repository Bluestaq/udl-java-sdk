// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.StatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see StatusService.list */
class StatusListPage
private constructor(
    private val service: StatusService,
    private val params: StatusListParams,
    private val items: List<StatusListResponse>,
) : Page<StatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): StatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StatusListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StatusListPage].
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

    /** A builder for [StatusListPage]. */
    class Builder internal constructor() {

        private var service: StatusService? = null
        private var params: StatusListParams? = null
        private var items: List<StatusListResponse>? = null

        @JvmSynthetic
        internal fun from(statusListPage: StatusListPage) = apply {
            service = statusListPage.service
            params = statusListPage.params
            items = statusListPage.items
        }

        fun service(service: StatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StatusListPage].
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
        fun build(): StatusListPage =
            StatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatusListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "StatusListPage{service=$service, params=$params, items=$items}"
}
