// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EffectResponseServiceAsync.list */
class EffectResponseListPageAsync
private constructor(
    private val service: EffectResponseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EffectResponseListParams,
    private val items: List<EffectResponseListResponse>,
) : PageAsync<EffectResponseListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EffectResponseListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EffectResponseListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EffectResponseListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EffectResponseListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EffectResponseListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EffectResponseListPageAsync].
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

    /** A builder for [EffectResponseListPageAsync]. */
    class Builder internal constructor() {

        private var service: EffectResponseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EffectResponseListParams? = null
        private var items: List<EffectResponseListResponse>? = null

        @JvmSynthetic
        internal fun from(effectResponseListPageAsync: EffectResponseListPageAsync) = apply {
            service = effectResponseListPageAsync.service
            streamHandlerExecutor = effectResponseListPageAsync.streamHandlerExecutor
            params = effectResponseListPageAsync.params
            items = effectResponseListPageAsync.items
        }

        fun service(service: EffectResponseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EffectResponseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EffectResponseListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EffectResponseListPageAsync].
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
        fun build(): EffectResponseListPageAsync =
            EffectResponseListPageAsync(
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

        return other is EffectResponseListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "EffectResponseListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
