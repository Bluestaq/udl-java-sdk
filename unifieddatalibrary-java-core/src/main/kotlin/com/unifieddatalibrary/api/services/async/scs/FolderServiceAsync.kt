// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.folders.FolderCreateParams
import com.unifieddatalibrary.api.models.scs.folders.FolderRetrieveParams
import com.unifieddatalibrary.api.models.scs.folders.FolderUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FolderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync

    /**
     * Creates a new folder that is passed as part of the path. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun create(params: FolderCreateParams): CompletableFuture<String> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** Returns a FileData object representing the folder ID that is visible to the calling user. */
    fun retrieve(params: FolderRetrieveParams): CompletableFuture<FileData> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FolderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileData>

    /**
     * operation to update folders metadata. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(params: FolderUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [FolderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scs/folder`, but is otherwise the same as
         * [FolderServiceAsync.create].
         */
        fun create(params: FolderCreateParams): CompletableFuture<HttpResponseFor<String>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /scs/folder`, but is otherwise the same as
         * [FolderServiceAsync.retrieve].
         */
        fun retrieve(params: FolderRetrieveParams): CompletableFuture<HttpResponseFor<FileData>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FolderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileData>>

        /**
         * Returns a raw HTTP response for `patch /scs/folder`, but is otherwise the same as
         * [FolderServiceAsync.update].
         */
        fun update(params: FolderUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
