// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see SeradataSigintPayloadServiceAsync.list */
class SeradataSigintPayloadListPageAsync
private constructor(
    private val service: SeradataSigintPayloadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SeradataSigintPayloadListParams,
    private val items: List<SeradataSigintPayloadListResponse>,
) : PageAsync<SeradataSigintPayloadListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SeradataSigintPayloadListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<SeradataSigintPayloadListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SeradataSigintPayloadListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SeradataSigintPayloadListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SeradataSigintPayloadListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SeradataSigintPayloadListPageAsync].
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

    /** A builder for [SeradataSigintPayloadListPageAsync]. */
    class Builder internal constructor() {

        private var service: SeradataSigintPayloadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SeradataSigintPayloadListParams? = null
        private var items: List<SeradataSigintPayloadListResponse>? = null

        @JvmSynthetic
        internal fun from(seradataSigintPayloadListPageAsync: SeradataSigintPayloadListPageAsync) =
            apply {
                service = seradataSigintPayloadListPageAsync.service
                streamHandlerExecutor = seradataSigintPayloadListPageAsync.streamHandlerExecutor
                params = seradataSigintPayloadListPageAsync.params
                items = seradataSigintPayloadListPageAsync.items
            }

        fun service(service: SeradataSigintPayloadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SeradataSigintPayloadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SeradataSigintPayloadListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SeradataSigintPayloadListPageAsync].
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
        fun build(): SeradataSigintPayloadListPageAsync =
            SeradataSigintPayloadListPageAsync(
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

        return /* spotless:off */ other is SeradataSigintPayloadListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "SeradataSigintPayloadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
