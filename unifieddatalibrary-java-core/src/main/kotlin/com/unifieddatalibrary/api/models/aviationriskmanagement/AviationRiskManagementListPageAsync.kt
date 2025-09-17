// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AviationRiskManagementServiceAsync.list */
class AviationRiskManagementListPageAsync
private constructor(
    private val service: AviationRiskManagementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AviationRiskManagementListParams,
    private val items: List<AviationRiskManagementListResponse>,
) : PageAsync<AviationRiskManagementListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AviationRiskManagementListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AviationRiskManagementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AviationRiskManagementListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AviationRiskManagementListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AviationRiskManagementListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AviationRiskManagementListPageAsync].
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

    /** A builder for [AviationRiskManagementListPageAsync]. */
    class Builder internal constructor() {

        private var service: AviationRiskManagementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AviationRiskManagementListParams? = null
        private var items: List<AviationRiskManagementListResponse>? = null

        @JvmSynthetic
        internal fun from(
            aviationRiskManagementListPageAsync: AviationRiskManagementListPageAsync
        ) = apply {
            service = aviationRiskManagementListPageAsync.service
            streamHandlerExecutor = aviationRiskManagementListPageAsync.streamHandlerExecutor
            params = aviationRiskManagementListPageAsync.params
            items = aviationRiskManagementListPageAsync.items
        }

        fun service(service: AviationRiskManagementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AviationRiskManagementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AviationRiskManagementListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AviationRiskManagementListPageAsync].
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
        fun build(): AviationRiskManagementListPageAsync =
            AviationRiskManagementListPageAsync(
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

        return other is AviationRiskManagementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AviationRiskManagementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
