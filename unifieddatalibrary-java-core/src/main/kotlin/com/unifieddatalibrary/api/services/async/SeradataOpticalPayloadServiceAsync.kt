// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCountParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListPageAsync
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeradataOpticalPayloadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataOpticalPayloadServiceAsync

    /**
     * Service operation to take a single SeradataOpticalPayload as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SeradataOpticalPayloadCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SeradataOpticalPayloadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update an SeradataOpticalPayload. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(
        pathId: String,
        params: SeradataOpticalPayloadUpdateParams,
    ): CompletableFuture<Void?> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SeradataOpticalPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SeradataOpticalPayloadUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SeradataOpticalPayloadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SeradataOpticalPayloadListPageAsync> =
        list(SeradataOpticalPayloadListParams.none())

    /** @see list */
    fun list(
        params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataOpticalPayloadListPageAsync>

    /** @see list */
    fun list(
        params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none()
    ): CompletableFuture<SeradataOpticalPayloadListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<SeradataOpticalPayloadListPageAsync> =
        list(SeradataOpticalPayloadListParams.none(), requestOptions)

    /**
     * Service operation to delete an SeradataOpticalPayload specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, SeradataOpticalPayloadDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SeradataOpticalPayloadDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeradataOpticalPayloadDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SeradataOpticalPayloadDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SeradataOpticalPayloadCountParams.none())

    /** @see count */
    fun count(
        params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SeradataOpticalPayloadCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SeradataOpticalPayload by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SeradataOpticalPayloadGetResponse> =
        get(id, SeradataOpticalPayloadGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataOpticalPayloadGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
    ): CompletableFuture<SeradataOpticalPayloadGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SeradataOpticalPayloadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataOpticalPayloadGetResponse>

    /** @see get */
    fun get(
        params: SeradataOpticalPayloadGetParams
    ): CompletableFuture<SeradataOpticalPayloadGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeradataOpticalPayloadGetResponse> =
        get(id, SeradataOpticalPayloadGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SeradataOpticalPayloadQueryhelpResponse> =
        queryhelp(SeradataOpticalPayloadQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataOpticalPayloadQueryhelpParams =
            SeradataOpticalPayloadQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SeradataOpticalPayloadQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SeradataOpticalPayloadQueryhelpParams = SeradataOpticalPayloadQueryhelpParams.none()
    ): CompletableFuture<SeradataOpticalPayloadQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SeradataOpticalPayloadQueryhelpResponse> =
        queryhelp(SeradataOpticalPayloadQueryhelpParams.none(), requestOptions)

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
        params: SeradataOpticalPayloadTupleParams
    ): CompletableFuture<List<SeradataOpticalPayloadTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SeradataOpticalPayloadTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SeradataOpticalPayloadTupleResponse>>

    /**
     * A view of [SeradataOpticalPayloadServiceAsync] that provides access to raw HTTP responses for
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
        ): SeradataOpticalPayloadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/seradataopticalpayload`, but is otherwise the
         * same as [SeradataOpticalPayloadServiceAsync.create].
         */
        fun create(params: SeradataOpticalPayloadCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SeradataOpticalPayloadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/seradataopticalpayload/{id}`, but is otherwise
         * the same as [SeradataOpticalPayloadServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SeradataOpticalPayloadUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SeradataOpticalPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SeradataOpticalPayloadUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SeradataOpticalPayloadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload`, but is otherwise the
         * same as [SeradataOpticalPayloadServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadListPageAsync>> =
            list(SeradataOpticalPayloadListParams.none())

        /** @see list */
        fun list(
            params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadListPageAsync>>

        /** @see list */
        fun list(
            params: SeradataOpticalPayloadListParams = SeradataOpticalPayloadListParams.none()
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadListPageAsync>> =
            list(SeradataOpticalPayloadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/seradataopticalpayload/{id}`, but is
         * otherwise the same as [SeradataOpticalPayloadServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SeradataOpticalPayloadDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SeradataOpticalPayloadDeleteParams = SeradataOpticalPayloadDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SeradataOpticalPayloadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeradataOpticalPayloadDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SeradataOpticalPayloadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/count`, but is otherwise
         * the same as [SeradataOpticalPayloadServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SeradataOpticalPayloadCountParams.none())

        /** @see count */
        fun count(
            params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SeradataOpticalPayloadCountParams = SeradataOpticalPayloadCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SeradataOpticalPayloadCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/{id}`, but is otherwise
         * the same as [SeradataOpticalPayloadServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>> =
            get(id, SeradataOpticalPayloadGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SeradataOpticalPayloadGetParams = SeradataOpticalPayloadGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SeradataOpticalPayloadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>>

        /** @see get */
        fun get(
            params: SeradataOpticalPayloadGetParams
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>> =
            get(id, SeradataOpticalPayloadGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/queryhelp`, but is
         * otherwise the same as [SeradataOpticalPayloadServiceAsync.queryhelp].
         */
        fun queryhelp():
            CompletableFuture<HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse>> =
            queryhelp(SeradataOpticalPayloadQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SeradataOpticalPayloadQueryhelpParams =
                SeradataOpticalPayloadQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SeradataOpticalPayloadQueryhelpParams =
                SeradataOpticalPayloadQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse>> =
            queryhelp(SeradataOpticalPayloadQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/seradataopticalpayload/tuple`, but is otherwise
         * the same as [SeradataOpticalPayloadServiceAsync.tuple].
         */
        fun tuple(
            params: SeradataOpticalPayloadTupleParams
        ): CompletableFuture<HttpResponseFor<List<SeradataOpticalPayloadTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SeradataOpticalPayloadTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SeradataOpticalPayloadTupleResponse>>>
    }
}
