// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.onorbitthrusterstatus

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.history.HistoryCountParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.history.HistoryListPage
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.history.HistoryListParams
import com.unifieddatalibrary.api.services.blocking.onorbitthrusterstatus.HistoryService
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
    fun list(): HistoryListPage = list(HistoryListParams.none())

    /** @see list */
    fun list(params: HistoryListParams = HistoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HistoryListPage

    /** @see list */
    fun list(params: HistoryListParams = HistoryListParams.none()): HistoryListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): HistoryListPage =
        list(
          HistoryListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(HistoryCountParams.none())

    /** @see count */
    fun count(params: HistoryCountParams = HistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: HistoryCountParams = HistoryCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          HistoryCountParams.none(), requestOptions
        )

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/history`, but is otherwise the same as [HistoryService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<HistoryListPage> = list(HistoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: HistoryListParams = HistoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HistoryListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: HistoryListParams = HistoryListParams.none()): HttpResponseFor<HistoryListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HistoryListPage> =
            list(
              HistoryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/history/count`, but is otherwise the same as [HistoryService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(HistoryCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: HistoryCountParams = HistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: HistoryCountParams = HistoryCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              HistoryCountParams.none(), requestOptions
            )
    }
}
