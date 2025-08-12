// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.ais

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ais.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.ais.history.HistoryListPage
import com.unifieddatalibrary.api.models.ais.history.HistoryListParams
import com.unifieddatalibrary.api.services.blocking.ais.HistoryService
import java.util.function.Consumer

interface HistoryService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: HistoryListParams): HistoryListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: HistoryListParams, requestOptions: RequestOptions = RequestOptions.none()): HistoryListPage

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun aodr(params: HistoryAodrParams) =
        aodr(
          params, RequestOptions.none()
        )

    /** @see aodr */
    fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/ais/history`, but is otherwise the same as [HistoryService.list]. */
        @MustBeClosed
        fun list(params: HistoryListParams): HttpResponseFor<HistoryListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: HistoryListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HistoryListPage>

        /** Returns a raw HTTP response for `get /udl/ais/history/aodr`, but is otherwise the same as [HistoryService.aodr]. */
        @MustBeClosed
        fun aodr(params: HistoryAodrParams): HttpResponse =
            aodr(
              params, RequestOptions.none()
            )

        /** @see aodr */
        @MustBeClosed
        fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
