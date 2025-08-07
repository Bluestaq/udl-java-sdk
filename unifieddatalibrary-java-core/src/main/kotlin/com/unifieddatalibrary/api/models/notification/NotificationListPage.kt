// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.NotificationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see NotificationService.list */
class NotificationListPage
private constructor(
    private val service: NotificationService,
    private val params: NotificationListParams,
    private val items: List<NotificationListResponse>,
) : Page<NotificationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): NotificationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): NotificationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<NotificationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationListPage].
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

    /** A builder for [NotificationListPage]. */
    class Builder internal constructor() {

        private var service: NotificationService? = null
        private var params: NotificationListParams? = null
        private var items: List<NotificationListResponse>? = null

        @JvmSynthetic
        internal fun from(notificationListPage: NotificationListPage) = apply {
            service = notificationListPage.service
            params = notificationListPage.params
            items = notificationListPage.items
        }

        fun service(service: NotificationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<NotificationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [NotificationListPage].
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
        fun build(): NotificationListPage =
            NotificationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NotificationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "NotificationListPage{service=$service, params=$params, items=$items}"
}
