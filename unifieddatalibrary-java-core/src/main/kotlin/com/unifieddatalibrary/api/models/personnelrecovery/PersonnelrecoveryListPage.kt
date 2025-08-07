// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.personnelrecovery

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see PersonnelrecoveryService.list */
class PersonnelrecoveryListPage
private constructor(
    private val service: PersonnelrecoveryService,
    private val params: PersonnelrecoveryListParams,
    private val items: List<PersonnelrecoveryListResponse>,
) : Page<PersonnelrecoveryListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PersonnelrecoveryListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): PersonnelrecoveryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PersonnelrecoveryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PersonnelrecoveryListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PersonnelrecoveryListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PersonnelrecoveryListPage].
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

    /** A builder for [PersonnelrecoveryListPage]. */
    class Builder internal constructor() {

        private var service: PersonnelrecoveryService? = null
        private var params: PersonnelrecoveryListParams? = null
        private var items: List<PersonnelrecoveryListResponse>? = null

        @JvmSynthetic
        internal fun from(personnelrecoveryListPage: PersonnelrecoveryListPage) = apply {
            service = personnelrecoveryListPage.service
            params = personnelrecoveryListPage.params
            items = personnelrecoveryListPage.items
        }

        fun service(service: PersonnelrecoveryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PersonnelrecoveryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PersonnelrecoveryListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PersonnelrecoveryListPage].
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
        fun build(): PersonnelrecoveryListPage =
            PersonnelrecoveryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PersonnelrecoveryListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "PersonnelrecoveryListPage{service=$service, params=$params, items=$items}"
}
