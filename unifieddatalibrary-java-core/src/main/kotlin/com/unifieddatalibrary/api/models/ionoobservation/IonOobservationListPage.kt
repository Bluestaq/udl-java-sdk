// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservation

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.IonOobservationService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see IonOobservationService.list */
class IonOobservationListPage
private constructor(
    private val service: IonOobservationService,
    private val params: IonOobservationListParams,
    private val items: List<IonOobservationListResponse>,
) : Page<IonOobservationListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IonOobservationListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): IonOobservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IonOobservationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IonOobservationListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IonOobservationListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IonOobservationListPage].
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

    /** A builder for [IonOobservationListPage]. */
    class Builder internal constructor() {

        private var service: IonOobservationService? = null
        private var params: IonOobservationListParams? = null
        private var items: List<IonOobservationListResponse>? = null

        @JvmSynthetic
        internal fun from(ionOobservationListPage: IonOobservationListPage) = apply {
            service = ionOobservationListPage.service
            params = ionOobservationListPage.params
            items = ionOobservationListPage.items
        }

        fun service(service: IonOobservationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IonOobservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IonOobservationListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IonOobservationListPage].
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
        fun build(): IonOobservationListPage =
            IonOobservationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IonOobservationListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "IonOobservationListPage{service=$service, params=$params, items=$items}"
}
