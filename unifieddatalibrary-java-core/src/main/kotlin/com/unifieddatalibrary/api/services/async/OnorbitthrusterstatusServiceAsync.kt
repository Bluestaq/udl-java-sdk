// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitthrusterstatusFull
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCountParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusDeleteParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusGetParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListPageAsync
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusTupleParams
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import com.unifieddatalibrary.api.services.async.onorbitthrusterstatus.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitthrusterstatusServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single OnorbitThrusterStatus record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitthrusterstatusCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitthrusterstatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OnorbitthrusterstatusListPageAsync> = list(OnorbitthrusterstatusListParams.none())

    /** @see list */
    fun list(params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitthrusterstatusListPageAsync>

    /** @see list */
    fun list(params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none()): CompletableFuture<OnorbitthrusterstatusListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterstatusListPageAsync> =
        list(
          OnorbitthrusterstatusListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitThrusterStatus record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OnorbitthrusterstatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitthrusterstatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitthrusterstatusDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OnorbitthrusterstatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(OnorbitthrusterstatusCountParams.none())

    /** @see count */
    fun count(params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          OnorbitthrusterstatusCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of onorbitthrusterstatus records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OnorbitthrusterstatusCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OnorbitthrusterstatusCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single OnorbitThrusterStatus record by its unique ID passed as a path parameter. OnorbitThrusterStatus records are information for OnorbitThruster objects. */
    fun get(id: String): CompletableFuture<OnorbitthrusterstatusFull> =
        get(
          id, OnorbitthrusterstatusGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitthrusterstatusFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none()): CompletableFuture<OnorbitthrusterstatusFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitthrusterstatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitthrusterstatusFull>

    /** @see get */
    fun get(params: OnorbitthrusterstatusGetParams): CompletableFuture<OnorbitthrusterstatusFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterstatusFull> =
        get(
          id,
          OnorbitthrusterstatusGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<OnorbitthrusterstatusQueryhelpResponse> = queryhelp(OnorbitthrusterstatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams = OnorbitthrusterstatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitthrusterstatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams = OnorbitthrusterstatusQueryhelpParams.none()): CompletableFuture<OnorbitthrusterstatusQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterstatusQueryhelpResponse> =
        queryhelp(
          OnorbitthrusterstatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OnorbitthrusterstatusTupleParams): CompletableFuture<List<OnorbitthrusterstatusFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OnorbitthrusterstatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<OnorbitthrusterstatusFull>>

    /** A view of [OnorbitthrusterstatusServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitthrusterstatus`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.create]. */
        fun create(params: OnorbitthrusterstatusCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OnorbitthrusterstatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusListPageAsync>> = list(OnorbitthrusterstatusListParams.none())

        /** @see list */
        fun list(params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusListPageAsync>>

        /** @see list */
        fun list(params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusListPageAsync>> =
            list(
              OnorbitthrusterstatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitthrusterstatus/{id}`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OnorbitthrusterstatusDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OnorbitthrusterstatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitthrusterstatusDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OnorbitthrusterstatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/count`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(OnorbitthrusterstatusCountParams.none())

        /** @see count */
        fun count(params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              OnorbitthrusterstatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/onorbitthrusterstatus/createBulk`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.createBulk]. */
        fun createBulk(params: OnorbitthrusterstatusCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: OnorbitthrusterstatusCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/{id}`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>> =
            get(
              id, OnorbitthrusterstatusGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OnorbitthrusterstatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>>

        /** @see get */
        fun get(params: OnorbitthrusterstatusGetParams): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>> =
            get(
              id,
              OnorbitthrusterstatusGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/queryhelp`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse>> = queryhelp(OnorbitthrusterstatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams = OnorbitthrusterstatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams = OnorbitthrusterstatusQueryhelpParams.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse>> =
            queryhelp(
              OnorbitthrusterstatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/tuple`, but is otherwise the same as [OnorbitthrusterstatusServiceAsync.tuple]. */
        fun tuple(params: OnorbitthrusterstatusTupleParams): CompletableFuture<HttpResponseFor<List<OnorbitthrusterstatusFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: OnorbitthrusterstatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<OnorbitthrusterstatusFull>>>
    }
}
