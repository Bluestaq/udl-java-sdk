// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.scsviews.ScsViewRetrieveParams
import com.unifieddatalibrary.api.services.blocking.ScsViewService
import java.util.function.Consumer

interface ScsViewService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScsViewService

    /** Return a single file to view in browser. */
    @MustBeClosed
    fun retrieve(id: String): HttpResponse =
        retrieve(
          id, ScsViewRetrieveParams.none()
        )

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(id: String, params: ScsViewRetrieveParams = ScsViewRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(id: String, params: ScsViewRetrieveParams = ScsViewRetrieveParams.none()): HttpResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(params: ScsViewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(params: ScsViewRetrieveParams): HttpResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
        retrieve(
          id,
          ScsViewRetrieveParams.none(),
          requestOptions,
        )

    /** A view of [ScsViewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScsViewService.WithRawResponse

        /** Returns a raw HTTP response for `get /scs/view/{id}`, but is otherwise the same as [ScsViewService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse =
            retrieve(
              id, ScsViewRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: ScsViewRetrieveParams = ScsViewRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: ScsViewRetrieveParams = ScsViewRetrieveParams.none()): HttpResponse =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ScsViewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ScsViewRetrieveParams): HttpResponse =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(
              id,
              ScsViewRetrieveParams.none(),
              requestOptions,
            )
    }
}
