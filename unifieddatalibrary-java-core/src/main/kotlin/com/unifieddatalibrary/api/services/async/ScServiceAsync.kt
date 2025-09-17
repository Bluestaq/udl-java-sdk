// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.services.async.scs.FileServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FolderServiceAsync
import com.unifieddatalibrary.api.services.async.scs.NotificationServiceAsync
import com.unifieddatalibrary.api.services.async.scs.PathServiceAsync
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsync
import com.unifieddatalibrary.api.services.async.scs.ViewServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScServiceAsync

    fun notifications(): NotificationServiceAsync

    fun file(): FileServiceAsync

    fun folders(): FolderServiceAsync

    fun paths(): PathServiceAsync

    fun view(): ViewServiceAsync

    fun v2(): V2ServiceAsync

    /**
     * Deletes the requested file or folder in the passed path directory that is visible to the
     * calling user. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun delete(params: ScDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: ScDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns a list of the allowed filename extensions. */
    fun allowableFileExtensions(): CompletableFuture<List<String>> =
        allowableFileExtensions(ScAllowableFileExtensionsParams.none())

    /** @see allowableFileExtensions */
    fun allowableFileExtensions(
        params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see allowableFileExtensions */
    fun allowableFileExtensions(
        params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none()
    ): CompletableFuture<List<String>> = allowableFileExtensions(params, RequestOptions.none())

    /** @see allowableFileExtensions */
    fun allowableFileExtensions(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        allowableFileExtensions(ScAllowableFileExtensionsParams.none(), requestOptions)

    /** Returns a list of the allowed file upload mime types. */
    fun allowableFileMimes(): CompletableFuture<List<String>> =
        allowableFileMimes(ScAllowableFileMimesParams.none())

    /** @see allowableFileMimes */
    fun allowableFileMimes(
        params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see allowableFileMimes */
    fun allowableFileMimes(
        params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none()
    ): CompletableFuture<List<String>> = allowableFileMimes(params, RequestOptions.none())

    /** @see allowableFileMimes */
    fun allowableFileMimes(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        allowableFileMimes(ScAllowableFileMimesParams.none(), requestOptions)

    /**
     * operation to copy folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun copy(params: ScCopyParams): CompletableFuture<String> = copy(params, RequestOptions.none())

    /** @see copy */
    @Deprecated("deprecated")
    fun copy(
        params: ScCopyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** Downloads a zip of one or more files and/or folders. */
    fun download(params: ScDownloadParams): CompletableFuture<HttpResponse> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: ScDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** Download a single file from SCS. */
    fun fileDownload(params: ScFileDownloadParams): CompletableFuture<HttpResponse> =
        fileDownload(params, RequestOptions.none())

    /** @see fileDownload */
    fun fileDownload(
        params: ScFileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Operation to upload a file. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun fileUpload(fileContent: String, params: ScFileUploadParams): CompletableFuture<String> =
        fileUpload(fileContent, params, RequestOptions.none())

    /** @see fileUpload */
    @Deprecated("deprecated")
    fun fileUpload(
        fileContent: String,
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see fileUpload */
    @Deprecated("deprecated")
    fun fileUpload(params: ScFileUploadParams): CompletableFuture<String> =
        fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    @Deprecated("deprecated")
    fun fileUpload(
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * operation to move folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun move(params: ScMoveParams): CompletableFuture<String> = move(params, RequestOptions.none())

    /** @see move */
    @Deprecated("deprecated")
    fun move(
        params: ScMoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Operation to rename folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    @Deprecated("deprecated")
    fun rename(params: ScRenameParams): CompletableFuture<Void?> =
        rename(params, RequestOptions.none())

    /** @see rename */
    @Deprecated("deprecated")
    fun rename(
        params: ScRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Search for files by metadata and/or text in file content. */
    @Deprecated("deprecated")
    fun search(params: ScSearchParams): CompletableFuture<List<FileData>> =
        search(params, RequestOptions.none())

    /** @see search */
    @Deprecated("deprecated")
    fun search(
        params: ScSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FileData>>

    /** A view of [ScServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScServiceAsync.WithRawResponse

        fun notifications(): NotificationServiceAsync.WithRawResponse

        fun file(): FileServiceAsync.WithRawResponse

        fun folders(): FolderServiceAsync.WithRawResponse

        fun paths(): PathServiceAsync.WithRawResponse

        fun view(): ViewServiceAsync.WithRawResponse

        fun v2(): V2ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /scs/delete`, but is otherwise the same as
         * [ScServiceAsync.delete].
         */
        @Deprecated("deprecated")
        fun delete(params: ScDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: ScDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /scs/allowableFileExtensions`, but is otherwise the
         * same as [ScServiceAsync.allowableFileExtensions].
         */
        fun allowableFileExtensions(): CompletableFuture<HttpResponseFor<List<String>>> =
            allowableFileExtensions(ScAllowableFileExtensionsParams.none())

        /** @see allowableFileExtensions */
        fun allowableFileExtensions(
            params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see allowableFileExtensions */
        fun allowableFileExtensions(
            params: ScAllowableFileExtensionsParams = ScAllowableFileExtensionsParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            allowableFileExtensions(params, RequestOptions.none())

        /** @see allowableFileExtensions */
        fun allowableFileExtensions(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            allowableFileExtensions(ScAllowableFileExtensionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scs/allowableFileMimes`, but is otherwise the same
         * as [ScServiceAsync.allowableFileMimes].
         */
        fun allowableFileMimes(): CompletableFuture<HttpResponseFor<List<String>>> =
            allowableFileMimes(ScAllowableFileMimesParams.none())

        /** @see allowableFileMimes */
        fun allowableFileMimes(
            params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see allowableFileMimes */
        fun allowableFileMimes(
            params: ScAllowableFileMimesParams = ScAllowableFileMimesParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            allowableFileMimes(params, RequestOptions.none())

        /** @see allowableFileMimes */
        fun allowableFileMimes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            allowableFileMimes(ScAllowableFileMimesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scs/copy`, but is otherwise the same as
         * [ScServiceAsync.copy].
         */
        @Deprecated("deprecated")
        fun copy(params: ScCopyParams): CompletableFuture<HttpResponseFor<String>> =
            copy(params, RequestOptions.none())

        /** @see copy */
        @Deprecated("deprecated")
        fun copy(
            params: ScCopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /scs/download`, but is otherwise the same as
         * [ScServiceAsync.download].
         */
        fun download(params: ScDownloadParams): CompletableFuture<HttpResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: ScDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /scs/download`, but is otherwise the same as
         * [ScServiceAsync.fileDownload].
         */
        fun fileDownload(params: ScFileDownloadParams): CompletableFuture<HttpResponse> =
            fileDownload(params, RequestOptions.none())

        /** @see fileDownload */
        fun fileDownload(
            params: ScFileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /scs/file`, but is otherwise the same as
         * [ScServiceAsync.fileUpload].
         */
        @Deprecated("deprecated")
        fun fileUpload(
            fileContent: String,
            params: ScFileUploadParams,
        ): CompletableFuture<HttpResponseFor<String>> =
            fileUpload(fileContent, params, RequestOptions.none())

        /** @see fileUpload */
        @Deprecated("deprecated")
        fun fileUpload(
            fileContent: String,
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see fileUpload */
        @Deprecated("deprecated")
        fun fileUpload(params: ScFileUploadParams): CompletableFuture<HttpResponseFor<String>> =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        @Deprecated("deprecated")
        fun fileUpload(
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `put /scs/move`, but is otherwise the same as
         * [ScServiceAsync.move].
         */
        @Deprecated("deprecated")
        fun move(params: ScMoveParams): CompletableFuture<HttpResponseFor<String>> =
            move(params, RequestOptions.none())

        /** @see move */
        @Deprecated("deprecated")
        fun move(
            params: ScMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `put /scs/rename`, but is otherwise the same as
         * [ScServiceAsync.rename].
         */
        @Deprecated("deprecated")
        fun rename(params: ScRenameParams): CompletableFuture<HttpResponse> =
            rename(params, RequestOptions.none())

        /** @see rename */
        @Deprecated("deprecated")
        fun rename(
            params: ScRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /scs/search`, but is otherwise the same as
         * [ScServiceAsync.search].
         */
        @Deprecated("deprecated")
        fun search(params: ScSearchParams): CompletableFuture<HttpResponseFor<List<FileData>>> =
            search(params, RequestOptions.none())

        /** @see search */
        @Deprecated("deprecated")
        fun search(
            params: ScSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FileData>>>
    }
}
