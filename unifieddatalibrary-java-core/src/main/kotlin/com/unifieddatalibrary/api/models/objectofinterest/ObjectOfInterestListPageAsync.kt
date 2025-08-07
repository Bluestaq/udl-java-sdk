// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.objectofinterest

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ObjectOfInterestServiceAsync.list */
class ObjectOfInterestListPageAsync
private constructor(
    private val service: ObjectOfInterestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ObjectOfInterestListParams,
    private val items: List<ObjectOfInterestListResponse>,
) : PageAsync<ObjectOfInterestListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ObjectOfInterestListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ObjectOfInterestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ObjectOfInterestListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ObjectOfInterestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ObjectOfInterestListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ObjectOfInterestListPageAsync].
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

    /** A builder for [ObjectOfInterestListPageAsync]. */
    class Builder internal constructor() {

        private var service: ObjectOfInterestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ObjectOfInterestListParams? = null
        private var items: List<ObjectOfInterestListResponse>? = null

        @JvmSynthetic
        internal fun from(objectOfInterestListPageAsync: ObjectOfInterestListPageAsync) = apply {
            service = objectOfInterestListPageAsync.service
            streamHandlerExecutor = objectOfInterestListPageAsync.streamHandlerExecutor
            params = objectOfInterestListPageAsync.params
            items = objectOfInterestListPageAsync.items
        }

        fun service(service: ObjectOfInterestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ObjectOfInterestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ObjectOfInterestListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ObjectOfInterestListPageAsync].
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
        fun build(): ObjectOfInterestListPageAsync =
            ObjectOfInterestListPageAsync(
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

        return /* spotless:off */ other is ObjectOfInterestListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "ObjectOfInterestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
