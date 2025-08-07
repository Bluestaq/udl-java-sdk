// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.services.async.VideoServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see VideoServiceAsync.list */
class VideoListPageAsync
private constructor(
    private val service: VideoServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VideoListParams,
    private val items: List<VideoListResponse>,
) : PageAsync<VideoListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): VideoListParams {
        val offset = params.firstResult().getOrDefault(0)
        return params.toBuilder().firstResult(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<VideoListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VideoListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VideoListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VideoListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VideoListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VideoListPageAsync]. */
    class Builder internal constructor() {

        private var service: VideoServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VideoListParams? = null
        private var items: List<VideoListResponse>? = null

        @JvmSynthetic
        internal fun from(videoListPageAsync: VideoListPageAsync) = apply {
            service = videoListPageAsync.service
            streamHandlerExecutor = videoListPageAsync.streamHandlerExecutor
            params = videoListPageAsync.params
            items = videoListPageAsync.items
        }

        fun service(service: VideoServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VideoListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<VideoListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VideoListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VideoListPageAsync =
            VideoListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VideoListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "VideoListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
