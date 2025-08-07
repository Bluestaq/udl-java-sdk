// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ais

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AiService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AiService.list */
class AiListPage
private constructor(
    private val service: AiService,
    private val params: AiListParams,
    private val items: List<AisAbridged>,
) : Page<AisAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AiListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AiListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AisAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AiListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AisAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiListPage].
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

    /** A builder for [AiListPage]. */
    class Builder internal constructor() {

        private var service: AiService? = null
        private var params: AiListParams? = null
        private var items: List<AisAbridged>? = null

        @JvmSynthetic
        internal fun from(aiListPage: AiListPage) = apply {
            service = aiListPage.service
            params = aiListPage.params
            items = aiListPage.items
        }

        fun service(service: AiService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AiListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AisAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AiListPage].
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
        fun build(): AiListPage =
            AiListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AiListPage{service=$service, params=$params, items=$items}"
}
