// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.gnssrawif.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.gnssrawif.HistoryServiceAsyncImpl
import java.util.function.Consumer

class GnssRawIfServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GnssRawIfServiceAsync {

    private val withRawResponse: GnssRawIfServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GnssRawIfServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfServiceAsync =
        GnssRawIfServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GnssRawIfServiceAsync.WithRawResponse {

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GnssRawIfServiceAsync.WithRawResponse =
            GnssRawIfServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history
    }
}
