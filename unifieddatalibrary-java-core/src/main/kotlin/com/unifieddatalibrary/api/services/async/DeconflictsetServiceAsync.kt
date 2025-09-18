// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCountParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCreateParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListPageAsync
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetQueryhelpParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetQueryhelpResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.deconflictset.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DeconflictsetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeconflictsetServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single DeconflictSet record as a POST body and ingest into the
     * database. This operation does not persist any DeconflictWindow datatypes that may be present
     * in the body of the request. This operation is not intended to be used for automated feeds
     * into UDL. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DeconflictsetCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DeconflictsetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: DeconflictsetListParams): CompletableFuture<DeconflictsetListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DeconflictsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeconflictsetListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: DeconflictsetCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: DeconflictsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to get a single DeconflictSet record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<DeconflictsetGetResponse> =
        get(id, DeconflictsetGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeconflictsetGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
    ): CompletableFuture<DeconflictsetGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DeconflictsetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeconflictsetGetResponse>

    /** @see get */
    fun get(params: DeconflictsetGetParams): CompletableFuture<DeconflictsetGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeconflictsetGetResponse> =
        get(id, DeconflictsetGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<DeconflictsetQueryhelpResponse> =
        queryhelp(DeconflictsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeconflictsetQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none()
    ): CompletableFuture<DeconflictsetQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<DeconflictsetQueryhelpResponse> =
        queryhelp(DeconflictsetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: DeconflictsetTupleParams
    ): CompletableFuture<List<DeconflictsetTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DeconflictsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DeconflictsetTupleResponse>>

    /**
     * Service operation to take a single DeconflictSet record as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: DeconflictsetUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: DeconflictsetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DeconflictsetServiceAsync] that provides access to raw HTTP responses for each
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
        ): DeconflictsetServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/deconflictset`, but is otherwise the same as
         * [DeconflictsetServiceAsync.create].
         */
        fun create(params: DeconflictsetCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DeconflictsetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset`, but is otherwise the same as
         * [DeconflictsetServiceAsync.list].
         */
        fun list(
            params: DeconflictsetListParams
        ): CompletableFuture<HttpResponseFor<DeconflictsetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DeconflictsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeconflictsetListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/count`, but is otherwise the same
         * as [DeconflictsetServiceAsync.count].
         */
        fun count(params: DeconflictsetCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: DeconflictsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/{id}`, but is otherwise the same
         * as [DeconflictsetServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<DeconflictsetGetResponse>> =
            get(id, DeconflictsetGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeconflictsetGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DeconflictsetGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DeconflictsetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeconflictsetGetResponse>>

        /** @see get */
        fun get(
            params: DeconflictsetGetParams
        ): CompletableFuture<HttpResponseFor<DeconflictsetGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeconflictsetGetResponse>> =
            get(id, DeconflictsetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/queryhelp`, but is otherwise the
         * same as [DeconflictsetServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<DeconflictsetQueryhelpResponse>> =
            queryhelp(DeconflictsetQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeconflictsetQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<DeconflictsetQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DeconflictsetQueryhelpResponse>> =
            queryhelp(DeconflictsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/tuple`, but is otherwise the same
         * as [DeconflictsetServiceAsync.tuple].
         */
        fun tuple(
            params: DeconflictsetTupleParams
        ): CompletableFuture<HttpResponseFor<List<DeconflictsetTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: DeconflictsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DeconflictsetTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-deconflictset`, but is otherwise the
         * same as [DeconflictsetServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: DeconflictsetUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: DeconflictsetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
