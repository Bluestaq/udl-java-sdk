// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldstatus

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldStatusServiceAsync.list */
class AirfieldStatusListPageAsync
private constructor(
    private val service: AirfieldStatusServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AirfieldStatusListParams,
    private val items: List<AirfieldstatusAbridged>,
) : PageAsync<AirfieldstatusAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AirfieldStatusListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AirfieldstatusAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldstatusAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirfieldStatusListPageAsync].
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

    /** A builder for [AirfieldStatusListPageAsync]. */
    class Builder internal constructor() {

        private var service: AirfieldStatusServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AirfieldStatusListParams? = null
        private var items: List<AirfieldstatusAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldStatusListPageAsync: AirfieldStatusListPageAsync) = apply {
            service = airfieldStatusListPageAsync.service
            streamHandlerExecutor = airfieldStatusListPageAsync.streamHandlerExecutor
            params = airfieldStatusListPageAsync.params
            items = airfieldStatusListPageAsync.items
        }

        fun service(service: AirfieldStatusServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldstatusAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirfieldStatusListPageAsync].
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
        fun build(): AirfieldStatusListPageAsync =
            AirfieldStatusListPageAsync(
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

        return other is AirfieldStatusListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AirfieldStatusListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
