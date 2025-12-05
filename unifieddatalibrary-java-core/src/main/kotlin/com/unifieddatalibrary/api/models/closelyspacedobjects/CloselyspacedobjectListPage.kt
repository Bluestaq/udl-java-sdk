// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.closelyspacedobjects

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.CloselyspacedobjectService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see CloselyspacedobjectService.list */
class CloselyspacedobjectListPage
private constructor(
    private val service: CloselyspacedobjectService,
    private val params: CloselyspacedobjectListParams,
    private val items: List<CloselyspacedobjectsAbridged>,
) : Page<CloselyspacedobjectsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CloselyspacedobjectListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CloselyspacedobjectListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CloselyspacedobjectsAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CloselyspacedobjectListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CloselyspacedobjectsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CloselyspacedobjectListPage].
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

    /** A builder for [CloselyspacedobjectListPage]. */
    class Builder internal constructor() {

        private var service: CloselyspacedobjectService? = null
        private var params: CloselyspacedobjectListParams? = null
        private var items: List<CloselyspacedobjectsAbridged>? = null

        @JvmSynthetic
        internal fun from(closelyspacedobjectListPage: CloselyspacedobjectListPage) = apply {
            service = closelyspacedobjectListPage.service
            params = closelyspacedobjectListPage.params
            items = closelyspacedobjectListPage.items
        }

        fun service(service: CloselyspacedobjectService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CloselyspacedobjectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CloselyspacedobjectsAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CloselyspacedobjectListPage].
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
        fun build(): CloselyspacedobjectListPage =
            CloselyspacedobjectListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloselyspacedobjectListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "CloselyspacedobjectListPage{service=$service, params=$params, items=$items}"
}
