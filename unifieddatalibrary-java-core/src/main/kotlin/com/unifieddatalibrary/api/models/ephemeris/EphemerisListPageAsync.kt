// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EphemerisServiceAsync.list */
class EphemerisListPageAsync
private constructor(
    private val service: EphemerisServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EphemerisListParams,
    private val items: List<EphemerisAbridged>,
) : PageAsync<EphemerisAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EphemerisListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EphemerisListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EphemerisAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EphemerisListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EphemerisAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemerisListPageAsync].
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

    /** A builder for [EphemerisListPageAsync]. */
    class Builder internal constructor() {

        private var service: EphemerisServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EphemerisListParams? = null
        private var items: List<EphemerisAbridged>? = null

        @JvmSynthetic
        internal fun from(ephemerisListPageAsync: EphemerisListPageAsync) = apply {
            service = ephemerisListPageAsync.service
            streamHandlerExecutor = ephemerisListPageAsync.streamHandlerExecutor
            params = ephemerisListPageAsync.params
            items = ephemerisListPageAsync.items
        }

        fun service(service: EphemerisServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EphemerisListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EphemerisAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EphemerisListPageAsync].
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
        fun build(): EphemerisListPageAsync =
            EphemerisListPageAsync(
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

        return /* spotless:off */ other is EphemerisListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "EphemerisListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
