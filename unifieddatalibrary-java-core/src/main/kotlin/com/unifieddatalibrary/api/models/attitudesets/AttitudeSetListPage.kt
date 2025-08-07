// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.attitudesets

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.AttitudeSetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AttitudeSetService.list */
class AttitudeSetListPage
private constructor(
    private val service: AttitudeSetService,
    private val params: AttitudeSetListParams,
    private val items: List<AttitudesetAbridged>,
) : Page<AttitudesetAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AttitudeSetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): AttitudeSetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AttitudesetAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AttitudeSetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AttitudesetAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttitudeSetListPage].
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

    /** A builder for [AttitudeSetListPage]. */
    class Builder internal constructor() {

        private var service: AttitudeSetService? = null
        private var params: AttitudeSetListParams? = null
        private var items: List<AttitudesetAbridged>? = null

        @JvmSynthetic
        internal fun from(attitudeSetListPage: AttitudeSetListPage) = apply {
            service = attitudeSetListPage.service
            params = attitudeSetListPage.params
            items = attitudeSetListPage.items
        }

        fun service(service: AttitudeSetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AttitudeSetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AttitudesetAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AttitudeSetListPage].
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
        fun build(): AttitudeSetListPage =
            AttitudeSetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AttitudeSetListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "AttitudeSetListPage{service=$service, params=$params, items=$items}"
}
