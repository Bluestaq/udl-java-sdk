// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.paths.PathCreateWithFileParams
import com.unifieddatalibrary.api.services.blocking.scs.PathService
import java.util.function.Consumer

interface PathService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PathService

    /** Creates the path and uploads file that is passed. If folder exist it will only create folders that are missing. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun createWithFile(fileContent: String, params: PathCreateWithFileParams): String =
        createWithFile(
          fileContent,
          params,
          RequestOptions.none(),
        )

    /** @see createWithFile */
    fun createWithFile(fileContent: String, params: PathCreateWithFileParams, requestOptions: RequestOptions = RequestOptions.none()): String =
        createWithFile(
          params.toBuilder()
              .fileContent(fileContent)
              .build(), requestOptions
        )

    /** @see createWithFile */
    fun createWithFile(params: PathCreateWithFileParams): String =
        createWithFile(
          params, RequestOptions.none()
        )

    /** @see createWithFile */
    fun createWithFile(params: PathCreateWithFileParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** A view of [PathService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PathService.WithRawResponse

        /** Returns a raw HTTP response for `post /scs/path`, but is otherwise the same as [PathService.createWithFile]. */
        @MustBeClosed
        fun createWithFile(fileContent: String, params: PathCreateWithFileParams): HttpResponseFor<String> =
            createWithFile(
              fileContent,
              params,
              RequestOptions.none(),
            )

        /** @see createWithFile */
        @MustBeClosed
        fun createWithFile(fileContent: String, params: PathCreateWithFileParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String> =
            createWithFile(
              params.toBuilder()
                  .fileContent(fileContent)
                  .build(), requestOptions
            )

        /** @see createWithFile */
        @MustBeClosed
        fun createWithFile(params: PathCreateWithFileParams): HttpResponseFor<String> =
            createWithFile(
              params, RequestOptions.none()
            )

        /** @see createWithFile */
        @MustBeClosed
        fun createWithFile(params: PathCreateWithFileParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>
    }
}
