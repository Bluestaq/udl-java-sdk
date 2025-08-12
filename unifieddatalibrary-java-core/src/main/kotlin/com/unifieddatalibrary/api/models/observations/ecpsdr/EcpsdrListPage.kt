// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.ecpsdr

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrAbridged
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrListParams
import com.unifieddatalibrary.api.services.blocking.observations.EcpsdrService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see EcpsdrService.list */
class EcpsdrListPage private constructor(
    private val service: EcpsdrService,
    private val params: EcpsdrListParams,
    private val items: List<EcpsdrAbridged>,

) : Page<EcpsdrAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EcpsdrListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): EcpsdrListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EcpsdrAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EcpsdrListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EcpsdrAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EcpsdrListPage].
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

    /** A builder for [EcpsdrListPage]. */
    class Builder internal constructor() {

        private var service: EcpsdrService? = null
        private var params: EcpsdrListParams? = null
        private var items: List<EcpsdrAbridged>? = null

        @JvmSynthetic
        internal fun from(ecpsdrListPage: EcpsdrListPage) =
            apply {
                service = ecpsdrListPage.service
                params = ecpsdrListPage.params
                items = ecpsdrListPage.items
            }

        fun service(service: EcpsdrService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: EcpsdrListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<EcpsdrAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [EcpsdrListPage].
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
        fun build(): EcpsdrListPage =
            EcpsdrListPage(
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

      return /* spotless:off */ other is EcpsdrListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EcpsdrListPage{service=$service, params=$params, items=$items}"
}
