// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.reportandactivities

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.reportandactivities.udlsigact.UdlSigactFileGetParams
import com.unifieddatalibrary.api.models.reportandactivities.udlsigact.UdlSigactUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.reportandactivities.UdlSigactServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UdlSigactServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UdlSigactServiceAsync

    /** Service operation to get a single SigAct text file by its unique ID passed as a path parameter. The text file is returned as an attachment Content-Disposition. */
    fun fileGet(id: String): CompletableFuture<HttpResponse> =
        fileGet(
          id, UdlSigactFileGetParams.none()
        )

    /** @see fileGet */
    fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
        fileGet(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see fileGet */
    fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none()): CompletableFuture<HttpResponse> =
        fileGet(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see fileGet */
    fun fileGet(params: UdlSigactFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

    /** @see fileGet */
    fun fileGet(params: UdlSigactFileGetParams): CompletableFuture<HttpResponse> =
        fileGet(
          params, RequestOptions.none()
        )

    /** @see fileGet */
    fun fileGet(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        fileGet(
          id,
          UdlSigactFileGetParams.none(),
          requestOptions,
        )

    /** Service operation to take a list of SigAct as a POST body and ingest into the database. A SigAct provides data for Report and Activity information. Requires a specific role, please contact the UDL team to gain access. This operation is intended to be used for automated feeds into UDL. */
    fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [UdlSigactServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UdlSigactServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/sigact/getFile/{id}`, but is otherwise the same as [UdlSigactServiceAsync.fileGet]. */
        fun fileGet(id: String): CompletableFuture<HttpResponse> =
            fileGet(
              id, UdlSigactFileGetParams.none()
            )

        /** @see fileGet */
        fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            fileGet(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see fileGet */
        fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none()): CompletableFuture<HttpResponse> =
            fileGet(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see fileGet */
        fun fileGet(params: UdlSigactFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see fileGet */
        fun fileGet(params: UdlSigactFileGetParams): CompletableFuture<HttpResponse> =
            fileGet(
              params, RequestOptions.none()
            )

        /** @see fileGet */
        fun fileGet(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            fileGet(
              id,
              UdlSigactFileGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `post /filedrop/udl-sigact`, but is otherwise the same as [UdlSigactServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
