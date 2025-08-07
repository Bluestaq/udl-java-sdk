// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.channels

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ChannelServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ChannelServiceAsync.list */
class ChannelListPageAsync
private constructor(
    private val service: ChannelServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ChannelListParams,
    private val items: List<ChannelAbridged>,
) : PageAsync<ChannelAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ChannelListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ChannelListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ChannelAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ChannelListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ChannelAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelListPageAsync]. */
    class Builder internal constructor() {

        private var service: ChannelServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ChannelListParams? = null
        private var items: List<ChannelAbridged>? = null

        @JvmSynthetic
        internal fun from(channelListPageAsync: ChannelListPageAsync) = apply {
            service = channelListPageAsync.service
            streamHandlerExecutor = channelListPageAsync.streamHandlerExecutor
            params = channelListPageAsync.params
            items = channelListPageAsync.items
        }

        fun service(service: ChannelServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ChannelAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ChannelListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelListPageAsync =
            ChannelListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChannelListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "ChannelListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
