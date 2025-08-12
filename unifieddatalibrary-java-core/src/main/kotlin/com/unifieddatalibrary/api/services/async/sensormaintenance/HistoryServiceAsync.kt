// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.sensormaintenance

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensormaintenance.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.sensormaintenance.history.HistoryCountParams
import com.unifieddatalibrary.api.models.sensormaintenance.history.HistoryRetrieveParams
import com.unifieddatalibrary.api.models.sensormaintenance.history.HistoryRetrieveResponse
import com.unifieddatalibrary.api.services.async.sensormaintenance.HistoryServiceAsync
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
    fun retrieve(): CompletableFuture<List<HistoryRetrieveResponse>> = retrieve(HistoryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(params: HistoryRetrieveParams = HistoryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<HistoryRetrieveResponse>>

    /** @see retrieve */
    fun retrieve(params: HistoryRetrieveParams = HistoryRetrieveParams.none()): CompletableFuture<List<HistoryRetrieveResponse>> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<HistoryRetrieveResponse>> =
        retrieve(
          HistoryRetrieveParams.none(), requestOptions
        )

    /** Service operation to dynamically query historical data by a variety of query parameters not specified in this API documentation, then write that data to the Secure Content Store. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun aodr(): CompletableFuture<Void?> = aodr(HistoryAodrParams.none())

    /** @see aodr */
    fun aodr(params: HistoryAodrParams = HistoryAodrParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see aodr */
    fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()): CompletableFuture<Void?> =
        aodr(
          params, RequestOptions.none()
        )

    /** @see aodr */
    fun aodr(requestOptions: RequestOptions): CompletableFuture<Void?> =
        aodr(
          HistoryAodrParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(HistoryCountParams.none())

    /** @see count */
    fun count(params: HistoryCountParams = HistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: HistoryCountParams = HistoryCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          HistoryCountParams.none(), requestOptions
        )

    /** A view of [HistoryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/sensormaintenance/history`, but is otherwise the same as [HistoryServiceAsync.retrieve]. */
        fun retrieve(): CompletableFuture<HttpResponseFor<List<HistoryRetrieveResponse>>> = retrieve(HistoryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(params: HistoryRetrieveParams = HistoryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<HistoryRetrieveResponse>>>

        /** @see retrieve */
        fun retrieve(params: HistoryRetrieveParams = HistoryRetrieveParams.none()): CompletableFuture<HttpResponseFor<List<HistoryRetrieveResponse>>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<HistoryRetrieveResponse>>> =
            retrieve(
              HistoryRetrieveParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sensormaintenance/history/aodr`, but is otherwise the same as [HistoryServiceAsync.aodr]. */
        fun aodr(): CompletableFuture<HttpResponse> = aodr(HistoryAodrParams.none())

        /** @see aodr */
        fun aodr(params: HistoryAodrParams = HistoryAodrParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see aodr */
        fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()): CompletableFuture<HttpResponse> =
            aodr(
              params, RequestOptions.none()
            )

        /** @see aodr */
        fun aodr(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            aodr(
              HistoryAodrParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sensormaintenance/history/count`, but is otherwise the same as [HistoryServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(HistoryCountParams.none())

        /** @see count */
        fun count(params: HistoryCountParams = HistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: HistoryCountParams = HistoryCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              HistoryCountParams.none(), requestOptions
            )
    }
}
