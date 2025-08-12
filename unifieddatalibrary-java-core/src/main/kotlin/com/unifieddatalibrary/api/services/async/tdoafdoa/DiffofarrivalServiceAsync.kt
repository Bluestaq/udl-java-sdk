// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.tdoafdoa

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalCountParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalCreateBulkParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalCreateParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalListPageAsync
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalListParams
import com.unifieddatalibrary.api.services.async.tdoafdoa.DiffofarrivalServiceAsync
import com.unifieddatalibrary.api.services.async.tdoafdoa.diffofarrival.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiffofarrivalServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiffofarrivalServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single TDOA/FDOA record as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: DiffofarrivalCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: DiffofarrivalCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: DiffofarrivalListParams): CompletableFuture<DiffofarrivalListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: DiffofarrivalListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DiffofarrivalListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: DiffofarrivalCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: DiffofarrivalCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of TDOA/FDOA records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: DiffofarrivalCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: DiffofarrivalCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [DiffofarrivalServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiffofarrivalServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/diffofarrival`, but is otherwise the same as [DiffofarrivalServiceAsync.create]. */
        fun create(params: DiffofarrivalCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: DiffofarrivalCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/diffofarrival`, but is otherwise the same as [DiffofarrivalServiceAsync.list]. */
        fun list(params: DiffofarrivalListParams): CompletableFuture<HttpResponseFor<DiffofarrivalListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: DiffofarrivalListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DiffofarrivalListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/diffofarrival/count`, but is otherwise the same as [DiffofarrivalServiceAsync.count]. */
        fun count(params: DiffofarrivalCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: DiffofarrivalCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/diffofarrival/createBulk`, but is otherwise the same as [DiffofarrivalServiceAsync.createBulk]. */
        fun createBulk(params: DiffofarrivalCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: DiffofarrivalCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
