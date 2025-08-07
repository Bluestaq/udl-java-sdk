// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.soiobservationset

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.SoiObservationSetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SoiObservationSetService.list */
class SoiObservationSetListPage
private constructor(
    private val service: SoiObservationSetService,
    private val params: SoiObservationSetListParams,
    private val items: List<SoiObservationSetListResponse>,
) : Page<SoiObservationSetListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SoiObservationSetListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): SoiObservationSetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SoiObservationSetListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SoiObservationSetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SoiObservationSetListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SoiObservationSetListPage].
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

    /** A builder for [SoiObservationSetListPage]. */
    class Builder internal constructor() {

        private var service: SoiObservationSetService? = null
        private var params: SoiObservationSetListParams? = null
        private var items: List<SoiObservationSetListResponse>? = null

        @JvmSynthetic
        internal fun from(soiObservationSetListPage: SoiObservationSetListPage) = apply {
            service = soiObservationSetListPage.service
            params = soiObservationSetListPage.params
            items = soiObservationSetListPage.items
        }

        fun service(service: SoiObservationSetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SoiObservationSetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SoiObservationSetListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SoiObservationSetListPage].
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
        fun build(): SoiObservationSetListPage =
            SoiObservationSetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SoiObservationSetListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "SoiObservationSetListPage{service=$service, params=$params, items=$items}"
}
