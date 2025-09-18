// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.DropzoneService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DropzoneService.list */
class DropzoneListPage
private constructor(
    private val service: DropzoneService,
    private val params: DropzoneListParams,
    private val items: List<DropzoneListResponse>,
) : Page<DropzoneListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DropzoneListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): DropzoneListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DropzoneListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DropzoneListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DropzoneListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DropzoneListPage].
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

    /** A builder for [DropzoneListPage]. */
    class Builder internal constructor() {

        private var service: DropzoneService? = null
        private var params: DropzoneListParams? = null
        private var items: List<DropzoneListResponse>? = null

        @JvmSynthetic
        internal fun from(dropzoneListPage: DropzoneListPage) = apply {
            service = dropzoneListPage.service
            params = dropzoneListPage.params
            items = dropzoneListPage.items
        }

        fun service(service: DropzoneService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DropzoneListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DropzoneListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DropzoneListPage].
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
        fun build(): DropzoneListPage =
            DropzoneListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DropzoneListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "DropzoneListPage{service=$service, params=$params, items=$items}"
}
