// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.skyimagery

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SkyImageryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SkyImageryService.list */
class SkyImageryListPage
private constructor(
    private val service: SkyImageryService,
    private val params: SkyImageryListParams,
    private val items: List<SkyImageryListResponse>,
) : Page<SkyImageryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SkyImageryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SkyImageryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SkyImageryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SkyImageryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SkyImageryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SkyImageryListPage].
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

    /** A builder for [SkyImageryListPage]. */
    class Builder internal constructor() {

        private var service: SkyImageryService? = null
        private var params: SkyImageryListParams? = null
        private var items: List<SkyImageryListResponse>? = null

        @JvmSynthetic
        internal fun from(skyImageryListPage: SkyImageryListPage) = apply {
            service = skyImageryListPage.service
            params = skyImageryListPage.params
            items = skyImageryListPage.items
        }

        fun service(service: SkyImageryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SkyImageryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SkyImageryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SkyImageryListPage].
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
        fun build(): SkyImageryListPage =
            SkyImageryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SkyImageryListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SkyImageryListPage{service=$service, params=$params, items=$items}"
}
