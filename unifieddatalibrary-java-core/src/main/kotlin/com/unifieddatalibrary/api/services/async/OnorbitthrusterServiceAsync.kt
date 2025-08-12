// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitThrusterFull
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterCreateParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterDeleteParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterGetParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListPageAsync
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitthrusterServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterServiceAsync

    /** Service operation to take a single OnorbitThruster as a POST body and ingest into the database. An OnorbitThruster is the association between an on-orbit spacecraft's engine and a particular on-orbit spacecraft. An Engine type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitthrusterCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitthrusterCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single OnorbitThruster. An OnorbitThruster is the association between an on-orbit spacecraft's engine and a particular on-orbit spacecraft. An Engine type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitthrusterUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitthrusterUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitthrusterUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitthrusterUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OnorbitthrusterListPageAsync> = list(OnorbitthrusterListParams.none())

    /** @see list */
    fun list(params: OnorbitthrusterListParams = OnorbitthrusterListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitthrusterListPageAsync>

    /** @see list */
    fun list(params: OnorbitthrusterListParams = OnorbitthrusterListParams.none()): CompletableFuture<OnorbitthrusterListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterListPageAsync> =
        list(
          OnorbitthrusterListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitThruster object specified by the passed ID path parameter. An OnorbitThruster is the association between an on-orbit spacecraft's engine and a particular on-orbit spacecraft. An Engine type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OnorbitthrusterDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitthrusterDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitthrusterDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OnorbitthrusterDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitThruster record by its unique ID passed as a path parameter. An OnorbitThruster is the association between an on-orbit spacecraft's engine and a particular on-orbit spacecraft. An Engine type may be associated with many different on-orbit spacecraft. */
    fun get(id: String): CompletableFuture<OnorbitThrusterFull> =
        get(
          id, OnorbitthrusterGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitThrusterFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none()): CompletableFuture<OnorbitThrusterFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitthrusterGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitThrusterFull>

    /** @see get */
    fun get(params: OnorbitthrusterGetParams): CompletableFuture<OnorbitThrusterFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitThrusterFull> =
        get(
          id,
          OnorbitthrusterGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitthrusterServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitthruster`, but is otherwise the same as [OnorbitthrusterServiceAsync.create]. */
        fun create(params: OnorbitthrusterCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OnorbitthrusterCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/onorbitthruster/{id}`, but is otherwise the same as [OnorbitthrusterServiceAsync.update]. */
        fun update(pathId: String, params: OnorbitthrusterUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OnorbitthrusterUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OnorbitthrusterUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OnorbitthrusterUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitthruster`, but is otherwise the same as [OnorbitthrusterServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitthrusterListPageAsync>> = list(OnorbitthrusterListParams.none())

        /** @see list */
        fun list(params: OnorbitthrusterListParams = OnorbitthrusterListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterListPageAsync>>

        /** @see list */
        fun list(params: OnorbitthrusterListParams = OnorbitthrusterListParams.none()): CompletableFuture<HttpResponseFor<OnorbitthrusterListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterListPageAsync>> =
            list(
              OnorbitthrusterListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitthruster/{id}`, but is otherwise the same as [OnorbitthrusterServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OnorbitthrusterDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OnorbitthrusterDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitthrusterDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OnorbitthrusterDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitthruster/{id}`, but is otherwise the same as [OnorbitthrusterServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>> =
            get(
              id, OnorbitthrusterGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none()): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OnorbitthrusterGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>>

        /** @see get */
        fun get(params: OnorbitthrusterGetParams): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>> =
            get(
              id,
              OnorbitthrusterGetParams.none(),
              requestOptions,
            )
    }
}
