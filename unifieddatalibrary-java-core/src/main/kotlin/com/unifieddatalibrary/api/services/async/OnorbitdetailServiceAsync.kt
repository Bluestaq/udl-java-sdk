// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitDetailsFull
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailCreateParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailDeleteParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailGetParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListPageAsync
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitdetailServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitdetailServiceAsync

    /** Service operation to take a single OnorbitDetails as a POST body and ingest into the database. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitdetailCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitdetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single OnorbitDetails. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitdetailUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitdetailUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OnorbitdetailListPageAsync> = list(OnorbitdetailListParams.none())

    /** @see list */
    fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitdetailListPageAsync>

    /** @see list */
    fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none()): CompletableFuture<OnorbitdetailListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitdetailListPageAsync> =
        list(
          OnorbitdetailListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitDetails object specified by the passed ID path parameter. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OnorbitdetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitdetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitdetailDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OnorbitdetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitDetails record by its unique ID passed as a path parameter. An OnorbitDetails is a collection of additional characteristics on an on-orbit object. */
    fun get(id: String): CompletableFuture<OnorbitDetailsFull> =
        get(
          id, OnorbitdetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitDetailsFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none()): CompletableFuture<OnorbitDetailsFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitdetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitDetailsFull>

    /** @see get */
    fun get(params: OnorbitdetailGetParams): CompletableFuture<OnorbitDetailsFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitDetailsFull> =
        get(
          id,
          OnorbitdetailGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitdetailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitdetailServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitdetails`, but is otherwise the same as [OnorbitdetailServiceAsync.create]. */
        fun create(params: OnorbitdetailCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OnorbitdetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/onorbitdetails/{id}`, but is otherwise the same as [OnorbitdetailServiceAsync.update]. */
        fun update(pathId: String, params: OnorbitdetailUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OnorbitdetailUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OnorbitdetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitdetails`, but is otherwise the same as [OnorbitdetailServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitdetailListPageAsync>> = list(OnorbitdetailListParams.none())

        /** @see list */
        fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitdetailListPageAsync>>

        /** @see list */
        fun list(params: OnorbitdetailListParams = OnorbitdetailListParams.none()): CompletableFuture<HttpResponseFor<OnorbitdetailListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitdetailListPageAsync>> =
            list(
              OnorbitdetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitdetails/{id}`, but is otherwise the same as [OnorbitdetailServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OnorbitdetailDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitdetailDeleteParams = OnorbitdetailDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OnorbitdetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitdetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OnorbitdetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitdetails/{id}`, but is otherwise the same as [OnorbitdetailServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitDetailsFull>> =
            get(
              id, OnorbitdetailGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitDetailsFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OnorbitdetailGetParams = OnorbitdetailGetParams.none()): CompletableFuture<HttpResponseFor<OnorbitDetailsFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OnorbitdetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitDetailsFull>>

        /** @see get */
        fun get(params: OnorbitdetailGetParams): CompletableFuture<HttpResponseFor<OnorbitDetailsFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitDetailsFull>> =
            get(
              id,
              OnorbitdetailGetParams.none(),
              requestOptions,
            )
    }
}
