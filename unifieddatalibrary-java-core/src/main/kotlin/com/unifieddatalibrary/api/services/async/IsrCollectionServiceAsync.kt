// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCountParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCreateBulkParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListPageAsync
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.isrcollections.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IsrCollectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsrCollectionServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: IsrCollectionListParams): CompletableFuture<IsrCollectionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IsrCollectionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IsrCollectionListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: IsrCollectionCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: IsrCollectionCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of ISRCollection
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: IsrCollectionCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: IsrCollectionCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<IsrCollectionQueryhelpResponse> =
        queryhelp(IsrCollectionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: IsrCollectionQueryhelpParams = IsrCollectionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IsrCollectionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: IsrCollectionQueryhelpParams = IsrCollectionQueryhelpParams.none()
    ): CompletableFuture<IsrCollectionQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<IsrCollectionQueryhelpResponse> =
        queryhelp(IsrCollectionQueryhelpParams.none(), requestOptions)

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
        params: IsrCollectionTupleParams
    ): CompletableFuture<List<IsrCollectionTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: IsrCollectionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<IsrCollectionTupleResponse>>

    /**
     * Service operation to take multiple ISR Collections as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: IsrCollectionUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: IsrCollectionUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [IsrCollectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): IsrCollectionServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/isrcollection`, but is otherwise the same as
         * [IsrCollectionServiceAsync.list].
         */
        fun list(
            params: IsrCollectionListParams
        ): CompletableFuture<HttpResponseFor<IsrCollectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: IsrCollectionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IsrCollectionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/isrcollection/count`, but is otherwise the same
         * as [IsrCollectionServiceAsync.count].
         */
        fun count(params: IsrCollectionCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: IsrCollectionCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/isrcollection/createBulk`, but is otherwise
         * the same as [IsrCollectionServiceAsync.createBulk].
         */
        fun createBulk(params: IsrCollectionCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: IsrCollectionCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/isrcollection/queryhelp`, but is otherwise the
         * same as [IsrCollectionServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<IsrCollectionQueryhelpResponse>> =
            queryhelp(IsrCollectionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: IsrCollectionQueryhelpParams = IsrCollectionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IsrCollectionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: IsrCollectionQueryhelpParams = IsrCollectionQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<IsrCollectionQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IsrCollectionQueryhelpResponse>> =
            queryhelp(IsrCollectionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/isrcollection/tuple`, but is otherwise the same
         * as [IsrCollectionServiceAsync.tuple].
         */
        fun tuple(
            params: IsrCollectionTupleParams
        ): CompletableFuture<HttpResponseFor<List<IsrCollectionTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: IsrCollectionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<IsrCollectionTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-isrcollection`, but is otherwise the
         * same as [IsrCollectionServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: IsrCollectionUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: IsrCollectionUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
