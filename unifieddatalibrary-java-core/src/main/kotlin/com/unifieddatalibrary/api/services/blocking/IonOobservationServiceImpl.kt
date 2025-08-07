// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.ionoobservation.HistoryService
import com.unifieddatalibrary.api.services.blocking.ionoobservation.HistoryServiceImpl
import java.util.function.Consumer

class IonoObservationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IonoObservationService {

    private val withRawResponse: IonoObservationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): IonoObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IonoObservationService =
        IonoObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IonoObservationService.WithRawResponse {

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IonoObservationService.WithRawResponse =
            IonoObservationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history
    }
}
