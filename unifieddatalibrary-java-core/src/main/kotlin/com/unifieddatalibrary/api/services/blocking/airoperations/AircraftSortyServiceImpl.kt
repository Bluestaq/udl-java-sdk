// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPage
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftsortieAbridged
import com.unifieddatalibrary.api.services.blocking.airoperations.aircraftsorties.HistoryService
import com.unifieddatalibrary.api.services.blocking.airoperations.aircraftsorties.HistoryServiceImpl
import java.util.function.Consumer

/**
 * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
 * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
 * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking Order,
 * Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation Risk
 * Management data. Aircraft Sortie information contains static and dynamic aircraft assignments,
 * departure and arrival times, and remarks. Aircraft Mission information contains static data for
 * mission planning to include assigned aircraft and crews, cargo pickup and dropoff locations,
 * unique identifiers, and prioritization. Item Tracking information contains data for tracking an
 * item from its origin to destination and how it may be configured during transport. Flight Plan
 * information contains schedule and route details. Air Event provides information concerning
 * various aerial events such as fuel transfer and air drops, as well as the associated aircraft
 * involved. Sortie PPR information contains details on operational access to a runway, taxiway, or
 * airport service. Diplomatic Clearance information contains details on the issuance and
 * coordination of aircraft clearance requests. Diplomatic Clearance Country provides information
 * such as entry/exit points, requirements, and points of contact for countries diplomatic
 * clearances are being created for. Airspace Control Order provides information concerning the
 * allocation, restriction, and deconfliction of airspace. Air Tasking Order information contains
 * details on the coordination of air missions and their tasks, resources, and timelines.
 * Navigational Obstruction provides the locations, characteristics, and boundaries of obstacles and
 * structures that can restrict or interfere with navigation. Logistics Support contains information
 * regarding the transport and maintenance of resources and equipment to sustain air operations.
 * Track Route information defines specific flight paths used by aircraft during the transport of
 * fuel and other resources. Air Load Plan information provides mission actuals concerning the
 * loading and air transport of cargo and passengers. Aviation Risk Management information help aid
 * in mission planning by accounting for factors such as mission complexity and crew fatigue.
 */
class AircraftSortyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AircraftSortyService {

    private val withRawResponse: AircraftSortyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): AircraftSortyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyService =
        AircraftSortyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun history(): HistoryService = history

    override fun create(params: AircraftSortyCreateParams, requestOptions: RequestOptions) {
        // post /udl/aircraftsortie
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: AircraftSortyListParams,
        requestOptions: RequestOptions,
    ): AircraftSortyListPage =
        // get /udl/aircraftsortie
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AircraftSortyCountParams, requestOptions: RequestOptions): String =
        // get /udl/aircraftsortie/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: AircraftSortyCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/aircraftsortie/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-aircraftsortie
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AircraftSortyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortyService.WithRawResponse =
            AircraftSortyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AircraftSortyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AircraftsortieAbridged>> =
            jsonHandler<List<AircraftsortieAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AircraftSortyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftSortyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        AircraftSortyListPage.builder()
                            .service(AircraftSortyServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AircraftSortyCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "count")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: AircraftSortyCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-aircraftsortie")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }
    }
}
