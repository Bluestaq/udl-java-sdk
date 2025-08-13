// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunitremark

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OperatingunitremarkService.list */
class OperatingunitremarkListPage
private constructor(
    private val service: OperatingunitremarkService,
    private val params: OperatingunitremarkListParams,
    private val items: List<OperatingunitremarkListResponse>,
) : Page<OperatingunitremarkListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OperatingunitremarkListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OperatingunitremarkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OperatingunitremarkListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OperatingunitremarkListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OperatingunitremarkListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OperatingunitremarkListPage].
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

    /** A builder for [OperatingunitremarkListPage]. */
    class Builder internal constructor() {

        private var service: OperatingunitremarkService? = null
        private var params: OperatingunitremarkListParams? = null
        private var items: List<OperatingunitremarkListResponse>? = null

        @JvmSynthetic
        internal fun from(operatingunitremarkListPage: OperatingunitremarkListPage) = apply {
            service = operatingunitremarkListPage.service
            params = operatingunitremarkListPage.params
            items = operatingunitremarkListPage.items
        }

        fun service(service: OperatingunitremarkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OperatingunitremarkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OperatingunitremarkListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OperatingunitremarkListPage].
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
        fun build(): OperatingunitremarkListPage =
            OperatingunitremarkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OperatingunitremarkListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OperatingunitremarkListPage{service=$service, params=$params, items=$items}"
}
