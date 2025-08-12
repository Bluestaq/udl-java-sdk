// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservations

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListResponse
import com.unifieddatalibrary.api.services.blocking.IonoObservationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see IonoObservationService.list */
class IonoObservationListPage private constructor(
    private val service: IonoObservationService,
    private val params: IonoObservationListParams,
    private val items: List<IonoObservationListResponse>,

) : Page<IonoObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IonoObservationListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): IonoObservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IonoObservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IonoObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IonoObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IonoObservationListPage].
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

    /** A builder for [IonoObservationListPage]. */
    class Builder internal constructor() {

        private var service: IonoObservationService? = null
        private var params: IonoObservationListParams? = null
        private var items: List<IonoObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(ionoObservationListPage: IonoObservationListPage) =
            apply {
                service = ionoObservationListPage.service
                params = ionoObservationListPage.params
                items = ionoObservationListPage.items
            }

        fun service(service: IonoObservationService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: IonoObservationListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<IonoObservationListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [IonoObservationListPage].
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
        fun build(): IonoObservationListPage =
            IonoObservationListPage(
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

      return /* spotless:off */ other is IonoObservationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "IonoObservationListPage{service=$service, params=$params, items=$items}"
}
