// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.ScAllowableFileExtensionsParams
import com.unifieddatalibrary.api.models.scs.ScAllowableFileMimesParams
import com.unifieddatalibrary.api.models.scs.ScCopyParams
import com.unifieddatalibrary.api.models.scs.ScDeleteParams
import com.unifieddatalibrary.api.models.scs.ScDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileUploadParams
import com.unifieddatalibrary.api.models.scs.ScMoveParams
import com.unifieddatalibrary.api.models.scs.ScRenameParams
import com.unifieddatalibrary.api.models.scs.ScSearchParams
import com.unifieddatalibrary.api.services.blocking.scs.FileService
import com.unifieddatalibrary.api.services.blocking.scs.FolderService
import com.unifieddatalibrary.api.services.blocking.scs.NotificationService
import com.unifieddatalibrary.api.services.blocking.scs.PathService
import com.unifieddatalibrary.api.services.blocking.scs.V2Service
import com.unifieddatalibrary.api.services.blocking.scs.ViewService
import java.util.function.Consumer

interface ScService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScService

    fun notifications(): NotificationService

    fun file(): FileService

    fun folders(): FolderService

    fun paths(): PathService

    fun view(): ViewService

    fun v2(): V2Service

    /**
     * Deletes the requested file or folder in the passed path directory that is visible to the
     * calling user. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun delete(params: ScDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: ScDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Returns a list of the allowed filename extensions. */
    fun allowableFileExtensions(): List<String> =
        allowableFileExtensions(ScAllowableFileExtensionsParams.none())

    /** @see allowableFileExtensions */
    fun allowableFileExtensions(
        params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see allowableFileExtensions */
    fun allowableFileExtensions(
        params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none()
    ): List<String> = allowableFileExtensions(params, RequestOptions.none())

    /** @see allowableFileExtensions */
    fun allowableFileExtensions(requestOptions: RequestOptions): List<String> =
        allowableFileExtensions(ScAllowableFileExtensionsParams.none(), requestOptions)

    /** Returns a list of the allowed file upload mime types. */
    fun allowableFileMimes(): List<String> = allowableFileMimes(ScAllowableFileMimesParams.none())

    /** @see allowableFileMimes */
    fun allowableFileMimes(
        params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see allowableFileMimes */
    fun allowableFileMimes(
        params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none()
    ): List<String> = allowableFileMimes(params, RequestOptions.none())

    /** @see allowableFileMimes */
    fun allowableFileMimes(requestOptions: RequestOptions): List<String> =
        allowableFileMimes(ScAllowableFileMimesParams.none(), requestOptions)

    /**
     * operation to copy folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun copy(params: ScCopyParams): String = copy(params, RequestOptions.none())

    /** @see copy */
    @Deprecated("deprecated")
    fun copy(params: ScCopyParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Downloads a zip of one or more files and/or folders. */
    @MustBeClosed
    fun download(params: ScDownloadParams): HttpResponse = download(params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        params: ScDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** Download a single file from SCS. */
    @MustBeClosed
    fun fileDownload(params: ScFileDownloadParams): HttpResponse =
        fileDownload(params, RequestOptions.none())

    /** @see fileDownload */
    @MustBeClosed
    fun fileDownload(
        params: ScFileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Operation to upload a file. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun fileUpload(fileContent: String, params: ScFileUploadParams): String =
        fileUpload(fileContent, params, RequestOptions.none())

    /** @see fileUpload */
    @Deprecated("deprecated")
    fun fileUpload(
        fileContent: String,
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see fileUpload */
    @Deprecated("deprecated")
    fun fileUpload(params: ScFileUploadParams): String = fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    @Deprecated("deprecated")
    fun fileUpload(
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * operation to move folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun move(params: ScMoveParams): String = move(params, RequestOptions.none())

    /** @see move */
    @Deprecated("deprecated")
    fun move(params: ScMoveParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /**
     * Operation to rename folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun rename(params: ScRenameParams) = rename(params, RequestOptions.none())

    /** @see rename */
    @Deprecated("deprecated")
    fun rename(params: ScRenameParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Search for files by metadata and/or text in file content. */
    @Deprecated("deprecated")
    fun search(params: ScSearchParams): List<FileData> = search(params, RequestOptions.none())

    /** @see search */
    @Deprecated("deprecated")
    fun search(
        params: ScSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FileData>

    /** A view of [ScService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScService.WithRawResponse

        fun notifications(): NotificationService.WithRawResponse

        fun file(): FileService.WithRawResponse

        fun folders(): FolderService.WithRawResponse

        fun paths(): PathService.WithRawResponse

        fun view(): ViewService.WithRawResponse

        fun v2(): V2Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /scs/delete`, but is otherwise the same as
         * [ScService.delete].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(params: ScDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            params: ScDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /scs/allowableFileExtensions`, but is otherwise the
         * same as [ScService.allowableFileExtensions].
         */
        @MustBeClosed
        fun allowableFileExtensions(): HttpResponseFor<List<String>> =
            allowableFileExtensions(ScAllowableFileExtensionsParams.none())

        /** @see allowableFileExtensions */
        @MustBeClosed
        fun allowableFileExtensions(
            params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see allowableFileExtensions */
        @MustBeClosed
        fun allowableFileExtensions(
            params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none()
        ): HttpResponseFor<List<String>> = allowableFileExtensions(params, RequestOptions.none())

        /** @see allowableFileExtensions */
        @MustBeClosed
        fun allowableFileExtensions(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            allowableFileExtensions(ScAllowableFileExtensionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scs/allowableFileMimes`, but is otherwise the same
         * as [ScService.allowableFileMimes].
         */
        @MustBeClosed
        fun allowableFileMimes(): HttpResponseFor<List<String>> =
            allowableFileMimes(ScAllowableFileMimesParams.none())

        /** @see allowableFileMimes */
        @MustBeClosed
        fun allowableFileMimes(
            params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see allowableFileMimes */
        @MustBeClosed
        fun allowableFileMimes(
            params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none()
        ): HttpResponseFor<List<String>> = allowableFileMimes(params, RequestOptions.none())

        /** @see allowableFileMimes */
        @MustBeClosed
        fun allowableFileMimes(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            allowableFileMimes(ScAllowableFileMimesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scs/copy`, but is otherwise the same as
         * [ScService.copy].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun copy(params: ScCopyParams): HttpResponseFor<String> =
            copy(params, RequestOptions.none())

        /** @see copy */
        @Deprecated("deprecated")
        @MustBeClosed
        fun copy(
            params: ScCopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /scs/download`, but is otherwise the same as
         * [ScService.download].
         */
        @MustBeClosed
        fun download(params: ScDownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: ScDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /scs/download`, but is otherwise the same as
         * [ScService.fileDownload].
         */
        @MustBeClosed
        fun fileDownload(params: ScFileDownloadParams): HttpResponse =
            fileDownload(params, RequestOptions.none())

        /** @see fileDownload */
        @MustBeClosed
        fun fileDownload(
            params: ScFileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/file`, but is otherwise the same as
         * [ScService.fileUpload].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun fileUpload(fileContent: String, params: ScFileUploadParams): HttpResponseFor<String> =
            fileUpload(fileContent, params, RequestOptions.none())

        /** @see fileUpload */
        @Deprecated("deprecated")
        @MustBeClosed
        fun fileUpload(
            fileContent: String,
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see fileUpload */
        @Deprecated("deprecated")
        @MustBeClosed
        fun fileUpload(params: ScFileUploadParams): HttpResponseFor<String> =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        @Deprecated("deprecated")
        @MustBeClosed
        fun fileUpload(
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `put /scs/move`, but is otherwise the same as
         * [ScService.move].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun move(params: ScMoveParams): HttpResponseFor<String> =
            move(params, RequestOptions.none())

        /** @see move */
        @Deprecated("deprecated")
        @MustBeClosed
        fun move(
            params: ScMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `put /scs/rename`, but is otherwise the same as
         * [ScService.rename].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun rename(params: ScRenameParams): HttpResponse = rename(params, RequestOptions.none())

        /** @see rename */
        @Deprecated("deprecated")
        @MustBeClosed
        fun rename(
            params: ScRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/search`, but is otherwise the same as
         * [ScService.search].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun search(params: ScSearchParams): HttpResponseFor<List<FileData>> =
            search(params, RequestOptions.none())

        /** @see search */
        @Deprecated("deprecated")
        @MustBeClosed
        fun search(
            params: ScSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FileData>>
    }
}
