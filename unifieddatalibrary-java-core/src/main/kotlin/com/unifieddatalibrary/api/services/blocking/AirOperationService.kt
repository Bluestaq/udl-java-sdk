// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.airoperations.AirTaskingOrderService
import com.unifieddatalibrary.api.services.blocking.airoperations.AircraftSortyService
import com.unifieddatalibrary.api.services.blocking.airoperations.AirspaceControlOrderService
import com.unifieddatalibrary.api.services.blocking.airoperations.CrewpaperService
import com.unifieddatalibrary.api.services.blocking.airoperations.DiplomaticClearanceService
import java.util.function.Consumer

interface AirOperationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirOperationService

    fun airTaskingOrders(): AirTaskingOrderService

    fun aircraftSorties(): AircraftSortyService

    fun airspaceControlOrders(): AirspaceControlOrderService

    fun crewpapers(): CrewpaperService

    fun diplomaticClearance(): DiplomaticClearanceService

    /**
     * A view of [AirOperationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirOperationService.WithRawResponse

        fun airTaskingOrders(): AirTaskingOrderService.WithRawResponse

        fun aircraftSorties(): AircraftSortyService.WithRawResponse

        fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse

        fun crewpapers(): CrewpaperService.WithRawResponse

        fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse
    }
}
