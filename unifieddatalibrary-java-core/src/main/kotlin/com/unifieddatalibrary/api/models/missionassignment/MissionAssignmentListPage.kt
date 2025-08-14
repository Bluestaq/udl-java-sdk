// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missionassignment

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see MissionAssignmentService.list */
class MissionAssignmentListPage
private constructor(
    private val service: MissionAssignmentService,
    private val params: MissionAssignmentListParams,
    private val items: List<MissionAssignmentListResponse>,
) : Page<MissionAssignmentListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MissionAssignmentListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): MissionAssignmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MissionAssignmentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MissionAssignmentListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MissionAssignmentListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissionAssignmentListPage].
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

    /** A builder for [MissionAssignmentListPage]. */
    class Builder internal constructor() {

        private var service: MissionAssignmentService? = null
        private var params: MissionAssignmentListParams? = null
        private var items: List<MissionAssignmentListResponse>? = null

        @JvmSynthetic
        internal fun from(missionAssignmentListPage: MissionAssignmentListPage) = apply {
            service = missionAssignmentListPage.service
            params = missionAssignmentListPage.params
            items = missionAssignmentListPage.items
        }

        fun service(service: MissionAssignmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MissionAssignmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MissionAssignmentListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MissionAssignmentListPage].
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
        fun build(): MissionAssignmentListPage =
            MissionAssignmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MissionAssignmentListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "MissionAssignmentListPage{service=$service, params=$params, items=$items}"
}
