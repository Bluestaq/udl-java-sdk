// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.scsviews.ScsViewRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScsViewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScsViewServiceAsync

    /** Return a single file to view in browser. */
    fun retrieve(id: String): CompletableFuture<HttpResponse> =
        retrieve(id, ScsViewRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ScsViewRetrieveParams = ScsViewRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ScsViewRetrieveParams = ScsViewRetrieveParams.none(),
    ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ScsViewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see retrieve */
    fun retrieve(params: ScsViewRetrieveParams): CompletableFuture<HttpResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        retrieve(id, ScsViewRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScsViewServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScsViewServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/view/{id}`, but is otherwise the same as
         * [ScsViewServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, ScsViewRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ScsViewRetrieveParams = ScsViewRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ScsViewRetrieveParams = ScsViewRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ScsViewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: ScsViewRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, ScsViewRetrieveParams.none(), requestOptions)
    }
}
