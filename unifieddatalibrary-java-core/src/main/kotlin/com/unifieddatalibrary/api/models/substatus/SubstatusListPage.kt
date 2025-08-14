// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SubstatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SubstatusService.list */
class SubstatusListPage
private constructor(
    private val service: SubstatusService,
    private val params: SubstatusListParams,
    private val items: List<SubstatusListResponse>,
) : Page<SubstatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SubstatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SubstatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SubstatusListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubstatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SubstatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubstatusListPage].
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

    /** A builder for [SubstatusListPage]. */
    class Builder internal constructor() {

        private var service: SubstatusService? = null
        private var params: SubstatusListParams? = null
        private var items: List<SubstatusListResponse>? = null

        @JvmSynthetic
        internal fun from(substatusListPage: SubstatusListPage) = apply {
            service = substatusListPage.service
            params = substatusListPage.params
            items = substatusListPage.items
        }

        fun service(service: SubstatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubstatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SubstatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SubstatusListPage].
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
        fun build(): SubstatusListPage =
            SubstatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubstatusListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SubstatusListPage{service=$service, params=$params, items=$items}"
}
