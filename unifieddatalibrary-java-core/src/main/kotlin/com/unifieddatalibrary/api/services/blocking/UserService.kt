// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.user.UserAuthParams
import com.unifieddatalibrary.api.models.user.UserAuthResponse
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /** Retrieve authentication details for the current user */
    fun auth(): UserAuthResponse = auth(UserAuthParams.none())

    /** @see auth */
    fun auth(
        params: UserAuthParams = UserAuthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAuthResponse

    /** @see auth */
    fun auth(params: UserAuthParams = UserAuthParams.none()): UserAuthResponse =
        auth(params, RequestOptions.none())

    /** @see auth */
    fun auth(requestOptions: RequestOptions): UserAuthResponse =
        auth(UserAuthParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /basicAuth`, but is otherwise the same as
         * [UserService.auth].
         */
        @MustBeClosed fun auth(): HttpResponseFor<UserAuthResponse> = auth(UserAuthParams.none())

        /** @see auth */
        @MustBeClosed
        fun auth(
            params: UserAuthParams = UserAuthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAuthResponse>

        /** @see auth */
        @MustBeClosed
        fun auth(
            params: UserAuthParams = UserAuthParams.none()
        ): HttpResponseFor<UserAuthResponse> = auth(params, RequestOptions.none())

        /** @see auth */
        @MustBeClosed
        fun auth(requestOptions: RequestOptions): HttpResponseFor<UserAuthResponse> =
            auth(UserAuthParams.none(), requestOptions)
    }
}
