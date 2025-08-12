// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListResponse
import com.unifieddatalibrary.api.services.blocking.EffectRequestService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see EffectRequestService.list */
class EffectRequestListPage private constructor(
    private val service: EffectRequestService,
    private val params: EffectRequestListParams,
    private val items: List<EffectRequestListResponse>,

) : Page<EffectRequestListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EffectRequestListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): EffectRequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EffectRequestListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EffectRequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EffectRequestListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EffectRequestListPage].
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

    /** A builder for [EffectRequestListPage]. */
    class Builder internal constructor() {

        private var service: EffectRequestService? = null
        private var params: EffectRequestListParams? = null
        private var items: List<EffectRequestListResponse>? = null

        @JvmSynthetic
        internal fun from(effectRequestListPage: EffectRequestListPage) =
            apply {
                service = effectRequestListPage.service
                params = effectRequestListPage.params
                items = effectRequestListPage.items
            }

        fun service(service: EffectRequestService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: EffectRequestListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<EffectRequestListResponse>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [EffectRequestListPage].
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
        fun build(): EffectRequestListPage =
            EffectRequestListPage(
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

      return /* spotless:off */ other is EffectRequestListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EffectRequestListPage{service=$service, params=$params, items=$items}"
}
