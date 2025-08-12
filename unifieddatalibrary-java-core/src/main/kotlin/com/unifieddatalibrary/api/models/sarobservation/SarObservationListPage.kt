// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sarobservation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListResponse
import com.unifieddatalibrary.api.services.blocking.SarObservationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SarObservationService.list */
class SarObservationListPage private constructor(
    private val service: SarObservationService,
    private val params: SarObservationListParams,
    private val items: List<SarObservationListResponse>,

) : Page<SarObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SarObservationListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SarObservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SarObservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SarObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SarObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SarObservationListPage].
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

    /** A builder for [SarObservationListPage]. */
    class Builder internal constructor() {

        private var service: SarObservationService? = null
        private var params: SarObservationListParams? = null
        private var items: List<SarObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(sarObservationListPage: SarObservationListPage) =
            apply {
                service = sarObservationListPage.service
                params = sarObservationListPage.params
                items = sarObservationListPage.items
            }

        fun service(service: SarObservationService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SarObservationListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SarObservationListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SarObservationListPage].
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
        fun build(): SarObservationListPage =
            SarObservationListPage(
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

      return /* spotless:off */ other is SarObservationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SarObservationListPage{service=$service, params=$params, items=$items}"
}
