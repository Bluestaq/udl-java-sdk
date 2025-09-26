// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.observations.EcpsdrService
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationService
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarService
import com.unifieddatalibrary.api.services.blocking.observations.ObscorrelationService
import com.unifieddatalibrary.api.services.blocking.observations.PassiveRadarObservationService
import com.unifieddatalibrary.api.services.blocking.observations.RadarobservationService
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationService
import com.unifieddatalibrary.api.services.blocking.observations.SwirService
import java.util.function.Consumer

interface ObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationService

    fun ecpsdr(): EcpsdrService

    fun eoObservations(): EoObservationService

    fun monoradar(): MonoradarService

    fun obscorrelation(): ObscorrelationService

    fun passiveRadarObservation(): PassiveRadarObservationService

    fun radarobservation(): RadarobservationService

    fun rfObservation(): RfObservationService

    fun swir(): SwirService

    /**
     * A view of [ObservationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationService.WithRawResponse

        fun ecpsdr(): EcpsdrService.WithRawResponse

        fun eoObservations(): EoObservationService.WithRawResponse

        fun monoradar(): MonoradarService.WithRawResponse

        fun obscorrelation(): ObscorrelationService.WithRawResponse

        fun passiveRadarObservation(): PassiveRadarObservationService.WithRawResponse

        fun radarobservation(): RadarobservationService.WithRawResponse

        fun rfObservation(): RfObservationService.WithRawResponse

        fun swir(): SwirService.WithRawResponse
    }
}
