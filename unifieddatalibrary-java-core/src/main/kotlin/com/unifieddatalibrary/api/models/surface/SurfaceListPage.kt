// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surface

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.surface.SurfaceListParams
import com.unifieddatalibrary.api.models.surface.SurfaceListResponse
import com.unifieddatalibrary.api.services.blocking.SurfaceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SurfaceService.list */
class SurfaceListPage private constructor(
    private val service: SurfaceService,
    private val params: SurfaceListParams,
    private val items: List<SurfaceListResponse>,

) : Page<SurfaceListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SurfaceListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SurfaceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SurfaceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SurfaceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SurfaceListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SurfaceListPage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SurfaceListPage]. */
    class Builder internal constructor() {

        private var service: SurfaceService? = null
        private var params: SurfaceListParams? = null
        private var items: List<SurfaceListResponse>? = null

        @JvmSynthetic
        internal fun from(surfaceListPage: SurfaceListPage) =
            apply {
                service = surfaceListPage.service
                params = surfaceListPage.params
                items = surfaceListPage.items
            }

        fun service(service: SurfaceService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SurfaceListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SurfaceListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SurfaceListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SurfaceListPage =
            SurfaceListPage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "items", items
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SurfaceListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SurfaceListPage{service=$service, params=$params, items=$items}"
}
