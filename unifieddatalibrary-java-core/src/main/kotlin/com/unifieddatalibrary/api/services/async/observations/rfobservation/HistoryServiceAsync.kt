// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations.rfobservation

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.rfobservation.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.observations.rfobservation.history.HistoryCountParams
import com.unifieddatalibrary.api.models.observations.rfobservation.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.observations.rfobservation.history.HistoryListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HistoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun list(params: HistoryListParams): CompletableFuture<HistoryListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HistoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HistoryListPageAsync>

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun aodr(params: HistoryAodrParams): CompletableFuture<Void?> =
        aodr(params, RequestOptions.none())

    /** @see aodr */
    fun aodr(
        params: HistoryAodrParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: HistoryCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: HistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * A view of [HistoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/history`, but is otherwise the
         * same as [HistoryServiceAsync.list].
         */
        fun list(
            params: HistoryListParams
        ): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HistoryListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/history/aodr`, but is otherwise
         * the same as [HistoryServiceAsync.aodr].
         */
        fun aodr(params: HistoryAodrParams): CompletableFuture<HttpResponse> =
            aodr(params, RequestOptions.none())

        /** @see aodr */
        fun aodr(
            params: HistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfobservation/history/count`, but is otherwise
         * the same as [HistoryServiceAsync.count].
         */
        fun count(params: HistoryCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>
    }
}
