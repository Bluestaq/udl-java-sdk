// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCountParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCreateBulkParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCreateParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListPageAsync
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestQueryHelpParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestQueryHelpResponse
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestRetrieveParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestRetrieveResponse
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestTupleParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestTupleResponse
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.effectrequests.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EffectRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectRequestServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single EffectRequest as a POST body and ingest into the database.
     * This operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun create(params: EffectRequestCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EffectRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single EffectRequest by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<EffectRequestRetrieveResponse> =
        retrieve(id, EffectRequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectRequestRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none(),
    ): CompletableFuture<EffectRequestRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EffectRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectRequestRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EffectRequestRetrieveParams
    ): CompletableFuture<EffectRequestRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EffectRequestRetrieveResponse> =
        retrieve(id, EffectRequestRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EffectRequestListParams): CompletableFuture<EffectRequestListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EffectRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectRequestListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EffectRequestCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EffectRequestCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of EffectRequest
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EffectRequestCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EffectRequestCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<EffectRequestQueryHelpResponse> =
        queryHelp(EffectRequestQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EffectRequestQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none()
    ): CompletableFuture<EffectRequestQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<EffectRequestQueryHelpResponse> =
        queryHelp(EffectRequestQueryHelpParams.none(), requestOptions)

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
        params: EffectRequestTupleParams
    ): CompletableFuture<List<EffectRequestTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EffectRequestTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EffectRequestTupleResponse>>

    /**
     * Service operation to take multiple EffectRequests as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: EffectRequestUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EffectRequestUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EffectRequestServiceAsync] that provides access to raw HTTP responses for each
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
        ): EffectRequestServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/effectrequest`, but is otherwise the same as
         * [EffectRequestServiceAsync.create].
         */
        fun create(params: EffectRequestCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EffectRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/effectrequest/{id}`, but is otherwise the same
         * as [EffectRequestServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<EffectRequestRetrieveResponse>> =
            retrieve(id, EffectRequestRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectRequestRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EffectRequestRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EffectRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectRequestRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EffectRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<EffectRequestRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EffectRequestRetrieveResponse>> =
            retrieve(id, EffectRequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/effectrequest`, but is otherwise the same as
         * [EffectRequestServiceAsync.list].
         */
        fun list(
            params: EffectRequestListParams
        ): CompletableFuture<HttpResponseFor<EffectRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EffectRequestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectRequestListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/effectrequest/count`, but is otherwise the same
         * as [EffectRequestServiceAsync.count].
         */
        fun count(params: EffectRequestCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: EffectRequestCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/effectrequest/createBulk`, but is otherwise
         * the same as [EffectRequestServiceAsync.createBulk].
         */
        fun createBulk(params: EffectRequestCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: EffectRequestCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/effectrequest/queryhelp`, but is otherwise the
         * same as [EffectRequestServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EffectRequestQueryHelpResponse>> =
            queryHelp(EffectRequestQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EffectRequestQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<EffectRequestQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EffectRequestQueryHelpResponse>> =
            queryHelp(EffectRequestQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/effectrequest/tuple`, but is otherwise the same
         * as [EffectRequestServiceAsync.tuple].
         */
        fun tuple(
            params: EffectRequestTupleParams
        ): CompletableFuture<HttpResponseFor<List<EffectRequestTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EffectRequestTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EffectRequestTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-effectrequest`, but is otherwise the
         * same as [EffectRequestServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: EffectRequestUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: EffectRequestUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
