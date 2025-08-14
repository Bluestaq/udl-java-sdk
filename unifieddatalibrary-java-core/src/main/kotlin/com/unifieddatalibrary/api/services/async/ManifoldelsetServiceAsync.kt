// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCountParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateBulkParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetDeleteParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListPageAsync
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetQueryhelpParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetQueryhelpResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ManifoldelsetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldelsetServiceAsync

    /**
     * Service operation to take a single ManifoldElset as a POST body and ingest into the database.
     * A ManifoldElset represents theoretical Keplarian orbital elements belonging to an object of
     * interest's manifold describing a possible/theoretical orbit for an object of interest for
     * tasking purposes. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: ManifoldelsetCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ManifoldelsetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single ManifoldElset. A ManifoldElset represents theoretical
     * Keplarian orbital elements belonging to an object of interest's manifold describing a
     * possible/theoretical orbit for an object of interest for tasking purposes. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: ManifoldelsetUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: ManifoldelsetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: ManifoldelsetUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ManifoldelsetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ManifoldelsetListParams): CompletableFuture<ManifoldelsetListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ManifoldelsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManifoldelsetListPageAsync>

    /**
     * Service operation to delete a ManifoldElset object specified by the passed ID path parameter.
     * A ManifoldElset represents theoretical Keplarian orbital elements belonging to an object of
     * interest's manifold describing a possible/theoretical orbit for an object of interest for
     * tasking purposes. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, ManifoldelsetDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ManifoldelsetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ManifoldelsetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ManifoldelsetDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ManifoldelsetCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ManifoldelsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to take multiple ManifoldElsets as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun createBulk(params: ManifoldelsetCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: ManifoldelsetCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single ManifoldElset record by its unique ID passed as a path
     * parameter. A ManifoldElset represents theoretical Keplarian orbital elements belonging to an
     * object of interest's manifold describing a possible/theoretical orbit for an object of
     * interest for tasking purposes.
     */
    fun get(id: String): CompletableFuture<ManifoldelsetGetResponse> =
        get(id, ManifoldelsetGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManifoldelsetGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
    ): CompletableFuture<ManifoldelsetGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ManifoldelsetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManifoldelsetGetResponse>

    /** @see get */
    fun get(params: ManifoldelsetGetParams): CompletableFuture<ManifoldelsetGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManifoldelsetGetResponse> =
        get(id, ManifoldelsetGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<ManifoldelsetQueryhelpResponse> =
        queryhelp(ManifoldelsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManifoldelsetQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none()
    ): CompletableFuture<ManifoldelsetQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<ManifoldelsetQueryhelpResponse> =
        queryhelp(ManifoldelsetQueryhelpParams.none(), requestOptions)

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
        params: ManifoldelsetTupleParams
    ): CompletableFuture<List<ManifoldelsetTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ManifoldelsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ManifoldelsetTupleResponse>>

    /**
     * A view of [ManifoldelsetServiceAsync] that provides access to raw HTTP responses for each
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
        ): ManifoldelsetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/manifoldelset`, but is otherwise the same as
         * [ManifoldelsetServiceAsync.create].
         */
        fun create(params: ManifoldelsetCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ManifoldelsetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/manifoldelset/{id}`, but is otherwise the same
         * as [ManifoldelsetServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: ManifoldelsetUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: ManifoldelsetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: ManifoldelsetUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ManifoldelsetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset`, but is otherwise the same as
         * [ManifoldelsetServiceAsync.list].
         */
        fun list(
            params: ManifoldelsetListParams
        ): CompletableFuture<HttpResponseFor<ManifoldelsetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ManifoldelsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManifoldelsetListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/manifoldelset/{id}`, but is otherwise the
         * same as [ManifoldelsetServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ManifoldelsetDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ManifoldelsetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ManifoldelsetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ManifoldelsetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/count`, but is otherwise the same
         * as [ManifoldelsetServiceAsync.count].
         */
        fun count(params: ManifoldelsetCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: ManifoldelsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/manifoldelset/createBulk`, but is otherwise
         * the same as [ManifoldelsetServiceAsync.createBulk].
         */
        fun createBulk(params: ManifoldelsetCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: ManifoldelsetCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/{id}`, but is otherwise the same
         * as [ManifoldelsetServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<ManifoldelsetGetResponse>> =
            get(id, ManifoldelsetGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManifoldelsetGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ManifoldelsetGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ManifoldelsetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManifoldelsetGetResponse>>

        /** @see get */
        fun get(
            params: ManifoldelsetGetParams
        ): CompletableFuture<HttpResponseFor<ManifoldelsetGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManifoldelsetGetResponse>> =
            get(id, ManifoldelsetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/queryhelp`, but is otherwise the
         * same as [ManifoldelsetServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ManifoldelsetQueryhelpResponse>> =
            queryhelp(ManifoldelsetQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManifoldelsetQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<ManifoldelsetQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ManifoldelsetQueryhelpResponse>> =
            queryhelp(ManifoldelsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/tuple`, but is otherwise the same
         * as [ManifoldelsetServiceAsync.tuple].
         */
        fun tuple(
            params: ManifoldelsetTupleParams
        ): CompletableFuture<HttpResponseFor<List<ManifoldelsetTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: ManifoldelsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ManifoldelsetTupleResponse>>>
    }
}
