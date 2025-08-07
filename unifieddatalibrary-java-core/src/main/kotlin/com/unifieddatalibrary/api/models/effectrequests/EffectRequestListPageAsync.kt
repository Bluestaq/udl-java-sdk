// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EffectRequestServiceAsync.list */
class EffectRequestListPageAsync
private constructor(
    private val service: EffectRequestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EffectRequestListParams,
    private val items: List<EffectRequestListResponse>,
) : PageAsync<EffectRequestListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EffectRequestListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<EffectRequestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EffectRequestListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EffectRequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EffectRequestListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EffectRequestListPageAsync].
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

    /** A builder for [EffectRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: EffectRequestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EffectRequestListParams? = null
        private var items: List<EffectRequestListResponse>? = null

        @JvmSynthetic
        internal fun from(effectRequestListPageAsync: EffectRequestListPageAsync) = apply {
            service = effectRequestListPageAsync.service
            streamHandlerExecutor = effectRequestListPageAsync.streamHandlerExecutor
            params = effectRequestListPageAsync.params
            items = effectRequestListPageAsync.items
        }

        fun service(service: EffectRequestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EffectRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EffectRequestListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EffectRequestListPageAsync].
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
        fun build(): EffectRequestListPageAsync =
            EffectRequestListPageAsync(
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

        return /* spotless:off */ other is EffectRequestListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "EffectRequestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
