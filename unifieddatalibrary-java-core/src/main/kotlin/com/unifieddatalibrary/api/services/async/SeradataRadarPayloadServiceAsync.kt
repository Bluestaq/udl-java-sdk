// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCountParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListPageAsync
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeradataRadarPayloadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataRadarPayloadServiceAsync

    /**
     * Service operation to take a single SeradataRadarPayload as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeradataRadarPayloadCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeradataRadarPayloadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update an SeradataRadarPayload. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SeradataRadarPayloadUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeradataRadarPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeradataRadarPayloadUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeradataRadarPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SeradataRadarPayloadListPageAsync> =
        list(SeradataRadarPayloadListParams.none())

    /** @see list */
    fun list(
        params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataRadarPayloadListPageAsync>

    /** @see list */
    fun list(
        params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none()
    ): CompletableFuture<SeradataRadarPayloadListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SeradataRadarPayloadListPageAsync> =
        list(SeradataRadarPayloadListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataRadarPayload specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, SeradataRadarPayloadDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeradataRadarPayloadDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeradataRadarPayloadDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SeradataRadarPayloadDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SeradataRadarPayloadCountParams.none())

    /** @see count */
    fun count(
        params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SeradataRadarPayloadCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataRadarPayload by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SeradataRadarPayloadGetResponse> =
        get(id, SeradataRadarPayloadGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataRadarPayloadGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none(),
    ): CompletableFuture<SeradataRadarPayloadGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeradataRadarPayloadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataRadarPayloadGetResponse>

    /** @see get */
    fun get(
        params: SeradataRadarPayloadGetParams
    ): CompletableFuture<SeradataRadarPayloadGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeradataRadarPayloadGetResponse> =
        get(id, SeradataRadarPayloadGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SeradataRadarPayloadQueryhelpResponse> =
        queryhelp(SeradataRadarPayloadQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataRadarPayloadQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none()
    ): CompletableFuture<SeradataRadarPayloadQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SeradataRadarPayloadQueryhelpResponse> =
        queryhelp(SeradataRadarPayloadQueryhelpParams.none(), requestOptions)

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
        params: SeradataRadarPayloadTupleParams
    ): CompletableFuture<List<SeradataRadarPayloadTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeradataRadarPayloadTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SeradataRadarPayloadTupleResponse>>

    /**
     * A view of [SeradataRadarPayloadServiceAsync] that provides access to raw HTTP responses for
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
        ): SeradataRadarPayloadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradataradarpayload`, but is otherwise the
         * same as [SeradataRadarPayloadServiceAsync.create].
         */
        fun create(params: SeradataRadarPayloadCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SeradataRadarPayloadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/seradataradarpayload/{id}`, but is otherwise
         * the same as [SeradataRadarPayloadServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SeradataRadarPayloadUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SeradataRadarPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SeradataRadarPayloadUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SeradataRadarPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/seradataradarpayload`, but is otherwise the
         * same as [SeradataRadarPayloadServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SeradataRadarPayloadListPageAsync>> =
            list(SeradataRadarPayloadListParams.none())

        /** @see list */
        fun list(
            params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadListPageAsync>>

        /** @see list */
        fun list(
            params: SeradataRadarPayloadListParams = SeradataRadarPayloadListParams.none()
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadListPageAsync>> =
            list(SeradataRadarPayloadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradataradarpayload/{id}`, but is otherwise
         * the same as [SeradataRadarPayloadServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SeradataRadarPayloadDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SeradataRadarPayloadDeleteParams = SeradataRadarPayloadDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SeradataRadarPayloadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeradataRadarPayloadDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SeradataRadarPayloadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataradarpayload/count`, but is otherwise
         * the same as [SeradataRadarPayloadServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SeradataRadarPayloadCountParams.none())

        /** @see count */
        fun count(
            params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SeradataRadarPayloadCountParams = SeradataRadarPayloadCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SeradataRadarPayloadCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataradarpayload/{id}`, but is otherwise
         * the same as [SeradataRadarPayloadServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SeradataRadarPayloadGetResponse>> =
            get(id, SeradataRadarPayloadGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SeradataRadarPayloadGetParams = SeradataRadarPayloadGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SeradataRadarPayloadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadGetResponse>>

        /** @see get */
        fun get(
            params: SeradataRadarPayloadGetParams
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadGetResponse>> =
            get(id, SeradataRadarPayloadGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataradarpayload/queryhelp`, but is
         * otherwise the same as [SeradataRadarPayloadServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SeradataRadarPayloadQueryhelpResponse>> =
            queryhelp(SeradataRadarPayloadQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SeradataRadarPayloadQueryhelpParams =
                SeradataRadarPayloadQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SeradataRadarPayloadQueryhelpParams = SeradataRadarPayloadQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeradataRadarPayloadQueryhelpResponse>> =
            queryhelp(SeradataRadarPayloadQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataradarpayload/tuple`, but is otherwise
         * the same as [SeradataRadarPayloadServiceAsync.tuple].
         */
        fun tuple(
            params: SeradataRadarPayloadTupleParams
        ): CompletableFuture<HttpResponseFor<List<SeradataRadarPayloadTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SeradataRadarPayloadTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SeradataRadarPayloadTupleResponse>>>
    }
}
