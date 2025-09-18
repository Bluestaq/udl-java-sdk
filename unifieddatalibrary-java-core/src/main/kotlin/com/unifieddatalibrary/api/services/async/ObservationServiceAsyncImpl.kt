// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.observations.EcpsdrServiceAsync
import com.unifieddatalibrary.api.services.async.observations.EcpsdrServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.MonoradarServiceAsync
import com.unifieddatalibrary.api.services.async.observations.MonoradarServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.PassiveRadarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.PassiveRadarObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.RadarobservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.RadarobservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.RfObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.RfObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.observations.SwirServiceAsyncImpl
import java.util.function.Consumer

class ObservationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObservationServiceAsync {

    private val withRawResponse: ObservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ecpsdr: EcpsdrServiceAsync by lazy { EcpsdrServiceAsyncImpl(clientOptions) }

    private val eoObservations: EoObservationServiceAsync by lazy {
        EoObservationServiceAsyncImpl(clientOptions)
    }

    private val monoradar: MonoradarServiceAsync by lazy {
        MonoradarServiceAsyncImpl(clientOptions)
    }

    private val passiveRadarObservation: PassiveRadarObservationServiceAsync by lazy {
        PassiveRadarObservationServiceAsyncImpl(clientOptions)
    }

    private val radarobservation: RadarobservationServiceAsync by lazy {
        RadarobservationServiceAsyncImpl(clientOptions)
    }

    private val rfObservation: RfObservationServiceAsync by lazy {
        RfObservationServiceAsyncImpl(clientOptions)
    }

    private val swir: SwirServiceAsync by lazy { SwirServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ObservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationServiceAsync =
        ObservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ecpsdr(): EcpsdrServiceAsync = ecpsdr

    override fun eoObservations(): EoObservationServiceAsync = eoObservations

    override fun monoradar(): MonoradarServiceAsync = monoradar

    override fun passiveRadarObservation(): PassiveRadarObservationServiceAsync =
        passiveRadarObservation

    override fun radarobservation(): RadarobservationServiceAsync = radarobservation

    override fun rfObservation(): RfObservationServiceAsync = rfObservation

    override fun swir(): SwirServiceAsync = swir

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObservationServiceAsync.WithRawResponse {

        private val ecpsdr: EcpsdrServiceAsync.WithRawResponse by lazy {
            EcpsdrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eoObservations: EoObservationServiceAsync.WithRawResponse by lazy {
            EoObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val monoradar: MonoradarServiceAsync.WithRawResponse by lazy {
            MonoradarServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val passiveRadarObservation:
            PassiveRadarObservationServiceAsync.WithRawResponse by lazy {
            PassiveRadarObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val radarobservation: RadarobservationServiceAsync.WithRawResponse by lazy {
            RadarobservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfObservation: RfObservationServiceAsync.WithRawResponse by lazy {
            RfObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val swir: SwirServiceAsync.WithRawResponse by lazy {
            SwirServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationServiceAsync.WithRawResponse =
            ObservationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ecpsdr(): EcpsdrServiceAsync.WithRawResponse = ecpsdr

        override fun eoObservations(): EoObservationServiceAsync.WithRawResponse = eoObservations

        override fun monoradar(): MonoradarServiceAsync.WithRawResponse = monoradar

        override fun passiveRadarObservation():
            PassiveRadarObservationServiceAsync.WithRawResponse = passiveRadarObservation

        override fun radarobservation(): RadarobservationServiceAsync.WithRawResponse =
            radarobservation

        override fun rfObservation(): RfObservationServiceAsync.WithRawResponse = rfObservation

        override fun swir(): SwirServiceAsync.WithRawResponse = swir
    }
}
