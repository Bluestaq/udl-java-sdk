// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPageAsync
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.airoperations.aircraftsorties.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
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
interface AircraftSortyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyServiceAsync

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
    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single AircraftSortie as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AircraftSortyCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftSortyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (`/udl/<datatype>/queryhelp`) for more
     * details on valid/required query parameter information.
     */
    fun list(params: AircraftSortyListParams): CompletableFuture<AircraftSortyListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AircraftSortyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AircraftSortyListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun count(params: AircraftSortyCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AircraftSortyCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of AircraftSorties as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: AircraftSortyCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AircraftSortyCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createBulk */
    fun createBulk(
        body: List<AircraftSortyCreateBulkParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        createBulk(AircraftSortyCreateBulkParams.builder().body(body).build(), requestOptions)

    /** @see createBulk */
    fun createBulk(body: List<AircraftSortyCreateBulkParams.Body>): CompletableFuture<Void?> =
        createBulk(body, RequestOptions.none())

    /**
     * Service operation to take one or many aircraft sortie records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<AircraftSortyUnvalidatedPublishParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unvalidatedPublish(
            AircraftSortyUnvalidatedPublishParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<AircraftSortyUnvalidatedPublishParams.Body>
    ): CompletableFuture<Void?> = unvalidatedPublish(body, RequestOptions.none())

    /**
     * A view of [AircraftSortyServiceAsync] that provides access to raw HTTP responses for each
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
        ): AircraftSortyServiceAsync.WithRawResponse

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
        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyServiceAsync.create].
         */
        fun create(params: AircraftSortyCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AircraftSortyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyServiceAsync.list].
         */
        fun list(
            params: AircraftSortyListParams
        ): CompletableFuture<HttpResponseFor<AircraftSortyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AircraftSortyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AircraftSortyListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/count`, but is otherwise the
         * same as [AircraftSortyServiceAsync.count].
         */
        fun count(params: AircraftSortyCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: AircraftSortyCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie/createBulk`, but is otherwise
         * the same as [AircraftSortyServiceAsync.createBulk].
         */
        fun createBulk(params: AircraftSortyCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: AircraftSortyCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createBulk */
        fun createBulk(
            body: List<AircraftSortyCreateBulkParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createBulk(AircraftSortyCreateBulkParams.builder().body(body).build(), requestOptions)

        /** @see createBulk */
        fun createBulk(
            body: List<AircraftSortyCreateBulkParams.Body>
        ): CompletableFuture<HttpResponse> = createBulk(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-aircraftsortie`, but is otherwise the
         * same as [AircraftSortyServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            body: List<AircraftSortyUnvalidatedPublishParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
                AircraftSortyUnvalidatedPublishParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            body: List<AircraftSortyUnvalidatedPublishParams.Body>
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(body, RequestOptions.none())
    }
}
