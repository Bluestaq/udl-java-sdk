// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.diplomaticclearance

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListPage
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryRetrieveResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryTupleResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryUpdateParams
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
interface CountryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService

    /**
     * Service operation to take a single diplomaticclearancecountry record as a POST body and
     * ingest into the database. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun create(params: CountryCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: CountryCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to get a single diplomaticclearancecountry record by its unique ID passed
     * as a path parameter.
     */
    fun retrieve(id: String): CountryRetrieveResponse = retrieve(id, CountryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CountryRetrieveParams = CountryRetrieveParams.none(),
    ): CountryRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CountryRetrieveParams): CountryRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CountryRetrieveResponse =
        retrieve(id, CountryRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single diplomaticclearancecountry record. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: CountryUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: CountryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: CountryUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: CountryUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CountryListPage = list(CountryListParams.none())

    /** @see list */
    fun list(
        params: CountryListParams = CountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryListPage

    /** @see list */
    fun list(params: CountryListParams = CountryListParams.none()): CountryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CountryListPage =
        list(CountryListParams.none(), requestOptions)

    /**
     * Service operation to delete a diplomaticclearancecountry record specified by the passed ID
     * path parameter. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, CountryDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CountryDeleteParams = CountryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: CountryDeleteParams = CountryDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CountryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CountryDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, CountryDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(CountryCountParams.none())

    /** @see count */
    fun count(
        params: CountryCountParams = CountryCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: CountryCountParams = CountryCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(CountryCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of
     * diplomaticclearancecountry records as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulk(params: CountryCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: CountryCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createBulk */
    fun createBulk(
        body: List<CountryCreateBulkParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createBulk(CountryCreateBulkParams.builder().body(body).build(), requestOptions)

    /** @see createBulk */
    fun createBulk(body: List<CountryCreateBulkParams.Body>) =
        createBulk(body, RequestOptions.none())

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CountryQueryHelpResponse = queryHelp(CountryQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: CountryQueryHelpParams = CountryQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: CountryQueryHelpParams = CountryQueryHelpParams.none()
    ): CountryQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CountryQueryHelpResponse =
        queryHelp(CountryQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: CountryTupleParams): List<CountryTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CountryTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CountryTupleResponse>

    /**
     * Service operation to take multiple diplomaticclearancecountry records as a POST body and
     * ingest into the database. This operation is intended to be used for automated feeds into UDL.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun unvalidatedPublish(params: CountryUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: CountryUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<CountryUnvalidatedPublishParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        unvalidatedPublish(
            CountryUnvalidatedPublishParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(body: List<CountryUnvalidatedPublishParams.Body>) =
        unvalidatedPublish(body, RequestOptions.none())

    /** A view of [CountryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/diplomaticclearancecountry`, but is otherwise
         * the same as [CountryService.create].
         */
        @MustBeClosed
        fun create(params: CountryCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CountryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/{id}`, but is
         * otherwise the same as [CountryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(id, CountryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CountryRetrieveParams = CountryRetrieveParams.none(),
        ): HttpResponseFor<CountryRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CountryRetrieveParams): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryRetrieveResponse> =
            retrieve(id, CountryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/diplomaticclearancecountry/{id}`, but is
         * otherwise the same as [CountryService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: CountryUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: CountryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CountryUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CountryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry`, but is otherwise
         * the same as [CountryService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CountryListPage> = list(CountryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CountryListParams = CountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CountryListParams = CountryListParams.none()
        ): HttpResponseFor<CountryListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CountryListPage> =
            list(CountryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/diplomaticclearancecountry/{id}`, but is
         * otherwise the same as [CountryService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, CountryDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CountryDeleteParams = CountryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CountryDeleteParams = CountryDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CountryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CountryDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, CountryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/count`, but is
         * otherwise the same as [CountryService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(CountryCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: CountryCountParams = CountryCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: CountryCountParams = CountryCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(CountryCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/diplomaticclearancecountry/createBulk`, but is
         * otherwise the same as [CountryService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: CountryCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: CountryCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            body: List<CountryCreateBulkParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createBulk(CountryCreateBulkParams.builder().body(body).build(), requestOptions)

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(body: List<CountryCreateBulkParams.Body>): HttpResponse =
            createBulk(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/queryhelp`, but is
         * otherwise the same as [CountryService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<CountryQueryHelpResponse> =
            queryHelp(CountryQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: CountryQueryHelpParams = CountryQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: CountryQueryHelpParams = CountryQueryHelpParams.none()
        ): HttpResponseFor<CountryQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<CountryQueryHelpResponse> =
            queryHelp(CountryQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearancecountry/tuple`, but is
         * otherwise the same as [CountryService.tuple].
         */
        @MustBeClosed
        fun tuple(params: CountryTupleParams): HttpResponseFor<List<CountryTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: CountryTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CountryTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-diplomaticclearancecountry`, but is
         * otherwise the same as [CountryService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: CountryUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: CountryUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            body: List<CountryUnvalidatedPublishParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unvalidatedPublish(
                CountryUnvalidatedPublishParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(body: List<CountryUnvalidatedPublishParams.Body>): HttpResponse =
            unvalidatedPublish(body, RequestOptions.none())
    }
}
