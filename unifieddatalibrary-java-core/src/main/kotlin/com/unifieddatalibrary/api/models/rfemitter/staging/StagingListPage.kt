// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.staging

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.rfemitter.StagingService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see StagingService.list */
class StagingListPage
private constructor(
    private val service: StagingService,
    private val params: StagingListParams,
    private val items: List<StagingListResponse>,
) : Page<StagingListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StagingListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): StagingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StagingListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StagingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StagingListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StagingListPage].
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

    /** A builder for [StagingListPage]. */
    class Builder internal constructor() {

        private var service: StagingService? = null
        private var params: StagingListParams? = null
        private var items: List<StagingListResponse>? = null

        @JvmSynthetic
        internal fun from(stagingListPage: StagingListPage) = apply {
            service = stagingListPage.service
            params = stagingListPage.params
            items = stagingListPage.items
        }

        fun service(service: StagingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StagingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StagingListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StagingListPage].
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
        fun build(): StagingListPage =
            StagingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StagingListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "StagingListPage{service=$service, params=$params, items=$items}"
}
