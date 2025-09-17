// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.h3geo

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.h3geo.history.HistoryAdorParams
import com.unifieddatalibrary.api.models.h3geo.history.HistoryCountParams
import com.unifieddatalibrary.api.models.h3geo.history.HistoryListPage
import com.unifieddatalibrary.api.models.h3geo.history.HistoryListParams
import java.util.function.Consumer

interface HistoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun list(params: HistoryListParams): HistoryListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HistoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HistoryListPage

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun ador(params: HistoryAdorParams) = ador(params, RequestOptions.none())

    /** @see ador */
    fun ador(params: HistoryAdorParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: HistoryCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: HistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/h3geo/history`, but is otherwise the same as
         * [HistoryService.list].
         */
        @MustBeClosed
        fun list(params: HistoryListParams): HttpResponseFor<HistoryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HistoryListPage>

        /**
         * Returns a raw HTTP response for `get /udl/h3geo/history/aodr`, but is otherwise the same
         * as [HistoryService.ador].
         */
        @MustBeClosed
        fun ador(params: HistoryAdorParams): HttpResponse = ador(params, RequestOptions.none())

        /** @see ador */
        @MustBeClosed
        fun ador(
            params: HistoryAdorParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/h3geo/history/count`, but is otherwise the same
         * as [HistoryService.count].
         */
        @MustBeClosed
        fun count(params: HistoryCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>
    }
}
