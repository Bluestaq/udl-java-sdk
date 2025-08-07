// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BusFull
import com.unifieddatalibrary.api.models.buses.BusCountParams
import com.unifieddatalibrary.api.models.buses.BusCreateParams
import com.unifieddatalibrary.api.models.buses.BusDeleteParams
import com.unifieddatalibrary.api.models.buses.BusListPageAsync
import com.unifieddatalibrary.api.models.buses.BusListParams
import com.unifieddatalibrary.api.models.buses.BusQueryHelpParams
import com.unifieddatalibrary.api.models.buses.BusQueryHelpResponse
import com.unifieddatalibrary.api.models.buses.BusRetrieveParams
import com.unifieddatalibrary.api.models.buses.BusTupleParams
import com.unifieddatalibrary.api.models.buses.BusUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusServiceAsync

    /**
     * Service operation to take a single Bus as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BusCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Service operation to get a single Bus record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<BusFull> = retrieve(id, BusRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusRetrieveParams = BusRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusRetrieveParams = BusRetrieveParams.none(),
    ): CompletableFuture<BusFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusFull>

    /** @see retrieve */
    fun retrieve(params: BusRetrieveParams): CompletableFuture<BusFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BusFull> =
        retrieve(id, BusRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Bus. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BusUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BusUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<BusListPageAsync> = list(BusListParams.none())

    /** @see list */
    fun list(
        params: BusListParams = BusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusListPageAsync>

    /** @see list */
    fun list(params: BusListParams = BusListParams.none()): CompletableFuture<BusListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BusListPageAsync> =
        list(BusListParams.none(), requestOptions)

    /**
     * Service operation to delete a Bus object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, BusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BusDeleteParams = BusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BusDeleteParams = BusDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BusDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, BusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(BusCountParams.none())

    /** @see count */
    fun count(
        params: BusCountParams = BusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: BusCountParams = BusCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(BusCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<BusQueryHelpResponse> = queryHelp(BusQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: BusQueryHelpParams = BusQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: BusQueryHelpParams = BusQueryHelpParams.none()
    ): CompletableFuture<BusQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<BusQueryHelpResponse> =
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
    fun tuple(params: BusTupleParams): CompletableFuture<List<BusFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: BusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BusFull>>

    /** A view of [BusServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/bus`, but is otherwise the same as
         * [BusServiceAsync.create].
         */
        fun create(params: BusCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/bus/{id}`, but is otherwise the same as
         * [BusServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BusFull>> =
            retrieve(id, BusRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BusRetrieveParams = BusRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BusRetrieveParams = BusRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BusFull>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusFull>>

        /** @see retrieve */
        fun retrieve(params: BusRetrieveParams): CompletableFuture<HttpResponseFor<BusFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusFull>> =
            retrieve(id, BusRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/bus/{id}`, but is otherwise the same as
         * [BusServiceAsync.update].
         */
        fun update(pathId: String, params: BusUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: BusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: BusUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/bus`, but is otherwise the same as
         * [BusServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BusListPageAsync>> =
            list(BusListParams.none())

        /** @see list */
        fun list(
            params: BusListParams = BusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusListPageAsync>>

        /** @see list */
        fun list(
            params: BusListParams = BusListParams.none()
        ): CompletableFuture<HttpResponseFor<BusListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BusListPageAsync>> =
            list(BusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/bus/{id}`, but is otherwise the same as
         * [BusServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, BusDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BusDeleteParams = BusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: BusDeleteParams = BusDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BusDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, BusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/bus/count`, but is otherwise the same as
         * [BusServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(BusCountParams.none())

        /** @see count */
        fun count(
            params: BusCountParams = BusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: BusCountParams = BusCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(BusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/bus/queryhelp`, but is otherwise the same as
         * [BusServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<BusQueryHelpResponse>> =
            queryHelp(BusQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: BusQueryHelpParams = BusQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: BusQueryHelpParams = BusQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<BusQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BusQueryHelpResponse>> =
            queryHelp(BusQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/bus/tuple`, but is otherwise the same as
         * [BusServiceAsync.tuple].
         */
        fun tuple(params: BusTupleParams): CompletableFuture<HttpResponseFor<List<BusFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: BusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BusFull>>>
    }
}
