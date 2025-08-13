// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution.history

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.EventEvolutionFull
import com.unifieddatalibrary.api.services.blocking.eventevolution.HistoryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see HistoryService.list */
class HistoryListPage
private constructor(
    private val service: HistoryService,
    private val params: HistoryListParams,
    private val items: List<EventEvolutionFull>,
) : Page<EventEvolutionFull> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HistoryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): HistoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EventEvolutionFull> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HistoryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EventEvolutionFull> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HistoryListPage].
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

    /** A builder for [HistoryListPage]. */
    class Builder internal constructor() {

        private var service: HistoryService? = null
        private var params: HistoryListParams? = null
        private var items: List<EventEvolutionFull>? = null

        @JvmSynthetic
        internal fun from(historyListPage: HistoryListPage) = apply {
            service = historyListPage.service
            params = historyListPage.params
            items = historyListPage.items
        }

        fun service(service: HistoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HistoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EventEvolutionFull>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HistoryListPage].
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
        fun build(): HistoryListPage =
            HistoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoryListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "HistoryListPage{service=$service, params=$params, items=$items}"
}
