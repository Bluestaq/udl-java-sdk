// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.hazard.HazardCountParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateBulkParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateParams
import com.unifieddatalibrary.api.models.hazard.HazardGetParams
import com.unifieddatalibrary.api.models.hazard.HazardGetResponse
import com.unifieddatalibrary.api.models.hazard.HazardListPageAsync
import com.unifieddatalibrary.api.models.hazard.HazardListParams
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpParams
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpResponse
import com.unifieddatalibrary.api.models.hazard.HazardTupleParams
import com.unifieddatalibrary.api.models.hazard.HazardTupleResponse
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import com.unifieddatalibrary.api.services.async.hazard.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HazardServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single hazard as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: HazardCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: HazardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: HazardListParams): CompletableFuture<HazardListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: HazardListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HazardListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: HazardCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: HazardCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of hazards as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: HazardCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Hazard by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<HazardGetResponse> =
        get(
          id, HazardGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: HazardGetParams = HazardGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HazardGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: HazardGetParams = HazardGetParams.none()): CompletableFuture<HazardGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: HazardGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HazardGetResponse>

    /** @see get */
    fun get(params: HazardGetParams): CompletableFuture<HazardGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HazardGetResponse> =
        get(
          id,
          HazardGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<HazardQueryhelpResponse> = queryhelp(HazardQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HazardQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none()): CompletableFuture<HazardQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HazardQueryhelpResponse> =
        queryhelp(
          HazardQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: HazardTupleParams): CompletableFuture<List<HazardTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: HazardTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<HazardTupleResponse>>

    /** A view of [HazardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/hazard`, but is otherwise the same as [HazardServiceAsync.create]. */
        fun create(params: HazardCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: HazardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/hazard`, but is otherwise the same as [HazardServiceAsync.list]. */
        fun list(params: HazardListParams): CompletableFuture<HttpResponseFor<HazardListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: HazardListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<HazardListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/hazard/count`, but is otherwise the same as [HazardServiceAsync.count]. */
        fun count(params: HazardCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: HazardCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/hazard/createBulk`, but is otherwise the same as [HazardServiceAsync.createBulk]. */
        fun createBulk(params: HazardCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/hazard/{id}`, but is otherwise the same as [HazardServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<HazardGetResponse>> =
            get(
              id, HazardGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: HazardGetParams = HazardGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<HazardGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: HazardGetParams = HazardGetParams.none()): CompletableFuture<HttpResponseFor<HazardGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: HazardGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<HazardGetResponse>>

        /** @see get */
        fun get(params: HazardGetParams): CompletableFuture<HttpResponseFor<HazardGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HazardGetResponse>> =
            get(
              id,
              HazardGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/hazard/queryhelp`, but is otherwise the same as [HazardServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<HazardQueryhelpResponse>> = queryhelp(HazardQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<HazardQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none()): CompletableFuture<HttpResponseFor<HazardQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HazardQueryhelpResponse>> =
            queryhelp(
              HazardQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/hazard/tuple`, but is otherwise the same as [HazardServiceAsync.tuple]. */
        fun tuple(params: HazardTupleParams): CompletableFuture<HttpResponseFor<List<HazardTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: HazardTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<HazardTupleResponse>>>
    }
}
