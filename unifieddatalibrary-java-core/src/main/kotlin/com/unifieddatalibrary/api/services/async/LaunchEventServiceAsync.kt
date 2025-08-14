// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCountParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateBulkParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListPageAsync
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventQueryhelpParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventQueryhelpResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.launchevent.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaunchEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchEventServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single LaunchEvent as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: LaunchEventCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: LaunchEventListParams): CompletableFuture<LaunchEventListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LaunchEventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchEventListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: LaunchEventCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: LaunchEventCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of LaunchEvent as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: LaunchEventCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: LaunchEventCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single LaunchEvent record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<LaunchEventGetResponse> =
        get(id, LaunchEventGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchEventGetParams = LaunchEventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchEventGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchEventGetParams = LaunchEventGetParams.none(),
    ): CompletableFuture<LaunchEventGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchEventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchEventGetResponse>

    /** @see get */
    fun get(params: LaunchEventGetParams): CompletableFuture<LaunchEventGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<LaunchEventGetResponse> =
        get(id, LaunchEventGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LaunchEventQueryhelpResponse> =
        queryhelp(LaunchEventQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchEventQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none()
    ): CompletableFuture<LaunchEventQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<LaunchEventQueryhelpResponse> =
        queryhelp(LaunchEventQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaunchEventTupleParams): CompletableFuture<List<LaunchEventTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchEventTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaunchEventTupleResponse>>

    /**
     * Service operation to take LaunchEvent entries as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: LaunchEventUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: LaunchEventUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [LaunchEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): LaunchEventServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchevent`, but is otherwise the same as
         * [LaunchEventServiceAsync.create].
         */
        fun create(params: LaunchEventCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaunchEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchevent`, but is otherwise the same as
         * [LaunchEventServiceAsync.list].
         */
        fun list(
            params: LaunchEventListParams
        ): CompletableFuture<HttpResponseFor<LaunchEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LaunchEventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchEventListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/count`, but is otherwise the same
         * as [LaunchEventServiceAsync.count].
         */
        fun count(params: LaunchEventCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: LaunchEventCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/launchevent/createBulk`, but is otherwise the
         * same as [LaunchEventServiceAsync.createBulk].
         */
        fun createBulk(params: LaunchEventCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: LaunchEventCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/{id}`, but is otherwise the same as
         * [LaunchEventServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>> =
            get(id, LaunchEventGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaunchEventGetParams = LaunchEventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaunchEventGetParams = LaunchEventGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaunchEventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>>

        /** @see get */
        fun get(
            params: LaunchEventGetParams
        ): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>> =
            get(id, LaunchEventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/queryhelp`, but is otherwise the
         * same as [LaunchEventServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LaunchEventQueryhelpResponse>> =
            queryhelp(LaunchEventQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchEventQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchEventQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchEventQueryhelpResponse>> =
            queryhelp(LaunchEventQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/tuple`, but is otherwise the same
         * as [LaunchEventServiceAsync.tuple].
         */
        fun tuple(
            params: LaunchEventTupleParams
        ): CompletableFuture<HttpResponseFor<List<LaunchEventTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LaunchEventTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaunchEventTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-launchevent`, but is otherwise the
         * same as [LaunchEventServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: LaunchEventUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: LaunchEventUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
