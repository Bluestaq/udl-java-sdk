// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCountParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCreateParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListPageAsync
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RfEmitterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterServiceAsync

    /**
     * Service operation to take a single RFEmitter as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: RfEmitterCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RfEmitterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single RFEmitter record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: RfEmitterUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: RfEmitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: RfEmitterUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RfEmitterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<RfEmitterListPageAsync> = list(RfEmitterListParams.none())

    /** @see list */
    fun list(
        params: RfEmitterListParams = RfEmitterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterListPageAsync>

    /** @see list */
    fun list(
        params: RfEmitterListParams = RfEmitterListParams.none()
    ): CompletableFuture<RfEmitterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RfEmitterListPageAsync> =
        list(RfEmitterListParams.none(), requestOptions)

    /**
     * Service operation to delete a RFEmitter record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, RfEmitterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RfEmitterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RfEmitterDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, RfEmitterDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(RfEmitterCountParams.none())

    /** @see count */
    fun count(
        params: RfEmitterCountParams = RfEmitterCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: RfEmitterCountParams = RfEmitterCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(RfEmitterCountParams.none(), requestOptions)

    /**
     * Service operation to get a single RFEmitter record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<RfEmitterGetResponse> =
        get(id, RfEmitterGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: RfEmitterGetParams = RfEmitterGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: RfEmitterGetParams = RfEmitterGetParams.none(),
    ): CompletableFuture<RfEmitterGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RfEmitterGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterGetResponse>

    /** @see get */
    fun get(params: RfEmitterGetParams): CompletableFuture<RfEmitterGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<RfEmitterGetResponse> =
        get(id, RfEmitterGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<RfEmitterQueryhelpResponse> =
        queryhelp(RfEmitterQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfEmitterQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none()
    ): CompletableFuture<RfEmitterQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<RfEmitterQueryhelpResponse> =
        queryhelp(RfEmitterQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: RfEmitterTupleParams): CompletableFuture<List<RfEmitterTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: RfEmitterTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RfEmitterTupleResponse>>

    /**
     * A view of [RfEmitterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RfEmitterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfemitter`, but is otherwise the same as
         * [RfEmitterServiceAsync.create].
         */
        fun create(params: RfEmitterCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RfEmitterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/rfemitter/{id}`, but is otherwise the same as
         * [RfEmitterServiceAsync.update].
         */
        fun update(pathId: String, params: RfEmitterUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: RfEmitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: RfEmitterUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RfEmitterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter`, but is otherwise the same as
         * [RfEmitterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RfEmitterListPageAsync>> =
            list(RfEmitterListParams.none())

        /** @see list */
        fun list(
            params: RfEmitterListParams = RfEmitterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterListPageAsync>>

        /** @see list */
        fun list(
            params: RfEmitterListParams = RfEmitterListParams.none()
        ): CompletableFuture<HttpResponseFor<RfEmitterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfEmitterListPageAsync>> =
            list(RfEmitterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfemitter/{id}`, but is otherwise the same
         * as [RfEmitterServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, RfEmitterDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: RfEmitterDeleteParams = RfEmitterDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RfEmitterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RfEmitterDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, RfEmitterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/count`, but is otherwise the same as
         * [RfEmitterServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(RfEmitterCountParams.none())

        /** @see count */
        fun count(
            params: RfEmitterCountParams = RfEmitterCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: RfEmitterCountParams = RfEmitterCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(RfEmitterCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/{id}`, but is otherwise the same as
         * [RfEmitterServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>> =
            get(id, RfEmitterGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: RfEmitterGetParams = RfEmitterGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: RfEmitterGetParams = RfEmitterGetParams.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RfEmitterGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>>

        /** @see get */
        fun get(
            params: RfEmitterGetParams
        ): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>> =
            get(id, RfEmitterGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/queryhelp`, but is otherwise the same
         * as [RfEmitterServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<RfEmitterQueryhelpResponse>> =
            queryhelp(RfEmitterQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfEmitterQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: RfEmitterQueryhelpParams = RfEmitterQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<RfEmitterQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfEmitterQueryhelpResponse>> =
            queryhelp(RfEmitterQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfemitter/tuple`, but is otherwise the same as
         * [RfEmitterServiceAsync.tuple].
         */
        fun tuple(
            params: RfEmitterTupleParams
        ): CompletableFuture<HttpResponseFor<List<RfEmitterTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: RfEmitterTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RfEmitterTupleResponse>>>
    }
}
