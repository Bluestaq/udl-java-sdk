// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.soiobservationset

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SoiObservationSetServiceAsync.list */
class SoiObservationSetListPageAsync
private constructor(
    private val service: SoiObservationSetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SoiObservationSetListParams,
    private val items: List<SoiObservationSetListResponse>,
) : PageAsync<SoiObservationSetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SoiObservationSetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SoiObservationSetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SoiObservationSetListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SoiObservationSetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SoiObservationSetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SoiObservationSetListPageAsync].
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

    /** A builder for [SoiObservationSetListPageAsync]. */
    class Builder internal constructor() {

        private var service: SoiObservationSetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SoiObservationSetListParams? = null
        private var items: List<SoiObservationSetListResponse>? = null

        @JvmSynthetic
        internal fun from(soiObservationSetListPageAsync: SoiObservationSetListPageAsync) = apply {
            service = soiObservationSetListPageAsync.service
            streamHandlerExecutor = soiObservationSetListPageAsync.streamHandlerExecutor
            params = soiObservationSetListPageAsync.params
            items = soiObservationSetListPageAsync.items
        }

        fun service(service: SoiObservationSetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SoiObservationSetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SoiObservationSetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SoiObservationSetListPageAsync].
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
        fun build(): SoiObservationSetListPageAsync =
            SoiObservationSetListPageAsync(
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

        return other is SoiObservationSetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SoiObservationSetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
