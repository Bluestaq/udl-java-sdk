// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BusFull
import com.unifieddatalibrary.api.models.buses.BusCountParams
import com.unifieddatalibrary.api.models.buses.BusCreateParams
import com.unifieddatalibrary.api.models.buses.BusDeleteParams
import com.unifieddatalibrary.api.models.buses.BusListPage
import com.unifieddatalibrary.api.models.buses.BusListParams
import com.unifieddatalibrary.api.models.buses.BusQueryHelpParams
import com.unifieddatalibrary.api.models.buses.BusQueryHelpResponse
import com.unifieddatalibrary.api.models.buses.BusRetrieveParams
import com.unifieddatalibrary.api.models.buses.BusTupleParams
import com.unifieddatalibrary.api.models.buses.BusUpdateParams
import java.util.function.Consumer

interface BusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusService

    /**
     * Service operation to take a single Bus as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BusCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: BusCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Bus record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): BusFull = retrieve(id, BusRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusRetrieveParams = BusRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: BusRetrieveParams = BusRetrieveParams.none()): BusFull =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusFull

    /** @see retrieve */
    fun retrieve(params: BusRetrieveParams): BusFull = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BusFull =
        retrieve(id, BusRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Bus. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BusUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BusUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: BusUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): BusListPage = list(BusListParams.none())

    /** @see list */
    fun list(
        params: BusListParams = BusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusListPage

    /** @see list */
    fun list(params: BusListParams = BusListParams.none()): BusListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BusListPage =
        list(BusListParams.none(), requestOptions)

    /**
     * Service operation to delete a Bus object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, BusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BusDeleteParams = BusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: BusDeleteParams = BusDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BusDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BusDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(BusCountParams.none())

    /** @see count */
    fun count(
        params: BusCountParams = BusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: BusCountParams = BusCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String = count(BusCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): BusQueryHelpResponse = queryHelp(BusQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: BusQueryHelpParams = BusQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: BusQueryHelpParams = BusQueryHelpParams.none()): BusQueryHelpResponse =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): BusQueryHelpResponse =
        queryHelp(BusQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: BusTupleParams): List<BusFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: BusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BusFull>

    /** A view of [BusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/bus`, but is otherwise the same as
         * [BusService.create].
         */
        @MustBeClosed
        fun create(params: BusCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/bus/{id}`, but is otherwise the same as
         * [BusService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BusFull> = retrieve(id, BusRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BusRetrieveParams = BusRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BusRetrieveParams = BusRetrieveParams.none(),
        ): HttpResponseFor<BusFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BusRetrieveParams): HttpResponseFor<BusFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BusFull> =
            retrieve(id, BusRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/bus/{id}`, but is otherwise the same as
         * [BusService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: BusUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: BusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BusUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/bus`, but is otherwise the same as
         * [BusService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BusListPage> = list(BusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BusListParams = BusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BusListParams = BusListParams.none()): HttpResponseFor<BusListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BusListPage> =
            list(BusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/bus/{id}`, but is otherwise the same as
         * [BusService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, BusDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BusDeleteParams = BusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: BusDeleteParams = BusDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BusDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/bus/count`, but is otherwise the same as
         * [BusService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(BusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: BusCountParams = BusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: BusCountParams = BusCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(BusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/bus/queryhelp`, but is otherwise the same as
         * [BusService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<BusQueryHelpResponse> =
            queryHelp(BusQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: BusQueryHelpParams = BusQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: BusQueryHelpParams = BusQueryHelpParams.none()
        ): HttpResponseFor<BusQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<BusQueryHelpResponse> =
            queryHelp(BusQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/bus/tuple`, but is otherwise the same as
         * [BusService.tuple].
         */
        @MustBeClosed
        fun tuple(params: BusTupleParams): HttpResponseFor<List<BusFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: BusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BusFull>>
    }
}
