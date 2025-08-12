// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemerissets

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetAbridged
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListParams
import com.unifieddatalibrary.api.services.blocking.EphemerisSetService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see EphemerisSetService.list */
class EphemerisSetListPage private constructor(
    private val service: EphemerisSetService,
    private val params: EphemerisSetListParams,
    private val items: List<EphemerisSetAbridged>,

) : Page<EphemerisSetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EphemerisSetListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): EphemerisSetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EphemerisSetAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EphemerisSetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EphemerisSetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemerisSetListPage].
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

    /** A builder for [EphemerisSetListPage]. */
    class Builder internal constructor() {

        private var service: EphemerisSetService? = null
        private var params: EphemerisSetListParams? = null
        private var items: List<EphemerisSetAbridged>? = null

        @JvmSynthetic
        internal fun from(ephemerisSetListPage: EphemerisSetListPage) =
            apply {
                service = ephemerisSetListPage.service
                params = ephemerisSetListPage.params
                items = ephemerisSetListPage.items
            }

        fun service(service: EphemerisSetService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: EphemerisSetListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<EphemerisSetAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [EphemerisSetListPage].
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
        fun build(): EphemerisSetListPage =
            EphemerisSetListPage(
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

      return /* spotless:off */ other is EphemerisSetListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EphemerisSetListPage{service=$service, params=$params, items=$items}"
}
