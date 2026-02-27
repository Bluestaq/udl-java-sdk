// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.observations.EcpsdrService
import com.unifieddatalibrary.api.services.blocking.observations.EcpsdrServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationService
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarService
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.ObscorrelationService
import com.unifieddatalibrary.api.services.blocking.observations.ObscorrelationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.PassiveRadarObservationService
import com.unifieddatalibrary.api.services.blocking.observations.PassiveRadarObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.RadarobservationService
import com.unifieddatalibrary.api.services.blocking.observations.RadarobservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationService
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.SwirService
import com.unifieddatalibrary.api.services.blocking.observations.SwirServiceImpl
import java.util.function.Consumer

class ObservationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObservationService {

    private val withRawResponse: ObservationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ecpsdr: EcpsdrService by lazy { EcpsdrServiceImpl(clientOptions) }

    private val eoObservations: EoObservationService by lazy {
        EoObservationServiceImpl(clientOptions)
    }

    private val monoradar: MonoradarService by lazy { MonoradarServiceImpl(clientOptions) }

    private val obscorrelation: ObscorrelationService by lazy {
        ObscorrelationServiceImpl(clientOptions)
    }

    private val passiveRadarObservation: PassiveRadarObservationService by lazy {
        PassiveRadarObservationServiceImpl(clientOptions)
    }

    private val radarobservation: RadarobservationService by lazy {
        RadarobservationServiceImpl(clientOptions)
    }

    private val rfObservation: RfObservationService by lazy {
        RfObservationServiceImpl(clientOptions)
    }

    private val swir: SwirService by lazy { SwirServiceImpl(clientOptions) }

    override fun withRawResponse(): ObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationService =
        ObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun ecpsdr(): EcpsdrService = ecpsdr

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun eoObservations(): EoObservationService = eoObservations

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun monoradar(): MonoradarService = monoradar

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun obscorrelation(): ObscorrelationService = obscorrelation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun passiveRadarObservation(): PassiveRadarObservationService = passiveRadarObservation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun radarobservation(): RadarobservationService = radarobservation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun rfObservation(): RfObservationService = rfObservation

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun swir(): SwirService = swir

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObservationService.WithRawResponse {

        private val ecpsdr: EcpsdrService.WithRawResponse by lazy {
            EcpsdrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val eoObservations: EoObservationService.WithRawResponse by lazy {
            EoObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val monoradar: MonoradarService.WithRawResponse by lazy {
            MonoradarServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val obscorrelation: ObscorrelationService.WithRawResponse by lazy {
            ObscorrelationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val passiveRadarObservation:
            PassiveRadarObservationService.WithRawResponse by lazy {
            PassiveRadarObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val radarobservation: RadarobservationService.WithRawResponse by lazy {
            RadarobservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfObservation: RfObservationService.WithRawResponse by lazy {
            RfObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val swir: SwirService.WithRawResponse by lazy {
            SwirServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationService.WithRawResponse =
            ObservationServiceImpl.WithRawResponseImpl(
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
        override fun ecpsdr(): EcpsdrService.WithRawResponse = ecpsdr

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun eoObservations(): EoObservationService.WithRawResponse = eoObservations

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun monoradar(): MonoradarService.WithRawResponse = monoradar

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun obscorrelation(): ObscorrelationService.WithRawResponse = obscorrelation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun passiveRadarObservation(): PassiveRadarObservationService.WithRawResponse =
            passiveRadarObservation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun radarobservation(): RadarobservationService.WithRawResponse = radarobservation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun rfObservation(): RfObservationService.WithRawResponse = rfObservation

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun swir(): SwirService.WithRawResponse = swir
    }
}
