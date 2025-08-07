// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.datatypes.DataTypeListPageAsync
import com.unifieddatalibrary.api.models.supportingdata.datatypes.DataTypeListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataTypeServiceAsync

    /** Retrieves all distinct data owner types. */
    fun list(): CompletableFuture<DataTypeListPageAsync> = list(DataTypeListParams.none())

    /** @see list */
    fun list(
        params: DataTypeListParams = DataTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataTypeListPageAsync>

    /** @see list */
    fun list(
        params: DataTypeListParams = DataTypeListParams.none()
    ): CompletableFuture<DataTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DataTypeListPageAsync> =
        list(DataTypeListParams.none(), requestOptions)

    /**
     * A view of [DataTypeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/getDataTypes`, but is otherwise the
         * same as [DataTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DataTypeListPageAsync>> =
            list(DataTypeListParams.none())

        /** @see list */
        fun list(
            params: DataTypeListParams = DataTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataTypeListPageAsync>>

        /** @see list */
        fun list(
            params: DataTypeListParams = DataTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<DataTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DataTypeListPageAsync>> =
            list(DataTypeListParams.none(), requestOptions)
    }
}
