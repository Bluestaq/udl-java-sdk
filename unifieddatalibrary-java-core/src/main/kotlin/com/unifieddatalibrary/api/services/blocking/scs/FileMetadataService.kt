// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.filemetadata.FileMetadataListParams
import com.unifieddatalibrary.api.services.blocking.scs.FileMetadataService
import java.util.function.Consumer

interface FileMetadataService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileMetadataService

    /** Returns a set of File Metadata that can be used for search endpoint. */
    fun list(): List<String> = list(FileMetadataListParams.none())

    /** @see list */
    fun list(params: FileMetadataListParams = FileMetadataListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<String>

    /** @see list */
    fun list(params: FileMetadataListParams = FileMetadataListParams.none()): List<String> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): List<String> =
        list(
          FileMetadataListParams.none(), requestOptions
        )

    /** A view of [FileMetadataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileMetadataService.WithRawResponse

        /** Returns a raw HTTP response for `get /scs/listFileMetadata`, but is otherwise the same as [FileMetadataService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<List<String>> = list(FileMetadataListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: FileMetadataListParams = FileMetadataListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<String>>

        /** @see list */
        @MustBeClosed
        fun list(params: FileMetadataListParams = FileMetadataListParams.none()): HttpResponseFor<List<String>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            list(
              FileMetadataListParams.none(), requestOptions
            )
    }
}
