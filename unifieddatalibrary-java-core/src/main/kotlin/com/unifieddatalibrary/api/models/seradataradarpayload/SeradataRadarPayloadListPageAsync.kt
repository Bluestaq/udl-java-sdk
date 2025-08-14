// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataradarpayload

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataRadarPayloadServiceAsync.list */
class SeradataRadarPayloadListPageAsync
private constructor(
    private val service: SeradataRadarPayloadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeradataRadarPayloadListParams,
    private val items: List<SeradataRadarPayloadListResponse>,
) : PageAsync<SeradataRadarPayloadListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataRadarPayloadListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SeradataRadarPayloadListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeradataRadarPayloadListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SeradataRadarPayloadListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataRadarPayloadListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeradataRadarPayloadListPageAsync].
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

    /** A builder for [SeradataRadarPayloadListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeradataRadarPayloadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeradataRadarPayloadListParams? = null
        private var items: List<SeradataRadarPayloadListResponse>? = null

        @JvmSynthetic
        internal fun from(seradataRadarPayloadListPageAsync: SeradataRadarPayloadListPageAsync) =
            apply {
                service = seradataRadarPayloadListPageAsync.service
                streamHandlerExecutor = seradataRadarPayloadListPageAsync.streamHandlerExecutor
                params = seradataRadarPayloadListPageAsync.params
                items = seradataRadarPayloadListPageAsync.items
            }

        fun service(service: SeradataRadarPayloadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataRadarPayloadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataRadarPayloadListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeradataRadarPayloadListPageAsync].
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
        fun build(): SeradataRadarPayloadListPageAsync =
            SeradataRadarPayloadListPageAsync(
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

        return other is SeradataRadarPayloadListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SeradataRadarPayloadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
