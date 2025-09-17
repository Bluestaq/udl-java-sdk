// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.v2.ScsEntity
import com.unifieddatalibrary.api.models.scs.v2.V2CopyParams
import com.unifieddatalibrary.api.models.scs.v2.V2DeleteParams
import com.unifieddatalibrary.api.models.scs.v2.V2FileUploadParams
import com.unifieddatalibrary.api.models.scs.v2.V2FolderCreateParams
import com.unifieddatalibrary.api.models.scs.v2.V2ListPage
import com.unifieddatalibrary.api.models.scs.v2.V2ListParams
import com.unifieddatalibrary.api.models.scs.v2.V2MoveParams
import com.unifieddatalibrary.api.models.scs.v2.V2SearchParams
import com.unifieddatalibrary.api.models.scs.v2.V2UpdateParams
import java.util.function.Consumer

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service

    /**
     * Update folders and files. For a folder, you may update description, writeAcl, readAcl,
     * classificationMarking, and tags. For a file, you may update description,
     * classificationMarking, and tags. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(params: V2UpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: V2UpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Returns a list of ScsEntity objects, each directly nested under the provided path. */
    fun list(params: V2ListParams): V2ListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: V2ListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ListPage

    /**
     * Operation to delete a folder or file. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun delete(params: V2DeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: V2DeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Operation to copy a folder or file. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun copy(params: V2CopyParams) = copy(params, RequestOptions.none())

    /** @see copy */
    fun copy(params: V2CopyParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Operation to upload a file. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun fileUpload(fileContent: String, params: V2FileUploadParams) =
        fileUpload(fileContent, params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        fileContent: String,
        params: V2FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see fileUpload */
    fun fileUpload(params: V2FileUploadParams) = fileUpload(params, RequestOptions.none())

    /** @see fileUpload */
    fun fileUpload(
        params: V2FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Creates all folders in provided path that don't exist. Can be used to create a single folder
     * or a new folder structure. Provided classificationMarking, description, writeAcl, readAcl,
     * and tags are applied to the deepest folder in the provided path. If parent folders are
     * created by this request, each parent folder will be created with the same
     * classificationMarking and tags. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun folderCreate(params: V2FolderCreateParams) = folderCreate(params, RequestOptions.none())

    /** @see folderCreate */
    fun folderCreate(
        params: V2FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Operation to move or rename a folder or file. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun move(params: V2MoveParams) = move(params, RequestOptions.none())

    /** @see move */
    fun move(params: V2MoveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Operation to search for files in the Secure Content Store. */
    fun search(): List<ScsEntity> = search(V2SearchParams.none())

    /** @see search */
    fun search(
        params: V2SearchParams = V2SearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScsEntity>

    /** @see search */
    fun search(params: V2SearchParams = V2SearchParams.none()): List<ScsEntity> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): List<ScsEntity> =
        search(V2SearchParams.none(), requestOptions)

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /scs/v2/update`, but is otherwise the same as
         * [V2Service.update].
         */
        @MustBeClosed
        fun update(params: V2UpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: V2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /scs/v2/list`, but is otherwise the same as
         * [V2Service.list].
         */
        @MustBeClosed
        fun list(params: V2ListParams): HttpResponseFor<V2ListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V2ListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2ListPage>

        /**
         * Returns a raw HTTP response for `delete /scs/v2/delete`, but is otherwise the same as
         * [V2Service.delete].
         */
        @MustBeClosed
        fun delete(params: V2DeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V2DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/v2/copy`, but is otherwise the same as
         * [V2Service.copy].
         */
        @MustBeClosed
        fun copy(params: V2CopyParams): HttpResponse = copy(params, RequestOptions.none())

        /** @see copy */
        @MustBeClosed
        fun copy(
            params: V2CopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/v2/file`, but is otherwise the same as
         * [V2Service.fileUpload].
         */
        @MustBeClosed
        fun fileUpload(fileContent: String, params: V2FileUploadParams): HttpResponse =
            fileUpload(fileContent, params, RequestOptions.none())

        /** @see fileUpload */
        @MustBeClosed
        fun fileUpload(
            fileContent: String,
            params: V2FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            fileUpload(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see fileUpload */
        @MustBeClosed
        fun fileUpload(params: V2FileUploadParams): HttpResponse =
            fileUpload(params, RequestOptions.none())

        /** @see fileUpload */
        @MustBeClosed
        fun fileUpload(
            params: V2FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/v2/folder`, but is otherwise the same as
         * [V2Service.folderCreate].
         */
        @MustBeClosed
        fun folderCreate(params: V2FolderCreateParams): HttpResponse =
            folderCreate(params, RequestOptions.none())

        /** @see folderCreate */
        @MustBeClosed
        fun folderCreate(
            params: V2FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /scs/v2/move`, but is otherwise the same as
         * [V2Service.move].
         */
        @MustBeClosed
        fun move(params: V2MoveParams): HttpResponse = move(params, RequestOptions.none())

        /** @see move */
        @MustBeClosed
        fun move(
            params: V2MoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /scs/v2/search`, but is otherwise the same as
         * [V2Service.search].
         */
        @MustBeClosed fun search(): HttpResponseFor<List<ScsEntity>> = search(V2SearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: V2SearchParams = V2SearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScsEntity>>

        /** @see search */
        @MustBeClosed
        fun search(
            params: V2SearchParams = V2SearchParams.none()
        ): HttpResponseFor<List<ScsEntity>> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<List<ScsEntity>> =
            search(V2SearchParams.none(), requestOptions)
    }
}
