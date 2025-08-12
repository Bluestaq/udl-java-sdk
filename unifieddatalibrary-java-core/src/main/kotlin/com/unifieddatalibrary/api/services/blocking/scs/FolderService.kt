// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.folders.FolderCreateParams
import com.unifieddatalibrary.api.models.scs.folders.FolderRetrieveParams
import com.unifieddatalibrary.api.models.scs.folders.FolderUpdateParams
import com.unifieddatalibrary.api.services.blocking.scs.FolderService
import java.util.function.Consumer

interface FolderService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService

    /** Creates a new folder that is passed as part of the path. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: FolderCreateParams): String =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: FolderCreateParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Returns a FileData object representing the folder ID that is visible to the calling user. */
    fun retrieve(params: FolderRetrieveParams): FileData =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(params: FolderRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): FileData

    /** operation to update folders metadata. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(params: FolderUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: FolderUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [FolderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService.WithRawResponse

        /** Returns a raw HTTP response for `post /scs/folder`, but is otherwise the same as [FolderService.create]. */
        @MustBeClosed
        fun create(params: FolderCreateParams): HttpResponseFor<String> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: FolderCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /scs/folder`, but is otherwise the same as [FolderService.retrieve]. */
        @MustBeClosed
        fun retrieve(params: FolderRetrieveParams): HttpResponseFor<FileData> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FolderRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FileData>

        /** Returns a raw HTTP response for `patch /scs/folder`, but is otherwise the same as [FolderService.update]. */
        @MustBeClosed
        fun update(params: FolderUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: FolderUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
