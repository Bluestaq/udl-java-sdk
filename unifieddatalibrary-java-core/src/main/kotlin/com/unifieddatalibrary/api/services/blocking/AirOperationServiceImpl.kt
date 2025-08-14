// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.airoperations.AirTaskingOrderService
import com.unifieddatalibrary.api.services.blocking.airoperations.AirTaskingOrderServiceImpl
import com.unifieddatalibrary.api.services.blocking.airoperations.AircraftSortyService
import com.unifieddatalibrary.api.services.blocking.airoperations.AircraftSortyServiceImpl
import com.unifieddatalibrary.api.services.blocking.airoperations.AirspaceControlOrderService
import com.unifieddatalibrary.api.services.blocking.airoperations.AirspaceControlOrderServiceImpl
import com.unifieddatalibrary.api.services.blocking.airoperations.CrewpaperService
import com.unifieddatalibrary.api.services.blocking.airoperations.CrewpaperServiceImpl
import com.unifieddatalibrary.api.services.blocking.airoperations.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.airoperations.DiplomaticClearanceServiceImpl
import java.util.function.Consumer

class AirOperationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AirOperationService {

    private val withRawResponse: AirOperationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val airTaskingOrders: AirTaskingOrderService by lazy {
        AirTaskingOrderServiceImpl(clientOptions)
    }

    private val aircraftSorties: AircraftSortyService by lazy {
        AircraftSortyServiceImpl(clientOptions)
    }

    private val airspaceControlOrders: AirspaceControlOrderService by lazy {
        AirspaceControlOrderServiceImpl(clientOptions)
    }

    private val crewpapers: CrewpaperService by lazy { CrewpaperServiceImpl(clientOptions) }

    private val diplomaticClearance: DiplomaticClearanceService by lazy {
        DiplomaticClearanceServiceImpl(clientOptions)
    }

    override fun withRawResponse(): AirOperationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirOperationService =
        AirOperationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun airTaskingOrders(): AirTaskingOrderService = airTaskingOrders

    override fun aircraftSorties(): AircraftSortyService = aircraftSorties

    override fun airspaceControlOrders(): AirspaceControlOrderService = airspaceControlOrders

    override fun crewpapers(): CrewpaperService = crewpapers

    override fun diplomaticClearance(): DiplomaticClearanceService = diplomaticClearance

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirOperationService.WithRawResponse {

        private val airTaskingOrders: AirTaskingOrderService.WithRawResponse by lazy {
            AirTaskingOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftSorties: AircraftSortyService.WithRawResponse by lazy {
            AircraftSortyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airspaceControlOrders: AirspaceControlOrderService.WithRawResponse by lazy {
            AirspaceControlOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val crewpapers: CrewpaperService.WithRawResponse by lazy {
            CrewpaperServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val diplomaticClearance: DiplomaticClearanceService.WithRawResponse by lazy {
            DiplomaticClearanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirOperationService.WithRawResponse =
            AirOperationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun airTaskingOrders(): AirTaskingOrderService.WithRawResponse = airTaskingOrders

        override fun aircraftSorties(): AircraftSortyService.WithRawResponse = aircraftSorties

        override fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse =
            airspaceControlOrders

        override fun crewpapers(): CrewpaperService.WithRawResponse = crewpapers

        override fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse =
            diplomaticClearance
    }
}
