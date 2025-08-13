// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsite

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaunchSiteService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchSiteService.list */
class LaunchSiteListPage
private constructor(
    private val service: LaunchSiteService,
    private val params: LaunchSiteListParams,
    private val items: List<LaunchSiteListResponse>,
) : Page<LaunchSiteListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchSiteListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaunchSiteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaunchSiteListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaunchSiteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchSiteListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchSiteListPage].
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

    /** A builder for [LaunchSiteListPage]. */
    class Builder internal constructor() {

        private var service: LaunchSiteService? = null
        private var params: LaunchSiteListParams? = null
        private var items: List<LaunchSiteListResponse>? = null

        @JvmSynthetic
        internal fun from(launchSiteListPage: LaunchSiteListPage) = apply {
            service = launchSiteListPage.service
            params = launchSiteListPage.params
            items = launchSiteListPage.items
        }

        fun service(service: LaunchSiteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchSiteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchSiteListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchSiteListPage].
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
        fun build(): LaunchSiteListPage =
            LaunchSiteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LaunchSiteListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "LaunchSiteListPage{service=$service, params=$params, items=$items}"
}
