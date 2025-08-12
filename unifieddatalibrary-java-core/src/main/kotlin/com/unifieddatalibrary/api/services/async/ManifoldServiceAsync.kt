// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.manifold.ManifoldCountParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateBulkParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateParams
import com.unifieddatalibrary.api.models.manifold.ManifoldDeleteParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldListPageAsync
import com.unifieddatalibrary.api.models.manifold.ManifoldListParams
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpParams
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleParams
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldUpdateParams
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ManifoldServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldServiceAsync

    /** Service operation to take a single Manifold as a POST body and ingest into the database. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ManifoldCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ManifoldCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single Manifold. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ManifoldUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ManifoldUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<ManifoldListPageAsync> = list(ManifoldListParams.none())

    /** @see list */
    fun list(params: ManifoldListParams = ManifoldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ManifoldListPageAsync>

    /** @see list */
    fun list(params: ManifoldListParams = ManifoldListParams.none()): CompletableFuture<ManifoldListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ManifoldListPageAsync> =
        list(
          ManifoldListParams.none(), requestOptions
        )

    /** Service operation to delete a Manifold object specified by the passed ID path parameter. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, ManifoldDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ManifoldDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          ManifoldDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(ManifoldCountParams.none())

    /** @see count */
    fun count(params: ManifoldCountParams = ManifoldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: ManifoldCountParams = ManifoldCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          ManifoldCountParams.none(), requestOptions
        )

    /** Service operation to take multiple Manifolds as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun createBulk(params: ManifoldCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Manifold record by its unique ID passed as a path parameter. A manifold represents a set of possible/theoretical orbits for an object of interest based on a delta V and delta T. */
    fun get(id: String): CompletableFuture<ManifoldGetResponse> =
        get(
          id, ManifoldGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ManifoldGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none()): CompletableFuture<ManifoldGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ManifoldGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ManifoldGetResponse>

    /** @see get */
    fun get(params: ManifoldGetParams): CompletableFuture<ManifoldGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ManifoldGetResponse> =
        get(
          id,
          ManifoldGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<ManifoldQueryhelpResponse> = queryhelp(ManifoldQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ManifoldQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none()): CompletableFuture<ManifoldQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ManifoldQueryhelpResponse> =
        queryhelp(
          ManifoldQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ManifoldTupleParams): CompletableFuture<List<ManifoldTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ManifoldTupleResponse>>

    /** A view of [ManifoldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/manifold`, but is otherwise the same as [ManifoldServiceAsync.create]. */
        fun create(params: ManifoldCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: ManifoldCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/manifold/{id}`, but is otherwise the same as [ManifoldServiceAsync.update]. */
        fun update(pathId: String, params: ManifoldUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: ManifoldUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/manifold`, but is otherwise the same as [ManifoldServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<ManifoldListPageAsync>> = list(ManifoldListParams.none())

        /** @see list */
        fun list(params: ManifoldListParams = ManifoldListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ManifoldListPageAsync>>

        /** @see list */
        fun list(params: ManifoldListParams = ManifoldListParams.none()): CompletableFuture<HttpResponseFor<ManifoldListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManifoldListPageAsync>> =
            list(
              ManifoldListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/manifold/{id}`, but is otherwise the same as [ManifoldServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, ManifoldDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: ManifoldDeleteParams = ManifoldDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ManifoldDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              ManifoldDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/manifold/count`, but is otherwise the same as [ManifoldServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(ManifoldCountParams.none())

        /** @see count */
        fun count(params: ManifoldCountParams = ManifoldCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: ManifoldCountParams = ManifoldCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              ManifoldCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/manifold/createBulk`, but is otherwise the same as [ManifoldServiceAsync.createBulk]. */
        fun createBulk(params: ManifoldCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/manifold/{id}`, but is otherwise the same as [ManifoldServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<ManifoldGetResponse>> =
            get(
              id, ManifoldGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ManifoldGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: ManifoldGetParams = ManifoldGetParams.none()): CompletableFuture<HttpResponseFor<ManifoldGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: ManifoldGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ManifoldGetResponse>>

        /** @see get */
        fun get(params: ManifoldGetParams): CompletableFuture<HttpResponseFor<ManifoldGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManifoldGetResponse>> =
            get(
              id,
              ManifoldGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/manifold/queryhelp`, but is otherwise the same as [ManifoldServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ManifoldQueryhelpResponse>> = queryhelp(ManifoldQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ManifoldQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: ManifoldQueryhelpParams = ManifoldQueryhelpParams.none()): CompletableFuture<HttpResponseFor<ManifoldQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManifoldQueryhelpResponse>> =
            queryhelp(
              ManifoldQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/manifold/tuple`, but is otherwise the same as [ManifoldServiceAsync.tuple]. */
        fun tuple(params: ManifoldTupleParams): CompletableFuture<HttpResponseFor<List<ManifoldTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ManifoldTupleResponse>>>
    }
}
