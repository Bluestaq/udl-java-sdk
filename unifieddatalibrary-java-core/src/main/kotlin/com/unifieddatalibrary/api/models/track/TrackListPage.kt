// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.track

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.TrackService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see TrackService.list */
class TrackListPage
private constructor(
    private val service: TrackService,
    private val params: TrackListParams,
    private val items: List<TrackListResponse>,
) : Page<TrackListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): TrackListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TrackListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TrackListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackListPage].
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

    /** A builder for [TrackListPage]. */
    class Builder internal constructor() {

        private var service: TrackService? = null
        private var params: TrackListParams? = null
        private var items: List<TrackListResponse>? = null

        @JvmSynthetic
        internal fun from(trackListPage: TrackListPage) = apply {
            service = trackListPage.service
            params = trackListPage.params
            items = trackListPage.items
        }

        fun service(service: TrackService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TrackListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TrackListPage].
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
        fun build(): TrackListPage =
            TrackListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "TrackListPage{service=$service, params=$params, items=$items}"
}
