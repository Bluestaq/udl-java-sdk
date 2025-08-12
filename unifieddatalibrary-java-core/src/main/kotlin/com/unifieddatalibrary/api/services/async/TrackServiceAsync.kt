// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.track.TrackCountParams
import com.unifieddatalibrary.api.models.track.TrackCreateBulkParams
import com.unifieddatalibrary.api.models.track.TrackListPageAsync
import com.unifieddatalibrary.api.models.track.TrackListParams
import com.unifieddatalibrary.api.models.track.TrackQueryhelpParams
import com.unifieddatalibrary.api.models.track.TrackQueryhelpResponse
import com.unifieddatalibrary.api.models.track.TrackTupleParams
import com.unifieddatalibrary.api.models.track.TrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.track.history.TrackFull
import com.unifieddatalibrary.api.services.async.TrackServiceAsync
import com.unifieddatalibrary.api.services.async.track.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TrackServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: TrackListParams): CompletableFuture<TrackListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: TrackListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TrackListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: TrackCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: TrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of Track records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: TrackCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: TrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<TrackQueryhelpResponse> = queryhelp(TrackQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: TrackQueryhelpParams = TrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TrackQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: TrackQueryhelpParams = TrackQueryhelpParams.none()): CompletableFuture<TrackQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<TrackQueryhelpResponse> =
        queryhelp(
          TrackQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: TrackTupleParams): CompletableFuture<List<TrackFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: TrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<TrackFull>>

    /** Service operation to take multiple tracks as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: TrackUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: TrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [TrackServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/track`, but is otherwise the same as [TrackServiceAsync.list]. */
        fun list(params: TrackListParams): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: TrackListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TrackListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/track/count`, but is otherwise the same as [TrackServiceAsync.count]. */
        fun count(params: TrackCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: TrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/track/createBulk`, but is otherwise the same as [TrackServiceAsync.createBulk]. */
        fun createBulk(params: TrackCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: TrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/track/queryhelp`, but is otherwise the same as [TrackServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<TrackQueryhelpResponse>> = queryhelp(TrackQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: TrackQueryhelpParams = TrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TrackQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: TrackQueryhelpParams = TrackQueryhelpParams.none()): CompletableFuture<HttpResponseFor<TrackQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TrackQueryhelpResponse>> =
            queryhelp(
              TrackQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/track/tuple`, but is otherwise the same as [TrackServiceAsync.tuple]. */
        fun tuple(params: TrackTupleParams): CompletableFuture<HttpResponseFor<List<TrackFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: TrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<TrackFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-tracks`, but is otherwise the same as [TrackServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: TrackUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: TrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
