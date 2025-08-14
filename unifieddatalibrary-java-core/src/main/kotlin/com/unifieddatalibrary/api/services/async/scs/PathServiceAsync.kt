// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.paths.PathCreateWithFileParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PathServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PathServiceAsync

    /**
     * Creates the path and uploads file that is passed. If folder exist it will only create folders
     * that are missing. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun createWithFile(
        fileContent: String,
        params: PathCreateWithFileParams,
    ): CompletableFuture<String> = createWithFile(fileContent, params, RequestOptions.none())

    /** @see createWithFile */
    fun createWithFile(
        fileContent: String,
        params: PathCreateWithFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        createWithFile(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see createWithFile */
    fun createWithFile(params: PathCreateWithFileParams): CompletableFuture<String> =
        createWithFile(params, RequestOptions.none())

    /** @see createWithFile */
    fun createWithFile(
        params: PathCreateWithFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** A view of [PathServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PathServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scs/path`, but is otherwise the same as
         * [PathServiceAsync.createWithFile].
         */
        fun createWithFile(
            fileContent: String,
            params: PathCreateWithFileParams,
        ): CompletableFuture<HttpResponseFor<String>> =
            createWithFile(fileContent, params, RequestOptions.none())

        /** @see createWithFile */
        fun createWithFile(
            fileContent: String,
            params: PathCreateWithFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            createWithFile(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see createWithFile */
        fun createWithFile(
            params: PathCreateWithFileParams
        ): CompletableFuture<HttpResponseFor<String>> =
            createWithFile(params, RequestOptions.none())

        /** @see createWithFile */
        fun createWithFile(
            params: PathCreateWithFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>
    }
}
