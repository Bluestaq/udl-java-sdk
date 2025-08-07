// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchevent

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaunchEventService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchEventService.list */
class LaunchEventListPage
private constructor(
    private val service: LaunchEventService,
    private val params: LaunchEventListParams,
    private val items: List<LaunchEventListResponse>,
) : Page<LaunchEventListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchEventListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaunchEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaunchEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaunchEventListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchEventListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchEventListPage].
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

    /** A builder for [LaunchEventListPage]. */
    class Builder internal constructor() {

        private var service: LaunchEventService? = null
        private var params: LaunchEventListParams? = null
        private var items: List<LaunchEventListResponse>? = null

        @JvmSynthetic
        internal fun from(launchEventListPage: LaunchEventListPage) = apply {
            service = launchEventListPage.service
            params = launchEventListPage.params
            items = launchEventListPage.items
        }

        fun service(service: LaunchEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchEventListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchEventListPage].
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
        fun build(): LaunchEventListPage =
            LaunchEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LaunchEventListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "LaunchEventListPage{service=$service, params=$params, items=$items}"
}
