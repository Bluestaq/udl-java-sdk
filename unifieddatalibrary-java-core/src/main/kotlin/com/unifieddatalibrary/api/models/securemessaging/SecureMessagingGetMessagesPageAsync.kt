// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.securemessaging

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SecureMessagingServiceAsync.getMessages */
class SecureMessagingGetMessagesPageAsync
private constructor(
    private val service: SecureMessagingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SecureMessagingGetMessagesParams,
    private val headers: Headers,
    private val items: List<Any>,
) : PageAsync<Any> {

    fun nextOffset(): Optional<Long> =
        Optional.ofNullable(headers.values("KAFKA_NEXT_OFFSET").firstOrNull()?.toLongOrNull())

    override fun hasNextPage(): Boolean = nextOffset().isPresent

    fun nextPageParams(): SecureMessagingGetMessagesParams {
        val nextOffset =
            nextOffset().getOrNull() ?: throw IllegalStateException("No next page available")
        return params.toBuilder().offset(nextOffset).build()
    }

    override fun nextPage(): CompletableFuture<SecureMessagingGetMessagesPageAsync> =
        service.getMessages(nextPageParams())

    fun autoPager(): AutoPagerAsync<Any> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SecureMessagingGetMessagesParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Any> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SecureMessagingGetMessagesPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecureMessagingGetMessagesPageAsync]. */
    class Builder internal constructor() {

        private var service: SecureMessagingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SecureMessagingGetMessagesParams? = null
        private var headers: Headers? = null
        private var items: List<Any>? = null

        @JvmSynthetic
        internal fun from(page: SecureMessagingGetMessagesPageAsync) = apply {
            service = page.service
            streamHandlerExecutor = page.streamHandlerExecutor
            params = page.params
            headers = page.headers
            items = page.items
        }

        fun service(service: SecureMessagingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SecureMessagingGetMessagesParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Any>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SecureMessagingGetMessagesPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SecureMessagingGetMessagesPageAsync =
            SecureMessagingGetMessagesPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SecureMessagingGetMessagesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */
        Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "SecureMessagingGetMessagesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
