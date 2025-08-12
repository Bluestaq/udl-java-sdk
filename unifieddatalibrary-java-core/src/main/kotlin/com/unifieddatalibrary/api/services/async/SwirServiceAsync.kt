// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.swir.SwirCountParams
import com.unifieddatalibrary.api.models.swir.SwirCreateBulkParams
import com.unifieddatalibrary.api.models.swir.SwirCreateParams
import com.unifieddatalibrary.api.models.swir.SwirGetParams
import com.unifieddatalibrary.api.models.swir.SwirListPageAsync
import com.unifieddatalibrary.api.models.swir.SwirListParams
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpParams
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpResponse
import com.unifieddatalibrary.api.models.swir.SwirTupleParams
import com.unifieddatalibrary.api.models.swir.history.SwirFull
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.swir.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SwirServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single SWIR record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SwirCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SwirCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SwirListParams): CompletableFuture<SwirListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SwirListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SwirListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SwirCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SwirCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of SWIR records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: SwirCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: SwirCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single SWIR record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SwirFull> =
        get(
          id, SwirGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SwirGetParams = SwirGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SwirFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SwirGetParams = SwirGetParams.none()): CompletableFuture<SwirFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SwirGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SwirFull>

    /** @see get */
    fun get(params: SwirGetParams): CompletableFuture<SwirFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SwirFull> =
        get(
          id,
          SwirGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SwirQueryhelpResponse> = queryhelp(SwirQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SwirQueryhelpParams = SwirQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SwirQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SwirQueryhelpParams = SwirQueryhelpParams.none()): CompletableFuture<SwirQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SwirQueryhelpResponse> =
        queryhelp(
          SwirQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SwirTupleParams): CompletableFuture<List<SwirFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SwirTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SwirFull>>

    /** A view of [SwirServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/swir`, but is otherwise the same as [SwirServiceAsync.create]. */
        fun create(params: SwirCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SwirCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/swir`, but is otherwise the same as [SwirServiceAsync.list]. */
        fun list(params: SwirListParams): CompletableFuture<HttpResponseFor<SwirListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: SwirListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SwirListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/swir/count`, but is otherwise the same as [SwirServiceAsync.count]. */
        fun count(params: SwirCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: SwirCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/swir/createBulk`, but is otherwise the same as [SwirServiceAsync.createBulk]. */
        fun createBulk(params: SwirCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: SwirCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/swir/{id}`, but is otherwise the same as [SwirServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SwirFull>> =
            get(
              id, SwirGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SwirGetParams = SwirGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SwirFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SwirGetParams = SwirGetParams.none()): CompletableFuture<HttpResponseFor<SwirFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SwirGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SwirFull>>

        /** @see get */
        fun get(params: SwirGetParams): CompletableFuture<HttpResponseFor<SwirFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SwirFull>> =
            get(
              id,
              SwirGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/swir/queryhelp`, but is otherwise the same as [SwirServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SwirQueryhelpResponse>> = queryhelp(SwirQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SwirQueryhelpParams = SwirQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SwirQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SwirQueryhelpParams = SwirQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SwirQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SwirQueryhelpResponse>> =
            queryhelp(
              SwirQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/swir/tuple`, but is otherwise the same as [SwirServiceAsync.tuple]. */
        fun tuple(params: SwirTupleParams): CompletableFuture<HttpResponseFor<List<SwirFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SwirTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SwirFull>>>
    }
}
