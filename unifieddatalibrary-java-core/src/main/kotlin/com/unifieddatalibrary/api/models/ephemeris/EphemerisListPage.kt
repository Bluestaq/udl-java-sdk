// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.ephemeris.EphemerisAbridged
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListParams
import com.unifieddatalibrary.api.services.blocking.EphemerisService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see EphemerisService.list */
class EphemerisListPage private constructor(
    private val service: EphemerisService,
    private val params: EphemerisListParams,
    private val items: List<EphemerisAbridged>,

) : Page<EphemerisAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EphemerisListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): EphemerisListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EphemerisAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EphemerisListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EphemerisAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemerisListPage].
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

    /** A builder for [EphemerisListPage]. */
    class Builder internal constructor() {

        private var service: EphemerisService? = null
        private var params: EphemerisListParams? = null
        private var items: List<EphemerisAbridged>? = null

        @JvmSynthetic
        internal fun from(ephemerisListPage: EphemerisListPage) =
            apply {
                service = ephemerisListPage.service
                params = ephemerisListPage.params
                items = ephemerisListPage.items
            }

        fun service(service: EphemerisService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: EphemerisListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<EphemerisAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [EphemerisListPage].
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
        fun build(): EphemerisListPage =
            EphemerisListPage(
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

      return /* spotless:off */ other is EphemerisListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EphemerisListPage{service=$service, params=$params, items=$items}"
}
