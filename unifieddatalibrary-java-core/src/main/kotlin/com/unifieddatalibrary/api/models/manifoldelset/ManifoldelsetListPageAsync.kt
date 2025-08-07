// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ManifoldelsetServiceAsync.list */
class ManifoldelsetListPageAsync
private constructor(
    private val service: ManifoldelsetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ManifoldelsetListParams,
    private val items: List<ManifoldelsetListResponse>,
) : PageAsync<ManifoldelsetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManifoldelsetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ManifoldelsetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ManifoldelsetListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ManifoldelsetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ManifoldelsetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManifoldelsetListPageAsync].
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

    /** A builder for [ManifoldelsetListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManifoldelsetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ManifoldelsetListParams? = null
        private var items: List<ManifoldelsetListResponse>? = null

        @JvmSynthetic
        internal fun from(manifoldelsetListPageAsync: ManifoldelsetListPageAsync) = apply {
            service = manifoldelsetListPageAsync.service
            streamHandlerExecutor = manifoldelsetListPageAsync.streamHandlerExecutor
            params = manifoldelsetListPageAsync.params
            items = manifoldelsetListPageAsync.items
        }

        fun service(service: ManifoldelsetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ManifoldelsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ManifoldelsetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ManifoldelsetListPageAsync].
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
        fun build(): ManifoldelsetListPageAsync =
            ManifoldelsetListPageAsync(
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

        return /* spotless:off */ other is ManifoldelsetListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "ManifoldelsetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
