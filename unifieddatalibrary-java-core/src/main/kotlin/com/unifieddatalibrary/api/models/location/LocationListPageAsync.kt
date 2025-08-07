// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.location

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.LocationAbridged
import com.unifieddatalibrary.api.services.async.LocationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see LocationServiceAsync.list */
class LocationListPageAsync
private constructor(
    private val service: LocationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LocationListParams,
    private val items: List<LocationAbridged>,
) : PageAsync<LocationAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LocationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<LocationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LocationAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LocationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LocationAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LocationListPageAsync].
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

    /** A builder for [LocationListPageAsync]. */
    class Builder internal constructor() {

        private var service: LocationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LocationListParams? = null
        private var items: List<LocationAbridged>? = null

        @JvmSynthetic
        internal fun from(locationListPageAsync: LocationListPageAsync) = apply {
            service = locationListPageAsync.service
            streamHandlerExecutor = locationListPageAsync.streamHandlerExecutor
            params = locationListPageAsync.params
            items = locationListPageAsync.items
        }

        fun service(service: LocationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LocationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<LocationAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LocationListPageAsync].
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
        fun build(): LocationListPageAsync =
            LocationListPageAsync(
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

        return /* spotless:off */ other is LocationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "LocationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
