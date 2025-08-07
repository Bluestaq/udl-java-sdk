// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCountParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCreateParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationGetParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationGetResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListPageAsync
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationTupleParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationTupleResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.observations.rfobservation.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RfObservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfObservationServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single RF observation as a POST body and ingest into the
     * database. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun create(params: RfObservationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RfObservationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: RfObservationListParams): CompletableFuture<RfObservationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RfObservationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfObservationListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: RfObservationCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: RfObservationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of RF observations as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: RfObservationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: RfObservationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single RF observation by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<RfObservationGetResponse> =
        get(id, RfObservationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: RfObservationGetParams = RfObservationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfObservationGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: RfObservationGetParams = RfObservationGetParams.none(),
    ): CompletableFuture<RfObservationGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RfObservationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfObservationGetResponse>

    /** @see get */
    fun get(params: RfObservationGetParams): CompletableFuture<RfObservationGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RfObservationGetResponse> =
        get(id, RfObservationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<RfObservationQueryhelpResponse> =
        queryhelp(RfObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RfObservationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none()
    ): CompletableFuture<RfObservationQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<RfObservationQueryhelpResponse> =
        queryhelp(RfObservationQueryhelpParams.none(), requestOptions)

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
        params: RfObservationTupleParams
    ): CompletableFuture<List<RfObservationTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: RfObservationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RfObservationTupleResponse>>

    /**
     * Service operation to take multiple RF observations as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: RfObservationUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: RfObservationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [RfObservationServiceAsync] that provides access to raw HTTP responses for each
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
        ): RfObservationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfobservation`, but is otherwise the same as
         * [RfObservationServiceAsync.create].
         */
        fun create(params: RfObservationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RfObservationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation`, but is otherwise the same as
         * [RfObservationServiceAsync.list].
         */
        fun list(
            params: RfObservationListParams
        ): CompletableFuture<HttpResponseFor<RfObservationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RfObservationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfObservationListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/count`, but is otherwise the same
         * as [RfObservationServiceAsync.count].
         */
        fun count(params: RfObservationCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: RfObservationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/rfobservation/createBulk`, but is otherwise
         * the same as [RfObservationServiceAsync.createBulk].
         */
        fun createBulk(params: RfObservationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: RfObservationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/{id}`, but is otherwise the same
         * as [RfObservationServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<RfObservationGetResponse>> =
            get(id, RfObservationGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: RfObservationGetParams = RfObservationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfObservationGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: RfObservationGetParams = RfObservationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<RfObservationGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RfObservationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfObservationGetResponse>>

        /** @see get */
        fun get(
            params: RfObservationGetParams
        ): CompletableFuture<HttpResponseFor<RfObservationGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RfObservationGetResponse>> =
            get(id, RfObservationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/queryhelp`, but is otherwise the
         * same as [RfObservationServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<RfObservationQueryhelpResponse>> =
            queryhelp(RfObservationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RfObservationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<RfObservationQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RfObservationQueryhelpResponse>> =
            queryhelp(RfObservationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/tuple`, but is otherwise the same
         * as [RfObservationServiceAsync.tuple].
         */
        fun tuple(
            params: RfObservationTupleParams
        ): CompletableFuture<HttpResponseFor<List<RfObservationTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: RfObservationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RfObservationTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-rf`, but is otherwise the same as
         * [RfObservationServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: RfObservationUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: RfObservationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
