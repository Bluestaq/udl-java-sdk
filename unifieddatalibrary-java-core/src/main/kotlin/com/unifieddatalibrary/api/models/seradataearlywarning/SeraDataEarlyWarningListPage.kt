// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SeraDataEarlyWarningService.list */
class SeraDataEarlyWarningListPage
private constructor(
    private val service: SeraDataEarlyWarningService,
    private val params: SeraDataEarlyWarningListParams,
    private val items: List<SeraDataEarlyWarningListResponse>,
) : Page<SeraDataEarlyWarningListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeraDataEarlyWarningListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SeraDataEarlyWarningListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeraDataEarlyWarningListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeraDataEarlyWarningListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeraDataEarlyWarningListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeraDataEarlyWarningListPage].
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

    /** A builder for [SeraDataEarlyWarningListPage]. */
    class Builder internal constructor() {

        private var service: SeraDataEarlyWarningService? = null
        private var params: SeraDataEarlyWarningListParams? = null
        private var items: List<SeraDataEarlyWarningListResponse>? = null

        @JvmSynthetic
        internal fun from(seraDataEarlyWarningListPage: SeraDataEarlyWarningListPage) = apply {
            service = seraDataEarlyWarningListPage.service
            params = seraDataEarlyWarningListPage.params
            items = seraDataEarlyWarningListPage.items
        }

        fun service(service: SeraDataEarlyWarningService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SeraDataEarlyWarningListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeraDataEarlyWarningListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeraDataEarlyWarningListPage].
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
        fun build(): SeraDataEarlyWarningListPage =
            SeraDataEarlyWarningListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SeraDataEarlyWarningListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "SeraDataEarlyWarningListPage{service=$service, params=$params, items=$items}"
}
