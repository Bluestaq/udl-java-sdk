// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.channels

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.channels.ChannelAbridged
import com.unifieddatalibrary.api.models.channels.ChannelListParams
import com.unifieddatalibrary.api.services.blocking.ChannelService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault

/** @see ChannelService.list */
class ChannelListPage private constructor(
    private val service: ChannelService,
    private val params: ChannelListParams,
    private val items: List<ChannelAbridged>,

) : Page<ChannelAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ChannelListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): ChannelListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ChannelAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ChannelListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ChannelAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelListPage].
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

    /** A builder for [ChannelListPage]. */
    class Builder internal constructor() {

        private var service: ChannelService? = null
        private var params: ChannelListParams? = null
        private var items: List<ChannelAbridged>? = null

        @JvmSynthetic
        internal fun from(channelListPage: ChannelListPage) =
            apply {
                service = channelListPage.service
                params = channelListPage.params
                items = channelListPage.items
            }

        fun service(service: ChannelService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<ChannelAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [ChannelListPage].
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
        fun build(): ChannelListPage =
            ChannelListPage(
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

      return /* spotless:off */ other is ChannelListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "ChannelListPage{service=$service, params=$params, items=$items}"
}
