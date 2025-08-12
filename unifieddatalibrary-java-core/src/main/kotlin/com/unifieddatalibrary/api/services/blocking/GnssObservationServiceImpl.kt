// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.GnssObservationService
import com.unifieddatalibrary.api.services.blocking.GnssObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.gnssobservations.HistoryService
import com.unifieddatalibrary.api.services.blocking.gnssobservations.HistoryServiceImpl
import java.util.function.Consumer

class GnssObservationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GnssObservationService {

    private val withRawResponse: GnssObservationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GnssObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationService = GnssObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GnssObservationService.WithRawResponse {

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationService.WithRawResponse = GnssObservationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history
    }
}
