// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.monoradar

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see MonoradarService.list */
class MonoradarListPage
private constructor(
    private val service: MonoradarService,
    private val params: MonoradarListParams,
    private val items: List<MonoradarListResponse>,
) : Page<MonoradarListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MonoradarListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): MonoradarListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MonoradarListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MonoradarListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MonoradarListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MonoradarListPage].
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

    /** A builder for [MonoradarListPage]. */
    class Builder internal constructor() {

        private var service: MonoradarService? = null
        private var params: MonoradarListParams? = null
        private var items: List<MonoradarListResponse>? = null

        @JvmSynthetic
        internal fun from(monoradarListPage: MonoradarListPage) = apply {
            service = monoradarListPage.service
            params = monoradarListPage.params
            items = monoradarListPage.items
        }

        fun service(service: MonoradarService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MonoradarListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MonoradarListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MonoradarListPage].
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
        fun build(): MonoradarListPage =
            MonoradarListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MonoradarListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "MonoradarListPage{service=$service, params=$params, items=$items}"
}
