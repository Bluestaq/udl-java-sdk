// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.spaceenvobservation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListResponse
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SpaceEnvObservationService.list */
class SpaceEnvObservationListPage private constructor(
    private val service: SpaceEnvObservationService,
    private val params: SpaceEnvObservationListParams,
    private val items: List<SpaceEnvObservationListResponse>,

) : Page<SpaceEnvObservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SpaceEnvObservationListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SpaceEnvObservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SpaceEnvObservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SpaceEnvObservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SpaceEnvObservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpaceEnvObservationListPage].
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

    /** A builder for [SpaceEnvObservationListPage]. */
    class Builder internal constructor() {

        private var service: SpaceEnvObservationService? = null
        private var params: SpaceEnvObservationListParams? = null
        private var items: List<SpaceEnvObservationListResponse>? = null

        @JvmSynthetic
        internal fun from(spaceEnvObservationListPage: SpaceEnvObservationListPage) =
            apply {
                service = spaceEnvObservationListPage.service
                params = spaceEnvObservationListPage.params
                items = spaceEnvObservationListPage.items
            }

        fun service(service: SpaceEnvObservationService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SpaceEnvObservationListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SpaceEnvObservationListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SpaceEnvObservationListPage].
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
        fun build(): SpaceEnvObservationListPage =
            SpaceEnvObservationListPage(
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

      return /* spotless:off */ other is SpaceEnvObservationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SpaceEnvObservationListPage{service=$service, params=$params, items=$items}"
}
