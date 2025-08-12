// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitSolarArrayFull
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayCreateParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayDeleteParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayGetParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListPageAsync
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitsolararrayServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitsolararrayServiceAsync

    /** Service operation to take a single OnorbitSolarArray as a POST body and ingest into the database. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OnorbitsolararrayCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OnorbitsolararrayCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single OnorbitSolarArray. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OnorbitsolararrayUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OnorbitsolararrayUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<OnorbitsolararrayListPageAsync> = list(OnorbitsolararrayListParams.none())

    /** @see list */
    fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitsolararrayListPageAsync>

    /** @see list */
    fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none()): CompletableFuture<OnorbitsolararrayListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitsolararrayListPageAsync> =
        list(
          OnorbitsolararrayListParams.none(), requestOptions
        )

    /** Service operation to delete a OnorbitSolarArray object specified by the passed ID path parameter. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, OnorbitsolararrayDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OnorbitsolararrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitsolararrayDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          OnorbitsolararrayDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single OnorbitSolarArray record by its unique ID passed as a path parameter. An OnorbitSolarArray is the association between on-orbit spacecraft SolarArrays and a particular on-orbit spacecraft. A SolarArray type may be associated with many different on-orbit spacecraft. */
    fun get(id: String): CompletableFuture<OnorbitSolarArrayFull> =
        get(
          id, OnorbitsolararrayGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitSolarArrayFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none()): CompletableFuture<OnorbitSolarArrayFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OnorbitsolararrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OnorbitSolarArrayFull>

    /** @see get */
    fun get(params: OnorbitsolararrayGetParams): CompletableFuture<OnorbitSolarArrayFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitSolarArrayFull> =
        get(
          id,
          OnorbitsolararrayGetParams.none(),
          requestOptions,
        )

    /** A view of [OnorbitsolararrayServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitsolararrayServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/onorbitsolararray`, but is otherwise the same as [OnorbitsolararrayServiceAsync.create]. */
        fun create(params: OnorbitsolararrayCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OnorbitsolararrayCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/onorbitsolararray/{id}`, but is otherwise the same as [OnorbitsolararrayServiceAsync.update]. */
        fun update(pathId: String, params: OnorbitsolararrayUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: OnorbitsolararrayUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/onorbitsolararray`, but is otherwise the same as [OnorbitsolararrayServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitsolararrayListPageAsync>> = list(OnorbitsolararrayListParams.none())

        /** @see list */
        fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitsolararrayListPageAsync>>

        /** @see list */
        fun list(params: OnorbitsolararrayListParams = OnorbitsolararrayListParams.none()): CompletableFuture<HttpResponseFor<OnorbitsolararrayListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitsolararrayListPageAsync>> =
            list(
              OnorbitsolararrayListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/onorbitsolararray/{id}`, but is otherwise the same as [OnorbitsolararrayServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, OnorbitsolararrayDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: OnorbitsolararrayDeleteParams = OnorbitsolararrayDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: OnorbitsolararrayDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitsolararrayDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              OnorbitsolararrayDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/onorbitsolararray/{id}`, but is otherwise the same as [OnorbitsolararrayServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>> =
            get(
              id, OnorbitsolararrayGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: OnorbitsolararrayGetParams = OnorbitsolararrayGetParams.none()): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: OnorbitsolararrayGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>>

        /** @see get */
        fun get(params: OnorbitsolararrayGetParams): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>> =
            get(
              id,
              OnorbitsolararrayGetParams.none(),
              requestOptions,
            )
    }
}
