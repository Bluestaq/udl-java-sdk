// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AirTaskingOrderServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.CrewpaperServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.DiplomaticClearanceServiceAsync
import java.util.function.Consumer

interface AirOperationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirOperationServiceAsync

    fun airTaskingOrders(): AirTaskingOrderServiceAsync

    fun aircraftSorties(): AircraftSortyServiceAsync

    fun airspaceControlOrders(): AirspaceControlOrderServiceAsync

    fun crewpapers(): CrewpaperServiceAsync

    fun diplomaticClearance(): DiplomaticClearanceServiceAsync

    /** A view of [AirOperationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirOperationServiceAsync.WithRawResponse

        fun airTaskingOrders(): AirTaskingOrderServiceAsync.WithRawResponse

        fun aircraftSorties(): AircraftSortyServiceAsync.WithRawResponse

        fun airspaceControlOrders(): AirspaceControlOrderServiceAsync.WithRawResponse

        fun crewpapers(): CrewpaperServiceAsync.WithRawResponse

        fun diplomaticClearance(): DiplomaticClearanceServiceAsync.WithRawResponse
    }
}
