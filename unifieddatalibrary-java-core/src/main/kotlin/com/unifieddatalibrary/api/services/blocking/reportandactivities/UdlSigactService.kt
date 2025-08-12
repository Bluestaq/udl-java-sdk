// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.reportandactivities

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.reportandactivities.udlsigact.UdlSigactFileGetParams
import com.unifieddatalibrary.api.models.reportandactivities.udlsigact.UdlSigactUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.reportandactivities.UdlSigactService
import java.util.function.Consumer

interface UdlSigactService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UdlSigactService

    /** Service operation to get a single SigAct text file by its unique ID passed as a path parameter. The text file is returned as an attachment Content-Disposition. */
    @MustBeClosed
    fun fileGet(id: String): HttpResponse =
        fileGet(
          id, UdlSigactFileGetParams.none()
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
        fileGet(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none()): HttpResponse =
        fileGet(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(params: UdlSigactFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(params: UdlSigactFileGetParams): HttpResponse =
        fileGet(
          params, RequestOptions.none()
        )

    /** @see fileGet */
    @MustBeClosed
    fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
        fileGet(
          id,
          UdlSigactFileGetParams.none(),
          requestOptions,
        )

    /** Service operation to take a list of SigAct as a POST body and ingest into the database. A SigAct provides data for Report and Activity information. Requires a specific role, please contact the UDL team to gain access. This operation is intended to be used for automated feeds into UDL. */
    fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [UdlSigactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UdlSigactService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/sigact/getFile/{id}`, but is otherwise the same as [UdlSigactService.fileGet]. */
        @MustBeClosed
        fun fileGet(id: String): HttpResponse =
            fileGet(
              id, UdlSigactFileGetParams.none()
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            fileGet(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, params: UdlSigactFileGetParams = UdlSigactFileGetParams.none()): HttpResponse =
            fileGet(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(params: UdlSigactFileGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(params: UdlSigactFileGetParams): HttpResponse =
            fileGet(
              params, RequestOptions.none()
            )

        /** @see fileGet */
        @MustBeClosed
        fun fileGet(id: String, requestOptions: RequestOptions): HttpResponse =
            fileGet(
              id,
              UdlSigactFileGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `post /filedrop/udl-sigact`, but is otherwise the same as [UdlSigactService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: UdlSigactUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
