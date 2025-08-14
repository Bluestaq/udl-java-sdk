// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.objectofinterest

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.ObjectOfInterestService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ObjectOfInterestService.list */
class ObjectOfInterestListPage
private constructor(
    private val service: ObjectOfInterestService,
    private val params: ObjectOfInterestListParams,
    private val items: List<ObjectOfInterestListResponse>,
) : Page<ObjectOfInterestListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ObjectOfInterestListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): ObjectOfInterestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ObjectOfInterestListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ObjectOfInterestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ObjectOfInterestListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObjectOfInterestListPage].
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

    /** A builder for [ObjectOfInterestListPage]. */
    class Builder internal constructor() {

        private var service: ObjectOfInterestService? = null
        private var params: ObjectOfInterestListParams? = null
        private var items: List<ObjectOfInterestListResponse>? = null

        @JvmSynthetic
        internal fun from(objectOfInterestListPage: ObjectOfInterestListPage) = apply {
            service = objectOfInterestListPage.service
            params = objectOfInterestListPage.params
            items = objectOfInterestListPage.items
        }

        fun service(service: ObjectOfInterestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ObjectOfInterestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ObjectOfInterestListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ObjectOfInterestListPage].
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
        fun build(): ObjectOfInterestListPage =
            ObjectOfInterestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectOfInterestListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "ObjectOfInterestListPage{service=$service, params=$params, items=$items}"
}
