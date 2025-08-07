// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCountParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateBulkParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListPageAsync
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.maneuvers.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ManeuverServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManeuverServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single maneuver as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun create(params: ManeuverCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ManeuverCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ManeuverListParams): CompletableFuture<ManeuverListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ManeuverListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManeuverListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ManeuverCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ManeuverCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of maneuvers as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: ManeuverCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: ManeuverCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Service operation to get a single maneuver by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<ManeuverGetResponse> = get(id, ManeuverGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ManeuverGetParams = ManeuverGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManeuverGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ManeuverGetParams = ManeuverGetParams.none(),
    ): CompletableFuture<ManeuverGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ManeuverGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManeuverGetResponse>

    /** @see get */
    fun get(params: ManeuverGetParams): CompletableFuture<ManeuverGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ManeuverGetResponse> =
        get(id, ManeuverGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<ManeuverQueryhelpResponse> =
        queryhelp(ManeuverQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManeuverQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none()
    ): CompletableFuture<ManeuverQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ManeuverQueryhelpResponse> =
        queryhelp(ManeuverQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ManeuverTupleParams): CompletableFuture<List<ManeuverTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ManeuverTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ManeuverTupleResponse>>

    /**
     * Service operation to take multiple maneuvers as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ManeuverUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ManeuverServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManeuverServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/maneuver`, but is otherwise the same as
         * [ManeuverServiceAsync.create].
         */
        fun create(params: ManeuverCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ManeuverCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/maneuver`, but is otherwise the same as
         * [ManeuverServiceAsync.list].
         */
        fun list(
            params: ManeuverListParams
        ): CompletableFuture<HttpResponseFor<ManeuverListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ManeuverListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManeuverListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/maneuver/count`, but is otherwise the same as
         * [ManeuverServiceAsync.count].
         */
        fun count(params: ManeuverCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: ManeuverCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/maneuver/createBulk`, but is otherwise the
         * same as [ManeuverServiceAsync.createBulk].
         */
        fun createBulk(params: ManeuverCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: ManeuverCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/maneuver/{id}`, but is otherwise the same as
         * [ManeuverServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<ManeuverGetResponse>> =
            get(id, ManeuverGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: ManeuverGetParams = ManeuverGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManeuverGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: ManeuverGetParams = ManeuverGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ManeuverGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ManeuverGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManeuverGetResponse>>

        /** @see get */
        fun get(
            params: ManeuverGetParams
        ): CompletableFuture<HttpResponseFor<ManeuverGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManeuverGetResponse>> =
            get(id, ManeuverGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/maneuver/queryhelp`, but is otherwise the same
         * as [ManeuverServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ManeuverQueryhelpResponse>> =
            queryhelp(ManeuverQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManeuverQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<ManeuverQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ManeuverQueryhelpResponse>> =
            queryhelp(ManeuverQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/maneuver/tuple`, but is otherwise the same as
         * [ManeuverServiceAsync.tuple].
         */
        fun tuple(
            params: ManeuverTupleParams
        ): CompletableFuture<HttpResponseFor<List<ManeuverTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: ManeuverTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ManeuverTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-maneuver`, but is otherwise the same
         * as [ManeuverServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: ManeuverUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: ManeuverUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
