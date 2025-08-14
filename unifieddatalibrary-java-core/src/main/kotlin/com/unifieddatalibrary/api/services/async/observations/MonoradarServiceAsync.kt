// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCountParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCreateBulkParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListPageAsync
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarQueryhelpParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.observations.monoradar.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MonoradarServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonoradarServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: MonoradarListParams): CompletableFuture<MonoradarListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MonoradarListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonoradarListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: MonoradarCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: MonoradarCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of MonoRadar records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: MonoradarCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: MonoradarCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<MonoradarQueryhelpResponse> =
        queryhelp(MonoradarQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonoradarQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none()
    ): CompletableFuture<MonoradarQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<MonoradarQueryhelpResponse> =
        queryhelp(MonoradarQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: MonoradarTupleParams): CompletableFuture<List<MonoradarTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: MonoradarTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<MonoradarTupleResponse>>

    /**
     * Service operation to take a list of MonoRadar records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: MonoradarUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: MonoradarUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [MonoradarServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MonoradarServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/monoradar`, but is otherwise the same as
         * [MonoradarServiceAsync.list].
         */
        fun list(
            params: MonoradarListParams
        ): CompletableFuture<HttpResponseFor<MonoradarListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MonoradarListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonoradarListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/monoradar/count`, but is otherwise the same as
         * [MonoradarServiceAsync.count].
         */
        fun count(params: MonoradarCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: MonoradarCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/monoradar/createBulk`, but is otherwise the
         * same as [MonoradarServiceAsync.createBulk].
         */
        fun createBulk(params: MonoradarCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: MonoradarCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/monoradar/queryhelp`, but is otherwise the same
         * as [MonoradarServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<MonoradarQueryhelpResponse>> =
            queryhelp(MonoradarQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonoradarQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<MonoradarQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MonoradarQueryhelpResponse>> =
            queryhelp(MonoradarQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/monoradar/tuple`, but is otherwise the same as
         * [MonoradarServiceAsync.tuple].
         */
        fun tuple(
            params: MonoradarTupleParams
        ): CompletableFuture<HttpResponseFor<List<MonoradarTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: MonoradarTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<MonoradarTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/monoradar`, but is otherwise the same as
         * [MonoradarServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: MonoradarUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: MonoradarUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
