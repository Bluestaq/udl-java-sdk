// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.featureassessment

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryCountParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryResponse
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryWriteAodrParams
import com.unifieddatalibrary.api.services.blocking.featureassessment.HistoryService
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

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: HistoryCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: HistoryCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(params: HistoryQueryParams): List<HistoryQueryResponse> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(params: HistoryQueryParams, requestOptions: RequestOptions = RequestOptions.none()): List<HistoryQueryResponse>

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun writeAodr(params: HistoryWriteAodrParams) =
        writeAodr(
          params, RequestOptions.none()
        )

    /** @see writeAodr */
    fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/featureassessment/history/count`, but is otherwise the same as [HistoryService.count]. */
        @MustBeClosed
        fun count(params: HistoryCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: HistoryCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/featureassessment/history`, but is otherwise the same as [HistoryService.query]. */
        @MustBeClosed
        fun query(params: HistoryQueryParams): HttpResponseFor<List<HistoryQueryResponse>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        @MustBeClosed
        fun query(params: HistoryQueryParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<HistoryQueryResponse>>

        /** Returns a raw HTTP response for `get /udl/featureassessment/history/aodr`, but is otherwise the same as [HistoryService.writeAodr]. */
        @MustBeClosed
        fun writeAodr(params: HistoryWriteAodrParams): HttpResponse =
            writeAodr(
              params, RequestOptions.none()
            )

        /** @see writeAodr */
        @MustBeClosed
        fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
