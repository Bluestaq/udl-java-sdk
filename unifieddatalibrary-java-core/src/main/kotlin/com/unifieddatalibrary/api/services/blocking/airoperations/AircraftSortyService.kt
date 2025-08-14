// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPage
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyUnvalidatedPublishParams
import java.util.function.Consumer

interface AircraftSortyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyService

    /**
     * Service operation to take a single AircraftSortie as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AircraftSortyCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AircraftSortyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: AircraftSortyListParams): AircraftSortyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AircraftSortyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AircraftSortyListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AircraftSortyCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AircraftSortyCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of AircraftSorties as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: AircraftSortyCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AircraftSortyCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun historyAodr(params: AircraftSortyHistoryAodrParams) =
        historyAodr(params, RequestOptions.none())

    /** @see historyAodr */
    fun historyAodr(
        params: AircraftSortyHistoryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyCount(params: AircraftSortyHistoryCountParams): String =
        historyCount(params, RequestOptions.none())

    /** @see historyCount */
    fun historyCount(
        params: AircraftSortyHistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun historyQuery(params: AircraftSortyHistoryQueryParams): List<AircraftsortieFull> =
        historyQuery(params, RequestOptions.none())

    /** @see historyQuery */
    fun historyQuery(
        params: AircraftSortyHistoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AircraftsortieFull>

    /**
     * Service operation to take one or many aircraft sortie records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: AircraftSortyUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AircraftSortyUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AircraftSortyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyService.create].
         */
        @MustBeClosed
        fun create(params: AircraftSortyCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AircraftSortyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie`, but is otherwise the same as
         * [AircraftSortyService.list].
         */
        @MustBeClosed
        fun list(params: AircraftSortyListParams): HttpResponseFor<AircraftSortyListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AircraftSortyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AircraftSortyListPage>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/count`, but is otherwise the
         * same as [AircraftSortyService.count].
         */
        @MustBeClosed
        fun count(params: AircraftSortyCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AircraftSortyCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/aircraftsortie/createBulk`, but is otherwise
         * the same as [AircraftSortyService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: AircraftSortyCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: AircraftSortyCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/aodr`, but is otherwise
         * the same as [AircraftSortyService.historyAodr].
         */
        @MustBeClosed
        fun historyAodr(params: AircraftSortyHistoryAodrParams): HttpResponse =
            historyAodr(params, RequestOptions.none())

        /** @see historyAodr */
        @MustBeClosed
        fun historyAodr(
            params: AircraftSortyHistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history/count`, but is otherwise
         * the same as [AircraftSortyService.historyCount].
         */
        @MustBeClosed
        fun historyCount(params: AircraftSortyHistoryCountParams): HttpResponseFor<String> =
            historyCount(params, RequestOptions.none())

        /** @see historyCount */
        @MustBeClosed
        fun historyCount(
            params: AircraftSortyHistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/history`, but is otherwise the
         * same as [AircraftSortyService.historyQuery].
         */
        @MustBeClosed
        fun historyQuery(
            params: AircraftSortyHistoryQueryParams
        ): HttpResponseFor<List<AircraftsortieFull>> = historyQuery(params, RequestOptions.none())

        /** @see historyQuery */
        @MustBeClosed
        fun historyQuery(
            params: AircraftSortyHistoryQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AircraftsortieFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-aircraftsortie`, but is otherwise the
         * same as [AircraftSortyService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: AircraftSortyUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AircraftSortyUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
