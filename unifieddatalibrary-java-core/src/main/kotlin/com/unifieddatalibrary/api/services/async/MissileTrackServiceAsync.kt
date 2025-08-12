// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCountParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCreateBulkParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListPageAsync
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import com.unifieddatalibrary.api.services.async.missiletracks.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MissileTrackServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: MissileTrackListParams): CompletableFuture<MissileTrackListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: MissileTrackListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<MissileTrackListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: MissileTrackCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: MissileTrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of MissileTrack records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: MissileTrackCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<MissileTrackQueryhelpResponse> = queryhelp(MissileTrackQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<MissileTrackQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none()): CompletableFuture<MissileTrackQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<MissileTrackQueryhelpResponse> =
        queryhelp(
          MissileTrackQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: MissileTrackTupleParams): CompletableFuture<List<MissileTrackTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<MissileTrackTupleResponse>>

    /** Service operation to take multiple missile track records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [MissileTrackServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/missiletrack`, but is otherwise the same as [MissileTrackServiceAsync.list]. */
        fun list(params: MissileTrackListParams): CompletableFuture<HttpResponseFor<MissileTrackListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: MissileTrackListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<MissileTrackListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/missiletrack/count`, but is otherwise the same as [MissileTrackServiceAsync.count]. */
        fun count(params: MissileTrackCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: MissileTrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/missiletrack/createBulk`, but is otherwise the same as [MissileTrackServiceAsync.createBulk]. */
        fun createBulk(params: MissileTrackCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/missiletrack/queryhelp`, but is otherwise the same as [MissileTrackServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<MissileTrackQueryhelpResponse>> = queryhelp(MissileTrackQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<MissileTrackQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none()): CompletableFuture<HttpResponseFor<MissileTrackQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<MissileTrackQueryhelpResponse>> =
            queryhelp(
              MissileTrackQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/missiletrack/tuple`, but is otherwise the same as [MissileTrackServiceAsync.tuple]. */
        fun tuple(params: MissileTrackTupleParams): CompletableFuture<HttpResponseFor<List<MissileTrackTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<MissileTrackTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-missiletrack`, but is otherwise the same as [MissileTrackServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
