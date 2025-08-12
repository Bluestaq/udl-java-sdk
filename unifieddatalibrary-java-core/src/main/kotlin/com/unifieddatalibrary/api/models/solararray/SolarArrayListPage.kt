// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.solararray.SolarArrayListParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayListResponse
import com.unifieddatalibrary.api.services.blocking.SolarArrayService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SolarArrayService.list */
class SolarArrayListPage private constructor(
    private val service: SolarArrayService,
    private val params: SolarArrayListParams,
    private val items: List<SolarArrayListResponse>,

) : Page<SolarArrayListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SolarArrayListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SolarArrayListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SolarArrayListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SolarArrayListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SolarArrayListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SolarArrayListPage].
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

    /** A builder for [SolarArrayListPage]. */
    class Builder internal constructor() {

        private var service: SolarArrayService? = null
        private var params: SolarArrayListParams? = null
        private var items: List<SolarArrayListResponse>? = null

        @JvmSynthetic
        internal fun from(solarArrayListPage: SolarArrayListPage) =
            apply {
                service = solarArrayListPage.service
                params = solarArrayListPage.params
                items = solarArrayListPage.items
            }

        fun service(service: SolarArrayService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SolarArrayListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SolarArrayListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SolarArrayListPage].
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
        fun build(): SolarArrayListPage =
            SolarArrayListPage(
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

      return /* spotless:off */ other is SolarArrayListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SolarArrayListPage{service=$service, params=$params, items=$items}"
}
