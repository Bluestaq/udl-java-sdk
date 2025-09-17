// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laserdeconflictrequest

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaserdeconflictrequestService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaserdeconflictrequestService.list */
class LaserdeconflictrequestListPage
private constructor(
    private val service: LaserdeconflictrequestService,
    private val params: LaserdeconflictrequestListParams,
    private val items: List<LaserdeconflictrequestListResponse>,
) : Page<LaserdeconflictrequestListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaserdeconflictrequestListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaserdeconflictrequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaserdeconflictrequestListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaserdeconflictrequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaserdeconflictrequestListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LaserdeconflictrequestListPage].
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

    /** A builder for [LaserdeconflictrequestListPage]. */
    class Builder internal constructor() {

        private var service: LaserdeconflictrequestService? = null
        private var params: LaserdeconflictrequestListParams? = null
        private var items: List<LaserdeconflictrequestListResponse>? = null

        @JvmSynthetic
        internal fun from(laserdeconflictrequestListPage: LaserdeconflictrequestListPage) = apply {
            service = laserdeconflictrequestListPage.service
            params = laserdeconflictrequestListPage.params
            items = laserdeconflictrequestListPage.items
        }

        fun service(service: LaserdeconflictrequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaserdeconflictrequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaserdeconflictrequestListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaserdeconflictrequestListPage].
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
        fun build(): LaserdeconflictrequestListPage =
            LaserdeconflictrequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LaserdeconflictrequestListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "LaserdeconflictrequestListPage{service=$service, params=$params, items=$items}"
}
