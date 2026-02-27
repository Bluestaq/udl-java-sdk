// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirTaskingOrderFull
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCountParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCreateParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListPageAsync
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderRetrieveParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderTupleParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderUnvalidatedPublishParams
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
interface AirTaskingOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTaskingOrderServiceAsync

    /**
     * Service operation to take a single airtaskingorder record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AirTaskingOrderCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AirTaskingOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single airtaskingorder record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<AirTaskingOrderFull> =
        retrieve(id, AirTaskingOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTaskingOrderFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none(),
    ): CompletableFuture<AirTaskingOrderFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AirTaskingOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTaskingOrderFull>

    /** @see retrieve */
    fun retrieve(params: AirTaskingOrderRetrieveParams): CompletableFuture<AirTaskingOrderFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirTaskingOrderFull> =
        retrieve(id, AirTaskingOrderRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<AirTaskingOrderListPageAsync> =
        list(AirTaskingOrderListParams.none())

    /** @see list */
    fun list(
        params: AirTaskingOrderListParams = AirTaskingOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTaskingOrderListPageAsync>

    /** @see list */
    fun list(
        params: AirTaskingOrderListParams = AirTaskingOrderListParams.none()
    ): CompletableFuture<AirTaskingOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AirTaskingOrderListPageAsync> =
        list(AirTaskingOrderListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(AirTaskingOrderCountParams.none())

    /** @see count */
    fun count(
        params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(AirTaskingOrderCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<AirTaskingOrderQueryHelpResponse> =
        queryHelp(AirTaskingOrderQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTaskingOrderQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none()
    ): CompletableFuture<AirTaskingOrderQueryHelpResponse> =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<AirTaskingOrderQueryHelpResponse> =
        queryHelp(AirTaskingOrderQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AirTaskingOrderTupleParams): CompletableFuture<List<AirTaskingOrderFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AirTaskingOrderTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AirTaskingOrderFull>>

    /**
     * Service operation to take multiple airtaskingorder records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: AirTaskingOrderUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AirTaskingOrderUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<AirTaskingOrderUnvalidatedPublishParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unvalidatedPublish(
            AirTaskingOrderUnvalidatedPublishParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<AirTaskingOrderUnvalidatedPublishParams.Body>
    ): CompletableFuture<Void?> = unvalidatedPublish(body, RequestOptions.none())

    /**
     * A view of [AirTaskingOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): AirTaskingOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/airtaskingorder`, but is otherwise the same as
         * [AirTaskingOrderServiceAsync.create].
         */
        fun create(params: AirTaskingOrderCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AirTaskingOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airtaskingorder/{id}`, but is otherwise the
         * same as [AirTaskingOrderServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>> =
            retrieve(id, AirTaskingOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AirTaskingOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>>

        /** @see retrieve */
        fun retrieve(
            params: AirTaskingOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>> =
            retrieve(id, AirTaskingOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airtaskingorder`, but is otherwise the same as
         * [AirTaskingOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AirTaskingOrderListPageAsync>> =
            list(AirTaskingOrderListParams.none())

        /** @see list */
        fun list(
            params: AirTaskingOrderListParams = AirTaskingOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderListPageAsync>>

        /** @see list */
        fun list(
            params: AirTaskingOrderListParams = AirTaskingOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderListPageAsync>> =
            list(AirTaskingOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airtaskingorder/count`, but is otherwise the
         * same as [AirTaskingOrderServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(AirTaskingOrderCountParams.none())

        /** @see count */
        fun count(
            params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(AirTaskingOrderCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airtaskingorder/queryhelp`, but is otherwise
         * the same as [AirTaskingOrderServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<AirTaskingOrderQueryHelpResponse>> =
            queryHelp(AirTaskingOrderQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AirTaskingOrderQueryHelpResponse>> =
            queryHelp(AirTaskingOrderQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airtaskingorder/tuple`, but is otherwise the
         * same as [AirTaskingOrderServiceAsync.tuple].
         */
        fun tuple(
            params: AirTaskingOrderTupleParams
        ): CompletableFuture<HttpResponseFor<List<AirTaskingOrderFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AirTaskingOrderTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AirTaskingOrderFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-airtaskingorder`, but is otherwise
         * the same as [AirTaskingOrderServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: AirTaskingOrderUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: AirTaskingOrderUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            body: List<AirTaskingOrderUnvalidatedPublishParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
                AirTaskingOrderUnvalidatedPublishParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            body: List<AirTaskingOrderUnvalidatedPublishParams.Body>
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(body, RequestOptions.none())
    }
}
