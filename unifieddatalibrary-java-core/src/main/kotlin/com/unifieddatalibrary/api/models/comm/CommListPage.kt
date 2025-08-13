// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.comm

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.CommService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see CommService.list */
class CommListPage
private constructor(
    private val service: CommService,
    private val params: CommListParams,
    private val items: List<CommAbridged>,
) : Page<CommAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CommListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CommListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CommAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CommListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CommAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommListPage].
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

    /** A builder for [CommListPage]. */
    class Builder internal constructor() {

        private var service: CommService? = null
        private var params: CommListParams? = null
        private var items: List<CommAbridged>? = null

        @JvmSynthetic
        internal fun from(commListPage: CommListPage) = apply {
            service = commListPage.service
            params = commListPage.params
            items = commListPage.items
        }

        fun service(service: CommService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CommListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CommAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CommListPage].
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
        fun build(): CommListPage =
            CommListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "CommListPage{service=$service, params=$params, items=$items}"
}
