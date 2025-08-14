// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyHistoryAodrParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyHistoryCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyHistoryQueryParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPageAsync
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyUnvalidatedPublishParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AircraftSortyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyServiceAsync

    /**
     * Service operation to take a single AircraftSortie as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AircraftSortyCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftSortyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AircraftSortyListParams): CompletableFuture<AircraftSortyListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AircraftSortyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AircraftSortyListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AircraftSortyCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AircraftSortyCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of AircraftSorties as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: AircraftSortyCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AircraftSortyCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun historyAodr(params: AircraftSortyHistoryAodrParams): CompletableFuture<Void?> =
        historyAodr(params, RequestOptions.none())

    /** @see historyAodr */
    fun historyAodr(
        params: AircraftSortyHistoryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyCount(params: AircraftSortyHistoryCountParams): CompletableFuture<String> =
        historyCount(params, RequestOptions.none())

    /** @see historyCount */
    fun historyCount(
        params: AircraftSortyHistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyQuery(
        params: AircraftSortyHistoryQueryParams
    ): CompletableFuture<List<AircraftsortieFull>> = historyQuery(params, RequestOptions.none())

    /** @see historyQuery */
    fun historyQuery(
        params: AircraftSortyHistoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AircraftsortieFull>>

    /**
     * Service operation to take one or many aircraft sortie records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AircraftSortyServiceAsync] that provides access to raw HTTP responses for each
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
        ): AircraftSortyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyServiceAsync.create].
         */
        fun create(params: AircraftSortyCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AircraftSortyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyServiceAsync.list].
         */
        fun list(
            params: AircraftSortyListParams
        ): CompletableFuture<HttpResponseFor<AircraftSortyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AircraftSortyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AircraftSortyListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/count`, but is otherwise the
         * same as [AircraftSortyServiceAsync.count].
         */
        fun count(params: AircraftSortyCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: AircraftSortyCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie/createBulk`, but is otherwise
         * the same as [AircraftSortyServiceAsync.createBulk].
         */
        fun createBulk(params: AircraftSortyCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: AircraftSortyCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/aodr`, but is otherwise
         * the same as [AircraftSortyServiceAsync.historyAodr].
         */
        fun historyAodr(params: AircraftSortyHistoryAodrParams): CompletableFuture<HttpResponse> =
            historyAodr(params, RequestOptions.none())

        /** @see historyAodr */
        fun historyAodr(
            params: AircraftSortyHistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/count`, but is otherwise
         * the same as [AircraftSortyServiceAsync.historyCount].
         */
        fun historyCount(
            params: AircraftSortyHistoryCountParams
        ): CompletableFuture<HttpResponseFor<String>> = historyCount(params, RequestOptions.none())

        /** @see historyCount */
        fun historyCount(
            params: AircraftSortyHistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history`, but is otherwise the
         * same as [AircraftSortyServiceAsync.historyQuery].
         */
        fun historyQuery(
            params: AircraftSortyHistoryQueryParams
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>> =
            historyQuery(params, RequestOptions.none())

        /** @see historyQuery */
        fun historyQuery(
            params: AircraftSortyHistoryQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-aircraftsortie`, but is otherwise the
         * same as [AircraftSortyServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
