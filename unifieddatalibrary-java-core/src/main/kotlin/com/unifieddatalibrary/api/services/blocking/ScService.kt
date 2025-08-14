// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.services.blocking.scs.ClassificationMarkingService
import com.unifieddatalibrary.api.services.blocking.scs.FileMetadataService
import com.unifieddatalibrary.api.services.blocking.scs.FileService
import com.unifieddatalibrary.api.services.blocking.scs.FolderService
import com.unifieddatalibrary.api.services.blocking.scs.GroupService
import com.unifieddatalibrary.api.services.blocking.scs.PathService
import com.unifieddatalibrary.api.services.blocking.scs.RangeParameterService
import com.unifieddatalibrary.api.services.blocking.scs.V2Service
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

    fun folders(): FolderService

    fun classificationMarkings(): ClassificationMarkingService

    fun groups(): GroupService

    fun fileMetadata(): FileMetadataService

    fun rangeParameters(): RangeParameterService

    fun paths(): PathService

    fun v2(): V2Service

    fun file(): FileService

    /**
     * Deletes the requested file or folder in the passed path directory that is visible to the
     * calling user. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun delete(params: ScDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ScDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Returns a map of document types and counts in root folder. */
    fun aggregateDocType(): List<String> = aggregateDocType(ScAggregateDocTypeParams.none())

    /** @see aggregateDocType */
    fun aggregateDocType(
        params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see aggregateDocType */
    fun aggregateDocType(
        params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none()
    ): List<String> = aggregateDocType(params, RequestOptions.none())

    /** @see aggregateDocType */
    fun aggregateDocType(requestOptions: RequestOptions): List<String> =
        aggregateDocType(ScAggregateDocTypeParams.none(), requestOptions)

    /** Returns a list of allowable file extensions for upload. */
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

    /** Returns a list of allowable file mime types for upload. */
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
    fun copy(params: ScCopyParams): String = copy(params, RequestOptions.none())

    /** @see copy */
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
    fun fileUpload(fileContent: String, params: ScFileUploadParams): String =
        fileUpload(fileContent, params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        fileContent: String,
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see fileUpload */
    fun fileUpload(params: ScFileUploadParams): String = fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        params: ScFileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * operation to move folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun move(params: ScMoveParams): String = move(params, RequestOptions.none())

    /** @see move */
    fun move(params: ScMoveParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /**
     * Operation to rename folders or files. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun rename(params: ScRenameParams) = rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(params: ScRenameParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Search for files by metadata and/or text in file content. */
    fun search(params: ScSearchParams): List<FileData> = search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ScSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FileData>

    /** Updates tags for given folder. */
    fun updateTags(params: ScUpdateTagsParams) = updateTags(params, RequestOptions.none())

    /** @see updateTags */
    fun updateTags(
        params: ScUpdateTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ScService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScService.WithRawResponse

        fun folders(): FolderService.WithRawResponse

        fun classificationMarkings(): ClassificationMarkingService.WithRawResponse

        fun groups(): GroupService.WithRawResponse

        fun fileMetadata(): FileMetadataService.WithRawResponse

        fun rangeParameters(): RangeParameterService.WithRawResponse

        fun paths(): PathService.WithRawResponse

        fun v2(): V2Service.WithRawResponse

        fun file(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /scs/delete`, but is otherwise the same as
         * [ScService.delete].
         */
        @MustBeClosed
        fun delete(params: ScDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ScDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /scs/aggregateDocType`, but is otherwise the same as
         * [ScService.aggregateDocType].
         */
        @MustBeClosed
        fun aggregateDocType(): HttpResponseFor<List<String>> =
            aggregateDocType(ScAggregateDocTypeParams.none())

        /** @see aggregateDocType */
        @MustBeClosed
        fun aggregateDocType(
            params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see aggregateDocType */
        @MustBeClosed
        fun aggregateDocType(
            params: ScAggregateDocTypeParams = ScAggregateDocTypeParams.none()
        ): HttpResponseFor<List<String>> = aggregateDocType(params, RequestOptions.none())

        /** @see aggregateDocType */
        @MustBeClosed
        fun aggregateDocType(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            aggregateDocType(ScAggregateDocTypeParams.none(), requestOptions)

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
        @MustBeClosed
        fun copy(params: ScCopyParams): HttpResponseFor<String> =
            copy(params, RequestOptions.none())

        /** @see copy */
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
        @MustBeClosed
        fun fileUpload(fileContent: String, params: ScFileUploadParams): HttpResponseFor<String> =
            fileUpload(fileContent, params, RequestOptions.none())

        /** @see fileUpload */
        @MustBeClosed
        fun fileUpload(
            fileContent: String,
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see fileUpload */
        @MustBeClosed
        fun fileUpload(params: ScFileUploadParams): HttpResponseFor<String> =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        @MustBeClosed
        fun fileUpload(
            params: ScFileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `put /scs/move`, but is otherwise the same as
         * [ScService.move].
         */
        @MustBeClosed
        fun move(params: ScMoveParams): HttpResponseFor<String> =
            move(params, RequestOptions.none())

        /** @see move */
        @MustBeClosed
        fun move(
            params: ScMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `put /scs/rename`, but is otherwise the same as
         * [ScService.rename].
         */
        @MustBeClosed
        fun rename(params: ScRenameParams): HttpResponse = rename(params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            params: ScRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/search`, but is otherwise the same as
         * [ScService.search].
         */
        @MustBeClosed
        fun search(params: ScSearchParams): HttpResponseFor<List<FileData>> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ScSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FileData>>

        /**
         * Returns a raw HTTP response for `put /scs/updateTagsForFilesInFolder`, but is otherwise
         * the same as [ScService.updateTags].
         */
        @MustBeClosed
        fun updateTags(params: ScUpdateTagsParams): HttpResponse =
            updateTags(params, RequestOptions.none())

        /** @see updateTags */
        @MustBeClosed
        fun updateTags(
            params: ScUpdateTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
