// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.ElsetCountParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkFromTleParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateParams
import com.unifieddatalibrary.api.models.elsets.ElsetListPageAsync
import com.unifieddatalibrary.api.models.elsets.ElsetListParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetRetrieveParams
import com.unifieddatalibrary.api.models.elsets.ElsetTupleParams
import com.unifieddatalibrary.api.models.elsets.ElsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.elsets.CurrentServiceAsync
import com.unifieddatalibrary.api.services.async.elsets.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ElsetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ElsetServiceAsync

    fun current(): CurrentServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single elset as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun create(params: ElsetCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ElsetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Service operation to get a single elset by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<Elset> = retrieve(id, ElsetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Elset> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
    ): CompletableFuture<Elset> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ElsetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Elset>

    /** @see retrieve */
    fun retrieve(params: ElsetRetrieveParams): CompletableFuture<Elset> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Elset> =
        retrieve(id, ElsetRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ElsetListParams): CompletableFuture<ElsetListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ElsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ElsetListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ElsetCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ElsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of elsets as a POST
     * body and ingest into the database with or without dupe detection. Default is no dupe
     * checking. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun createBulk(params: ElsetCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: ElsetCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to take a multiple TLEs as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulkFromTle(params: ElsetCreateBulkFromTleParams): CompletableFuture<Void?> =
        createBulkFromTle(params, RequestOptions.none())

    /** @see createBulkFromTle */
    fun createBulkFromTle(
        params: ElsetCreateBulkFromTleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryCurrentElsetHelp(): CompletableFuture<ElsetQueryCurrentElsetHelpResponse> =
        queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none())

    /** @see queryCurrentElsetHelp */
    fun queryCurrentElsetHelp(
        params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ElsetQueryCurrentElsetHelpResponse>

    /** @see queryCurrentElsetHelp */
    fun queryCurrentElsetHelp(
        params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none()
    ): CompletableFuture<ElsetQueryCurrentElsetHelpResponse> =
        queryCurrentElsetHelp(params, RequestOptions.none())

    /** @see queryCurrentElsetHelp */
    fun queryCurrentElsetHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<ElsetQueryCurrentElsetHelpResponse> =
        queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<ElsetQueryhelpResponse> =
        queryhelp(ElsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ElsetQueryhelpParams = ElsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ElsetQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: ElsetQueryhelpParams = ElsetQueryhelpParams.none()
    ): CompletableFuture<ElsetQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ElsetQueryhelpResponse> =
        queryhelp(ElsetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ElsetTupleParams): CompletableFuture<List<Elset>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ElsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Elset>>

    /**
     * Service operation to take elsets as a POST body and ingest into the database with or without
     * dupe detection. Default is no dupe checking. This operation is intended to be used for
     * automated feeds into UDL.
     */
    fun unvalidatedPublish(params: ElsetUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ElsetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ElsetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ElsetServiceAsync.WithRawResponse

        fun current(): CurrentServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/elset`, but is otherwise the same as
         * [ElsetServiceAsync.create].
         */
        fun create(params: ElsetCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ElsetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/elset/{id}`, but is otherwise the same as
         * [ElsetServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Elset>> =
            retrieve(id, ElsetRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Elset>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Elset>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ElsetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Elset>>

        /** @see retrieve */
        fun retrieve(params: ElsetRetrieveParams): CompletableFuture<HttpResponseFor<Elset>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Elset>> =
            retrieve(id, ElsetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset`, but is otherwise the same as
         * [ElsetServiceAsync.list].
         */
        fun list(params: ElsetListParams): CompletableFuture<HttpResponseFor<ElsetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ElsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ElsetListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/elset/count`, but is otherwise the same as
         * [ElsetServiceAsync.count].
         */
        fun count(params: ElsetCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: ElsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/elset/createBulk`, but is otherwise the same
         * as [ElsetServiceAsync.createBulk].
         */
        fun createBulk(params: ElsetCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: ElsetCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /udl/elset/createBulkFromTLE`, but is otherwise the
         * same as [ElsetServiceAsync.createBulkFromTle].
         */
        fun createBulkFromTle(
            params: ElsetCreateBulkFromTleParams
        ): CompletableFuture<HttpResponse> = createBulkFromTle(params, RequestOptions.none())

        /** @see createBulkFromTle */
        fun createBulkFromTle(
            params: ElsetCreateBulkFromTleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/currentelset/queryhelp`, but is otherwise the
         * same as [ElsetServiceAsync.queryCurrentElsetHelp].
         */
        fun queryCurrentElsetHelp():
            CompletableFuture<HttpResponseFor<ElsetQueryCurrentElsetHelpResponse>> =
            queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none())

        /** @see queryCurrentElsetHelp */
        fun queryCurrentElsetHelp(
            params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ElsetQueryCurrentElsetHelpResponse>>

        /** @see queryCurrentElsetHelp */
        fun queryCurrentElsetHelp(
            params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none()
        ): CompletableFuture<HttpResponseFor<ElsetQueryCurrentElsetHelpResponse>> =
            queryCurrentElsetHelp(params, RequestOptions.none())

        /** @see queryCurrentElsetHelp */
        fun queryCurrentElsetHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ElsetQueryCurrentElsetHelpResponse>> =
            queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset/queryhelp`, but is otherwise the same as
         * [ElsetServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ElsetQueryhelpResponse>> =
            queryhelp(ElsetQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: ElsetQueryhelpParams = ElsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ElsetQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: ElsetQueryhelpParams = ElsetQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<ElsetQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ElsetQueryhelpResponse>> =
            queryhelp(ElsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset/tuple`, but is otherwise the same as
         * [ElsetServiceAsync.tuple].
         */
        fun tuple(params: ElsetTupleParams): CompletableFuture<HttpResponseFor<List<Elset>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: ElsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Elset>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-elset`, but is otherwise the same as
         * [ElsetServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: ElsetUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: ElsetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
