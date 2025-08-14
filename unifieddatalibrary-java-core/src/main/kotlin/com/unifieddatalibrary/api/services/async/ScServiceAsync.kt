// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.ScAggregateDocTypeParams
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
import com.unifieddatalibrary.api.models.scs.ScUpdateTagsParams
import com.unifieddatalibrary.api.services.async.scs.ClassificationMarkingServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FileMetadataServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FileServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FolderServiceAsync
import com.unifieddatalibrary.api.services.async.scs.GroupServiceAsync
import com.unifieddatalibrary.api.services.async.scs.PathServiceAsync
import com.unifieddatalibrary.api.services.async.scs.RangeParameterServiceAsync
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsync
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

    fun folders(): FolderServiceAsync

    fun classificationMarkings(): ClassificationMarkingServiceAsync

    fun groups(): GroupServiceAsync

    fun fileMetadata(): FileMetadataServiceAsync

    fun rangeParameters(): RangeParameterServiceAsync

    fun paths(): PathServiceAsync

    fun v2(): V2ServiceAsync

    fun file(): FileServiceAsync

    /**
     * Deletes the requested file or folder in the passed path directory that is visible to the
     * calling user. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(params: ScDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ScDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns a map of document types and counts in root folder. */
    fun aggregateDocType(): CompletableFuture<List<String>> =
        aggregateDocType(ScAggregateDocTypeParams.none())

    /** @see aggregateDocType */
    fun aggregateDocType(
        params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see aggregateDocType */
    fun aggregateDocType(
        params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none()
    ): CompletableFuture<List<String>> = aggregateDocType(params, RequestOptions.none())

    /** @see aggregateDocType */
    fun aggregateDocType(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        aggregateDocType(ScAggregateDocTypeParams.none(), requestOptions)

    /** Returns a list of allowable file extensions for upload. */
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

    /** Returns a list of allowable file mime types for upload. */
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
    fun copy(params: ScCopyParams): CompletableFuture<String> = copy(params, RequestOptions.none())

    /** @see copy */
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
    fun fileUpload(fileContent: String, params: ScFileUploadParams): CompletableFuture<String> =
        fileUpload(fileContent, params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        fileContent: String,
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see fileUpload */
    fun fileUpload(params: ScFileUploadParams): CompletableFuture<String> =
        fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * operation to move folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun move(params: ScMoveParams): CompletableFuture<String> = move(params, RequestOptions.none())

    /** @see move */
    fun move(
        params: ScMoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Operation to rename folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun rename(params: ScRenameParams): CompletableFuture<Void?> =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: ScRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Search for files by metadata and/or text in file content. */
    fun search(params: ScSearchParams): CompletableFuture<List<FileData>> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ScSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FileData>>

    /** Updates tags for given folder. */
    fun updateTags(params: ScUpdateTagsParams): CompletableFuture<Void?> =
        updateTags(params, RequestOptions.none())

    /** @see updateTags */
    fun updateTags(
        params: ScUpdateTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ScServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScServiceAsync.WithRawResponse

        fun folders(): FolderServiceAsync.WithRawResponse

        fun classificationMarkings(): ClassificationMarkingServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        fun fileMetadata(): FileMetadataServiceAsync.WithRawResponse

        fun rangeParameters(): RangeParameterServiceAsync.WithRawResponse

        fun paths(): PathServiceAsync.WithRawResponse

        fun v2(): V2ServiceAsync.WithRawResponse

        fun file(): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /scs/delete`, but is otherwise the same as
         * [ScServiceAsync.delete].
         */
        fun delete(params: ScDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ScDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /scs/aggregateDocType`, but is otherwise the same as
         * [ScServiceAsync.aggregateDocType].
         */
        fun aggregateDocType(): CompletableFuture<HttpResponseFor<List<String>>> =
            aggregateDocType(ScAggregateDocTypeParams.none())

        /** @see aggregateDocType */
        fun aggregateDocType(
            params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see aggregateDocType */
        fun aggregateDocType(
            params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            aggregateDocType(params, RequestOptions.none())

        /** @see aggregateDocType */
        fun aggregateDocType(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            aggregateDocType(ScAggregateDocTypeParams.none(), requestOptions)

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
        fun copy(params: ScCopyParams): CompletableFuture<HttpResponseFor<String>> =
            copy(params, RequestOptions.none())

        /** @see copy */
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
        fun fileUpload(
            fileContent: String,
            params: ScFileUploadParams,
        ): CompletableFuture<HttpResponseFor<String>> =
            fileUpload(fileContent, params, RequestOptions.none())

        /** @see fileUpload */
        fun fileUpload(
            fileContent: String,
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see fileUpload */
        fun fileUpload(params: ScFileUploadParams): CompletableFuture<HttpResponseFor<String>> =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        fun fileUpload(
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `put /scs/move`, but is otherwise the same as
         * [ScServiceAsync.move].
         */
        fun move(params: ScMoveParams): CompletableFuture<HttpResponseFor<String>> =
            move(params, RequestOptions.none())

        /** @see move */
        fun move(
            params: ScMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `put /scs/rename`, but is otherwise the same as
         * [ScServiceAsync.rename].
         */
        fun rename(params: ScRenameParams): CompletableFuture<HttpResponse> =
            rename(params, RequestOptions.none())

        /** @see rename */
        fun rename(
            params: ScRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /scs/search`, but is otherwise the same as
         * [ScServiceAsync.search].
         */
        fun search(params: ScSearchParams): CompletableFuture<HttpResponseFor<List<FileData>>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ScSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FileData>>>

        /**
         * Returns a raw HTTP response for `put /scs/updateTagsForFilesInFolder`, but is otherwise
         * the same as [ScServiceAsync.updateTags].
         */
        fun updateTags(params: ScUpdateTagsParams): CompletableFuture<HttpResponse> =
            updateTags(params, RequestOptions.none())

        /** @see updateTags */
        fun updateTags(
            params: ScUpdateTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
