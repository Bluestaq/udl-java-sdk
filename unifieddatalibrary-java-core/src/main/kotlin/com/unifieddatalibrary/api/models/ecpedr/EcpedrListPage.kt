// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EcpedrService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EcpedrService.list */
class EcpedrListPage
private constructor(
    private val service: EcpedrService,
    private val params: EcpedrListParams,
    private val items: List<EcpedrListResponse>,
) : Page<EcpedrListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EcpedrListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EcpedrListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EcpedrListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EcpedrListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EcpedrListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EcpedrListPage].
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

    /** A builder for [EcpedrListPage]. */
    class Builder internal constructor() {

        private var service: EcpedrService? = null
        private var params: EcpedrListParams? = null
        private var items: List<EcpedrListResponse>? = null

        @JvmSynthetic
        internal fun from(ecpedrListPage: EcpedrListPage) = apply {
            service = ecpedrListPage.service
            params = ecpedrListPage.params
            items = ecpedrListPage.items
        }

        fun service(service: EcpedrService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EcpedrListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EcpedrListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EcpedrListPage].
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
        fun build(): EcpedrListPage =
            EcpedrListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EcpedrListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "EcpedrListPage{service=$service, params=$params, items=$items}"
}
