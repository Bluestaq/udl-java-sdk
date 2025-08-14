// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.starcatalog

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.starcatalog.history.HistoryAodrParams
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
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun aodr(): CompletableFuture<Void?> = aodr(HistoryAodrParams.none())

    /** @see aodr */
    fun aodr(
        params: HistoryAodrParams = HistoryAodrParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see aodr */
    fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()): CompletableFuture<Void?> =
        aodr(params, RequestOptions.none())

    /** @see aodr */
    fun aodr(requestOptions: RequestOptions): CompletableFuture<Void?> =
        aodr(HistoryAodrParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /udl/starcatalog/history/aodr`, but is otherwise the
         * same as [HistoryServiceAsync.aodr].
         */
        fun aodr(): CompletableFuture<HttpResponse> = aodr(HistoryAodrParams.none())

        /** @see aodr */
        fun aodr(
            params: HistoryAodrParams = HistoryAodrParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see aodr */
        fun aodr(
            params: HistoryAodrParams = HistoryAodrParams.none()
        ): CompletableFuture<HttpResponse> = aodr(params, RequestOptions.none())

        /** @see aodr */
        fun aodr(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            aodr(HistoryAodrParams.none(), requestOptions)
    }
}
