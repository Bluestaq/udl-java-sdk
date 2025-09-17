// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.scs.view.ViewGetParams
import java.util.function.Consumer

interface ViewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewService

    /** Return a single file to view in browser. */
    @MustBeClosed fun get(id: String): HttpResponse = get(id, ViewGetParams.none())

    /** @see get */
    @MustBeClosed
    fun get(
        id: String,
        params: ViewGetParams = ViewGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(id: String, params: ViewGetParams = ViewGetParams.none()): HttpResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: ViewGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed fun get(params: ViewGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(id: String, requestOptions: RequestOptions): HttpResponse =
        get(id, ViewGetParams.none(), requestOptions)

    /** A view of [ViewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/view/{id}`, but is otherwise the same as
         * [ViewService.get].
         */
        @MustBeClosed fun get(id: String): HttpResponse = get(id, ViewGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ViewGetParams = ViewGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ViewGetParams = ViewGetParams.none()): HttpResponse =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ViewGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: ViewGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponse =
            get(id, ViewGetParams.none(), requestOptions)
    }
}
