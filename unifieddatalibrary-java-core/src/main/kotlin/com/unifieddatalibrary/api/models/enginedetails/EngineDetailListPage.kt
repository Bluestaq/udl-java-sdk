// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.enginedetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EngineDetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EngineDetailService.list */
class EngineDetailListPage
private constructor(
    private val service: EngineDetailService,
    private val params: EngineDetailListParams,
    private val items: List<EngineDetailsAbridged>,
) : Page<EngineDetailsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EngineDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EngineDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EngineDetailsAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EngineDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EngineDetailsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EngineDetailListPage].
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

    /** A builder for [EngineDetailListPage]. */
    class Builder internal constructor() {

        private var service: EngineDetailService? = null
        private var params: EngineDetailListParams? = null
        private var items: List<EngineDetailsAbridged>? = null

        @JvmSynthetic
        internal fun from(engineDetailListPage: EngineDetailListPage) = apply {
            service = engineDetailListPage.service
            params = engineDetailListPage.params
            items = engineDetailListPage.items
        }

        fun service(service: EngineDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EngineDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EngineDetailsAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EngineDetailListPage].
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
        fun build(): EngineDetailListPage =
            EngineDetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EngineDetailListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "EngineDetailListPage{service=$service, params=$params, items=$items}"
}
