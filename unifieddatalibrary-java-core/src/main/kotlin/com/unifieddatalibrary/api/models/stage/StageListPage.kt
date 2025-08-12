// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.stage

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.stage.StageListParams
import com.unifieddatalibrary.api.models.stage.StageListResponse
import com.unifieddatalibrary.api.services.blocking.StageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see StageService.list */
class StageListPage private constructor(
    private val service: StageService,
    private val params: StageListParams,
    private val items: List<StageListResponse>,

) : Page<StageListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StageListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): StageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StageListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StageListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<StageListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StageListPage].
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

    /** A builder for [StageListPage]. */
    class Builder internal constructor() {

        private var service: StageService? = null
        private var params: StageListParams? = null
        private var items: List<StageListResponse>? = null

        @JvmSynthetic
        internal fun from(stageListPage: StageListPage) =
            apply {
                service = stageListPage.service
                params = stageListPage.params
                items = stageListPage.items
            }

        fun service(service: StageService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: StageListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<StageListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [StageListPage].
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
        fun build(): StageListPage =
            StageListPage(
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

      return /* spotless:off */ other is StageListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "StageListPage{service=$service, params=$params, items=$items}"
}
