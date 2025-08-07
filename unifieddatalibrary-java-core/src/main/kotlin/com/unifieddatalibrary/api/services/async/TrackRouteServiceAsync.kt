// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCountParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateBulkParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteDeleteParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteGetParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListPageAsync
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteQueryhelpParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteQueryhelpResponse
import com.unifieddatalibrary.api.models.trackroute.TrackRouteTupleParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUpdateParams
import com.unifieddatalibrary.api.models.trackroute.history.TrackRouteFull
import com.unifieddatalibrary.api.services.async.trackroute.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TrackRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackRouteServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single trackroute record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: TrackRouteCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TrackRouteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single trackroute record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: TrackRouteUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: TrackRouteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: TrackRouteUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TrackRouteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: TrackRouteListParams): CompletableFuture<TrackRouteListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TrackRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackRouteListPageAsync>

    /**
     * Service operation to delete a trackroute record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, TrackRouteDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TrackRouteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TrackRouteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, TrackRouteDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: TrackRouteCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: TrackRouteCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of trackroute records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: TrackRouteCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: TrackRouteCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single trackroute record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<TrackRouteFull> = get(id, TrackRouteGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: TrackRouteGetParams = TrackRouteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackRouteFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: TrackRouteGetParams = TrackRouteGetParams.none(),
    ): CompletableFuture<TrackRouteFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TrackRouteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackRouteFull>

    /** @see get */
    fun get(params: TrackRouteGetParams): CompletableFuture<TrackRouteFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<TrackRouteFull> =
        get(id, TrackRouteGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<TrackRouteQueryhelpResponse> =
        queryhelp(TrackRouteQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackRouteQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none()
    ): CompletableFuture<TrackRouteQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<TrackRouteQueryhelpResponse> =
        queryhelp(TrackRouteQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: TrackRouteTupleParams): CompletableFuture<List<TrackRouteFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: TrackRouteTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TrackRouteFull>>

    /**
     * Service operation to take multiple trackroute records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: TrackRouteUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: TrackRouteUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TrackRouteServiceAsync] that provides access to raw HTTP responses for each
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
        ): TrackRouteServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/trackroute`, but is otherwise the same as
         * [TrackRouteServiceAsync.create].
         */
        fun create(params: TrackRouteCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TrackRouteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/trackroute/{id}`, but is otherwise the same as
         * [TrackRouteServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: TrackRouteUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: TrackRouteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: TrackRouteUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TrackRouteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/trackroute`, but is otherwise the same as
         * [TrackRouteServiceAsync.list].
         */
        fun list(
            params: TrackRouteListParams
        ): CompletableFuture<HttpResponseFor<TrackRouteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TrackRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackRouteListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/trackroute/{id}`, but is otherwise the same
         * as [TrackRouteServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, TrackRouteDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TrackRouteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TrackRouteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, TrackRouteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/count`, but is otherwise the same as
         * [TrackRouteServiceAsync.count].
         */
        fun count(params: TrackRouteCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: TrackRouteCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/trackroute/createBulk`, but is otherwise the
         * same as [TrackRouteServiceAsync.createBulk].
         */
        fun createBulk(params: TrackRouteCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: TrackRouteCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/{id}`, but is otherwise the same as
         * [TrackRouteServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<TrackRouteFull>> =
            get(id, TrackRouteGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: TrackRouteGetParams = TrackRouteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackRouteFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: TrackRouteGetParams = TrackRouteGetParams.none(),
        ): CompletableFuture<HttpResponseFor<TrackRouteFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TrackRouteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackRouteFull>>

        /** @see get */
        fun get(params: TrackRouteGetParams): CompletableFuture<HttpResponseFor<TrackRouteFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrackRouteFull>> =
            get(id, TrackRouteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/queryhelp`, but is otherwise the
         * same as [TrackRouteServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<TrackRouteQueryhelpResponse>> =
            queryhelp(TrackRouteQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackRouteQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<TrackRouteQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TrackRouteQueryhelpResponse>> =
            queryhelp(TrackRouteQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/tuple`, but is otherwise the same as
         * [TrackRouteServiceAsync.tuple].
         */
        fun tuple(
            params: TrackRouteTupleParams
        ): CompletableFuture<HttpResponseFor<List<TrackRouteFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: TrackRouteTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TrackRouteFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-trackroute`, but is otherwise the
         * same as [TrackRouteServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: TrackRouteUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: TrackRouteUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
