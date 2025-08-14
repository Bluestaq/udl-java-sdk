// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SgiService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SgiService.list */
class SgiListPage
private constructor(
    private val service: SgiService,
    private val params: SgiListParams,
    private val items: List<SgiListResponse>,
) : Page<SgiListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SgiListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SgiListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SgiListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SgiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SgiListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SgiListPage].
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

    /** A builder for [SgiListPage]. */
    class Builder internal constructor() {

        private var service: SgiService? = null
        private var params: SgiListParams? = null
        private var items: List<SgiListResponse>? = null

        @JvmSynthetic
        internal fun from(sgiListPage: SgiListPage) = apply {
            service = sgiListPage.service
            params = sgiListPage.params
            items = sgiListPage.items
        }

        fun service(service: SgiService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SgiListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SgiListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SgiListPage].
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
        fun build(): SgiListPage =
            SgiListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SgiListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SgiListPage{service=$service, params=$params, items=$items}"
}
