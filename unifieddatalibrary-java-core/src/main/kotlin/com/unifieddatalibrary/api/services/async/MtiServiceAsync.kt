// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.mti.MtiCountParams
import com.unifieddatalibrary.api.models.mti.MtiCreateBulkParams
import com.unifieddatalibrary.api.models.mti.MtiListPageAsync
import com.unifieddatalibrary.api.models.mti.MtiListParams
import com.unifieddatalibrary.api.models.mti.MtiQueryhelpParams
import com.unifieddatalibrary.api.models.mti.MtiQueryhelpResponse
import com.unifieddatalibrary.api.models.mti.MtiTupleParams
import com.unifieddatalibrary.api.models.mti.MtiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.mti.history.MtiFull
import com.unifieddatalibrary.api.services.async.MtiServiceAsync
import com.unifieddatalibrary.api.services.async.mti.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MtiServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MtiServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: MtiListParams): CompletableFuture<MtiListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: MtiListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<MtiListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: MtiCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: MtiCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of Moving Target Indicator (MTI) records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: MtiCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: MtiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<MtiQueryhelpResponse> = queryhelp(MtiQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: MtiQueryhelpParams = MtiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<MtiQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: MtiQueryhelpParams = MtiQueryhelpParams.none()): CompletableFuture<MtiQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<MtiQueryhelpResponse> =
        queryhelp(
          MtiQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: MtiTupleParams): CompletableFuture<List<MtiFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: MtiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<MtiFull>>

    /** Service operation to take a list of Moving Target Indicator (MTI) formatted data as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: MtiUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: MtiUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [MtiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MtiServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/mti`, but is otherwise the same as [MtiServiceAsync.list]. */
        fun list(params: MtiListParams): CompletableFuture<HttpResponseFor<MtiListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: MtiListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<MtiListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/mti/count`, but is otherwise the same as [MtiServiceAsync.count]. */
        fun count(params: MtiCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: MtiCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/mti/createBulk`, but is otherwise the same as [MtiServiceAsync.createBulk]. */
        fun createBulk(params: MtiCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: MtiCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/mti/queryhelp`, but is otherwise the same as [MtiServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<MtiQueryhelpResponse>> = queryhelp(MtiQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: MtiQueryhelpParams = MtiQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<MtiQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: MtiQueryhelpParams = MtiQueryhelpParams.none()): CompletableFuture<HttpResponseFor<MtiQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<MtiQueryhelpResponse>> =
            queryhelp(
              MtiQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/mti/tuple`, but is otherwise the same as [MtiServiceAsync.tuple]. */
        fun tuple(params: MtiTupleParams): CompletableFuture<HttpResponseFor<List<MtiFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: MtiTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<MtiFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-mti`, but is otherwise the same as [MtiServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: MtiUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: MtiUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
