// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataspacecraftdetails

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataSpacecraftDetailServiceAsync.list */
class SeradataSpacecraftDetailListPageAsync
private constructor(
    private val service: SeradataSpacecraftDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeradataSpacecraftDetailListParams,
    private val items: List<SeradataSpacecraftDetailListResponse>,
) : PageAsync<SeradataSpacecraftDetailListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataSpacecraftDetailListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SeradataSpacecraftDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeradataSpacecraftDetailListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SeradataSpacecraftDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataSpacecraftDetailListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeradataSpacecraftDetailListPageAsync].
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

    /** A builder for [SeradataSpacecraftDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeradataSpacecraftDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeradataSpacecraftDetailListParams? = null
        private var items: List<SeradataSpacecraftDetailListResponse>? = null

        @JvmSynthetic
        internal fun from(
            seradataSpacecraftDetailListPageAsync: SeradataSpacecraftDetailListPageAsync
        ) = apply {
            service = seradataSpacecraftDetailListPageAsync.service
            streamHandlerExecutor = seradataSpacecraftDetailListPageAsync.streamHandlerExecutor
            params = seradataSpacecraftDetailListPageAsync.params
            items = seradataSpacecraftDetailListPageAsync.items
        }

        fun service(service: SeradataSpacecraftDetailServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataSpacecraftDetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataSpacecraftDetailListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeradataSpacecraftDetailListPageAsync].
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
        fun build(): SeradataSpacecraftDetailListPageAsync =
            SeradataSpacecraftDetailListPageAsync(
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

        return other is SeradataSpacecraftDetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "SeradataSpacecraftDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
