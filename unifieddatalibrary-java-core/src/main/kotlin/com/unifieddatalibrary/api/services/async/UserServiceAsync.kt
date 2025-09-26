// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.user.UserAuthParams
import com.unifieddatalibrary.api.models.user.UserAuthResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** Retrieve authentication details for the current user */
    fun auth(): CompletableFuture<UserAuthResponse> = auth(UserAuthParams.none())

    /** @see auth */
    fun auth(
        params: UserAuthParams = UserAuthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAuthResponse>

    /** @see auth */
    fun auth(params: UserAuthParams = UserAuthParams.none()): CompletableFuture<UserAuthResponse> =
        auth(params, RequestOptions.none())

    /** @see auth */
    fun auth(requestOptions: RequestOptions): CompletableFuture<UserAuthResponse> =
        auth(UserAuthParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /basicAuth`, but is otherwise the same as
         * [UserServiceAsync.auth].
         */
        fun auth(): CompletableFuture<HttpResponseFor<UserAuthResponse>> =
            auth(UserAuthParams.none())

        /** @see auth */
        fun auth(
            params: UserAuthParams = UserAuthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAuthResponse>>

        /** @see auth */
        fun auth(
            params: UserAuthParams = UserAuthParams.none()
        ): CompletableFuture<HttpResponseFor<UserAuthResponse>> =
            auth(params, RequestOptions.none())

        /** @see auth */
        fun auth(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserAuthResponse>> =
            auth(UserAuthParams.none(), requestOptions)
    }
}
