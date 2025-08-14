// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalQueryhelpParams
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalQueryhelpResponse
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalRetrieveParams
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalTupleParams
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalFull
import com.unifieddatalibrary.api.services.async.diffofarrival.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiffOfArrivalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiffOfArrivalServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to get a single TDOA/FDOA record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<DiffofarrivalFull> =
        retrieve(id, DiffOfArrivalRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DiffOfArrivalRetrieveParams = DiffOfArrivalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiffofarrivalFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DiffOfArrivalRetrieveParams = DiffOfArrivalRetrieveParams.none(),
    ): CompletableFuture<DiffofarrivalFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DiffOfArrivalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiffofarrivalFull>

    /** @see retrieve */
    fun retrieve(params: DiffOfArrivalRetrieveParams): CompletableFuture<DiffofarrivalFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<DiffofarrivalFull> =
        retrieve(id, DiffOfArrivalRetrieveParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<DiffOfArrivalQueryhelpResponse> =
        queryhelp(DiffOfArrivalQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DiffOfArrivalQueryhelpParams = DiffOfArrivalQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiffOfArrivalQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: DiffOfArrivalQueryhelpParams = DiffOfArrivalQueryhelpParams.none()
    ): CompletableFuture<DiffOfArrivalQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<DiffOfArrivalQueryhelpResponse> =
        queryhelp(DiffOfArrivalQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: DiffOfArrivalTupleParams): CompletableFuture<List<DiffofarrivalFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DiffOfArrivalTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DiffofarrivalFull>>

    /**
     * Service operation to take multiple TDOA/FDOA records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: DiffOfArrivalUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: DiffOfArrivalUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DiffOfArrivalServiceAsync] that provides access to raw HTTP responses for each
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
        ): DiffOfArrivalServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/diffofarrival/{id}`, but is otherwise the same
         * as [DiffOfArrivalServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DiffofarrivalFull>> =
            retrieve(id, DiffOfArrivalRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DiffOfArrivalRetrieveParams = DiffOfArrivalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiffofarrivalFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DiffOfArrivalRetrieveParams = DiffOfArrivalRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DiffofarrivalFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DiffOfArrivalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiffofarrivalFull>>

        /** @see retrieve */
        fun retrieve(
            params: DiffOfArrivalRetrieveParams
        ): CompletableFuture<HttpResponseFor<DiffofarrivalFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DiffofarrivalFull>> =
            retrieve(id, DiffOfArrivalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diffofarrival/queryhelp`, but is otherwise the
         * same as [DiffOfArrivalServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<DiffOfArrivalQueryhelpResponse>> =
            queryhelp(DiffOfArrivalQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: DiffOfArrivalQueryhelpParams = DiffOfArrivalQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiffOfArrivalQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: DiffOfArrivalQueryhelpParams = DiffOfArrivalQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<DiffOfArrivalQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DiffOfArrivalQueryhelpResponse>> =
            queryhelp(DiffOfArrivalQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diffofarrival/tuple`, but is otherwise the same
         * as [DiffOfArrivalServiceAsync.tuple].
         */
        fun tuple(
            params: DiffOfArrivalTupleParams
        ): CompletableFuture<HttpResponseFor<List<DiffofarrivalFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: DiffOfArrivalTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DiffofarrivalFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-diffofarrival`, but is otherwise the
         * same as [DiffOfArrivalServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: DiffOfArrivalUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: DiffOfArrivalUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
