// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.dataownertypes

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerTypeService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull
import kotlin.jvm.optionals.toList

/** @see DataownerTypeService.list */
class DataownerTypeListPage
private constructor(
    private val service: DataownerTypeService,
    private val params: DataownerTypeListParams,
    private val items: List<String>,
) : Page<String> {

    /** Delegates to [List<String>], but gracefully handles missing data. */
    override fun items(): List<String> = items.flatMap { it.toList() }.getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DataownerTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DataownerTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<String> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DataownerTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<String> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataownerTypeListPage].
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

    /** A builder for [DataownerTypeListPage]. */
    class Builder internal constructor() {

        private var service: DataownerTypeService? = null
        private var params: DataownerTypeListParams? = null
        private var items: List<String>? = null

        @JvmSynthetic
        internal fun from(dataownerTypeListPage: DataownerTypeListPage) = apply {
            service = dataownerTypeListPage.service
            params = dataownerTypeListPage.params
            items = dataownerTypeListPage.items
        }

        fun service(service: DataownerTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataownerTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<String>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DataownerTypeListPage].
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
        fun build(): DataownerTypeListPage =
            DataownerTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataownerTypeListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "DataownerTypeListPage{service=$service, params=$params, items=$items}"
}
