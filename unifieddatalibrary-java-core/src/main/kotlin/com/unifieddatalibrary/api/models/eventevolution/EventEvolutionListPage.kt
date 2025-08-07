// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EventEvolutionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EventEvolutionService.list */
class EventEvolutionListPage
private constructor(
    private val service: EventEvolutionService,
    private val params: EventEvolutionListParams,
    private val items: List<EventEvolutionListResponse>,
) : Page<EventEvolutionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EventEvolutionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EventEvolutionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EventEvolutionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventEvolutionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EventEvolutionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventEvolutionListPage].
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

    /** A builder for [EventEvolutionListPage]. */
    class Builder internal constructor() {

        private var service: EventEvolutionService? = null
        private var params: EventEvolutionListParams? = null
        private var items: List<EventEvolutionListResponse>? = null

        @JvmSynthetic
        internal fun from(eventEvolutionListPage: EventEvolutionListPage) = apply {
            service = eventEvolutionListPage.service
            params = eventEvolutionListPage.params
            items = eventEvolutionListPage.items
        }

        fun service(service: EventEvolutionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventEvolutionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EventEvolutionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EventEvolutionListPage].
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
        fun build(): EventEvolutionListPage =
            EventEvolutionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventEvolutionListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "EventEvolutionListPage{service=$service, params=$params, items=$items}"
}
