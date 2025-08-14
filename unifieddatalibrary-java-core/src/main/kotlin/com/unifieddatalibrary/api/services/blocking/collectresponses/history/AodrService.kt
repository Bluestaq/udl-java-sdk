// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.collectresponses.history

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.collectresponses.history.aodr.AodrListParams
import java.util.function.Consumer

interface AodrService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AodrService

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required
     * query parameter information.
     */
    fun list(params: AodrListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(params: AodrListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AodrService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AodrService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/collectresponse/history/aodr`, but is otherwise
         * the same as [AodrService.list].
         */
        @MustBeClosed
        fun list(params: AodrListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AodrListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
