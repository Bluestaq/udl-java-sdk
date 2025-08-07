// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.observations.EcpsdrServiceAsync
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.MonoradarServiceAsync
import com.unifieddatalibrary.api.services.async.observations.PassiveRadarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.RadarobservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.RfObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.SwirServiceAsync
import java.util.function.Consumer

interface ObservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationServiceAsync

    fun ecpsdr(): EcpsdrServiceAsync

    fun monoradar(): MonoradarServiceAsync

    fun swir(): SwirServiceAsync

    fun radarobservation(): RadarobservationServiceAsync

    fun rfObservation(): RfObservationServiceAsync

    fun passiveRadarObservation(): PassiveRadarObservationServiceAsync

    fun eoObservations(): EoObservationServiceAsync

    /**
     * A view of [ObservationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationServiceAsync.WithRawResponse

        fun ecpsdr(): EcpsdrServiceAsync.WithRawResponse

        fun monoradar(): MonoradarServiceAsync.WithRawResponse

        fun swir(): SwirServiceAsync.WithRawResponse

        fun radarobservation(): RadarobservationServiceAsync.WithRawResponse

        fun rfObservation(): RfObservationServiceAsync.WithRawResponse

        fun passiveRadarObservation(): PassiveRadarObservationServiceAsync.WithRawResponse

        fun eoObservations(): EoObservationServiceAsync.WithRawResponse
    }
}
