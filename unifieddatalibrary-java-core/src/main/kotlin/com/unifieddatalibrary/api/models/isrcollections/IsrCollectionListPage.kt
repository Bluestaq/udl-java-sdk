// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.IsrCollectionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see IsrCollectionService.list */
class IsrCollectionListPage
private constructor(
    private val service: IsrCollectionService,
    private val params: IsrCollectionListParams,
    private val items: List<IsrCollectionListResponse>,
) : Page<IsrCollectionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IsrCollectionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): IsrCollectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IsrCollectionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IsrCollectionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IsrCollectionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IsrCollectionListPage].
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

    /** A builder for [IsrCollectionListPage]. */
    class Builder internal constructor() {

        private var service: IsrCollectionService? = null
        private var params: IsrCollectionListParams? = null
        private var items: List<IsrCollectionListResponse>? = null

        @JvmSynthetic
        internal fun from(isrCollectionListPage: IsrCollectionListPage) = apply {
            service = isrCollectionListPage.service
            params = isrCollectionListPage.params
            items = isrCollectionListPage.items
        }

        fun service(service: IsrCollectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IsrCollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IsrCollectionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IsrCollectionListPage].
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
        fun build(): IsrCollectionListPage =
            IsrCollectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IsrCollectionListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "IsrCollectionListPage{service=$service, params=$params, items=$items}"
}
