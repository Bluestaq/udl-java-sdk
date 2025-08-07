// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CommFull
import com.unifieddatalibrary.api.models.comm.CommCountParams
import com.unifieddatalibrary.api.models.comm.CommCreateParams
import com.unifieddatalibrary.api.models.comm.CommDeleteParams
import com.unifieddatalibrary.api.models.comm.CommListPageAsync
import com.unifieddatalibrary.api.models.comm.CommListParams
import com.unifieddatalibrary.api.models.comm.CommQueryhelpParams
import com.unifieddatalibrary.api.models.comm.CommQueryhelpResponse
import com.unifieddatalibrary.api.models.comm.CommRetrieveParams
import com.unifieddatalibrary.api.models.comm.CommTupleParams
import com.unifieddatalibrary.api.models.comm.CommUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommServiceAsync

    /**
     * Service operation to take a single Comm as a POST body and ingest into the database. A Comm
     * is an on-orbit communications payload, including supporting data such as transponders and
     * channels, etc. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: CommCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Comm record by its unique ID passed as a path parameter. A
     * Comm is an on-orbit communications payload, including supporting data such as transponders
     * and channels, etc.
     */
    fun retrieve(id: String): CompletableFuture<CommFull> = retrieve(id, CommRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CommRetrieveParams = CommRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CommRetrieveParams = CommRetrieveParams.none(),
    ): CompletableFuture<CommFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommFull>

    /** @see retrieve */
    fun retrieve(params: CommRetrieveParams): CompletableFuture<CommFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CommFull> =
        retrieve(id, CommRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Comm. A Comm is an on-orbit communications payload,
     * including supporting data such as transponders and channels, etc. A specific role is required
     * to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: CommUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: CommUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: CommUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<CommListPageAsync> = list(CommListParams.none())

    /** @see list */
    fun list(
        params: CommListParams = CommListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommListPageAsync>

    /** @see list */
    fun list(params: CommListParams = CommListParams.none()): CompletableFuture<CommListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CommListPageAsync> =
        list(CommListParams.none(), requestOptions)

    /**
     * Service operation to delete a Comm object specified by the passed ID path parameter. A Comm
     * is an on-orbit communications payload, including supporting data such as transponders and
     * channels, etc. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, CommDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CommDeleteParams = CommDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CommDeleteParams = CommDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CommDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, CommDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(CommCountParams.none())

    /** @see count */
    fun count(
        params: CommCountParams = CommCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: CommCountParams = CommCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(CommCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<CommQueryhelpResponse> =
        queryhelp(CommQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: CommQueryhelpParams = CommQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: CommQueryhelpParams = CommQueryhelpParams.none()
    ): CompletableFuture<CommQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<CommQueryhelpResponse> =
        queryhelp(CommQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: CommTupleParams): CompletableFuture<List<CommFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CommTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CommFull>>

    /** A view of [CommServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/comm`, but is otherwise the same as
         * [CommServiceAsync.create].
         */
        fun create(params: CommCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/comm/{id}`, but is otherwise the same as
         * [CommServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CommFull>> =
            retrieve(id, CommRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CommRetrieveParams = CommRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CommRetrieveParams = CommRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CommFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CommRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommFull>>

        /** @see retrieve */
        fun retrieve(params: CommRetrieveParams): CompletableFuture<HttpResponseFor<CommFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommFull>> =
            retrieve(id, CommRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/comm/{id}`, but is otherwise the same as
         * [CommServiceAsync.update].
         */
        fun update(pathId: String, params: CommUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: CommUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: CommUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CommUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/comm`, but is otherwise the same as
         * [CommServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CommListPageAsync>> =
            list(CommListParams.none())

        /** @see list */
        fun list(
            params: CommListParams = CommListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommListPageAsync>>

        /** @see list */
        fun list(
            params: CommListParams = CommListParams.none()
        ): CompletableFuture<HttpResponseFor<CommListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommListPageAsync>> =
            list(CommListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/comm/{id}`, but is otherwise the same as
         * [CommServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, CommDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CommDeleteParams = CommDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CommDeleteParams = CommDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CommDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CommDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, CommDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/comm/count`, but is otherwise the same as
         * [CommServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(CommCountParams.none())

        /** @see count */
        fun count(
            params: CommCountParams = CommCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: CommCountParams = CommCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(CommCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/comm/queryhelp`, but is otherwise the same as
         * [CommServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<CommQueryhelpResponse>> =
            queryhelp(CommQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: CommQueryhelpParams = CommQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: CommQueryhelpParams = CommQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<CommQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommQueryhelpResponse>> =
            queryhelp(CommQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/comm/tuple`, but is otherwise the same as
         * [CommServiceAsync.tuple].
         */
        fun tuple(params: CommTupleParams): CompletableFuture<HttpResponseFor<List<CommFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: CommTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CommFull>>>
    }
}
