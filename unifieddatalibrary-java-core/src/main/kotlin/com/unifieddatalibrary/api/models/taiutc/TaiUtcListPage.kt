// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.taiutc

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.TaiUtcService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see TaiUtcService.list */
class TaiUtcListPage
private constructor(
    private val service: TaiUtcService,
    private val params: TaiUtcListParams,
    private val items: List<TaiUtcListResponse>,
) : Page<TaiUtcListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TaiUtcListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): TaiUtcListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TaiUtcListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TaiUtcListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TaiUtcListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaiUtcListPage].
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

    /** A builder for [TaiUtcListPage]. */
    class Builder internal constructor() {

        private var service: TaiUtcService? = null
        private var params: TaiUtcListParams? = null
        private var items: List<TaiUtcListResponse>? = null

        @JvmSynthetic
        internal fun from(taiUtcListPage: TaiUtcListPage) = apply {
            service = taiUtcListPage.service
            params = taiUtcListPage.params
            items = taiUtcListPage.items
        }

        fun service(service: TaiUtcService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TaiUtcListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TaiUtcListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [TaiUtcListPage].
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
        fun build(): TaiUtcListPage =
            TaiUtcListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaiUtcListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "TaiUtcListPage{service=$service, params=$params, items=$items}"
}
