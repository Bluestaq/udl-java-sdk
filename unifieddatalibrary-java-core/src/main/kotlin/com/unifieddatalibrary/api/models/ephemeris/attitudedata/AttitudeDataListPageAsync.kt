// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris.attitudedata

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ephemeris.AttitudeDataServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AttitudeDataServiceAsync.list */
class AttitudeDataListPageAsync
private constructor(
    private val service: AttitudeDataServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AttitudeDataListParams,
    private val items: List<AttitudeDataAbridged>,
) : PageAsync<AttitudeDataAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AttitudeDataListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AttitudeDataListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AttitudeDataAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AttitudeDataListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AttitudeDataAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttitudeDataListPageAsync].
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

    /** A builder for [AttitudeDataListPageAsync]. */
    class Builder internal constructor() {

        private var service: AttitudeDataServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AttitudeDataListParams? = null
        private var items: List<AttitudeDataAbridged>? = null

        @JvmSynthetic
        internal fun from(attitudeDataListPageAsync: AttitudeDataListPageAsync) = apply {
            service = attitudeDataListPageAsync.service
            streamHandlerExecutor = attitudeDataListPageAsync.streamHandlerExecutor
            params = attitudeDataListPageAsync.params
            items = attitudeDataListPageAsync.items
        }

        fun service(service: AttitudeDataServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AttitudeDataListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AttitudeDataAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AttitudeDataListPageAsync].
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
        fun build(): AttitudeDataListPageAsync =
            AttitudeDataListPageAsync(
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

        return other is AttitudeDataListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AttitudeDataListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
