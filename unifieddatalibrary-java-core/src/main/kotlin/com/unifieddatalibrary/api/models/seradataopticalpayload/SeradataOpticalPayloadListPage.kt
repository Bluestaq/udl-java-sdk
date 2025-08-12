// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListResponse
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataOpticalPayloadService.list */
class SeradataOpticalPayloadListPage private constructor(
    private val service: SeradataOpticalPayloadService,
    private val params: SeradataOpticalPayloadListParams,
    private val items: List<SeradataOpticalPayloadListResponse>,

) : Page<SeradataOpticalPayloadListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataOpticalPayloadListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): SeradataOpticalPayloadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SeradataOpticalPayloadListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SeradataOpticalPayloadListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataOpticalPayloadListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SeradataOpticalPayloadListPage].
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

    /** A builder for [SeradataOpticalPayloadListPage]. */
    class Builder internal constructor() {

        private var service: SeradataOpticalPayloadService? = null
        private var params: SeradataOpticalPayloadListParams? = null
        private var items: List<SeradataOpticalPayloadListResponse>? = null

        @JvmSynthetic
        internal fun from(seradataOpticalPayloadListPage: SeradataOpticalPayloadListPage) =
            apply {
                service = seradataOpticalPayloadListPage.service
                params = seradataOpticalPayloadListPage.params
                items = seradataOpticalPayloadListPage.items
            }

        fun service(service: SeradataOpticalPayloadService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataOpticalPayloadListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataOpticalPayloadListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [SeradataOpticalPayloadListPage].
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
        fun build(): SeradataOpticalPayloadListPage =
            SeradataOpticalPayloadListPage(
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

      return /* spotless:off */ other is SeradataOpticalPayloadListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "SeradataOpticalPayloadListPage{service=$service, params=$params, items=$items}"
}
