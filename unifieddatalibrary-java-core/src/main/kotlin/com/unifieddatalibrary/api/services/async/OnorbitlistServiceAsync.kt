// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCountParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCreateParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistDeleteParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListPageAsync
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitlistServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistServiceAsync

    /** Service operation to take a single OnorbitList as a POST body and ingest into the database. An OnorbitList is just a generic named list of on-orbit IDs. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitlistCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitlistCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single OnorbitList. An OnorbitList is just a generic named list of on-orbit IDs. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitlistUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitlistUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitlistUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitlistUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OnorbitlistListPageAsync> = list(OnorbitlistListParams.none())

    /** @see list */
    fun list(params: OnorbitlistListParams = OnorbitlistListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitlistListPageAsync>

    /** @see list */
    fun list(params: OnorbitlistListParams = OnorbitlistListParams.none()): CompletableFuture<OnorbitlistListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitlistListPageAsync> =
        list(
          OnorbitlistListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitList object specified by the passed ID path parameter. An OnorbitList is just a generic named list of on-orbit IDs. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OnorbitlistDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitlistDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitlistDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OnorbitlistDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(OnorbitlistCountParams.none())

    /** @see count */
    fun count(params: OnorbitlistCountParams = OnorbitlistCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: OnorbitlistCountParams = OnorbitlistCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          OnorbitlistCountParams.none(), requestOptions
        )

    /** Service operation to get a single OnorbitList record by its unique ID passed as a path parameter. An OnorbitList is just a generic named list of on-orbit IDs. */
    fun get(id: String): CompletableFuture<OnorbitlistGetResponse> =
        get(
          id, OnorbitlistGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitlistGetParams = OnorbitlistGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitlistGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitlistGetParams = OnorbitlistGetParams.none()): CompletableFuture<OnorbitlistGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitlistGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitlistGetResponse>

    /** @see get */
    fun get(params: OnorbitlistGetParams): CompletableFuture<OnorbitlistGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitlistGetResponse> =
        get(
          id,
          OnorbitlistGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<OnorbitlistQueryhelpResponse> = queryhelp(OnorbitlistQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitlistQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none()): CompletableFuture<OnorbitlistQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<OnorbitlistQueryhelpResponse> =
        queryhelp(
          OnorbitlistQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OnorbitlistTupleParams): CompletableFuture<List<OnorbitlistTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OnorbitlistTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<OnorbitlistTupleResponse>>

    /** A view of [OnorbitlistServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitlist`, but is otherwise the same as [OnorbitlistServiceAsync.create]. */
        fun create(params: OnorbitlistCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OnorbitlistCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/onorbitlist/{id}`, but is otherwise the same as [OnorbitlistServiceAsync.update]. */
        fun update(pathId: String, params: OnorbitlistUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OnorbitlistUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OnorbitlistUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OnorbitlistUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitlist`, but is otherwise the same as [OnorbitlistServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitlistListPageAsync>> = list(OnorbitlistListParams.none())

        /** @see list */
        fun list(params: OnorbitlistListParams = OnorbitlistListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitlistListPageAsync>>

        /** @see list */
        fun list(params: OnorbitlistListParams = OnorbitlistListParams.none()): CompletableFuture<HttpResponseFor<OnorbitlistListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitlistListPageAsync>> =
            list(
              OnorbitlistListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitlist/{id}`, but is otherwise the same as [OnorbitlistServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OnorbitlistDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OnorbitlistDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitlistDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OnorbitlistDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitlist/count`, but is otherwise the same as [OnorbitlistServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(OnorbitlistCountParams.none())

        /** @see count */
        fun count(params: OnorbitlistCountParams = OnorbitlistCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: OnorbitlistCountParams = OnorbitlistCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              OnorbitlistCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/onorbitlist/{id}`, but is otherwise the same as [OnorbitlistServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>> =
            get(
              id, OnorbitlistGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OnorbitlistGetParams = OnorbitlistGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OnorbitlistGetParams = OnorbitlistGetParams.none()): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OnorbitlistGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>>

        /** @see get */
        fun get(params: OnorbitlistGetParams): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>> =
            get(
              id,
              OnorbitlistGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitlist/queryhelp`, but is otherwise the same as [OnorbitlistServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OnorbitlistQueryhelpResponse>> = queryhelp(OnorbitlistQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitlistQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none()): CompletableFuture<HttpResponseFor<OnorbitlistQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitlistQueryhelpResponse>> =
            queryhelp(
              OnorbitlistQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/onorbitlist/tuple`, but is otherwise the same as [OnorbitlistServiceAsync.tuple]. */
        fun tuple(params: OnorbitlistTupleParams): CompletableFuture<HttpResponseFor<List<OnorbitlistTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: OnorbitlistTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<OnorbitlistTupleResponse>>>
    }
}
