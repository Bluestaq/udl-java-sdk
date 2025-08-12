// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.tdoafdoa.diffofarrival

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.history.HistoryListParams
import com.unifieddatalibrary.api.services.async.tdoafdoa.diffofarrival.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HistoryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: HistoryListParams): CompletableFuture<HistoryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: HistoryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HistoryListPageAsync>

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun aodr(params: HistoryAodrParams): CompletableFuture<Void?> =
        aodr(
          params, RequestOptions.none()
        )

    /** @see aodr */
    fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [HistoryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/diffofarrival/history`, but is otherwise the same as [HistoryServiceAsync.list]. */
        fun list(params: HistoryListParams): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: HistoryListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<HistoryListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/diffofarrival/history/aodr`, but is otherwise the same as [HistoryServiceAsync.aodr]. */
        fun aodr(params: HistoryAodrParams): CompletableFuture<HttpResponse> =
            aodr(
              params, RequestOptions.none()
            )

        /** @see aodr */
        fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
