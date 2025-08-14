// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see V2ServiceAsync.list */
class V2ListPageAsync
private constructor(
    private val service: V2ServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: V2ListParams,
    private val items: List<ScsEntity>,
) : PageAsync<ScsEntity> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): V2ListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<V2ListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ScsEntity> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): V2ListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ScsEntity> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2ListPageAsync].
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

    /** A builder for [V2ListPageAsync]. */
    class Builder internal constructor() {

        private var service: V2ServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: V2ListParams? = null
        private var items: List<ScsEntity>? = null

        @JvmSynthetic
        internal fun from(v2ListPageAsync: V2ListPageAsync) = apply {
            service = v2ListPageAsync.service
            streamHandlerExecutor = v2ListPageAsync.streamHandlerExecutor
            params = v2ListPageAsync.params
            items = v2ListPageAsync.items
        }

        fun service(service: V2ServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: V2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ScsEntity>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [V2ListPageAsync].
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
        fun build(): V2ListPageAsync =
            V2ListPageAsync(
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

        return other is V2ListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "V2ListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
