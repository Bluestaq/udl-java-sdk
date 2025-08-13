// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SurfaceObstructionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SurfaceObstructionService.list */
class SurfaceObstructionListPage
private constructor(
    private val service: SurfaceObstructionService,
    private val params: SurfaceObstructionListParams,
    private val items: List<SurfaceObstructionListResponse>,
) : Page<SurfaceObstructionListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SurfaceObstructionListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SurfaceObstructionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SurfaceObstructionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SurfaceObstructionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SurfaceObstructionListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SurfaceObstructionListPage].
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

    /** A builder for [SurfaceObstructionListPage]. */
    class Builder internal constructor() {

        private var service: SurfaceObstructionService? = null
        private var params: SurfaceObstructionListParams? = null
        private var items: List<SurfaceObstructionListResponse>? = null

        @JvmSynthetic
        internal fun from(surfaceObstructionListPage: SurfaceObstructionListPage) = apply {
            service = surfaceObstructionListPage.service
            params = surfaceObstructionListPage.params
            items = surfaceObstructionListPage.items
        }

        fun service(service: SurfaceObstructionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SurfaceObstructionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SurfaceObstructionListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SurfaceObstructionListPage].
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
        fun build(): SurfaceObstructionListPage =
            SurfaceObstructionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SurfaceObstructionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "SurfaceObstructionListPage{service=$service, params=$params, items=$items}"
}
