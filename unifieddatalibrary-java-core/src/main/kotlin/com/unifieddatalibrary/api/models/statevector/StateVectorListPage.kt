// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.statevector

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.StateVectorService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see StateVectorService.list */
class StateVectorListPage
private constructor(
    private val service: StateVectorService,
    private val params: StateVectorListParams,
    private val items: List<StateVectorAbridged>,
) : Page<StateVectorAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StateVectorListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): StateVectorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StateVectorAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StateVectorListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StateVectorAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StateVectorListPage].
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

    /** A builder for [StateVectorListPage]. */
    class Builder internal constructor() {

        private var service: StateVectorService? = null
        private var params: StateVectorListParams? = null
        private var items: List<StateVectorAbridged>? = null

        @JvmSynthetic
        internal fun from(stateVectorListPage: StateVectorListPage) = apply {
            service = stateVectorListPage.service
            params = stateVectorListPage.params
            items = stateVectorListPage.items
        }

        fun service(service: StateVectorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StateVectorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<StateVectorAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [StateVectorListPage].
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
        fun build(): StateVectorListPage =
            StateVectorListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StateVectorListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "StateVectorListPage{service=$service, params=$params, items=$items}"
}
