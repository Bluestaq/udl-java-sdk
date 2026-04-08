// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.video.HistoryService
import com.unifieddatalibrary.api.services.blocking.video.HistoryServiceImpl
import java.util.function.Consumer

class VideoServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoService {

    private val withRawResponse: VideoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): VideoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoService =
        VideoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoService.WithRawResponse {

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoService.WithRawResponse =
            VideoServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history
    }
}
