// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.vessel.VesselCountParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateBulkParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateParams
import com.unifieddatalibrary.api.models.vessel.VesselGetParams
import com.unifieddatalibrary.api.models.vessel.VesselGetResponse
import com.unifieddatalibrary.api.models.vessel.VesselListPageAsync
import com.unifieddatalibrary.api.models.vessel.VesselListParams
import com.unifieddatalibrary.api.models.vessel.VesselQueryhelpParams
import com.unifieddatalibrary.api.models.vessel.VesselQueryhelpResponse
import com.unifieddatalibrary.api.models.vessel.VesselTupleParams
import com.unifieddatalibrary.api.models.vessel.VesselTupleResponse
import com.unifieddatalibrary.api.models.vessel.VesselUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VesselServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VesselServiceAsync

    /**
     * Service operation to take a single vessel record as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: VesselCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VesselCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single vessel record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: VesselUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: VesselUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: VesselUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VesselUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<VesselListPageAsync> = list(VesselListParams.none())

    /** @see list */
    fun list(
        params: VesselListParams = VesselListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VesselListPageAsync>

    /** @see list */
    fun list(
        params: VesselListParams = VesselListParams.none()
    ): CompletableFuture<VesselListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VesselListPageAsync> =
        list(VesselListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(VesselCountParams.none())

    /** @see count */
    fun count(
        params: VesselCountParams = VesselCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: VesselCountParams = VesselCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(VesselCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of vessel records as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: VesselCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: VesselCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single vessel record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<VesselGetResponse> = get(id, VesselGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: VesselGetParams = VesselGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VesselGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: VesselGetParams = VesselGetParams.none(),
    ): CompletableFuture<VesselGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: VesselGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VesselGetResponse>

    /** @see get */
    fun get(params: VesselGetParams): CompletableFuture<VesselGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<VesselGetResponse> =
        get(id, VesselGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<VesselQueryhelpResponse> =
        queryhelp(VesselQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: VesselQueryhelpParams = VesselQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VesselQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: VesselQueryhelpParams = VesselQueryhelpParams.none()
    ): CompletableFuture<VesselQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<VesselQueryhelpResponse> =
        queryhelp(VesselQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: VesselTupleParams): CompletableFuture<List<VesselTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: VesselTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<VesselTupleResponse>>

    /**
     * A view of [VesselServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VesselServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/vessel`, but is otherwise the same as
         * [VesselServiceAsync.create].
         */
        fun create(params: VesselCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VesselCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/vessel/{id}`, but is otherwise the same as
         * [VesselServiceAsync.update].
         */
        fun update(pathId: String, params: VesselUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: VesselUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: VesselUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VesselUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/vessel`, but is otherwise the same as
         * [VesselServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VesselListPageAsync>> =
            list(VesselListParams.none())

        /** @see list */
        fun list(
            params: VesselListParams = VesselListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VesselListPageAsync>>

        /** @see list */
        fun list(
            params: VesselListParams = VesselListParams.none()
        ): CompletableFuture<HttpResponseFor<VesselListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VesselListPageAsync>> =
            list(VesselListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/vessel/count`, but is otherwise the same as
         * [VesselServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(VesselCountParams.none())

        /** @see count */
        fun count(
            params: VesselCountParams = VesselCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: VesselCountParams = VesselCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(VesselCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/vessel/createBulk`, but is otherwise the same
         * as [VesselServiceAsync.createBulk].
         */
        fun createBulk(params: VesselCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: VesselCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/vessel/{id}`, but is otherwise the same as
         * [VesselServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<VesselGetResponse>> =
            get(id, VesselGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: VesselGetParams = VesselGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VesselGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: VesselGetParams = VesselGetParams.none(),
        ): CompletableFuture<HttpResponseFor<VesselGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: VesselGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VesselGetResponse>>

        /** @see get */
        fun get(params: VesselGetParams): CompletableFuture<HttpResponseFor<VesselGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VesselGetResponse>> =
            get(id, VesselGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/vessel/queryhelp`, but is otherwise the same as
         * [VesselServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<VesselQueryhelpResponse>> =
            queryhelp(VesselQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: VesselQueryhelpParams = VesselQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VesselQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: VesselQueryhelpParams = VesselQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<VesselQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VesselQueryhelpResponse>> =
            queryhelp(VesselQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/vessel/tuple`, but is otherwise the same as
         * [VesselServiceAsync.tuple].
         */
        fun tuple(
            params: VesselTupleParams
        ): CompletableFuture<HttpResponseFor<List<VesselTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: VesselTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<VesselTupleResponse>>>
    }
}
