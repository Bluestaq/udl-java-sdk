// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataradarpayload

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SeradataRadarPayloadService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataRadarPayloadService.list */
class SeradataRadarPayloadListPage
private constructor(
    private val service: SeradataRadarPayloadService,
    private val params: SeradataRadarPayloadListParams,
    private val items: List<SeradataRadarPayloadListResponse>,
) : Page<SeradataRadarPayloadListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataRadarPayloadListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SeradataRadarPayloadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeradataRadarPayloadListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeradataRadarPayloadListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataRadarPayloadListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeradataRadarPayloadListPage].
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

    /** A builder for [SeradataRadarPayloadListPage]. */
    class Builder internal constructor() {

        private var service: SeradataRadarPayloadService? = null
        private var params: SeradataRadarPayloadListParams? = null
        private var items: List<SeradataRadarPayloadListResponse>? = null

        @JvmSynthetic
        internal fun from(seradataRadarPayloadListPage: SeradataRadarPayloadListPage) = apply {
            service = seradataRadarPayloadListPage.service
            params = seradataRadarPayloadListPage.params
            items = seradataRadarPayloadListPage.items
        }

        fun service(service: SeradataRadarPayloadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataRadarPayloadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataRadarPayloadListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeradataRadarPayloadListPage].
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
        fun build(): SeradataRadarPayloadListPage =
            SeradataRadarPayloadListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SeradataRadarPayloadListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "SeradataRadarPayloadListPage{service=$service, params=$params, items=$items}"
}
