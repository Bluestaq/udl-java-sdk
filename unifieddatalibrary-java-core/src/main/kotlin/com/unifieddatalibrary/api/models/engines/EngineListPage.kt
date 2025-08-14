// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EngineService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EngineService.list */
class EngineListPage
private constructor(
    private val service: EngineService,
    private val params: EngineListParams,
    private val items: List<EngineAbridged>,
) : Page<EngineAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EngineListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EngineListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EngineAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EngineListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EngineAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EngineListPage].
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

    /** A builder for [EngineListPage]. */
    class Builder internal constructor() {

        private var service: EngineService? = null
        private var params: EngineListParams? = null
        private var items: List<EngineAbridged>? = null

        @JvmSynthetic
        internal fun from(engineListPage: EngineListPage) = apply {
            service = engineListPage.service
            params = engineListPage.params
            items = engineListPage.items
        }

        fun service(service: EngineService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EngineListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EngineAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EngineListPage].
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
        fun build(): EngineListPage =
            EngineListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EngineListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "EngineListPage{service=$service, params=$params, items=$items}"
}
