// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitAntennaFull
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaCreateParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaDeleteParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaGetParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListPageAsync
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitantennaServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitantennaServiceAsync

    /** Service operation to take a single OnorbitAntenna as a POST body and ingest into the database. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a particular on-orbit spacecraft. An antenna type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitantennaCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitantennaCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single OnorbitAntenna. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a particular on-orbit spacecraft. An antenna type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitantennaUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitantennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitantennaUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitantennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OnorbitantennaListPageAsync> = list(OnorbitantennaListParams.none())

    /** @see list */
    fun list(params: OnorbitantennaListParams = OnorbitantennaListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitantennaListPageAsync>

    /** @see list */
    fun list(params: OnorbitantennaListParams = OnorbitantennaListParams.none()): CompletableFuture<OnorbitantennaListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitantennaListPageAsync> =
        list(
          OnorbitantennaListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitAntenna object specified by the passed ID path parameter. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a particular on-orbit spacecraft. An antenna type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OnorbitantennaDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitantennaDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitantennaDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OnorbitantennaDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitAntenna record by its unique ID passed as a path parameter. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a particular on-orbit spacecraft. An antenna type may be associated with many different on-orbit spacecraft. */
    fun get(id: String): CompletableFuture<OnorbitAntennaFull> =
        get(
          id, OnorbitantennaGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitantennaGetParams = OnorbitantennaGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitAntennaFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitantennaGetParams = OnorbitantennaGetParams.none()): CompletableFuture<OnorbitAntennaFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitantennaGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitAntennaFull>

    /** @see get */
    fun get(params: OnorbitantennaGetParams): CompletableFuture<OnorbitAntennaFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitAntennaFull> =
        get(
          id,
          OnorbitantennaGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitantennaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitantennaServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitantenna`, but is otherwise the same as [OnorbitantennaServiceAsync.create]. */
        fun create(params: OnorbitantennaCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OnorbitantennaCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/onorbitantenna/{id}`, but is otherwise the same as [OnorbitantennaServiceAsync.update]. */
        fun update(pathId: String, params: OnorbitantennaUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OnorbitantennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OnorbitantennaUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OnorbitantennaUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitantenna`, but is otherwise the same as [OnorbitantennaServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitantennaListPageAsync>> = list(OnorbitantennaListParams.none())

        /** @see list */
        fun list(params: OnorbitantennaListParams = OnorbitantennaListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitantennaListPageAsync>>

        /** @see list */
        fun list(params: OnorbitantennaListParams = OnorbitantennaListParams.none()): CompletableFuture<HttpResponseFor<OnorbitantennaListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitantennaListPageAsync>> =
            list(
              OnorbitantennaListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitantenna/{id}`, but is otherwise the same as [OnorbitantennaServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OnorbitantennaDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OnorbitantennaDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitantennaDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OnorbitantennaDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitantenna/{id}`, but is otherwise the same as [OnorbitantennaServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitAntennaFull>> =
            get(
              id, OnorbitantennaGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OnorbitantennaGetParams = OnorbitantennaGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitAntennaFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OnorbitantennaGetParams = OnorbitantennaGetParams.none()): CompletableFuture<HttpResponseFor<OnorbitAntennaFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OnorbitantennaGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitAntennaFull>>

        /** @see get */
        fun get(params: OnorbitantennaGetParams): CompletableFuture<HttpResponseFor<OnorbitAntennaFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitAntennaFull>> =
            get(
              id,
              OnorbitantennaGetParams.none(),
              requestOptions,
            )
    }
}
