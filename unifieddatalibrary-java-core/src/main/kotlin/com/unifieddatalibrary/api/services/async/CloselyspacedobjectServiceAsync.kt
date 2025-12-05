// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCountParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateBulkParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListPageAsync
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectQueryHelpParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectQueryHelpResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.closelyspacedobjects.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CloselyspacedobjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CloselyspacedobjectServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single CloselySpacedObjects (CSO) as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: CloselyspacedobjectCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CloselyspacedobjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single CloselySpacedObjects (CSO) record by its unique ID passed
     * as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<CloselyspacedobjectRetrieveResponse> =
        retrieve(id, CloselyspacedobjectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CloselyspacedobjectRetrieveParams = CloselyspacedobjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloselyspacedobjectRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CloselyspacedobjectRetrieveParams = CloselyspacedobjectRetrieveParams.none(),
    ): CompletableFuture<CloselyspacedobjectRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CloselyspacedobjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloselyspacedobjectRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CloselyspacedobjectRetrieveParams
    ): CompletableFuture<CloselyspacedobjectRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloselyspacedobjectRetrieveResponse> =
        retrieve(id, CloselyspacedobjectRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: CloselyspacedobjectListParams
    ): CompletableFuture<CloselyspacedobjectListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CloselyspacedobjectListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloselyspacedobjectListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: CloselyspacedobjectCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: CloselyspacedobjectCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of
     * CloselySpacedObjects (CSO) records as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulk(params: CloselyspacedobjectCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: CloselyspacedobjectCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<CloselyspacedobjectQueryHelpResponse> =
        queryHelp(CloselyspacedobjectQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: CloselyspacedobjectQueryHelpParams = CloselyspacedobjectQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloselyspacedobjectQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: CloselyspacedobjectQueryHelpParams = CloselyspacedobjectQueryHelpParams.none()
    ): CompletableFuture<CloselyspacedobjectQueryHelpResponse> =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<CloselyspacedobjectQueryHelpResponse> =
        queryHelp(CloselyspacedobjectQueryHelpParams.none(), requestOptions)

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
        params: CloselyspacedobjectTupleParams
    ): CompletableFuture<List<CloselyspacedobjectTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CloselyspacedobjectTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CloselyspacedobjectTupleResponse>>

    /**
     * Service operation to take multiple CloselySpacedObjects (CSO) records as a POST body and
     * ingest into the database. This operation is intended to be used for automated feeds into UDL.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun unvalidatedPublish(
        params: CloselyspacedobjectUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: CloselyspacedobjectUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CloselyspacedobjectServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CloselyspacedobjectServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/closelyspacedobjects`, but is otherwise the
         * same as [CloselyspacedobjectServiceAsync.create].
         */
        fun create(params: CloselyspacedobjectCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CloselyspacedobjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/closelyspacedobjects/{id}`, but is otherwise
         * the same as [CloselyspacedobjectServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>> =
            retrieve(id, CloselyspacedobjectRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CloselyspacedobjectRetrieveParams = CloselyspacedobjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CloselyspacedobjectRetrieveParams = CloselyspacedobjectRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CloselyspacedobjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CloselyspacedobjectRetrieveParams
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>> =
            retrieve(id, CloselyspacedobjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/closelyspacedobjects`, but is otherwise the
         * same as [CloselyspacedobjectServiceAsync.list].
         */
        fun list(
            params: CloselyspacedobjectListParams
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CloselyspacedobjectListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/closelyspacedobjects/count`, but is otherwise
         * the same as [CloselyspacedobjectServiceAsync.count].
         */
        fun count(
            params: CloselyspacedobjectCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: CloselyspacedobjectCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/closelyspacedobjects/createBulk`, but is
         * otherwise the same as [CloselyspacedobjectServiceAsync.createBulk].
         */
        fun createBulk(
            params: CloselyspacedobjectCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: CloselyspacedobjectCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/closelyspacedobjects/queryhelp`, but is
         * otherwise the same as [CloselyspacedobjectServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<CloselyspacedobjectQueryHelpResponse>> =
            queryHelp(CloselyspacedobjectQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: CloselyspacedobjectQueryHelpParams = CloselyspacedobjectQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: CloselyspacedobjectQueryHelpParams = CloselyspacedobjectQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectQueryHelpResponse>> =
            queryHelp(CloselyspacedobjectQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/closelyspacedobjects/tuple`, but is otherwise
         * the same as [CloselyspacedobjectServiceAsync.tuple].
         */
        fun tuple(
            params: CloselyspacedobjectTupleParams
        ): CompletableFuture<HttpResponseFor<List<CloselyspacedobjectTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: CloselyspacedobjectTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CloselyspacedobjectTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-closelyspacedobjects`, but is
         * otherwise the same as [CloselyspacedobjectServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: CloselyspacedobjectUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: CloselyspacedobjectUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
