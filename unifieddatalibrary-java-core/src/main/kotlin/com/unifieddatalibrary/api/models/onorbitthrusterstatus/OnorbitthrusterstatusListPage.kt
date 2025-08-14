// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see OnorbitthrusterstatusService.list */
class OnorbitthrusterstatusListPage
private constructor(
    private val service: OnorbitthrusterstatusService,
    private val params: OnorbitthrusterstatusListParams,
    private val items: List<OnorbitthrusterstatusListResponse>,
) : Page<OnorbitthrusterstatusListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnorbitthrusterstatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): OnorbitthrusterstatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnorbitthrusterstatusListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnorbitthrusterstatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<OnorbitthrusterstatusListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OnorbitthrusterstatusListPage].
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

    /** A builder for [OnorbitthrusterstatusListPage]. */
    class Builder internal constructor() {

        private var service: OnorbitthrusterstatusService? = null
        private var params: OnorbitthrusterstatusListParams? = null
        private var items: List<OnorbitthrusterstatusListResponse>? = null

        @JvmSynthetic
        internal fun from(onorbitthrusterstatusListPage: OnorbitthrusterstatusListPage) = apply {
            service = onorbitthrusterstatusListPage.service
            params = onorbitthrusterstatusListPage.params
            items = onorbitthrusterstatusListPage.items
        }

        fun service(service: OnorbitthrusterstatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnorbitthrusterstatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<OnorbitthrusterstatusListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [OnorbitthrusterstatusListPage].
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
        fun build(): OnorbitthrusterstatusListPage =
            OnorbitthrusterstatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitthrusterstatusListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "OnorbitthrusterstatusListPage{service=$service, params=$params, items=$items}"
}
