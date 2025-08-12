// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellCountParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListPageAsync
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpResponse
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleResponse
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface H3GeoHexCellServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoHexCellServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: H3GeoHexCellListParams): CompletableFuture<H3GeoHexCellListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: H3GeoHexCellListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<H3GeoHexCellListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: H3GeoHexCellCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: H3GeoHexCellCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<H3GeoHexCellQueryhelpResponse> = queryhelp(H3GeoHexCellQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<H3GeoHexCellQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none()): CompletableFuture<H3GeoHexCellQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<H3GeoHexCellQueryhelpResponse> =
        queryhelp(
          H3GeoHexCellQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: H3GeoHexCellTupleParams): CompletableFuture<List<H3GeoHexCellTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: H3GeoHexCellTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<H3GeoHexCellTupleResponse>>

    /** A view of [H3GeoHexCellServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoHexCellServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/h3geohexcell`, but is otherwise the same as [H3GeoHexCellServiceAsync.list]. */
        fun list(params: H3GeoHexCellListParams): CompletableFuture<HttpResponseFor<H3GeoHexCellListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: H3GeoHexCellListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<H3GeoHexCellListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/h3geohexcell/count`, but is otherwise the same as [H3GeoHexCellServiceAsync.count]. */
        fun count(params: H3GeoHexCellCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: H3GeoHexCellCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/h3geohexcell/queryhelp`, but is otherwise the same as [H3GeoHexCellServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<H3GeoHexCellQueryhelpResponse>> = queryhelp(H3GeoHexCellQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<H3GeoHexCellQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none()): CompletableFuture<HttpResponseFor<H3GeoHexCellQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<H3GeoHexCellQueryhelpResponse>> =
            queryhelp(
              H3GeoHexCellQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/h3geohexcell/tuple`, but is otherwise the same as [H3GeoHexCellServiceAsync.tuple]. */
        fun tuple(params: H3GeoHexCellTupleParams): CompletableFuture<HttpResponseFor<List<H3GeoHexCellTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: H3GeoHexCellTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<H3GeoHexCellTupleResponse>>>
    }
}
