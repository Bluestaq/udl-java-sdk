// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCountParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCreateParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterDeleteParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListPageAsync
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterUpdateParams
import com.unifieddatalibrary.api.services.async.laseremitter.StagingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaseremitterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaseremitterServiceAsync

    fun staging(): StagingServiceAsync

    /**
     * Service operation to take a single LaserEmitter record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LaseremitterCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaseremitterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single LaserEmitter record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaseremitterUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaseremitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaseremitterUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaseremitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LaseremitterListPageAsync> = list(LaseremitterListParams.none())

    /** @see list */
    fun list(
        params: LaseremitterListParams = LaseremitterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaseremitterListPageAsync>

    /** @see list */
    fun list(
        params: LaseremitterListParams = LaseremitterListParams.none()
    ): CompletableFuture<LaseremitterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LaseremitterListPageAsync> =
        list(LaseremitterListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaserEmitter record specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, LaseremitterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaseremitterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LaseremitterDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LaseremitterDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(LaseremitterCountParams.none())

    /** @see count */
    fun count(
        params: LaseremitterCountParams = LaseremitterCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: LaseremitterCountParams = LaseremitterCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(LaseremitterCountParams.none(), requestOptions)

    /**
     * Service operation to get a single LaserEmitter record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<LaseremitterGetResponse> =
        get(id, LaseremitterGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaseremitterGetParams = LaseremitterGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaseremitterGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaseremitterGetParams = LaseremitterGetParams.none(),
    ): CompletableFuture<LaseremitterGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaseremitterGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaseremitterGetResponse>

    /** @see get */
    fun get(params: LaseremitterGetParams): CompletableFuture<LaseremitterGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaseremitterGetResponse> =
        get(id, LaseremitterGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LaseremitterQueryhelpResponse> =
        queryhelp(LaseremitterQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaseremitterQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none()
    ): CompletableFuture<LaseremitterQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<LaseremitterQueryhelpResponse> =
        queryhelp(LaseremitterQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaseremitterTupleParams): CompletableFuture<List<LaseremitterTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaseremitterTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaseremitterTupleResponse>>

    /**
     * A view of [LaseremitterServiceAsync] that provides access to raw HTTP responses for each
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
        ): LaseremitterServiceAsync.WithRawResponse

        fun staging(): StagingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/laseremitter`, but is otherwise the same as
         * [LaseremitterServiceAsync.create].
         */
        fun create(params: LaseremitterCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaseremitterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/laseremitter/{id}`, but is otherwise the same
         * as [LaseremitterServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: LaseremitterUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: LaseremitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: LaseremitterUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LaseremitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter`, but is otherwise the same as
         * [LaseremitterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LaseremitterListPageAsync>> =
            list(LaseremitterListParams.none())

        /** @see list */
        fun list(
            params: LaseremitterListParams = LaseremitterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaseremitterListPageAsync>>

        /** @see list */
        fun list(
            params: LaseremitterListParams = LaseremitterListParams.none()
        ): CompletableFuture<HttpResponseFor<LaseremitterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaseremitterListPageAsync>> =
            list(LaseremitterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/laseremitter/{id}`, but is otherwise the
         * same as [LaseremitterServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LaseremitterDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LaseremitterDeleteParams = LaseremitterDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LaseremitterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LaseremitterDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LaseremitterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/count`, but is otherwise the same
         * as [LaseremitterServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(LaseremitterCountParams.none())

        /** @see count */
        fun count(
            params: LaseremitterCountParams = LaseremitterCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: LaseremitterCountParams = LaseremitterCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(LaseremitterCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/{id}`, but is otherwise the same
         * as [LaseremitterServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>> =
            get(id, LaseremitterGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaseremitterGetParams = LaseremitterGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaseremitterGetParams = LaseremitterGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaseremitterGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>>

        /** @see get */
        fun get(
            params: LaseremitterGetParams
        ): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>> =
            get(id, LaseremitterGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/queryhelp`, but is otherwise the
         * same as [LaseremitterServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LaseremitterQueryhelpResponse>> =
            queryhelp(LaseremitterQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaseremitterQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LaseremitterQueryhelpParams = LaseremitterQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LaseremitterQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaseremitterQueryhelpResponse>> =
            queryhelp(LaseremitterQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/laseremitter/tuple`, but is otherwise the same
         * as [LaseremitterServiceAsync.tuple].
         */
        fun tuple(
            params: LaseremitterTupleParams
        ): CompletableFuture<HttpResponseFor<List<LaseremitterTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LaseremitterTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaseremitterTupleResponse>>>
    }
}
