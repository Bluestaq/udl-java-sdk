// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfields

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.airfields.AirfieldAbridged
import com.unifieddatalibrary.api.models.airfields.AirfieldListParams
import com.unifieddatalibrary.api.services.blocking.AirfieldService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldService.list */
class AirfieldListPage private constructor(
    private val service: AirfieldService,
    private val params: AirfieldListParams,
    private val items: List<AirfieldAbridged>,

) : Page<AirfieldAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): AirfieldListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirfieldAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirfieldListPage].
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

    /** A builder for [AirfieldListPage]. */
    class Builder internal constructor() {

        private var service: AirfieldService? = null
        private var params: AirfieldListParams? = null
        private var items: List<AirfieldAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldListPage: AirfieldListPage) =
            apply {
                service = airfieldListPage.service
                params = airfieldListPage.params
                items = airfieldListPage.items
            }

        fun service(service: AirfieldService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [AirfieldListPage].
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
        fun build(): AirfieldListPage =
            AirfieldListPage(
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

      return /* spotless:off */ other is AirfieldListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AirfieldListPage{service=$service, params=$params, items=$items}"
}
