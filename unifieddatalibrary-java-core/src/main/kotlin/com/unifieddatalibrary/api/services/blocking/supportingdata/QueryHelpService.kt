// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.queryhelp.QueryHelpRetrieveParams
import com.unifieddatalibrary.api.models.supportingdata.queryhelp.QueryHelpRetrieveResponse
import java.util.function.Consumer

interface QueryHelpService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryHelpService

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun retrieve(): QueryHelpRetrieveResponse = retrieve(QueryHelpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryHelpRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none()
    ): QueryHelpRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): QueryHelpRetrieveResponse =
        retrieve(QueryHelpRetrieveParams.none(), requestOptions)

    /** A view of [QueryHelpService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryHelpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/queryhelp`, but is otherwise the same
         * as [QueryHelpService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<QueryHelpRetrieveResponse> =
            retrieve(QueryHelpRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueryHelpRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: QueryHelpRetrieveParams = QueryHelpRetrieveParams.none()
        ): HttpResponseFor<QueryHelpRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<QueryHelpRetrieveResponse> =
            retrieve(QueryHelpRetrieveParams.none(), requestOptions)
    }
}
