// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit.antennadetails

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailsAbridged
import com.unifieddatalibrary.api.services.blocking.onorbit.AntennaDetailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see AntennaDetailService.list */
class AntennaDetailListPage private constructor(
    private val service: AntennaDetailService,
    private val params: AntennaDetailListParams,
    private val items: List<AntennaDetailsAbridged>,

) : Page<AntennaDetailsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AntennaDetailListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): AntennaDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AntennaDetailsAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AntennaDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AntennaDetailsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AntennaDetailListPage].
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

    /** A builder for [AntennaDetailListPage]. */
    class Builder internal constructor() {

        private var service: AntennaDetailService? = null
        private var params: AntennaDetailListParams? = null
        private var items: List<AntennaDetailsAbridged>? = null

        @JvmSynthetic
        internal fun from(antennaDetailListPage: AntennaDetailListPage) =
            apply {
                service = antennaDetailListPage.service
                params = antennaDetailListPage.params
                items = antennaDetailListPage.items
            }

        fun service(service: AntennaDetailService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: AntennaDetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AntennaDetailsAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AntennaDetailListPage].
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
        fun build(): AntennaDetailListPage =
            AntennaDetailListPage(
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

      return /* spotless:off */ other is AntennaDetailListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AntennaDetailListPage{service=$service, params=$params, items=$items}"
}
