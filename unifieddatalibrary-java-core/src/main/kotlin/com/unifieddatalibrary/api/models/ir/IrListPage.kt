// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ir

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.IrService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see IrService.list */
class IrListPage
private constructor(
    private val service: IrService,
    private val params: IrListParams,
    private val items: List<IrListResponse>,
) : Page<IrListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IrListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): IrListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IrListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IrListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IrListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IrListPage].
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

    /** A builder for [IrListPage]. */
    class Builder internal constructor() {

        private var service: IrService? = null
        private var params: IrListParams? = null
        private var items: List<IrListResponse>? = null

        @JvmSynthetic
        internal fun from(irListPage: IrListPage) = apply {
            service = irListPage.service
            params = irListPage.params
            items = irListPage.items
        }

        fun service(service: IrService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IrListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IrListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IrListPage].
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
        fun build(): IrListPage =
            IrListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IrListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "IrListPage{service=$service, params=$params, items=$items}"
}
