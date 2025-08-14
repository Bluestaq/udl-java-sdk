// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthruster

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitthrusterService.list */
class OnorbitthrusterListPage
private constructor(
    private val service: OnorbitthrusterService,
    private val params: OnorbitthrusterListParams,
    private val items: List<OnorbitthrusterListResponse>,
) : Page<OnorbitthrusterListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitthrusterListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitthrusterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitthrusterListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitthrusterListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitthrusterListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitthrusterListPage].
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

    /** A builder for [OnorbitthrusterListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitthrusterService? = null
        private var params: OnorbitthrusterListParams? = null
        private var items: List<OnorbitthrusterListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitthrusterListPage: OnorbitthrusterListPage) = apply {
            service = onorbitthrusterListPage.service
            params = onorbitthrusterListPage.params
            items = onorbitthrusterListPage.items
        }

        fun service(service: OnorbitthrusterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitthrusterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitthrusterListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitthrusterListPage].
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
        fun build(): OnorbitthrusterListPage =
            OnorbitthrusterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitthrusterListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OnorbitthrusterListPage{service=$service, params=$params, items=$items}"
}
