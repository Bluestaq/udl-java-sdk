// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataspacecraftdetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataSpacecraftDetailService.list */
class SeradataSpacecraftDetailListPage
private constructor(
    private val service: SeradataSpacecraftDetailService,
    private val params: SeradataSpacecraftDetailListParams,
    private val items: List<SeradataSpacecraftDetailListResponse>,
) : Page<SeradataSpacecraftDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataSpacecraftDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SeradataSpacecraftDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeradataSpacecraftDetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeradataSpacecraftDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataSpacecraftDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeradataSpacecraftDetailListPage].
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

    /** A builder for [SeradataSpacecraftDetailListPage]. */
    class Builder internal constructor() {

        private var service: SeradataSpacecraftDetailService? = null
        private var params: SeradataSpacecraftDetailListParams? = null
        private var items: List<SeradataSpacecraftDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(seradataSpacecraftDetailListPage: SeradataSpacecraftDetailListPage) =
            apply {
                service = seradataSpacecraftDetailListPage.service
                params = seradataSpacecraftDetailListPage.params
                items = seradataSpacecraftDetailListPage.items
            }

        fun service(service: SeradataSpacecraftDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataSpacecraftDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataSpacecraftDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeradataSpacecraftDetailListPage].
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
        fun build(): SeradataSpacecraftDetailListPage =
            SeradataSpacecraftDetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SeradataSpacecraftDetailListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "SeradataSpacecraftDetailListPage{service=$service, params=$params, items=$items}"
}
