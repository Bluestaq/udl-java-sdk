// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.queryhelp.QueryHelpRetrieveParams
import com.unifieddatalibrary.api.models.supportingdata.queryhelp.QueryHelpRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueryHelpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryHelpServiceAsync

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun retrieve(): CompletableFuture<QueryHelpRetrieveResponse> =
        retrieve(QueryHelpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueryHelpRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none()
    ): CompletableFuture<QueryHelpRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<QueryHelpRetrieveResponse> =
        retrieve(QueryHelpRetrieveParams.none(), requestOptions)

    /**
     * A view of [QueryHelpServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueryHelpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/queryhelp`, but is otherwise the same
         * as [QueryHelpServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<QueryHelpRetrieveResponse>> =
            retrieve(QueryHelpRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueryHelpRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<QueryHelpRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QueryHelpRetrieveResponse>> =
            retrieve(QueryHelpRetrieveParams.none(), requestOptions)
    }
}
