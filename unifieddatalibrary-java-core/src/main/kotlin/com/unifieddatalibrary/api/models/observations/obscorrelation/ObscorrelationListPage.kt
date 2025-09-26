// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.observations.ObscorrelationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ObscorrelationService.list */
class ObscorrelationListPage
private constructor(
    private val service: ObscorrelationService,
    private val params: ObscorrelationListParams,
    private val items: List<ObscorrelationListResponse>,
) : Page<ObscorrelationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ObscorrelationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ObscorrelationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ObscorrelationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ObscorrelationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ObscorrelationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObscorrelationListPage].
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

    /** A builder for [ObscorrelationListPage]. */
    class Builder internal constructor() {

        private var service: ObscorrelationService? = null
        private var params: ObscorrelationListParams? = null
        private var items: List<ObscorrelationListResponse>? = null

        @JvmSynthetic
        internal fun from(obscorrelationListPage: ObscorrelationListPage) = apply {
            service = obscorrelationListPage.service
            params = obscorrelationListPage.params
            items = obscorrelationListPage.items
        }

        fun service(service: ObscorrelationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ObscorrelationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ObscorrelationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ObscorrelationListPage].
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
        fun build(): ObscorrelationListPage =
            ObscorrelationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObscorrelationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "ObscorrelationListPage{service=$service, params=$params, items=$items}"
}
