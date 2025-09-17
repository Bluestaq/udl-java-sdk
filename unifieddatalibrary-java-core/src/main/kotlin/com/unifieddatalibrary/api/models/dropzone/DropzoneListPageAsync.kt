// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DropzoneServiceAsync.list */
class DropzoneListPageAsync
private constructor(
    private val service: DropzoneServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DropzoneListParams,
    private val items: List<DropzoneListResponse>,
) : PageAsync<DropzoneListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DropzoneListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DropzoneListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DropzoneListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DropzoneListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DropzoneListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DropzoneListPageAsync].
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

    /** A builder for [DropzoneListPageAsync]. */
    class Builder internal constructor() {

        private var service: DropzoneServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DropzoneListParams? = null
        private var items: List<DropzoneListResponse>? = null

        @JvmSynthetic
        internal fun from(dropzoneListPageAsync: DropzoneListPageAsync) = apply {
            service = dropzoneListPageAsync.service
            streamHandlerExecutor = dropzoneListPageAsync.streamHandlerExecutor
            params = dropzoneListPageAsync.params
            items = dropzoneListPageAsync.items
        }

        fun service(service: DropzoneServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DropzoneListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DropzoneListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DropzoneListPageAsync].
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
        fun build(): DropzoneListPageAsync =
            DropzoneListPageAsync(
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

        return other is DropzoneListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DropzoneListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
