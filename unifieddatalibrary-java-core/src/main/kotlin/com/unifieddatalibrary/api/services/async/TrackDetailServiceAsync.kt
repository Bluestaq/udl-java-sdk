// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCountParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCreateBulkParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListPageAsync
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailTupleParams
import com.unifieddatalibrary.api.models.trackdetails.history.TrackDetailsFull
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import com.unifieddatalibrary.api.services.async.trackdetails.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TrackDetailServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackDetailServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: TrackDetailListParams): CompletableFuture<TrackDetailListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: TrackDetailListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TrackDetailListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: TrackDetailCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: TrackDetailCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of Track Details records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: TrackDetailCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: TrackDetailCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<TrackDetailQueryhelpResponse> = queryhelp(TrackDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TrackDetailQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none()): CompletableFuture<TrackDetailQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<TrackDetailQueryhelpResponse> =
        queryhelp(
          TrackDetailQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: TrackDetailTupleParams): CompletableFuture<List<TrackDetailsFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: TrackDetailTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<TrackDetailsFull>>

    /** A view of [TrackDetailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackDetailServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/trackdetails`, but is otherwise the same as [TrackDetailServiceAsync.list]. */
        fun list(params: TrackDetailListParams): CompletableFuture<HttpResponseFor<TrackDetailListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: TrackDetailListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TrackDetailListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/trackdetails/count`, but is otherwise the same as [TrackDetailServiceAsync.count]. */
        fun count(params: TrackDetailCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: TrackDetailCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/trackdetails/createBulk`, but is otherwise the same as [TrackDetailServiceAsync.createBulk]. */
        fun createBulk(params: TrackDetailCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: TrackDetailCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/trackdetails/queryhelp`, but is otherwise the same as [TrackDetailServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<TrackDetailQueryhelpResponse>> = queryhelp(TrackDetailQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TrackDetailQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none()): CompletableFuture<HttpResponseFor<TrackDetailQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TrackDetailQueryhelpResponse>> =
            queryhelp(
              TrackDetailQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/trackdetails/tuple`, but is otherwise the same as [TrackDetailServiceAsync.tuple]. */
        fun tuple(params: TrackDetailTupleParams): CompletableFuture<HttpResponseFor<List<TrackDetailsFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: TrackDetailTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<TrackDetailsFull>>>
    }
}
