// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LinkStatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LinkStatusService.list */
class LinkStatusListPage
private constructor(
    private val service: LinkStatusService,
    private val params: LinkStatusListParams,
    private val items: List<LinkStatusListResponse>,
) : Page<LinkStatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LinkStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LinkStatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LinkStatusListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LinkStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LinkStatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LinkStatusListPage].
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

    /** A builder for [LinkStatusListPage]. */
    class Builder internal constructor() {

        private var service: LinkStatusService? = null
        private var params: LinkStatusListParams? = null
        private var items: List<LinkStatusListResponse>? = null

        @JvmSynthetic
        internal fun from(linkStatusListPage: LinkStatusListPage) = apply {
            service = linkStatusListPage.service
            params = linkStatusListPage.params
            items = linkStatusListPage.items
        }

        fun service(service: LinkStatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LinkStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LinkStatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LinkStatusListPage].
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
        fun build(): LinkStatusListPage =
            LinkStatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LinkStatusListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "LinkStatusListPage{service=$service, params=$params, items=$items}"
}
