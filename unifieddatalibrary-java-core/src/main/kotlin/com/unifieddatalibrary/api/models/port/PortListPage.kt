// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.port.PortListParams
import com.unifieddatalibrary.api.models.port.PortListResponse
import com.unifieddatalibrary.api.services.blocking.PortService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see PortService.list */
class PortListPage private constructor(
    private val service: PortService,
    private val params: PortListParams,
    private val items: List<PortListResponse>,

) : Page<PortListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PortListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): PortListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PortListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PortListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortListPage].
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

    /** A builder for [PortListPage]. */
    class Builder internal constructor() {

        private var service: PortService? = null
        private var params: PortListParams? = null
        private var items: List<PortListResponse>? = null

        @JvmSynthetic
        internal fun from(portListPage: PortListPage) =
            apply {
                service = portListPage.service
                params = portListPage.params
                items = portListPage.items
            }

        fun service(service: PortService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: PortListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<PortListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [PortListPage].
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
        fun build(): PortListPage =
            PortListPage(
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

      return /* spotless:off */ other is PortListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "PortListPage{service=$service, params=$params, items=$items}"
}
