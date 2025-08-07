// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance.country

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.diplomaticclearance.CountryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see CountryServiceAsync.list */
class CountryListPageAsync
private constructor(
    private val service: CountryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CountryListParams,
    private val items: List<CountryListResponse>,
) : PageAsync<CountryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CountryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CountryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CountryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CountryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CountryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CountryListPageAsync].
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

    /** A builder for [CountryListPageAsync]. */
    class Builder internal constructor() {

        private var service: CountryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CountryListParams? = null
        private var items: List<CountryListResponse>? = null

        @JvmSynthetic
        internal fun from(countryListPageAsync: CountryListPageAsync) = apply {
            service = countryListPageAsync.service
            streamHandlerExecutor = countryListPageAsync.streamHandlerExecutor
            params = countryListPageAsync.params
            items = countryListPageAsync.items
        }

        fun service(service: CountryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CountryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CountryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CountryListPageAsync].
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
        fun build(): CountryListPageAsync =
            CountryListPageAsync(
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

        return /* spotless:off */ other is CountryListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "CountryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
