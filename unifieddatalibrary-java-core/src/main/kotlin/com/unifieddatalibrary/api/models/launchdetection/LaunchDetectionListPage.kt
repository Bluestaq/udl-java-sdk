// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaunchDetectionService.list */
class LaunchDetectionListPage
private constructor(
    private val service: LaunchDetectionService,
    private val params: LaunchDetectionListParams,
    private val items: List<LaunchDetectionListResponse>,
) : Page<LaunchDetectionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaunchDetectionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaunchDetectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaunchDetectionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaunchDetectionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaunchDetectionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaunchDetectionListPage].
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

    /** A builder for [LaunchDetectionListPage]. */
    class Builder internal constructor() {

        private var service: LaunchDetectionService? = null
        private var params: LaunchDetectionListParams? = null
        private var items: List<LaunchDetectionListResponse>? = null

        @JvmSynthetic
        internal fun from(launchDetectionListPage: LaunchDetectionListPage) = apply {
            service = launchDetectionListPage.service
            params = launchDetectionListPage.params
            items = launchDetectionListPage.items
        }

        fun service(service: LaunchDetectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaunchDetectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaunchDetectionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaunchDetectionListPage].
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
        fun build(): LaunchDetectionListPage =
            LaunchDetectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LaunchDetectionListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "LaunchDetectionListPage{service=$service, params=$params, items=$items}"
}
