// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.personnelrecovery

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see PersonnelrecoveryServiceAsync.list */
class PersonnelrecoveryListPageAsync
private constructor(
    private val service: PersonnelrecoveryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PersonnelrecoveryListParams,
    private val items: List<PersonnelrecoveryListResponse>,
) : PageAsync<PersonnelrecoveryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PersonnelrecoveryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<PersonnelrecoveryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PersonnelrecoveryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PersonnelrecoveryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PersonnelrecoveryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PersonnelrecoveryListPageAsync].
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

    /** A builder for [PersonnelrecoveryListPageAsync]. */
    class Builder internal constructor() {

        private var service: PersonnelrecoveryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PersonnelrecoveryListParams? = null
        private var items: List<PersonnelrecoveryListResponse>? = null

        @JvmSynthetic
        internal fun from(personnelrecoveryListPageAsync: PersonnelrecoveryListPageAsync) = apply {
            service = personnelrecoveryListPageAsync.service
            streamHandlerExecutor = personnelrecoveryListPageAsync.streamHandlerExecutor
            params = personnelrecoveryListPageAsync.params
            items = personnelrecoveryListPageAsync.items
        }

        fun service(service: PersonnelrecoveryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PersonnelrecoveryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PersonnelrecoveryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PersonnelrecoveryListPageAsync].
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
        fun build(): PersonnelrecoveryListPageAsync =
            PersonnelrecoveryListPageAsync(
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

        return other is PersonnelrecoveryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "PersonnelrecoveryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
