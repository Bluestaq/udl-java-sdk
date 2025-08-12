// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scientific.ScientificCountParams
import com.unifieddatalibrary.api.models.scientific.ScientificCreateParams
import com.unifieddatalibrary.api.models.scientific.ScientificDeleteParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetResponse
import com.unifieddatalibrary.api.models.scientific.ScientificListPageAsync
import com.unifieddatalibrary.api.models.scientific.ScientificListParams
import com.unifieddatalibrary.api.models.scientific.ScientificQueryhelpParams
import com.unifieddatalibrary.api.models.scientific.ScientificQueryhelpResponse
import com.unifieddatalibrary.api.models.scientific.ScientificTupleParams
import com.unifieddatalibrary.api.models.scientific.ScientificTupleResponse
import com.unifieddatalibrary.api.models.scientific.ScientificUpdateParams
import com.unifieddatalibrary.api.services.async.ScientificServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScientificServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScientificServiceAsync

    /** Service operation to take a single Scientific as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ScientificCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ScientificCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single Scientific. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ScientificUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ScientificUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<ScientificListPageAsync> = list(ScientificListParams.none())

    /** @see list */
    fun list(params: ScientificListParams = ScientificListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ScientificListPageAsync>

    /** @see list */
    fun list(params: ScientificListParams = ScientificListParams.none()): CompletableFuture<ScientificListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ScientificListPageAsync> =
        list(
          ScientificListParams.none(), requestOptions
        )

    /** Service operation to delete a Scientific object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, ScientificDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ScientificDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ScientificDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          ScientificDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(ScientificCountParams.none())

    /** @see count */
    fun count(params: ScientificCountParams = ScientificCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: ScientificCountParams = ScientificCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          ScientificCountParams.none(), requestOptions
        )

    /** Service operation to get a single Scientific record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<ScientificGetResponse> =
        get(
          id, ScientificGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ScientificGetParams = ScientificGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ScientificGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ScientificGetParams = ScientificGetParams.none()): CompletableFuture<ScientificGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ScientificGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ScientificGetResponse>

    /** @see get */
    fun get(params: ScientificGetParams): CompletableFuture<ScientificGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ScientificGetResponse> =
        get(
          id,
          ScientificGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<ScientificQueryhelpResponse> = queryhelp(ScientificQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ScientificQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none()): CompletableFuture<ScientificQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ScientificQueryhelpResponse> =
        queryhelp(
          ScientificQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ScientificTupleParams): CompletableFuture<List<ScientificTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ScientificTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ScientificTupleResponse>>

    /** A view of [ScientificServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScientificServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/scientific`, but is otherwise the same as [ScientificServiceAsync.create]. */
        fun create(params: ScientificCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: ScientificCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/scientific/{id}`, but is otherwise the same as [ScientificServiceAsync.update]. */
        fun update(pathId: String, params: ScientificUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: ScientificUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: ScientificUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/scientific`, but is otherwise the same as [ScientificServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<ScientificListPageAsync>> = list(ScientificListParams.none())

        /** @see list */
        fun list(params: ScientificListParams = ScientificListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ScientificListPageAsync>>

        /** @see list */
        fun list(params: ScientificListParams = ScientificListParams.none()): CompletableFuture<HttpResponseFor<ScientificListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ScientificListPageAsync>> =
            list(
              ScientificListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/scientific/{id}`, but is otherwise the same as [ScientificServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, ScientificDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: ScientificDeleteParams = ScientificDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: ScientificDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ScientificDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              ScientificDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/scientific/count`, but is otherwise the same as [ScientificServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(ScientificCountParams.none())

        /** @see count */
        fun count(params: ScientificCountParams = ScientificCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: ScientificCountParams = ScientificCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              ScientificCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/scientific/{id}`, but is otherwise the same as [ScientificServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<ScientificGetResponse>> =
            get(
              id, ScientificGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: ScientificGetParams = ScientificGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ScientificGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: ScientificGetParams = ScientificGetParams.none()): CompletableFuture<HttpResponseFor<ScientificGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: ScientificGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ScientificGetResponse>>

        /** @see get */
        fun get(params: ScientificGetParams): CompletableFuture<HttpResponseFor<ScientificGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ScientificGetResponse>> =
            get(
              id,
              ScientificGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/scientific/queryhelp`, but is otherwise the same as [ScientificServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ScientificQueryhelpResponse>> = queryhelp(ScientificQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ScientificQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: ScientificQueryhelpParams = ScientificQueryhelpParams.none()): CompletableFuture<HttpResponseFor<ScientificQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ScientificQueryhelpResponse>> =
            queryhelp(
              ScientificQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/scientific/tuple`, but is otherwise the same as [ScientificServiceAsync.tuple]. */
        fun tuple(params: ScientificTupleParams): CompletableFuture<HttpResponseFor<List<ScientificTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: ScientificTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ScientificTupleResponse>>>
    }
}
