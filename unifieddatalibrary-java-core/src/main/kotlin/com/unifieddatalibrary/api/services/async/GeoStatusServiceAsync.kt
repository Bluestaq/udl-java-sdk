// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCountParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateBulkParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusGetParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListPageAsync
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.geostatus.GeoStatusTupleParams
import com.unifieddatalibrary.api.models.geostatus.history.GeoStatusFull
import com.unifieddatalibrary.api.services.async.geostatus.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GeoStatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single GEOStatus record as a POST body and ingest into the
     * database. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun create(params: GeoStatusCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GeoStatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: GeoStatusListParams): CompletableFuture<GeoStatusListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GeoStatusListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeoStatusListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: GeoStatusCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: GeoStatusCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of GEOStatus records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: GeoStatusCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: GeoStatusCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single GEOStatus record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<GeoStatusFull> = get(id, GeoStatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GeoStatusGetParams = GeoStatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeoStatusFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: GeoStatusGetParams = GeoStatusGetParams.none(),
    ): CompletableFuture<GeoStatusFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GeoStatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeoStatusFull>

    /** @see get */
    fun get(params: GeoStatusGetParams): CompletableFuture<GeoStatusFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<GeoStatusFull> =
        get(id, GeoStatusGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<GeoStatusQueryhelpResponse> =
        queryhelp(GeoStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeoStatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none()
    ): CompletableFuture<GeoStatusQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<GeoStatusQueryhelpResponse> =
        queryhelp(GeoStatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: GeoStatusTupleParams): CompletableFuture<List<GeoStatusFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: GeoStatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<GeoStatusFull>>

    /**
     * A view of [GeoStatusServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeoStatusServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/geostatus`, but is otherwise the same as
         * [GeoStatusServiceAsync.create].
         */
        fun create(params: GeoStatusCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GeoStatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/geostatus`, but is otherwise the same as
         * [GeoStatusServiceAsync.list].
         */
        fun list(
            params: GeoStatusListParams
        ): CompletableFuture<HttpResponseFor<GeoStatusListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GeoStatusListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeoStatusListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/count`, but is otherwise the same as
         * [GeoStatusServiceAsync.count].
         */
        fun count(params: GeoStatusCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: GeoStatusCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/geostatus/createBulk`, but is otherwise the
         * same as [GeoStatusServiceAsync.createBulk].
         */
        fun createBulk(params: GeoStatusCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: GeoStatusCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/{id}`, but is otherwise the same as
         * [GeoStatusServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<GeoStatusFull>> =
            get(id, GeoStatusGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: GeoStatusGetParams = GeoStatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeoStatusFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: GeoStatusGetParams = GeoStatusGetParams.none(),
        ): CompletableFuture<HttpResponseFor<GeoStatusFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: GeoStatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeoStatusFull>>

        /** @see get */
        fun get(params: GeoStatusGetParams): CompletableFuture<HttpResponseFor<GeoStatusFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeoStatusFull>> =
            get(id, GeoStatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/queryhelp`, but is otherwise the same
         * as [GeoStatusServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<GeoStatusQueryhelpResponse>> =
            queryhelp(GeoStatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeoStatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<GeoStatusQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GeoStatusQueryhelpResponse>> =
            queryhelp(GeoStatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/tuple`, but is otherwise the same as
         * [GeoStatusServiceAsync.tuple].
         */
        fun tuple(
            params: GeoStatusTupleParams
        ): CompletableFuture<HttpResponseFor<List<GeoStatusFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: GeoStatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<GeoStatusFull>>>
    }
}
