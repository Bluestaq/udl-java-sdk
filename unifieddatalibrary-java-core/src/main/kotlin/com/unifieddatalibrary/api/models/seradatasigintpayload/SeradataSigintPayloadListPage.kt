// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListResponse
import com.unifieddatalibrary.api.services.blocking.SeradataSigintPayloadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataSigintPayloadService.list */
class SeradataSigintPayloadListPage private constructor(
    private val service: SeradataSigintPayloadService,
    private val params: SeradataSigintPayloadListParams,
    private val items: List<SeradataSigintPayloadListResponse>,

) : Page<SeradataSigintPayloadListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataSigintPayloadListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SeradataSigintPayloadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeradataSigintPayloadListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeradataSigintPayloadListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataSigintPayloadListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeradataSigintPayloadListPage].
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

    /** A builder for [SeradataSigintPayloadListPage]. */
    class Builder internal constructor() {

        private var service: SeradataSigintPayloadService? = null
        private var params: SeradataSigintPayloadListParams? = null
        private var items: List<SeradataSigintPayloadListResponse>? = null

        @JvmSynthetic
        internal fun from(seradataSigintPayloadListPage: SeradataSigintPayloadListPage) =
            apply {
                service = seradataSigintPayloadListPage.service
                params = seradataSigintPayloadListPage.params
                items = seradataSigintPayloadListPage.items
            }

        fun service(service: SeradataSigintPayloadService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataSigintPayloadListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataSigintPayloadListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SeradataSigintPayloadListPage].
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
        fun build(): SeradataSigintPayloadListPage =
            SeradataSigintPayloadListPage(
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

      return /* spotless:off */ other is SeradataSigintPayloadListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SeradataSigintPayloadListPage{service=$service, params=$params, items=$items}"
}
