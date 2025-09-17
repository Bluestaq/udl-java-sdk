// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.scs.view.ViewGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ViewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewServiceAsync

    /** Return a single file to view in browser. */
    fun get(id: String): CompletableFuture<HttpResponse> = get(id, ViewGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ViewGetParams = ViewGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ViewGetParams = ViewGetParams.none(),
    ): CompletableFuture<HttpResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ViewGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(params: ViewGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        get(id, ViewGetParams.none(), requestOptions)

    /** A view of [ViewServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/view/{id}`, but is otherwise the same as
         * [ViewServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponse> = get(id, ViewGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: ViewGetParams = ViewGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: ViewGetParams = ViewGetParams.none(),
        ): CompletableFuture<HttpResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ViewGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: ViewGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(id, ViewGetParams.none(), requestOptions)
    }
}
