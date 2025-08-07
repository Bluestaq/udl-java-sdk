// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryAodrParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryQueryParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListPageAsync
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AircraftSortieServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortieServiceAsync

    /**
     * Service operation to take a single AircraftSortie as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AircraftSortieCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftSortieCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AircraftSortieListParams): CompletableFuture<AircraftSortieListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AircraftSortieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AircraftSortieListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AircraftSortieCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AircraftSortieCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of AircraftSorties as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: AircraftSortieCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AircraftSortieCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun historyAodr(params: AircraftSortieHistoryAodrParams): CompletableFuture<Void?> =
        historyAodr(params, RequestOptions.none())

    /** @see historyAodr */
    fun historyAodr(
        params: AircraftSortieHistoryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyCount(params: AircraftSortieHistoryCountParams): CompletableFuture<String> =
        historyCount(params, RequestOptions.none())

    /** @see historyCount */
    fun historyCount(
        params: AircraftSortieHistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyQuery(
        params: AircraftSortieHistoryQueryParams
    ): CompletableFuture<List<AircraftsortieFull>> = historyQuery(params, RequestOptions.none())

    /** @see historyQuery */
    fun historyQuery(
        params: AircraftSortieHistoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AircraftsortieFull>>

    /**
     * A view of [AircraftSortieServiceAsync] that provides access to raw HTTP responses for each
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
        ): AircraftSortieServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortieServiceAsync.create].
         */
        fun create(params: AircraftSortieCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AircraftSortieCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortieServiceAsync.list].
         */
        fun list(
            params: AircraftSortieListParams
        ): CompletableFuture<HttpResponseFor<AircraftSortieListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AircraftSortieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AircraftSortieListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/count`, but is otherwise the
         * same as [AircraftSortieServiceAsync.count].
         */
        fun count(params: AircraftSortieCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: AircraftSortieCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie/createBulk`, but is otherwise
         * the same as [AircraftSortieServiceAsync.createBulk].
         */
        fun createBulk(params: AircraftSortieCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: AircraftSortieCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/aodr`, but is otherwise
         * the same as [AircraftSortieServiceAsync.historyAodr].
         */
        fun historyAodr(params: AircraftSortieHistoryAodrParams): CompletableFuture<HttpResponse> =
            historyAodr(params, RequestOptions.none())

        /** @see historyAodr */
        fun historyAodr(
            params: AircraftSortieHistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/count`, but is otherwise
         * the same as [AircraftSortieServiceAsync.historyCount].
         */
        fun historyCount(
            params: AircraftSortieHistoryCountParams
        ): CompletableFuture<HttpResponseFor<String>> = historyCount(params, RequestOptions.none())

        /** @see historyCount */
        fun historyCount(
            params: AircraftSortieHistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history`, but is otherwise the
         * same as [AircraftSortieServiceAsync.historyQuery].
         */
        fun historyQuery(
            params: AircraftSortieHistoryQueryParams
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>> =
            historyQuery(params, RequestOptions.none())

        /** @see historyQuery */
        fun historyQuery(
            params: AircraftSortieHistoryQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>>
    }
}
