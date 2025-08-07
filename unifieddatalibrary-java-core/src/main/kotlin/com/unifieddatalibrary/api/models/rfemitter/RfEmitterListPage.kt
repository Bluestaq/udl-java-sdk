// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.RfEmitterService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see RfEmitterService.list */
class RfEmitterListPage
private constructor(
    private val service: RfEmitterService,
    private val params: RfEmitterListParams,
    private val items: List<RfEmitterListResponse>,
) : Page<RfEmitterListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RfEmitterListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): RfEmitterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RfEmitterListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RfEmitterListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RfEmitterListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RfEmitterListPage].
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

    /** A builder for [RfEmitterListPage]. */
    class Builder internal constructor() {

        private var service: RfEmitterService? = null
        private var params: RfEmitterListParams? = null
        private var items: List<RfEmitterListResponse>? = null

        @JvmSynthetic
        internal fun from(rfEmitterListPage: RfEmitterListPage) = apply {
            service = rfEmitterListPage.service
            params = rfEmitterListPage.params
            items = rfEmitterListPage.items
        }

        fun service(service: RfEmitterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RfEmitterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<RfEmitterListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RfEmitterListPage].
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
        fun build(): RfEmitterListPage =
            RfEmitterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RfEmitterListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "RfEmitterListPage{service=$service, params=$params, items=$items}"
}
