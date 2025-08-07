// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beam

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see BeamServiceAsync.list */
class BeamListPageAsync
private constructor(
    private val service: BeamServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BeamListParams,
    private val items: List<BeamAbridged>,
) : PageAsync<BeamAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BeamListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<BeamListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BeamAbridged> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BeamListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BeamAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeamListPageAsync].
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

    /** A builder for [BeamListPageAsync]. */
    class Builder internal constructor() {

        private var service: BeamServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BeamListParams? = null
        private var items: List<BeamAbridged>? = null

        @JvmSynthetic
        internal fun from(beamListPageAsync: BeamListPageAsync) = apply {
            service = beamListPageAsync.service
            streamHandlerExecutor = beamListPageAsync.streamHandlerExecutor
            params = beamListPageAsync.params
            items = beamListPageAsync.items
        }

        fun service(service: BeamServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BeamListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BeamAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BeamListPageAsync].
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
        fun build(): BeamListPageAsync =
            BeamListPageAsync(
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

        return /* spotless:off */ other is BeamListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "BeamListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
