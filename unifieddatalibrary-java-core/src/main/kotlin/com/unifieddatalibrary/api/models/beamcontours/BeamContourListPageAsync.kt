// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see BeamContourServiceAsync.list */
class BeamContourListPageAsync
private constructor(
    private val service: BeamContourServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BeamContourListParams,
    private val items: List<BeamcontourAbridged>,
) : PageAsync<BeamcontourAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BeamContourListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<BeamContourListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BeamcontourAbridged> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BeamContourListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BeamcontourAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeamContourListPageAsync].
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

    /** A builder for [BeamContourListPageAsync]. */
    class Builder internal constructor() {

        private var service: BeamContourServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BeamContourListParams? = null
        private var items: List<BeamcontourAbridged>? = null

        @JvmSynthetic
        internal fun from(beamContourListPageAsync: BeamContourListPageAsync) = apply {
            service = beamContourListPageAsync.service
            streamHandlerExecutor = beamContourListPageAsync.streamHandlerExecutor
            params = beamContourListPageAsync.params
            items = beamContourListPageAsync.items
        }

        fun service(service: BeamContourServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BeamContourListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BeamcontourAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BeamContourListPageAsync].
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
        fun build(): BeamContourListPageAsync =
            BeamContourListPageAsync(
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

        return other is BeamContourListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "BeamContourListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
