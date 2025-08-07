// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.gnssrawif.HistoryService
import com.unifieddatalibrary.api.services.blocking.gnssrawif.HistoryServiceImpl
import java.util.function.Consumer

class GnssRawIfServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GnssRawIfService {

    private val withRawResponse: GnssRawIfService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GnssRawIfService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfService =
        GnssRawIfServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GnssRawIfService.WithRawResponse {

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GnssRawIfService.WithRawResponse =
            GnssRawIfServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history
    }
}
