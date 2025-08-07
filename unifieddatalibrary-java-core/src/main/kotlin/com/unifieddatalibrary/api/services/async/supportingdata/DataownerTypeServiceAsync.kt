// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataownertypes.DataownerTypeListPageAsync
import com.unifieddatalibrary.api.models.supportingdata.dataownertypes.DataownerTypeListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataownerTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerTypeServiceAsync

    /** Retrieves all distinct data owner types. */
    fun list(): CompletableFuture<DataownerTypeListPageAsync> = list(DataownerTypeListParams.none())

    /** @see list */
    fun list(
        params: DataownerTypeListParams = DataownerTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataownerTypeListPageAsync>

    /** @see list */
    fun list(
        params: DataownerTypeListParams = DataownerTypeListParams.none()
    ): CompletableFuture<DataownerTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DataownerTypeListPageAsync> =
        list(DataownerTypeListParams.none(), requestOptions)

    /**
     * A view of [DataownerTypeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataownerTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/getDataOwnerTypes`, but is otherwise
         * the same as [DataownerTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DataownerTypeListPageAsync>> =
            list(DataownerTypeListParams.none())

        /** @see list */
        fun list(
            params: DataownerTypeListParams = DataownerTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataownerTypeListPageAsync>>

        /** @see list */
        fun list(
            params: DataownerTypeListParams = DataownerTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<DataownerTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DataownerTypeListPageAsync>> =
            list(DataownerTypeListParams.none(), requestOptions)
    }
}
