// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.crew

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.crew.CrewAbridged
import com.unifieddatalibrary.api.models.crew.CrewListParams
import com.unifieddatalibrary.api.services.blocking.CrewService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see CrewService.list */
class CrewListPage private constructor(
    private val service: CrewService,
    private val params: CrewListParams,
    private val items: List<CrewAbridged>,

) : Page<CrewAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CrewListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CrewListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CrewAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CrewListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CrewAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CrewListPage].
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

    /** A builder for [CrewListPage]. */
    class Builder internal constructor() {

        private var service: CrewService? = null
        private var params: CrewListParams? = null
        private var items: List<CrewAbridged>? = null

        @JvmSynthetic
        internal fun from(crewListPage: CrewListPage) =
            apply {
                service = crewListPage.service
                params = crewListPage.params
                items = crewListPage.items
            }

        fun service(service: CrewService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: CrewListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<CrewAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [CrewListPage].
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
        fun build(): CrewListPage =
            CrewListPage(
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

      return /* spotless:off */ other is CrewListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "CrewListPage{service=$service, params=$params, items=$items}"
}
