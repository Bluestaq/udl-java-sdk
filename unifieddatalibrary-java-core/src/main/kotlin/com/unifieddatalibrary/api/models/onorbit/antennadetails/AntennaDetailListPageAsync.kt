// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit.antennadetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.onorbit.AntennaDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AntennaDetailServiceAsync.list */
class AntennaDetailListPageAsync
private constructor(
    private val service: AntennaDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AntennaDetailListParams,
    private val items: List<AntennaDetailsAbridged>,
) : PageAsync<AntennaDetailsAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AntennaDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AntennaDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AntennaDetailsAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AntennaDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AntennaDetailsAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AntennaDetailListPageAsync].
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

    /** A builder for [AntennaDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: AntennaDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AntennaDetailListParams? = null
        private var items: List<AntennaDetailsAbridged>? = null

        @JvmSynthetic
        internal fun from(antennaDetailListPageAsync: AntennaDetailListPageAsync) = apply {
            service = antennaDetailListPageAsync.service
            streamHandlerExecutor = antennaDetailListPageAsync.streamHandlerExecutor
            params = antennaDetailListPageAsync.params
            items = antennaDetailListPageAsync.items
        }

        fun service(service: AntennaDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AntennaDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AntennaDetailsAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AntennaDetailListPageAsync].
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
        fun build(): AntennaDetailListPageAsync =
            AntennaDetailListPageAsync(
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

        return /* spotless:off */ other is AntennaDetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "AntennaDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
