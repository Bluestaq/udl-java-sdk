// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUnpublishParams
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUploadPdfParams
import com.unifieddatalibrary.api.services.blocking.airoperations.CrewpaperService
import java.util.function.Consumer

interface CrewpaperService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewpaperService

    /** Service operation to remove supporting PDF from an aircraft sortie or sorties. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unpublish(params: CrewpaperUnpublishParams) =
        unpublish(
          params, RequestOptions.none()
        )

    /** @see unpublish */
    fun unpublish(params: CrewpaperUnpublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to upload a supporting PDF for the aircraft sortie. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun uploadPdf(fileContent: String, params: CrewpaperUploadPdfParams) =
        uploadPdf(
          fileContent,
          params,
          RequestOptions.none(),
        )

    /** @see uploadPdf */
    fun uploadPdf(fileContent: String, params: CrewpaperUploadPdfParams, requestOptions: RequestOptions = RequestOptions.none()) =
        uploadPdf(
          params.toBuilder()
              .fileContent(fileContent)
              .build(), requestOptions
        )

    /** @see uploadPdf */
    fun uploadPdf(params: CrewpaperUploadPdfParams) =
        uploadPdf(
          params, RequestOptions.none()
        )

    /** @see uploadPdf */
    fun uploadPdf(params: CrewpaperUploadPdfParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [CrewpaperService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewpaperService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/crewpapers/unpublish`, but is otherwise the same as [CrewpaperService.unpublish]. */
        @MustBeClosed
        fun unpublish(params: CrewpaperUnpublishParams): HttpResponse =
            unpublish(
              params, RequestOptions.none()
            )

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(params: CrewpaperUnpublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `post /filedrop/crewpapers`, but is otherwise the same as [CrewpaperService.uploadPdf]. */
        @MustBeClosed
        fun uploadPdf(fileContent: String, params: CrewpaperUploadPdfParams): HttpResponse =
            uploadPdf(
              fileContent,
              params,
              RequestOptions.none(),
            )

        /** @see uploadPdf */
        @MustBeClosed
        fun uploadPdf(fileContent: String, params: CrewpaperUploadPdfParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            uploadPdf(
              params.toBuilder()
                  .fileContent(fileContent)
                  .build(), requestOptions
            )

        /** @see uploadPdf */
        @MustBeClosed
        fun uploadPdf(params: CrewpaperUploadPdfParams): HttpResponse =
            uploadPdf(
              params, RequestOptions.none()
            )

        /** @see uploadPdf */
        @MustBeClosed
        fun uploadPdf(params: CrewpaperUploadPdfParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
