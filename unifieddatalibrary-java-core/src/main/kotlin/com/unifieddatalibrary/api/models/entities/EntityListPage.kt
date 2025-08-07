// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.entities

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.EntityService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see EntityService.list */
class EntityListPage
private constructor(
    private val service: EntityService,
    private val params: EntityListParams,
    private val items: List<EntityAbridged>,
) : Page<EntityAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EntityListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): EntityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntityAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntityListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EntityAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityListPage].
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

    /** A builder for [EntityListPage]. */
    class Builder internal constructor() {

        private var service: EntityService? = null
        private var params: EntityListParams? = null
        private var items: List<EntityAbridged>? = null

        @JvmSynthetic
        internal fun from(entityListPage: EntityListPage) = apply {
            service = entityListPage.service
            params = entityListPage.params
            items = entityListPage.items
        }

        fun service(service: EntityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<EntityAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EntityListPage].
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
        fun build(): EntityListPage =
            EntityListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "EntityListPage{service=$service, params=$params, items=$items}"
}
