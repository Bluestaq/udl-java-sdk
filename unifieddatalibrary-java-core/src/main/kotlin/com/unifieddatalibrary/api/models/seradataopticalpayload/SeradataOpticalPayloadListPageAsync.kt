// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataOpticalPayloadServiceAsync.list */
class SeradataOpticalPayloadListPageAsync
private constructor(
    private val service: SeradataOpticalPayloadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeradataOpticalPayloadListParams,
    private val items: List<SeradataOpticalPayloadListResponse>,
) : PageAsync<SeradataOpticalPayloadListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataOpticalPayloadListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SeradataOpticalPayloadListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeradataOpticalPayloadListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SeradataOpticalPayloadListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataOpticalPayloadListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeradataOpticalPayloadListPageAsync].
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

    /** A builder for [SeradataOpticalPayloadListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeradataOpticalPayloadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeradataOpticalPayloadListParams? = null
        private var items: List<SeradataOpticalPayloadListResponse>? = null

        @JvmSynthetic
        internal fun from(
            seradataOpticalPayloadListPageAsync: SeradataOpticalPayloadListPageAsync
        ) = apply {
            service = seradataOpticalPayloadListPageAsync.service
            streamHandlerExecutor = seradataOpticalPayloadListPageAsync.streamHandlerExecutor
            params = seradataOpticalPayloadListPageAsync.params
            items = seradataOpticalPayloadListPageAsync.items
        }

        fun service(service: SeradataOpticalPayloadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataOpticalPayloadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataOpticalPayloadListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeradataOpticalPayloadListPageAsync].
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
        fun build(): SeradataOpticalPayloadListPageAsync =
            SeradataOpticalPayloadListPageAsync(
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

        return other is SeradataOpticalPayloadListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SeradataOpticalPayloadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
