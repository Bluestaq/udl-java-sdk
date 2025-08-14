// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCountParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListPageAsync
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.effectresponses.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EffectResponseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectResponseServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single EffectResponse as a POST body and ingest into the
     * database. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun create(params: EffectResponseCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EffectResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single EffectResponse by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<EffectResponseRetrieveResponse> =
        retrieve(id, EffectResponseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectResponseRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none(),
    ): CompletableFuture<EffectResponseRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EffectResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectResponseRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EffectResponseRetrieveParams
    ): CompletableFuture<EffectResponseRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EffectResponseRetrieveResponse> =
        retrieve(id, EffectResponseRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EffectResponseListParams): CompletableFuture<EffectResponseListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EffectResponseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectResponseListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EffectResponseCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EffectResponseCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of EffectResponse
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EffectResponseCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EffectResponseCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<EffectResponseQueryHelpResponse> =
        queryHelp(EffectResponseQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectResponseQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none()
    ): CompletableFuture<EffectResponseQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<EffectResponseQueryHelpResponse> =
        queryHelp(EffectResponseQueryHelpParams.none(), requestOptions)

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
        params: EffectResponseTupleParams
    ): CompletableFuture<List<EffectResponseTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EffectResponseTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EffectResponseTupleResponse>>

    /**
     * Service operation to take multiple EffectResponses as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: EffectResponseUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EffectResponseUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EffectResponseServiceAsync] that provides access to raw HTTP responses for each
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
        ): EffectResponseServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/effectresponse`, but is otherwise the same as
         * [EffectResponseServiceAsync.create].
         */
        fun create(params: EffectResponseCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EffectResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/effectresponse/{id}`, but is otherwise the same
         * as [EffectResponseServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>> =
            retrieve(id, EffectResponseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EffectResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EffectResponseRetrieveParams
        ): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>> =
            retrieve(id, EffectResponseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/effectresponse`, but is otherwise the same as
         * [EffectResponseServiceAsync.list].
         */
        fun list(
            params: EffectResponseListParams
        ): CompletableFuture<HttpResponseFor<EffectResponseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EffectResponseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectResponseListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/effectresponse/count`, but is otherwise the
         * same as [EffectResponseServiceAsync.count].
         */
        fun count(params: EffectResponseCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: EffectResponseCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/effectresponse/createBulk`, but is otherwise
         * the same as [EffectResponseServiceAsync.createBulk].
         */
        fun createBulk(params: EffectResponseCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: EffectResponseCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/effectresponse/queryhelp`, but is otherwise the
         * same as [EffectResponseServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EffectResponseQueryHelpResponse>> =
            queryHelp(EffectResponseQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectResponseQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<EffectResponseQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EffectResponseQueryHelpResponse>> =
            queryHelp(EffectResponseQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/effectresponse/tuple`, but is otherwise the
         * same as [EffectResponseServiceAsync.tuple].
         */
        fun tuple(
            params: EffectResponseTupleParams
        ): CompletableFuture<HttpResponseFor<List<EffectResponseTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EffectResponseTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EffectResponseTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-effectresponse`, but is otherwise the
         * same as [EffectResponseServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: EffectResponseUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: EffectResponseUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
