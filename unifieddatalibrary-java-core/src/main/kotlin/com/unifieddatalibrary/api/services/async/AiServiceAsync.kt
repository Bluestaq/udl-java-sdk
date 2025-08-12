// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AisFull
import com.unifieddatalibrary.api.models.ais.AiCountParams
import com.unifieddatalibrary.api.models.ais.AiCreateBulkParams
import com.unifieddatalibrary.api.models.ais.AiHistoryCountParams
import com.unifieddatalibrary.api.models.ais.AiListPageAsync
import com.unifieddatalibrary.api.models.ais.AiListParams
import com.unifieddatalibrary.api.models.ais.AiQueryhelpParams
import com.unifieddatalibrary.api.models.ais.AiQueryhelpResponse
import com.unifieddatalibrary.api.models.ais.AiTupleParams
import com.unifieddatalibrary.api.services.async.AiServiceAsync
import com.unifieddatalibrary.api.services.async.ais.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AiServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AiListParams): CompletableFuture<AiListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AiListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AiListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AiCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AiCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of AIS records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: AiCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: AiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun historyCount(params: AiHistoryCountParams): CompletableFuture<String> =
        historyCount(
          params, RequestOptions.none()
        )

    /** @see historyCount */
    fun historyCount(params: AiHistoryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AiQueryhelpResponse> = queryhelp(AiQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AiQueryhelpParams = AiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AiQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AiQueryhelpParams = AiQueryhelpParams.none()): CompletableFuture<AiQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AiQueryhelpResponse> =
        queryhelp(
          AiQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AiTupleParams): CompletableFuture<List<AisFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AisFull>>

    /** A view of [AiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/ais`, but is otherwise the same as [AiServiceAsync.list]. */
        fun list(params: AiListParams): CompletableFuture<HttpResponseFor<AiListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: AiListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AiListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/ais/count`, but is otherwise the same as [AiServiceAsync.count]. */
        fun count(params: AiCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: AiCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/ais/createBulk`, but is otherwise the same as [AiServiceAsync.createBulk]. */
        fun createBulk(params: AiCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: AiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/ais/history/count`, but is otherwise the same as [AiServiceAsync.historyCount]. */
        fun historyCount(params: AiHistoryCountParams): CompletableFuture<HttpResponseFor<String>> =
            historyCount(
              params, RequestOptions.none()
            )

        /** @see historyCount */
        fun historyCount(params: AiHistoryCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/ais/queryhelp`, but is otherwise the same as [AiServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AiQueryhelpResponse>> = queryhelp(AiQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AiQueryhelpParams = AiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AiQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AiQueryhelpParams = AiQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AiQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AiQueryhelpResponse>> =
            queryhelp(
              AiQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/ais/tuple`, but is otherwise the same as [AiServiceAsync.tuple]. */
        fun tuple(params: AiTupleParams): CompletableFuture<HttpResponseFor<List<AisFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AisFull>>>
    }
}
