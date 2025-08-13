// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.swir

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SwirService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SwirService.list */
class SwirListPage
private constructor(
    private val service: SwirService,
    private val params: SwirListParams,
    private val items: List<SwirListResponse>,
) : Page<SwirListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SwirListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SwirListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SwirListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SwirListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SwirListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SwirListPage].
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

    /** A builder for [SwirListPage]. */
    class Builder internal constructor() {

        private var service: SwirService? = null
        private var params: SwirListParams? = null
        private var items: List<SwirListResponse>? = null

        @JvmSynthetic
        internal fun from(swirListPage: SwirListPage) = apply {
            service = swirListPage.service
            params = swirListPage.params
            items = swirListPage.items
        }

        fun service(service: SwirService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SwirListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SwirListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SwirListPage].
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
        fun build(): SwirListPage =
            SwirListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SwirListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SwirListPage{service=$service, params=$params, items=$items}"
}
