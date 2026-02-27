// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.observations.EcpsdrServiceAsync
import com.unifieddatalibrary.api.services.async.observations.EcpsdrServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.MonoradarServiceAsync
import com.unifieddatalibrary.api.services.async.observations.MonoradarServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.observations.ObscorrelationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.ObscorrelationServiceAsyncImpl
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

    private val obscorrelation: ObscorrelationServiceAsync by lazy {
        ObscorrelationServiceAsyncImpl(clientOptions)
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

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun ecpsdr(): EcpsdrServiceAsync = ecpsdr

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun eoObservations(): EoObservationServiceAsync = eoObservations

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun monoradar(): MonoradarServiceAsync = monoradar

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun obscorrelation(): ObscorrelationServiceAsync = obscorrelation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun passiveRadarObservation(): PassiveRadarObservationServiceAsync =
        passiveRadarObservation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun radarobservation(): RadarobservationServiceAsync = radarobservation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun rfObservation(): RfObservationServiceAsync = rfObservation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
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

        private val obscorrelation: ObscorrelationServiceAsync.WithRawResponse by lazy {
            ObscorrelationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun ecpsdr(): EcpsdrServiceAsync.WithRawResponse = ecpsdr

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun eoObservations(): EoObservationServiceAsync.WithRawResponse = eoObservations

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun monoradar(): MonoradarServiceAsync.WithRawResponse = monoradar

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun obscorrelation(): ObscorrelationServiceAsync.WithRawResponse = obscorrelation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun passiveRadarObservation():
            PassiveRadarObservationServiceAsync.WithRawResponse = passiveRadarObservation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun radarobservation(): RadarobservationServiceAsync.WithRawResponse =
            radarobservation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun rfObservation(): RfObservationServiceAsync.WithRawResponse = rfObservation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun swir(): SwirServiceAsync.WithRawResponse = swir
    }
}
