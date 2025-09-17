// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.LaseremitterService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see LaseremitterService.list */
class LaseremitterListPage
private constructor(
    private val service: LaseremitterService,
    private val params: LaseremitterListParams,
    private val items: List<LaseremitterListResponse>,
) : Page<LaseremitterListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LaseremitterListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): LaseremitterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LaseremitterListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LaseremitterListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LaseremitterListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LaseremitterListPage].
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

    /** A builder for [LaseremitterListPage]. */
    class Builder internal constructor() {

        private var service: LaseremitterService? = null
        private var params: LaseremitterListParams? = null
        private var items: List<LaseremitterListResponse>? = null

        @JvmSynthetic
        internal fun from(laseremitterListPage: LaseremitterListPage) = apply {
            service = laseremitterListPage.service
            params = laseremitterListPage.params
            items = laseremitterListPage.items
        }

        fun service(service: LaseremitterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LaseremitterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LaseremitterListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LaseremitterListPage].
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
        fun build(): LaseremitterListPage =
            LaseremitterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LaseremitterListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "LaseremitterListPage{service=$service, params=$params, items=$items}"
}
