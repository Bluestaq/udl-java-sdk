// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.video.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.video.HistoryServiceAsyncImpl
import java.util.function.Consumer

class VideoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoServiceAsync {

    private val withRawResponse: VideoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VideoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoServiceAsync =
        VideoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoServiceAsync.WithRawResponse {

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoServiceAsync.WithRawResponse =
            VideoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history
    }
}
