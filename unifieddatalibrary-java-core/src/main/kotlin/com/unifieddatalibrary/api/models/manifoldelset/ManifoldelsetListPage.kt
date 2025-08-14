// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ManifoldelsetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ManifoldelsetService.list */
class ManifoldelsetListPage
private constructor(
    private val service: ManifoldelsetService,
    private val params: ManifoldelsetListParams,
    private val items: List<ManifoldelsetListResponse>,
) : Page<ManifoldelsetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManifoldelsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ManifoldelsetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ManifoldelsetListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ManifoldelsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ManifoldelsetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManifoldelsetListPage].
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

    /** A builder for [ManifoldelsetListPage]. */
    class Builder internal constructor() {

        private var service: ManifoldelsetService? = null
        private var params: ManifoldelsetListParams? = null
        private var items: List<ManifoldelsetListResponse>? = null

        @JvmSynthetic
        internal fun from(manifoldelsetListPage: ManifoldelsetListPage) = apply {
            service = manifoldelsetListPage.service
            params = manifoldelsetListPage.params
            items = manifoldelsetListPage.items
        }

        fun service(service: ManifoldelsetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManifoldelsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ManifoldelsetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ManifoldelsetListPage].
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
        fun build(): ManifoldelsetListPage =
            ManifoldelsetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManifoldelsetListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "ManifoldelsetListPage{service=$service, params=$params, items=$items}"
}
