// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.ObservationService
import com.unifieddatalibrary.api.services.blocking.observations.EcpsdrService
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationService
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarService
import com.unifieddatalibrary.api.services.blocking.observations.PassiveRadarObservationService
import com.unifieddatalibrary.api.services.blocking.observations.RadarobservationService
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationService
import com.unifieddatalibrary.api.services.blocking.observations.SwirService
import java.util.function.Consumer

interface ObservationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationService

    fun ecpsdr(): EcpsdrService

    fun monoradar(): MonoradarService

    fun swir(): SwirService

    fun radarobservation(): RadarobservationService

    fun rfObservation(): RfObservationService

    fun passiveRadarObservation(): PassiveRadarObservationService

    fun eoObservations(): EoObservationService

    /** A view of [ObservationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationService.WithRawResponse

        fun ecpsdr(): EcpsdrService.WithRawResponse

        fun monoradar(): MonoradarService.WithRawResponse

        fun swir(): SwirService.WithRawResponse

        fun radarobservation(): RadarobservationService.WithRawResponse

        fun rfObservation(): RfObservationService.WithRawResponse

        fun passiveRadarObservation(): PassiveRadarObservationService.WithRawResponse

        fun eoObservations(): EoObservationService.WithRawResponse
    }
}
