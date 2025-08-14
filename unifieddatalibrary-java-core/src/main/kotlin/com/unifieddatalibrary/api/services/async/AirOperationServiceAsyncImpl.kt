// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.airoperations.AirTaskingOrderServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AirTaskingOrderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortyServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.airoperations.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AirspaceControlOrderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.airoperations.CrewpaperServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.CrewpaperServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.airoperations.DiplomaticClearanceServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.DiplomaticClearanceServiceAsyncImpl
import java.util.function.Consumer

class AirOperationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AirOperationServiceAsync {

    private val withRawResponse: AirOperationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val airTaskingOrders: AirTaskingOrderServiceAsync by lazy {
        AirTaskingOrderServiceAsyncImpl(clientOptions)
    }

    private val aircraftSorties: AircraftSortyServiceAsync by lazy {
        AircraftSortyServiceAsyncImpl(clientOptions)
    }

    private val airspaceControlOrders: AirspaceControlOrderServiceAsync by lazy {
        AirspaceControlOrderServiceAsyncImpl(clientOptions)
    }

    private val crewpapers: CrewpaperServiceAsync by lazy {
        CrewpaperServiceAsyncImpl(clientOptions)
    }

    private val diplomaticClearance: DiplomaticClearanceServiceAsync by lazy {
        DiplomaticClearanceServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AirOperationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirOperationServiceAsync =
        AirOperationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun airTaskingOrders(): AirTaskingOrderServiceAsync = airTaskingOrders

    override fun aircraftSorties(): AircraftSortyServiceAsync = aircraftSorties

    override fun airspaceControlOrders(): AirspaceControlOrderServiceAsync = airspaceControlOrders

    override fun crewpapers(): CrewpaperServiceAsync = crewpapers

    override fun diplomaticClearance(): DiplomaticClearanceServiceAsync = diplomaticClearance

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirOperationServiceAsync.WithRawResponse {

        private val airTaskingOrders: AirTaskingOrderServiceAsync.WithRawResponse by lazy {
            AirTaskingOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftSorties: AircraftSortyServiceAsync.WithRawResponse by lazy {
            AircraftSortyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airspaceControlOrders:
            AirspaceControlOrderServiceAsync.WithRawResponse by lazy {
            AirspaceControlOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val crewpapers: CrewpaperServiceAsync.WithRawResponse by lazy {
            CrewpaperServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val diplomaticClearance: DiplomaticClearanceServiceAsync.WithRawResponse by lazy {
            DiplomaticClearanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirOperationServiceAsync.WithRawResponse =
            AirOperationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun airTaskingOrders(): AirTaskingOrderServiceAsync.WithRawResponse =
            airTaskingOrders

        override fun aircraftSorties(): AircraftSortyServiceAsync.WithRawResponse = aircraftSorties

        override fun airspaceControlOrders(): AirspaceControlOrderServiceAsync.WithRawResponse =
            airspaceControlOrders

        override fun crewpapers(): CrewpaperServiceAsync.WithRawResponse = crewpapers

        override fun diplomaticClearance(): DiplomaticClearanceServiceAsync.WithRawResponse =
            diplomaticClearance
    }
}
