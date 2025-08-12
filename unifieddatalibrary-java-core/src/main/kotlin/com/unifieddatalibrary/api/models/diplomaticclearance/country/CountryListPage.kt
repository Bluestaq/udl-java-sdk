// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance.country

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListResponse
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.CountryService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see CountryService.list */
class CountryListPage private constructor(
    private val service: CountryService,
    private val params: CountryListParams,
    private val items: List<CountryListResponse>,

) : Page<CountryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CountryListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CountryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CountryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CountryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CountryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CountryListPage].
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

    /** A builder for [CountryListPage]. */
    class Builder internal constructor() {

        private var service: CountryService? = null
        private var params: CountryListParams? = null
        private var items: List<CountryListResponse>? = null

        @JvmSynthetic
        internal fun from(countryListPage: CountryListPage) =
            apply {
                service = countryListPage.service
                params = countryListPage.params
                items = countryListPage.items
            }

        fun service(service: CountryService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: CountryListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<CountryListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [CountryListPage].
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
        fun build(): CountryListPage =
            CountryListPage(
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

      return /* spotless:off */ other is CountryListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "CountryListPage{service=$service, params=$params, items=$items}"
}
