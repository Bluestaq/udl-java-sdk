// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.MissileTrackService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see MissileTrackService.list */
class MissileTrackListPage
private constructor(
    private val service: MissileTrackService,
    private val params: MissileTrackListParams,
    private val items: List<MissileTrackListResponse>,
) : Page<MissileTrackListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MissileTrackListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): MissileTrackListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MissileTrackListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MissileTrackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MissileTrackListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissileTrackListPage].
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

    /** A builder for [MissileTrackListPage]. */
    class Builder internal constructor() {

        private var service: MissileTrackService? = null
        private var params: MissileTrackListParams? = null
        private var items: List<MissileTrackListResponse>? = null

        @JvmSynthetic
        internal fun from(missileTrackListPage: MissileTrackListPage) = apply {
            service = missileTrackListPage.service
            params = missileTrackListPage.params
            items = missileTrackListPage.items
        }

        fun service(service: MissileTrackService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MissileTrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MissileTrackListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MissileTrackListPage].
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
        fun build(): MissileTrackListPage =
            MissileTrackListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MissileTrackListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "MissileTrackListPage{service=$service, params=$params, items=$items}"
}
