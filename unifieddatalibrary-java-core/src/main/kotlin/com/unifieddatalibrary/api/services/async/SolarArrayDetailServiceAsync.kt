// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SolarArrayDetailsFull
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailCreateParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailDeleteParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailGetParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListPageAsync
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailUpdateParams
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SolarArrayDetailServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayDetailServiceAsync

    /** Service operation to take a single SolarArrayDetails as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A SolarArray may have multiple details records compiled by various sources. */
    fun create(params: SolarArrayDetailCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SolarArrayDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single SolarArrayDetails. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A SolarArray may have multiple details records compiled by various sources. */
    fun update(pathId: String, params: SolarArrayDetailUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SolarArrayDetailUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SolarArrayDetailListPageAsync> = list(SolarArrayDetailListParams.none())

    /** @see list */
    fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayDetailListPageAsync>

    /** @see list */
    fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none()): CompletableFuture<SolarArrayDetailListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SolarArrayDetailListPageAsync> =
        list(
          SolarArrayDetailListParams.none(), requestOptions
        )

    /** Service operation to delete a SolarArrayDetails object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A SolarArray may have multiple details records compiled by various sources. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SolarArrayDetailDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SolarArrayDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SolarArrayDetailDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SolarArrayDetailDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to get a single SolarArrayDetails record by its unique ID passed as a path parameter. A SolarArray may have multiple details records compiled by various sources. */
    fun get(id: String): CompletableFuture<SolarArrayDetailsFull> =
        get(
          id, SolarArrayDetailGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayDetailsFull> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none()): CompletableFuture<SolarArrayDetailsFull> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SolarArrayDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SolarArrayDetailsFull>

    /** @see get */
    fun get(params: SolarArrayDetailGetParams): CompletableFuture<SolarArrayDetailsFull> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SolarArrayDetailsFull> =
        get(
          id,
          SolarArrayDetailGetParams.none(),
          requestOptions,
        )

    /** A view of [SolarArrayDetailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayDetailServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/solararraydetails`, but is otherwise the same as [SolarArrayDetailServiceAsync.create]. */
        fun create(params: SolarArrayDetailCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SolarArrayDetailCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/solararraydetails/{id}`, but is otherwise the same as [SolarArrayDetailServiceAsync.update]. */
        fun update(pathId: String, params: SolarArrayDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SolarArrayDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/solararraydetails`, but is otherwise the same as [SolarArrayDetailServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SolarArrayDetailListPageAsync>> = list(SolarArrayDetailListParams.none())

        /** @see list */
        fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayDetailListPageAsync>>

        /** @see list */
        fun list(params: SolarArrayDetailListParams = SolarArrayDetailListParams.none()): CompletableFuture<HttpResponseFor<SolarArrayDetailListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayDetailListPageAsync>> =
            list(
              SolarArrayDetailListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/solararraydetails/{id}`, but is otherwise the same as [SolarArrayDetailServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SolarArrayDetailDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SolarArrayDetailDeleteParams = SolarArrayDetailDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SolarArrayDetailDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SolarArrayDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SolarArrayDetailDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/solararraydetails/{id}`, but is otherwise the same as [SolarArrayDetailServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>> =
            get(
              id, SolarArrayDetailGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SolarArrayDetailGetParams = SolarArrayDetailGetParams.none()): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SolarArrayDetailGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>>

        /** @see get */
        fun get(params: SolarArrayDetailGetParams): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>> =
            get(
              id,
              SolarArrayDetailGetParams.none(),
              requestOptions,
            )
    }
}
