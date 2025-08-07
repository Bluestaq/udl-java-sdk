// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.monoradar

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.observations.MonoradarServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see MonoradarServiceAsync.list */
class MonoradarListPageAsync
private constructor(
    private val service: MonoradarServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MonoradarListParams,
    private val items: List<MonoradarListResponse>,
) : PageAsync<MonoradarListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MonoradarListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<MonoradarListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MonoradarListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MonoradarListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<MonoradarListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MonoradarListPageAsync].
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

    /** A builder for [MonoradarListPageAsync]. */
    class Builder internal constructor() {

        private var service: MonoradarServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MonoradarListParams? = null
        private var items: List<MonoradarListResponse>? = null

        @JvmSynthetic
        internal fun from(monoradarListPageAsync: MonoradarListPageAsync) = apply {
            service = monoradarListPageAsync.service
            streamHandlerExecutor = monoradarListPageAsync.streamHandlerExecutor
            params = monoradarListPageAsync.params
            items = monoradarListPageAsync.items
        }

        fun service(service: MonoradarServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MonoradarListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<MonoradarListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [MonoradarListPageAsync].
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
        fun build(): MonoradarListPageAsync =
            MonoradarListPageAsync(
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

        return /* spotless:off */ other is MonoradarListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "MonoradarListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
