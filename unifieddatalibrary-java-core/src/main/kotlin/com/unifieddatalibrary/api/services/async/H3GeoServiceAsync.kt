// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.h3geo.H3GeoCountParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoCreateParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoGetParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoGetResponse
import com.unifieddatalibrary.api.models.h3geo.H3GeoListPageAsync
import com.unifieddatalibrary.api.models.h3geo.H3GeoListParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoQueryhelpParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoQueryhelpResponse
import com.unifieddatalibrary.api.models.h3geo.H3GeoTupleParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoTupleResponse
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsync
import com.unifieddatalibrary.api.services.async.h3geo.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface H3GeoServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single H3Geo record as a POST body and ingest into the database. This operation does not persist any H3GeoHexCell points that may be present in the body of the request. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: H3GeoCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: H3GeoCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: H3GeoListParams): CompletableFuture<H3GeoListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: H3GeoListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<H3GeoListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: H3GeoCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: H3GeoCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to get a single RF geolocation by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<H3GeoGetResponse> =
        get(
          id, H3GeoGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: H3GeoGetParams = H3GeoGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<H3GeoGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: H3GeoGetParams = H3GeoGetParams.none()): CompletableFuture<H3GeoGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: H3GeoGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<H3GeoGetResponse>

    /** @see get */
    fun get(params: H3GeoGetParams): CompletableFuture<H3GeoGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<H3GeoGetResponse> =
        get(
          id,
          H3GeoGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<H3GeoQueryhelpResponse> = queryhelp(H3GeoQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: H3GeoQueryhelpParams = H3GeoQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<H3GeoQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: H3GeoQueryhelpParams = H3GeoQueryhelpParams.none()): CompletableFuture<H3GeoQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<H3GeoQueryhelpResponse> =
        queryhelp(
          H3GeoQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: H3GeoTupleParams): CompletableFuture<List<H3GeoTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: H3GeoTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<H3GeoTupleResponse>>

    /** A view of [H3GeoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/h3geo`, but is otherwise the same as [H3GeoServiceAsync.create]. */
        fun create(params: H3GeoCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: H3GeoCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/h3geo`, but is otherwise the same as [H3GeoServiceAsync.list]. */
        fun list(params: H3GeoListParams): CompletableFuture<HttpResponseFor<H3GeoListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: H3GeoListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<H3GeoListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/h3geo/count`, but is otherwise the same as [H3GeoServiceAsync.count]. */
        fun count(params: H3GeoCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: H3GeoCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/h3geo/{id}`, but is otherwise the same as [H3GeoServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<H3GeoGetResponse>> =
            get(
              id, H3GeoGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: H3GeoGetParams = H3GeoGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<H3GeoGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: H3GeoGetParams = H3GeoGetParams.none()): CompletableFuture<HttpResponseFor<H3GeoGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: H3GeoGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<H3GeoGetResponse>>

        /** @see get */
        fun get(params: H3GeoGetParams): CompletableFuture<HttpResponseFor<H3GeoGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<H3GeoGetResponse>> =
            get(
              id,
              H3GeoGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/h3geo/queryhelp`, but is otherwise the same as [H3GeoServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<H3GeoQueryhelpResponse>> = queryhelp(H3GeoQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: H3GeoQueryhelpParams = H3GeoQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<H3GeoQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: H3GeoQueryhelpParams = H3GeoQueryhelpParams.none()): CompletableFuture<HttpResponseFor<H3GeoQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<H3GeoQueryhelpResponse>> =
            queryhelp(
              H3GeoQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/h3geo/tuple`, but is otherwise the same as [H3GeoServiceAsync.tuple]. */
        fun tuple(params: H3GeoTupleParams): CompletableFuture<HttpResponseFor<List<H3GeoTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: H3GeoTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<H3GeoTupleResponse>>>
    }
}
