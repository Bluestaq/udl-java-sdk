// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.scs.V2Service
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see V2Service.list */
class V2ListPage
private constructor(
    private val service: V2Service,
    private val params: V2ListParams,
    private val items: List<ScsEntity>,
) : Page<ScsEntity> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): V2ListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): V2ListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ScsEntity> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): V2ListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ScsEntity> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2ListPage].
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

    /** A builder for [V2ListPage]. */
    class Builder internal constructor() {

        private var service: V2Service? = null
        private var params: V2ListParams? = null
        private var items: List<ScsEntity>? = null

        @JvmSynthetic
        internal fun from(v2ListPage: V2ListPage) = apply {
            service = v2ListPage.service
            params = v2ListPage.params
            items = v2ListPage.items
        }

        fun service(service: V2Service) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: V2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ScsEntity>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [V2ListPage].
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
        fun build(): V2ListPage =
            V2ListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2ListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "V2ListPage{service=$service, params=$params, items=$items}"
}
