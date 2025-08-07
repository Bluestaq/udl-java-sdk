// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.file.FileListPageAsync
import com.unifieddatalibrary.api.models.scs.file.FileListParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import com.unifieddatalibrary.api.models.scs.file.FileUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /**
     * Returns a FileData object representing the file with the given ID that is visible to the
     * calling user.
     */
    fun retrieve(params: FileRetrieveParams): CompletableFuture<FileData> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileData>

    /**
     * operation to update files metadata. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(): CompletableFuture<Void?> = update(FileUpdateParams.none())

    /** @see update */
    fun update(
        params: FileUpdateParams = FileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: FileUpdateParams = FileUpdateParams.none()): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(FileUpdateParams.none(), requestOptions)

    /**
     * Returns a non-recursive list of FileData objects representing the files and subdirectories in
     * the passed-in path directory that are visible to the calling user.
     */
    fun list(params: FileListParams): CompletableFuture<FileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/file`, but is otherwise the same as
         * [FileServiceAsync.retrieve].
         */
        fun retrieve(params: FileRetrieveParams): CompletableFuture<HttpResponseFor<FileData>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileData>>

        /**
         * Returns a raw HTTP response for `patch /scs/file`, but is otherwise the same as
         * [FileServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponse> = update(FileUpdateParams.none())

        /** @see update */
        fun update(
            params: FileUpdateParams = FileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(
            params: FileUpdateParams = FileUpdateParams.none()
        ): CompletableFuture<HttpResponse> = update(params, RequestOptions.none())

        /** @see update */
        fun update(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(FileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scs/list`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        fun list(params: FileListParams): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>>
    }
}
