// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackdetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.TrackDetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see TrackDetailService.list */
class TrackDetailListPage
private constructor(
    private val service: TrackDetailService,
    private val params: TrackDetailListParams,
    private val items: List<TrackDetailListResponse>,
) : Page<TrackDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): TrackDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TrackDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrackDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TrackDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackDetailListPage].
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

    /** A builder for [TrackDetailListPage]. */
    class Builder internal constructor() {

        private var service: TrackDetailService? = null
        private var params: TrackDetailListParams? = null
        private var items: List<TrackDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(trackDetailListPage: TrackDetailListPage) = apply {
            service = trackDetailListPage.service
            params = trackDetailListPage.params
            items = trackDetailListPage.items
        }

        fun service(service: TrackDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrackDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TrackDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TrackDetailListPage].
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
        fun build(): TrackDetailListPage =
            TrackDetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackDetailListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "TrackDetailListPage{service=$service, params=$params, items=$items}"
}
