// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestCountParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestCreateParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestGetParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestGetResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestListPageAsync
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestListParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestQueryhelpParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestQueryhelpResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestTupleParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestTupleResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.laserdeconflictrequest.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaserdeconflictrequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaserdeconflictrequestServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single LaserDeconflictRequest record as a POST body and ingest
     * into the database. This operation does not persist any LaserDeconflictTarget datatypes that
     * may be present in the body of the request. This operation is not intended to be used for
     * automated feeds into UDL. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun create(params: LaserdeconflictrequestCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaserdeconflictrequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: LaserdeconflictrequestListParams
    ): CompletableFuture<LaserdeconflictrequestListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LaserdeconflictrequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaserdeconflictrequestListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: LaserdeconflictrequestCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: LaserdeconflictrequestCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to get a single LaserDeconflictRequest record by its unique ID passed as a
     * path parameter.
     */
    fun get(id: String): CompletableFuture<LaserdeconflictrequestGetResponse> =
        get(id, LaserdeconflictrequestGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaserdeconflictrequestGetParams = LaserdeconflictrequestGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaserdeconflictrequestGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaserdeconflictrequestGetParams = LaserdeconflictrequestGetParams.none(),
    ): CompletableFuture<LaserdeconflictrequestGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaserdeconflictrequestGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaserdeconflictrequestGetResponse>

    /** @see get */
    fun get(
        params: LaserdeconflictrequestGetParams
    ): CompletableFuture<LaserdeconflictrequestGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaserdeconflictrequestGetResponse> =
        get(id, LaserdeconflictrequestGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LaserdeconflictrequestQueryhelpResponse> =
        queryhelp(LaserdeconflictrequestQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaserdeconflictrequestQueryhelpParams =
            LaserdeconflictrequestQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaserdeconflictrequestQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LaserdeconflictrequestQueryhelpParams = LaserdeconflictrequestQueryhelpParams.none()
    ): CompletableFuture<LaserdeconflictrequestQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<LaserdeconflictrequestQueryhelpResponse> =
        queryhelp(LaserdeconflictrequestQueryhelpParams.none(), requestOptions)

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
        params: LaserdeconflictrequestTupleParams
    ): CompletableFuture<List<LaserdeconflictrequestTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaserdeconflictrequestTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaserdeconflictrequestTupleResponse>>

    /**
     * Service operation to take a single LaserDeconflictRequest record as a POST body and ingest
     * into the database. This operation is intended to be used for automated feeds into UDL. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: LaserdeconflictrequestUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: LaserdeconflictrequestUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [LaserdeconflictrequestServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaserdeconflictrequestServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/laserdeconflictrequest`, but is otherwise the
         * same as [LaserdeconflictrequestServiceAsync.create].
         */
        fun create(params: LaserdeconflictrequestCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaserdeconflictrequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/laserdeconflictrequest`, but is otherwise the
         * same as [LaserdeconflictrequestServiceAsync.list].
         */
        fun list(
            params: LaserdeconflictrequestListParams
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LaserdeconflictrequestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/laserdeconflictrequest/count`, but is otherwise
         * the same as [LaserdeconflictrequestServiceAsync.count].
         */
        fun count(
            params: LaserdeconflictrequestCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: LaserdeconflictrequestCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/laserdeconflictrequest/{id}`, but is otherwise
         * the same as [LaserdeconflictrequestServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>> =
            get(id, LaserdeconflictrequestGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaserdeconflictrequestGetParams = LaserdeconflictrequestGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaserdeconflictrequestGetParams = LaserdeconflictrequestGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaserdeconflictrequestGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>>

        /** @see get */
        fun get(
            params: LaserdeconflictrequestGetParams
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>> =
            get(id, LaserdeconflictrequestGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laserdeconflictrequest/queryhelp`, but is
         * otherwise the same as [LaserdeconflictrequestServiceAsync.queryhelp].
         */
        fun queryhelp():
            CompletableFuture<HttpResponseFor<LaserdeconflictrequestQueryhelpResponse>> =
            queryhelp(LaserdeconflictrequestQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LaserdeconflictrequestQueryhelpParams =
                LaserdeconflictrequestQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LaserdeconflictrequestQueryhelpParams =
                LaserdeconflictrequestQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestQueryhelpResponse>> =
            queryhelp(LaserdeconflictrequestQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laserdeconflictrequest/tuple`, but is otherwise
         * the same as [LaserdeconflictrequestServiceAsync.tuple].
         */
        fun tuple(
            params: LaserdeconflictrequestTupleParams
        ): CompletableFuture<HttpResponseFor<List<LaserdeconflictrequestTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LaserdeconflictrequestTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaserdeconflictrequestTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-laserdeconflictrequest`, but is
         * otherwise the same as [LaserdeconflictrequestServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: LaserdeconflictrequestUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: LaserdeconflictrequestUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
