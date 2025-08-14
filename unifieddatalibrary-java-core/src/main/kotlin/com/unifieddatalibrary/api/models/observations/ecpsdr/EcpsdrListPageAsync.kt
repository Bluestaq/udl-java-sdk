// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.ecpsdr

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.EcpsdrServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EcpsdrServiceAsync.list */
class EcpsdrListPageAsync
private constructor(
    private val service: EcpsdrServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EcpsdrListParams,
    private val items: List<EcpsdrAbridged>,
) : PageAsync<EcpsdrAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EcpsdrListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EcpsdrListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EcpsdrAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EcpsdrListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EcpsdrAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EcpsdrListPageAsync].
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

    /** A builder for [EcpsdrListPageAsync]. */
    class Builder internal constructor() {

        private var service: EcpsdrServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EcpsdrListParams? = null
        private var items: List<EcpsdrAbridged>? = null

        @JvmSynthetic
        internal fun from(ecpsdrListPageAsync: EcpsdrListPageAsync) = apply {
            service = ecpsdrListPageAsync.service
            streamHandlerExecutor = ecpsdrListPageAsync.streamHandlerExecutor
            params = ecpsdrListPageAsync.params
            items = ecpsdrListPageAsync.items
        }

        fun service(service: EcpsdrServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EcpsdrListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EcpsdrAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EcpsdrListPageAsync].
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
        fun build(): EcpsdrListPageAsync =
            EcpsdrListPageAsync(
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

        return other is EcpsdrListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EcpsdrListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
