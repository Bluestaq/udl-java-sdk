// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListPage
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListParams
import java.util.function.Consumer

interface AircraftSortieService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortieService

    /**
     * Service operation to take a single AircraftSortie as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AircraftSortieCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftSortieCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AircraftSortieListParams): AircraftSortieListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AircraftSortieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftSortieListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AircraftSortieCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AircraftSortieCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of AircraftSorties as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: AircraftSortieCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AircraftSortieCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun historyAodr(params: AircraftSortieHistoryAodrParams) =
        historyAodr(params, RequestOptions.none())

    /** @see historyAodr */
    fun historyAodr(
        params: AircraftSortieHistoryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyCount(params: AircraftSortieHistoryCountParams): String =
        historyCount(params, RequestOptions.none())

    /** @see historyCount */
    fun historyCount(
        params: AircraftSortieHistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyQuery(params: AircraftSortieHistoryQueryParams): List<AircraftsortieFull> =
        historyQuery(params, RequestOptions.none())

    /** @see historyQuery */
    fun historyQuery(
        params: AircraftSortieHistoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AircraftsortieFull>

    /**
     * A view of [AircraftSortieService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortieService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortieService.create].
         */
        @MustBeClosed
        fun create(params: AircraftSortieCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AircraftSortieCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortieService.list].
         */
        @MustBeClosed
        fun list(params: AircraftSortieListParams): HttpResponseFor<AircraftSortieListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AircraftSortieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftSortieListPage>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/count`, but is otherwise the
         * same as [AircraftSortieService.count].
         */
        @MustBeClosed
        fun count(params: AircraftSortieCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AircraftSortieCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie/createBulk`, but is otherwise
         * the same as [AircraftSortieService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: AircraftSortieCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: AircraftSortieCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/aodr`, but is otherwise
         * the same as [AircraftSortieService.historyAodr].
         */
        @MustBeClosed
        fun historyAodr(params: AircraftSortieHistoryAodrParams): HttpResponse =
            historyAodr(params, RequestOptions.none())

        /** @see historyAodr */
        @MustBeClosed
        fun historyAodr(
            params: AircraftSortieHistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/count`, but is otherwise
         * the same as [AircraftSortieService.historyCount].
         */
        @MustBeClosed
        fun historyCount(params: AircraftSortieHistoryCountParams): HttpResponseFor<String> =
            historyCount(params, RequestOptions.none())

        /** @see historyCount */
        @MustBeClosed
        fun historyCount(
            params: AircraftSortieHistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history`, but is otherwise the
         * same as [AircraftSortieService.historyQuery].
         */
        @MustBeClosed
        fun historyQuery(
            params: AircraftSortieHistoryQueryParams
        ): HttpResponseFor<List<AircraftsortieFull>> = historyQuery(params, RequestOptions.none())

        /** @see historyQuery */
        @MustBeClosed
        fun historyQuery(
            params: AircraftSortieHistoryQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AircraftsortieFull>>
    }
}
