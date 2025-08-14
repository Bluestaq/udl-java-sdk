// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.datatypes

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataTypeService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DataTypeService.list */
class DataTypeListPage
private constructor(
    private val service: DataTypeService,
    private val params: DataTypeListParams,
    private val items: List<String>,
) : Page<String> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DataTypeListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DataTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<String> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DataTypeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<String> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataTypeListPage].
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

    /** A builder for [DataTypeListPage]. */
    class Builder internal constructor() {

        private var service: DataTypeService? = null
        private var params: DataTypeListParams? = null
        private var items: List<String>? = null

        @JvmSynthetic
        internal fun from(dataTypeListPage: DataTypeListPage) = apply {
            service = dataTypeListPage.service
            params = dataTypeListPage.params
            items = dataTypeListPage.items
        }

        fun service(service: DataTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<String>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DataTypeListPage].
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
        fun build(): DataTypeListPage =
            DataTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataTypeListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "DataTypeListPage{service=$service, params=$params, items=$items}"
}
