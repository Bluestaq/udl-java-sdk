// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.starcatalog

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.starcatalog.history.HistoryAodrParams
import com.unifieddatalibrary.api.services.blocking.starcatalog.HistoryService
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

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun aodr() = aodr(HistoryAodrParams.none())

    /** @see aodr */
    fun aodr(params: HistoryAodrParams = HistoryAodrParams.none(), requestOptions: RequestOptions = RequestOptions.none())

    /** @see aodr */
    fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()) =
        aodr(
          params, RequestOptions.none()
        )

    /** @see aodr */
    fun aodr(requestOptions: RequestOptions) =
        aodr(
          HistoryAodrParams.none(), requestOptions
        )

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/starcatalog/history/aodr`, but is otherwise the same as [HistoryService.aodr]. */
        @MustBeClosed
        fun aodr(): HttpResponse = aodr(HistoryAodrParams.none())

        /** @see aodr */
        @MustBeClosed
        fun aodr(params: HistoryAodrParams = HistoryAodrParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see aodr */
        @MustBeClosed
        fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()): HttpResponse =
            aodr(
              params, RequestOptions.none()
            )

        /** @see aodr */
        @MustBeClosed
        fun aodr(requestOptions: RequestOptions): HttpResponse =
            aodr(
              HistoryAodrParams.none(), requestOptions
            )
    }
}
