// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.securemessaging

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.services.blocking.SecureMessagingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SecureMessagingService.getMessages */
class SecureMessagingGetMessagesPage
private constructor(
    private val service: SecureMessagingService,
    private val params: SecureMessagingGetMessagesParams,
    private val headers: Headers,
    private val items: List<Any>,
) : Page<Any> {

    fun nextOffset(): Optional<Long> =
        Optional.ofNullable(headers.values("KAFKA_NEXT_OFFSET").firstOrNull()?.toLongOrNull())

    override fun hasNextPage(): Boolean = nextOffset().isPresent

    fun nextPageParams(): SecureMessagingGetMessagesParams {
        val nextOffset =
            nextOffset().getOrNull() ?: throw IllegalStateException("No next page available")
        return params.toBuilder().offset(nextOffset).build()
    }

    override fun nextPage(): SecureMessagingGetMessagesPage = service.getMessages(nextPageParams())

    fun autoPager(): AutoPager<Any> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SecureMessagingGetMessagesParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Any> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SecureMessagingGetMessagesPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecureMessagingGetMessagesPage]. */
    class Builder internal constructor() {

        private var service: SecureMessagingService? = null
        private var params: SecureMessagingGetMessagesParams? = null
        private var headers: Headers? = null
        private var items: List<Any>? = null

        @JvmSynthetic
        internal fun from(page: SecureMessagingGetMessagesPage) = apply {
            service = page.service
            params = page.params
            headers = page.headers
            items = page.items
        }

        fun service(service: SecureMessagingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SecureMessagingGetMessagesParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Any>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SecureMessagingGetMessagesPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SecureMessagingGetMessagesPage =
            SecureMessagingGetMessagesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SecureMessagingGetMessagesPage &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */
        Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "SecureMessagingGetMessagesPage{service=$service, params=$params, headers=$headers, items=$items}"
}
