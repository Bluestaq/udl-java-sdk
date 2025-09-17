// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EmitterGeolocationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EmitterGeolocationService.list */
class EmitterGeolocationListPage
private constructor(
    private val service: EmitterGeolocationService,
    private val params: EmitterGeolocationListParams,
    private val items: List<EmitterGeolocationListResponse>,
) : Page<EmitterGeolocationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EmitterGeolocationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EmitterGeolocationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmitterGeolocationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmitterGeolocationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EmitterGeolocationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmitterGeolocationListPage].
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

    /** A builder for [EmitterGeolocationListPage]. */
    class Builder internal constructor() {

        private var service: EmitterGeolocationService? = null
        private var params: EmitterGeolocationListParams? = null
        private var items: List<EmitterGeolocationListResponse>? = null

        @JvmSynthetic
        internal fun from(emitterGeolocationListPage: EmitterGeolocationListPage) = apply {
            service = emitterGeolocationListPage.service
            params = emitterGeolocationListPage.params
            items = emitterGeolocationListPage.items
        }

        fun service(service: EmitterGeolocationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmitterGeolocationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EmitterGeolocationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EmitterGeolocationListPage].
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
        fun build(): EmitterGeolocationListPage =
            EmitterGeolocationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmitterGeolocationListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "EmitterGeolocationListPage{service=$service, params=$params, items=$items}"
}
