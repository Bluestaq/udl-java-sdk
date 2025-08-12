// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.DriftHistoryFull
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryCountParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryListPageAsync
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryListParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryQueryhelpParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryQueryhelpResponse
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryRetrieveParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryTupleParams
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DriftHistoryServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriftHistoryServiceAsync

    /** Service operation to get a single DriftHistory record by its unique ID passed as a path parameter. DriftHistory represents historical drift rates for GEO Onorbit objects resulting from updates to OnorbitDetails driftRate values. */
    fun retrieve(id: String): CompletableFuture<DriftHistoryFull> =
        retrieve(
          id, DriftHistoryRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DriftHistoryFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none()): CompletableFuture<DriftHistoryFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: DriftHistoryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DriftHistoryFull>

    /** @see retrieve */
    fun retrieve(params: DriftHistoryRetrieveParams): CompletableFuture<DriftHistoryFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<DriftHistoryFull> =
        retrieve(
          id,
          DriftHistoryRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<DriftHistoryListPageAsync> = list(DriftHistoryListParams.none())

    /** @see list */
    fun list(params: DriftHistoryListParams = DriftHistoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DriftHistoryListPageAsync>

    /** @see list */
    fun list(params: DriftHistoryListParams = DriftHistoryListParams.none()): CompletableFuture<DriftHistoryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DriftHistoryListPageAsync> =
        list(
          DriftHistoryListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(DriftHistoryCountParams.none())

    /** @see count */
    fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          DriftHistoryCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<DriftHistoryQueryhelpResponse> = queryhelp(DriftHistoryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DriftHistoryQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none()): CompletableFuture<DriftHistoryQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<DriftHistoryQueryhelpResponse> =
        queryhelp(
          DriftHistoryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: DriftHistoryTupleParams): CompletableFuture<List<DriftHistoryFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: DriftHistoryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<DriftHistoryFull>>

    /** A view of [DriftHistoryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriftHistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/drifthistory/{id}`, but is otherwise the same as [DriftHistoryServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DriftHistoryFull>> =
            retrieve(
              id, DriftHistoryRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DriftHistoryFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none()): CompletableFuture<HttpResponseFor<DriftHistoryFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: DriftHistoryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DriftHistoryFull>>

        /** @see retrieve */
        fun retrieve(params: DriftHistoryRetrieveParams): CompletableFuture<HttpResponseFor<DriftHistoryFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DriftHistoryFull>> =
            retrieve(
              id,
              DriftHistoryRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory`, but is otherwise the same as [DriftHistoryServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<DriftHistoryListPageAsync>> = list(DriftHistoryListParams.none())

        /** @see list */
        fun list(params: DriftHistoryListParams = DriftHistoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DriftHistoryListPageAsync>>

        /** @see list */
        fun list(params: DriftHistoryListParams = DriftHistoryListParams.none()): CompletableFuture<HttpResponseFor<DriftHistoryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DriftHistoryListPageAsync>> =
            list(
              DriftHistoryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory/count`, but is otherwise the same as [DriftHistoryServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(DriftHistoryCountParams.none())

        /** @see count */
        fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              DriftHistoryCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory/queryhelp`, but is otherwise the same as [DriftHistoryServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<DriftHistoryQueryhelpResponse>> = queryhelp(DriftHistoryQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DriftHistoryQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none()): CompletableFuture<HttpResponseFor<DriftHistoryQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DriftHistoryQueryhelpResponse>> =
            queryhelp(
              DriftHistoryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory/tuple`, but is otherwise the same as [DriftHistoryServiceAsync.tuple]. */
        fun tuple(params: DriftHistoryTupleParams): CompletableFuture<HttpResponseFor<List<DriftHistoryFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: DriftHistoryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<DriftHistoryFull>>>
    }
}
