// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservation

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.IonOobservationServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see IonOobservationServiceAsync.list */
class IonOobservationListPageAsync
private constructor(
    private val service: IonOobservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IonOobservationListParams,
    private val items: List<IonOobservationListResponse>,
) : PageAsync<IonOobservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IonOobservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<IonOobservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IonOobservationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IonOobservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IonOobservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IonOobservationListPageAsync].
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

    /** A builder for [IonOobservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: IonOobservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IonOobservationListParams? = null
        private var items: List<IonOobservationListResponse>? = null

        @JvmSynthetic
        internal fun from(ionOobservationListPageAsync: IonOobservationListPageAsync) = apply {
            service = ionOobservationListPageAsync.service
            streamHandlerExecutor = ionOobservationListPageAsync.streamHandlerExecutor
            params = ionOobservationListPageAsync.params
            items = ionOobservationListPageAsync.items
        }

        fun service(service: IonOobservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IonOobservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IonOobservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IonOobservationListPageAsync].
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
        fun build(): IonOobservationListPageAsync =
            IonOobservationListPageAsync(
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

        return /* spotless:off */ other is IonOobservationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "IonOobservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
