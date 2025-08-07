// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.ionoobservation.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.ionoobservation.HistoryServiceAsyncImpl
import java.util.function.Consumer

class IonoObservationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IonoObservationServiceAsync {

    private val withRawResponse: IonoObservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IonoObservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): IonoObservationServiceAsync =
        IonoObservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IonoObservationServiceAsync.WithRawResponse {

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IonoObservationServiceAsync.WithRawResponse =
            IonoObservationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history
    }
}
