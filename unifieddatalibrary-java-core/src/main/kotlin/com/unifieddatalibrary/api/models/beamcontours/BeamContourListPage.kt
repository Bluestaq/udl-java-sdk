// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.BeamContourService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see BeamContourService.list */
class BeamContourListPage
private constructor(
    private val service: BeamContourService,
    private val params: BeamContourListParams,
    private val items: List<BeamcontourAbridged>,
) : Page<BeamcontourAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BeamContourListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): BeamContourListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BeamcontourAbridged> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BeamContourListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BeamcontourAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeamContourListPage].
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

    /** A builder for [BeamContourListPage]. */
    class Builder internal constructor() {

        private var service: BeamContourService? = null
        private var params: BeamContourListParams? = null
        private var items: List<BeamcontourAbridged>? = null

        @JvmSynthetic
        internal fun from(beamContourListPage: BeamContourListPage) = apply {
            service = beamContourListPage.service
            params = beamContourListPage.params
            items = beamContourListPage.items
        }

        fun service(service: BeamContourService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BeamContourListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BeamcontourAbridged>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BeamContourListPage].
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
        fun build(): BeamContourListPage =
            BeamContourListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BeamContourListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "BeamContourListPage{service=$service, params=$params, items=$items}"
}
