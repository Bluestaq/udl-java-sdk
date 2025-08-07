// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.file.FileListPage
import com.unifieddatalibrary.api.models.scs.file.FileListParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import com.unifieddatalibrary.api.models.scs.file.FileUpdateParams
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /**
     * Returns a FileData object representing the file with the given ID that is visible to the
     * calling user.
     */
    fun retrieve(params: FileRetrieveParams): FileData = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileData

    /**
     * operation to update files metadata. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update() = update(FileUpdateParams.none())

    /** @see update */
    fun update(
        params: FileUpdateParams = FileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    fun update(params: FileUpdateParams = FileUpdateParams.none()) =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions) = update(FileUpdateParams.none(), requestOptions)

    /**
     * Returns a non-recursive list of FileData objects representing the files and subdirectories in
     * the passed-in path directory that are visible to the calling user.
     */
    fun list(params: FileListParams): FileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/file`, but is otherwise the same as
         * [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: FileRetrieveParams): HttpResponseFor<FileData> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileData>

        /**
         * Returns a raw HTTP response for `patch /scs/file`, but is otherwise the same as
         * [FileService.update].
         */
        @MustBeClosed fun update(): HttpResponse = update(FileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FileUpdateParams = FileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: FileUpdateParams = FileUpdateParams.none()): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponse =
            update(FileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scs/list`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed
        fun list(params: FileListParams): HttpResponseFor<FileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage>
    }
}
