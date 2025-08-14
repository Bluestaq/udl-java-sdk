// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldstatus

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AirfieldStatusService.list */
class AirfieldStatusListPage
private constructor(
    private val service: AirfieldStatusService,
    private val params: AirfieldStatusListParams,
    private val items: List<AirfieldstatusAbridged>,
) : Page<AirfieldstatusAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AirfieldStatusListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AirfieldStatusListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AirfieldstatusAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AirfieldStatusListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AirfieldstatusAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AirfieldStatusListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirfieldStatusListPage]. */
    class Builder internal constructor() {

        private var service: AirfieldStatusService? = null
        private var params: AirfieldStatusListParams? = null
        private var items: List<AirfieldstatusAbridged>? = null

        @JvmSynthetic
        internal fun from(airfieldStatusListPage: AirfieldStatusListPage) = apply {
            service = airfieldStatusListPage.service
            params = airfieldStatusListPage.params
            items = airfieldStatusListPage.items
        }

        fun service(service: AirfieldStatusService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AirfieldStatusListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AirfieldstatusAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AirfieldStatusListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirfieldStatusListPage =
            AirfieldStatusListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirfieldStatusListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AirfieldStatusListPage{service=$service, params=$params, items=$items}"
}
