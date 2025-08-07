// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.mti

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.MtiService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see MtiService.list */
class MtiListPage
private constructor(
    private val service: MtiService,
    private val params: MtiListParams,
    private val items: List<MtiListResponse>,
) : Page<MtiListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MtiListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): MtiListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MtiListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MtiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MtiListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MtiListPage].
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

    /** A builder for [MtiListPage]. */
    class Builder internal constructor() {

        private var service: MtiService? = null
        private var params: MtiListParams? = null
        private var items: List<MtiListResponse>? = null

        @JvmSynthetic
        internal fun from(mtiListPage: MtiListPage) = apply {
            service = mtiListPage.service
            params = mtiListPage.params
            items = mtiListPage.items
        }

        fun service(service: MtiService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MtiListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MtiListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MtiListPage].
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
        fun build(): MtiListPage =
            MtiListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MtiListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "MtiListPage{service=$service, params=$params, items=$items}"
}
