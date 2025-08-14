// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.v2.V2CopyParams
import com.unifieddatalibrary.api.models.scs.v2.V2DeleteParams
import com.unifieddatalibrary.api.models.scs.v2.V2FileUploadParams
import com.unifieddatalibrary.api.models.scs.v2.V2FolderCreateParams
import com.unifieddatalibrary.api.models.scs.v2.V2ListPageAsync
import com.unifieddatalibrary.api.models.scs.v2.V2ListParams
import com.unifieddatalibrary.api.models.scs.v2.V2MoveParams
import com.unifieddatalibrary.api.models.scs.v2.V2UpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync

    /**
     * Update folders and files. For a folder, you may update description, writeAcl, readAcl,
     * classificationMarking, and tags. For a file, you may update description,
     * classificationMarking, and tags. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(params: V2UpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns a list of ScsEntity objects, each directly nested under the provided path. */
    fun list(params: V2ListParams): CompletableFuture<V2ListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: V2ListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2ListPageAsync>

    /**
     * Operation to delete a folder or file. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun delete(params: V2DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V2DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Operation to copy a folder or file. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun copy(params: V2CopyParams): CompletableFuture<Void?> = copy(params, RequestOptions.none())

    /** @see copy */
    fun copy(
        params: V2CopyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Operation to upload a file. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun fileUpload(fileContent: String, params: V2FileUploadParams): CompletableFuture<Void?> =
        fileUpload(fileContent, params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        fileContent: String,
        params: V2FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see fileUpload */
    fun fileUpload(params: V2FileUploadParams): CompletableFuture<Void?> =
        fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        params: V2FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Creates all folders in provided path that don't exist. Can be used to create a single folder
     * or a new folder structure. Provided classificationMarking, description, writeAcl, readAcl,
     * and tags are applied to the deepest folder in the provided path. If parent folders are
     * created by this request, each parent folder will be created with the same
     * classificationMarking and tags. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun folderCreate(params: V2FolderCreateParams): CompletableFuture<Void?> =
        folderCreate(params, RequestOptions.none())

    /** @see folderCreate */
    fun folderCreate(
        params: V2FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Operation to move or rename a folder or file. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun move(params: V2MoveParams): CompletableFuture<Void?> = move(params, RequestOptions.none())

    /** @see move */
    fun move(
        params: V2MoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /scs/v2/update`, but is otherwise the same as
         * [V2ServiceAsync.update].
         */
        fun update(params: V2UpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: V2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /scs/v2/list`, but is otherwise the same as
         * [V2ServiceAsync.list].
         */
        fun list(params: V2ListParams): CompletableFuture<HttpResponseFor<V2ListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: V2ListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2ListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /scs/v2/delete`, but is otherwise the same as
         * [V2ServiceAsync.delete].
         */
        fun delete(params: V2DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V2DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /scs/v2/copy`, but is otherwise the same as
         * [V2ServiceAsync.copy].
         */
        fun copy(params: V2CopyParams): CompletableFuture<HttpResponse> =
            copy(params, RequestOptions.none())

        /** @see copy */
        fun copy(
            params: V2CopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /scs/v2/file`, but is otherwise the same as
         * [V2ServiceAsync.fileUpload].
         */
        fun fileUpload(
            fileContent: String,
            params: V2FileUploadParams,
        ): CompletableFuture<HttpResponse> = fileUpload(fileContent, params, RequestOptions.none())

        /** @see fileUpload */
        fun fileUpload(
            fileContent: String,
            params: V2FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see fileUpload */
        fun fileUpload(params: V2FileUploadParams): CompletableFuture<HttpResponse> =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        fun fileUpload(
            params: V2FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /scs/v2/folder`, but is otherwise the same as
         * [V2ServiceAsync.folderCreate].
         */
        fun folderCreate(params: V2FolderCreateParams): CompletableFuture<HttpResponse> =
            folderCreate(params, RequestOptions.none())

        /** @see folderCreate */
        fun folderCreate(
            params: V2FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /scs/v2/move`, but is otherwise the same as
         * [V2ServiceAsync.move].
         */
        fun move(params: V2MoveParams): CompletableFuture<HttpResponse> =
            move(params, RequestOptions.none())

        /** @see move */
        fun move(
            params: V2MoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
