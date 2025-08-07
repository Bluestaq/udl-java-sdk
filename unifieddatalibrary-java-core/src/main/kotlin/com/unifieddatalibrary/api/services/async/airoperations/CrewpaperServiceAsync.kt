// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUnpublishParams
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUploadPdfParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CrewpaperServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewpaperServiceAsync

    /**
     * Service operation to remove supporting PDF from an aircraft sortie or sorties. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unpublish(params: CrewpaperUnpublishParams): CompletableFuture<Void?> =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: CrewpaperUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to upload a supporting PDF for the aircraft sortie. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadPdf(fileContent: String, params: CrewpaperUploadPdfParams): CompletableFuture<Void?> =
        uploadPdf(fileContent, params, RequestOptions.none())

    /** @see uploadPdf */
    fun uploadPdf(
        fileContent: String,
        params: CrewpaperUploadPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        uploadPdf(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see uploadPdf */
    fun uploadPdf(params: CrewpaperUploadPdfParams): CompletableFuture<Void?> =
        uploadPdf(params, RequestOptions.none())

    /** @see uploadPdf */
    fun uploadPdf(
        params: CrewpaperUploadPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CrewpaperServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrewpaperServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/crewpapers/unpublish`, but is otherwise the
         * same as [CrewpaperServiceAsync.unpublish].
         */
        fun unpublish(params: CrewpaperUnpublishParams): CompletableFuture<HttpResponse> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            params: CrewpaperUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /filedrop/crewpapers`, but is otherwise the same as
         * [CrewpaperServiceAsync.uploadPdf].
         */
        fun uploadPdf(
            fileContent: String,
            params: CrewpaperUploadPdfParams,
        ): CompletableFuture<HttpResponse> = uploadPdf(fileContent, params, RequestOptions.none())

        /** @see uploadPdf */
        fun uploadPdf(
            fileContent: String,
            params: CrewpaperUploadPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            uploadPdf(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see uploadPdf */
        fun uploadPdf(params: CrewpaperUploadPdfParams): CompletableFuture<HttpResponse> =
            uploadPdf(params, RequestOptions.none())

        /** @see uploadPdf */
        fun uploadPdf(
            params: CrewpaperUploadPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
