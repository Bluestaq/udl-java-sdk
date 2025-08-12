// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beam

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.beam.BeamAbridged
import com.unifieddatalibrary.api.models.beam.BeamListParams
import com.unifieddatalibrary.api.services.blocking.BeamService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see BeamService.list */
class BeamListPage private constructor(
    private val service: BeamService,
    private val params: BeamListParams,
    private val items: List<BeamAbridged>,

) : Page<BeamAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BeamListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): BeamListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BeamAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BeamListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BeamAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeamListPage].
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

    /** A builder for [BeamListPage]. */
    class Builder internal constructor() {

        private var service: BeamService? = null
        private var params: BeamListParams? = null
        private var items: List<BeamAbridged>? = null

        @JvmSynthetic
        internal fun from(beamListPage: BeamListPage) =
            apply {
                service = beamListPage.service
                params = beamListPage.params
                items = beamListPage.items
            }

        fun service(service: BeamService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: BeamListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<BeamAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [BeamListPage].
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
        fun build(): BeamListPage =
            BeamListPage(
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

      return /* spotless:off */ other is BeamListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "BeamListPage{service=$service, params=$params, items=$items}"
}
