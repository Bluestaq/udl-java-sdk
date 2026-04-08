// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.video

import com.unifieddatalibrary.api.core.ClientOptions
import java.util.function.Consumer

class HistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService =
        HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryService.WithRawResponse =
            HistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
