// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.filemetadata.FileMetadataListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileMetadataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileMetadataServiceAsync

    /** Returns a set of File Metadata that can be used for search endpoint. */
    fun list(): CompletableFuture<List<String>> = list(FileMetadataListParams.none())

    /** @see list */
    fun list(
        params: FileMetadataListParams = FileMetadataListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see list */
    fun list(
        params: FileMetadataListParams = FileMetadataListParams.none()
    ): CompletableFuture<List<String>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(FileMetadataListParams.none(), requestOptions)

    /**
     * A view of [FileMetadataServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileMetadataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/listFileMetadata`, but is otherwise the same as
         * [FileMetadataServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<String>>> =
            list(FileMetadataListParams.none())

        /** @see list */
        fun list(
            params: FileMetadataListParams = FileMetadataListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(
            params: FileMetadataListParams = FileMetadataListParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> =
            list(FileMetadataListParams.none(), requestOptions)
    }
}
