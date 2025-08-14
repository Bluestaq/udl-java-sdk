// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.port.PortCountParams
import com.unifieddatalibrary.api.models.port.PortCreateBulkParams
import com.unifieddatalibrary.api.models.port.PortCreateParams
import com.unifieddatalibrary.api.models.port.PortGetParams
import com.unifieddatalibrary.api.models.port.PortGetResponse
import com.unifieddatalibrary.api.models.port.PortListPageAsync
import com.unifieddatalibrary.api.models.port.PortListParams
import com.unifieddatalibrary.api.models.port.PortQueryhelpParams
import com.unifieddatalibrary.api.models.port.PortQueryhelpResponse
import com.unifieddatalibrary.api.models.port.PortTupleParams
import com.unifieddatalibrary.api.models.port.PortTupleResponse
import com.unifieddatalibrary.api.models.port.PortUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PortServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortServiceAsync

    /**
     * Service operation to take a single port record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: PortCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PortCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single port record. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: PortUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: PortUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: PortUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<PortListPageAsync> = list(PortListParams.none())

    /** @see list */
    fun list(
        params: PortListParams = PortListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortListPageAsync>

    /** @see list */
    fun list(params: PortListParams = PortListParams.none()): CompletableFuture<PortListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PortListPageAsync> =
        list(PortListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(PortCountParams.none())

    /** @see count */
    fun count(
        params: PortCountParams = PortCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: PortCountParams = PortCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(PortCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of port records as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: PortCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: PortCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single port record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<PortGetResponse> = get(id, PortGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: PortGetParams = PortGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: PortGetParams = PortGetParams.none(),
    ): CompletableFuture<PortGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PortGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortGetResponse>

    /** @see get */
    fun get(params: PortGetParams): CompletableFuture<PortGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<PortGetResponse> =
        get(id, PortGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<PortQueryhelpResponse> =
        queryhelp(PortQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: PortQueryhelpParams = PortQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: PortQueryhelpParams = PortQueryhelpParams.none()
    ): CompletableFuture<PortQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<PortQueryhelpResponse> =
        queryhelp(PortQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: PortTupleParams): CompletableFuture<List<PortTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: PortTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PortTupleResponse>>

    /** A view of [PortServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/port`, but is otherwise the same as
         * [PortServiceAsync.create].
         */
        fun create(params: PortCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PortCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/port/{id}`, but is otherwise the same as
         * [PortServiceAsync.update].
         */
        fun update(pathId: String, params: PortUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: PortUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: PortUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PortUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/port`, but is otherwise the same as
         * [PortServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PortListPageAsync>> =
            list(PortListParams.none())

        /** @see list */
        fun list(
            params: PortListParams = PortListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortListPageAsync>>

        /** @see list */
        fun list(
            params: PortListParams = PortListParams.none()
        ): CompletableFuture<HttpResponseFor<PortListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortListPageAsync>> =
            list(PortListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/port/count`, but is otherwise the same as
         * [PortServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(PortCountParams.none())

        /** @see count */
        fun count(
            params: PortCountParams = PortCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: PortCountParams = PortCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(PortCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/port/createBulk`, but is otherwise the same as
         * [PortServiceAsync.createBulk].
         */
        fun createBulk(params: PortCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: PortCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/port/{id}`, but is otherwise the same as
         * [PortServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<PortGetResponse>> =
            get(id, PortGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: PortGetParams = PortGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: PortGetParams = PortGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PortGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PortGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortGetResponse>>

        /** @see get */
        fun get(params: PortGetParams): CompletableFuture<HttpResponseFor<PortGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortGetResponse>> =
            get(id, PortGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/port/queryhelp`, but is otherwise the same as
         * [PortServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<PortQueryhelpResponse>> =
            queryhelp(PortQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: PortQueryhelpParams = PortQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: PortQueryhelpParams = PortQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<PortQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortQueryhelpResponse>> =
            queryhelp(PortQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/port/tuple`, but is otherwise the same as
         * [PortServiceAsync.tuple].
         */
        fun tuple(
            params: PortTupleParams
        ): CompletableFuture<HttpResponseFor<List<PortTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: PortTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PortTupleResponse>>>
    }
}
