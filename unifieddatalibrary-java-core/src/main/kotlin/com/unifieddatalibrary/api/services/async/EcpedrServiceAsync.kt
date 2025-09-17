// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCountParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateBulkParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListPageAsync
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrQueryhelpParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrQueryhelpResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.ecpedr.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EcpedrServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EcpedrServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single ECPEDR record as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: EcpedrCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EcpedrCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EcpedrListParams): CompletableFuture<EcpedrListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EcpedrListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EcpedrListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EcpedrCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EcpedrCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of ECPEDR records as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EcpedrCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EcpedrCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<EcpedrQueryhelpResponse> =
        queryhelp(EcpedrQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EcpedrQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none()
    ): CompletableFuture<EcpedrQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<EcpedrQueryhelpResponse> =
        queryhelp(EcpedrQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EcpedrTupleParams): CompletableFuture<List<EcpedrTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EcpedrTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EcpedrTupleResponse>>

    /**
     * Service operation to take multiple ECPEDR records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: EcpedrUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EcpedrUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EcpedrServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EcpedrServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/ecpedr`, but is otherwise the same as
         * [EcpedrServiceAsync.create].
         */
        fun create(params: EcpedrCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EcpedrCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr`, but is otherwise the same as
         * [EcpedrServiceAsync.list].
         */
        fun list(
            params: EcpedrListParams
        ): CompletableFuture<HttpResponseFor<EcpedrListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EcpedrListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EcpedrListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr/count`, but is otherwise the same as
         * [EcpedrServiceAsync.count].
         */
        fun count(params: EcpedrCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: EcpedrCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/ecpedr/createBulk`, but is otherwise the same
         * as [EcpedrServiceAsync.createBulk].
         */
        fun createBulk(params: EcpedrCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: EcpedrCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr/queryhelp`, but is otherwise the same as
         * [EcpedrServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<EcpedrQueryhelpResponse>> =
            queryhelp(EcpedrQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EcpedrQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<EcpedrQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EcpedrQueryhelpResponse>> =
            queryhelp(EcpedrQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr/tuple`, but is otherwise the same as
         * [EcpedrServiceAsync.tuple].
         */
        fun tuple(
            params: EcpedrTupleParams
        ): CompletableFuture<HttpResponseFor<List<EcpedrTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EcpedrTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EcpedrTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-ecpedr`, but is otherwise the same as
         * [EcpedrServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: EcpedrUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: EcpedrUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
