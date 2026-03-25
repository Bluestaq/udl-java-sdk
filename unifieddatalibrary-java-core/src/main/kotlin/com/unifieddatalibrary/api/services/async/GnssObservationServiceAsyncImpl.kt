// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.gnssobservations.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.gnssobservations.HistoryServiceAsyncImpl
import java.util.function.Consumer

class GnssObservationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : GnssObservationServiceAsync {

    private val withRawResponse: GnssObservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GnssObservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GnssObservationServiceAsync =
        GnssObservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun history(): HistoryServiceAsync = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GnssObservationServiceAsync.WithRawResponse {

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GnssObservationServiceAsync.WithRawResponse =
            GnssObservationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun history(): HistoryServiceAsync.WithRawResponse = history
    }
}
