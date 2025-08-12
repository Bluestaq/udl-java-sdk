// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.StateVectorFull
import com.unifieddatalibrary.api.models.statevector.StateVectorCountParams
import com.unifieddatalibrary.api.models.statevector.StateVectorCreateBulkParams
import com.unifieddatalibrary.api.models.statevector.StateVectorCreateParams
import com.unifieddatalibrary.api.models.statevector.StateVectorGetParams
import com.unifieddatalibrary.api.models.statevector.StateVectorListPageAsync
import com.unifieddatalibrary.api.models.statevector.StateVectorListParams
import com.unifieddatalibrary.api.models.statevector.StateVectorQueryhelpParams
import com.unifieddatalibrary.api.models.statevector.StateVectorQueryhelpResponse
import com.unifieddatalibrary.api.models.statevector.StateVectorTupleParams
import com.unifieddatalibrary.api.models.statevector.StateVectorUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsync
import com.unifieddatalibrary.api.services.async.statevector.CurrentServiceAsync
import com.unifieddatalibrary.api.services.async.statevector.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StateVectorServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StateVectorServiceAsync

    fun history(): HistoryServiceAsync

    fun current(): CurrentServiceAsync

    /** Service operation to take a single state vector as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: StateVectorCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: StateVectorCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: StateVectorListParams): CompletableFuture<StateVectorListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: StateVectorListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StateVectorListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: StateVectorCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: StateVectorCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of state vectors as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: StateVectorCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: StateVectorCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single state vector by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<StateVectorFull> =
        get(
          id, StateVectorGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: StateVectorGetParams = StateVectorGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StateVectorFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: StateVectorGetParams = StateVectorGetParams.none()): CompletableFuture<StateVectorFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: StateVectorGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StateVectorFull>

    /** @see get */
    fun get(params: StateVectorGetParams): CompletableFuture<StateVectorFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<StateVectorFull> =
        get(
          id,
          StateVectorGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<StateVectorQueryhelpResponse> = queryhelp(StateVectorQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: StateVectorQueryhelpParams = StateVectorQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StateVectorQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: StateVectorQueryhelpParams = StateVectorQueryhelpParams.none()): CompletableFuture<StateVectorQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<StateVectorQueryhelpResponse> =
        queryhelp(
          StateVectorQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: StateVectorTupleParams): CompletableFuture<List<StateVectorFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: StateVectorTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<StateVectorFull>>

    /** Service operation to take multiple state vectors as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: StateVectorUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: StateVectorUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [StateVectorServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StateVectorServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        fun current(): CurrentServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/statevector`, but is otherwise the same as [StateVectorServiceAsync.create]. */
        fun create(params: StateVectorCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: StateVectorCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/statevector`, but is otherwise the same as [StateVectorServiceAsync.list]. */
        fun list(params: StateVectorListParams): CompletableFuture<HttpResponseFor<StateVectorListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: StateVectorListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StateVectorListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/statevector/count`, but is otherwise the same as [StateVectorServiceAsync.count]. */
        fun count(params: StateVectorCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: StateVectorCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/statevector/createBulk`, but is otherwise the same as [StateVectorServiceAsync.createBulk]. */
        fun createBulk(params: StateVectorCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: StateVectorCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/statevector/{id}`, but is otherwise the same as [StateVectorServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<StateVectorFull>> =
            get(
              id, StateVectorGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: StateVectorGetParams = StateVectorGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StateVectorFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: StateVectorGetParams = StateVectorGetParams.none()): CompletableFuture<HttpResponseFor<StateVectorFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: StateVectorGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StateVectorFull>>

        /** @see get */
        fun get(params: StateVectorGetParams): CompletableFuture<HttpResponseFor<StateVectorFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StateVectorFull>> =
            get(
              id,
              StateVectorGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/statevector/queryhelp`, but is otherwise the same as [StateVectorServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<StateVectorQueryhelpResponse>> = queryhelp(StateVectorQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: StateVectorQueryhelpParams = StateVectorQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StateVectorQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: StateVectorQueryhelpParams = StateVectorQueryhelpParams.none()): CompletableFuture<HttpResponseFor<StateVectorQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StateVectorQueryhelpResponse>> =
            queryhelp(
              StateVectorQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/statevector/tuple`, but is otherwise the same as [StateVectorServiceAsync.tuple]. */
        fun tuple(params: StateVectorTupleParams): CompletableFuture<HttpResponseFor<List<StateVectorFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: StateVectorTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<StateVectorFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-sv`, but is otherwise the same as [StateVectorServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: StateVectorUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: StateVectorUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
