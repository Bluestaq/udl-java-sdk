// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPage
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.airoperations.aircraftsorties.HistoryService
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
interface AircraftSortyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyService

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
    fun history(): HistoryService

    /**
     * Service operation to take a single AircraftSortie as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AircraftSortyCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftSortyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AircraftSortyListParams): AircraftSortyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AircraftSortyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftSortyListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AircraftSortyCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AircraftSortyCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of AircraftSorties as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: AircraftSortyCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AircraftSortyCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createBulk */
    fun createBulk(
        body: List<AircraftSortyCreateBulkParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createBulk(AircraftSortyCreateBulkParams.builder().body(body).build(), requestOptions)

    /** @see createBulk */
    fun createBulk(body: List<AircraftSortyCreateBulkParams.Body>) =
        createBulk(body, RequestOptions.none())

    /**
     * Service operation to take one or many aircraft sortie records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: AircraftSortyUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<AircraftSortyUnvalidatedPublishParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        unvalidatedPublish(
            AircraftSortyUnvalidatedPublishParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(body: List<AircraftSortyUnvalidatedPublishParams.Body>) =
        unvalidatedPublish(body, RequestOptions.none())

    /**
     * A view of [AircraftSortyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortyService.WithRawResponse

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
        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyService.create].
         */
        @MustBeClosed
        fun create(params: AircraftSortyCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AircraftSortyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyService.list].
         */
        @MustBeClosed
        fun list(params: AircraftSortyListParams): HttpResponseFor<AircraftSortyListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AircraftSortyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftSortyListPage>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/count`, but is otherwise the
         * same as [AircraftSortyService.count].
         */
        @MustBeClosed
        fun count(params: AircraftSortyCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AircraftSortyCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie/createBulk`, but is otherwise
         * the same as [AircraftSortyService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: AircraftSortyCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: AircraftSortyCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            body: List<AircraftSortyCreateBulkParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createBulk(AircraftSortyCreateBulkParams.builder().body(body).build(), requestOptions)

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(body: List<AircraftSortyCreateBulkParams.Body>): HttpResponse =
            createBulk(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-aircraftsortie`, but is otherwise the
         * same as [AircraftSortyService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: AircraftSortyUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            body: List<AircraftSortyUnvalidatedPublishParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unvalidatedPublish(
                AircraftSortyUnvalidatedPublishParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            body: List<AircraftSortyUnvalidatedPublishParams.Body>
        ): HttpResponse = unvalidatedPublish(body, RequestOptions.none())
    }
}
