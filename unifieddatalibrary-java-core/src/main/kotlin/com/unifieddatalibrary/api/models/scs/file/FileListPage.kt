// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.file

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.services.blocking.scs.FileService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see FileService.list */
@Deprecated("deprecated")
class FileListPage
private constructor(
    private val service: FileService,
    private val params: FileListParams,
    private val items: List<FileData>,
) : Page<FileData> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FileListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): FileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FileData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FileListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FileData> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileListPage].
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

    /** A builder for [FileListPage]. */
    class Builder internal constructor() {

        private var service: FileService? = null
        private var params: FileListParams? = null
        private var items: List<FileData>? = null

        @JvmSynthetic
        internal fun from(fileListPage: FileListPage) = apply {
            service = fileListPage.service
            params = fileListPage.params
            items = fileListPage.items
        }

        fun service(service: FileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FileData>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [FileListPage].
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
        fun build(): FileListPage =
            FileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "FileListPage{service=$service, params=$params, items=$items}"
}
