// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.unifieddatalibrary.api.core.AutoPager
import com.unifieddatalibrary.api.core.Page
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.blocking.VideoService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see VideoService.list */
class VideoListPage
private constructor(
    private val service: VideoService,
    private val params: VideoListParams,
    private val items: List<VideoListResponse>,
) : Page<VideoListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): VideoListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): VideoListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VideoListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VideoListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VideoListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VideoListPage].
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

    /** A builder for [VideoListPage]. */
    class Builder internal constructor() {

        private var service: VideoService? = null
        private var params: VideoListParams? = null
        private var items: List<VideoListResponse>? = null

        @JvmSynthetic
        internal fun from(videoListPage: VideoListPage) = apply {
            service = videoListPage.service
            params = videoListPage.params
            items = videoListPage.items
        }

        fun service(service: VideoService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VideoListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<VideoListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VideoListPage].
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
        fun build(): VideoListPage =
            VideoListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VideoListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "VideoListPage{service=$service, params=$params, items=$items}"
}
