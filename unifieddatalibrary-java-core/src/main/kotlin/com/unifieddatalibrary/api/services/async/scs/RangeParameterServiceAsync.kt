// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.rangeparameters.RangeParameterListParams
import com.unifieddatalibrary.api.services.async.scs.RangeParameterServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RangeParameterServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterServiceAsync

    /** Returns a set of File Metadata that can be used for search endpoint. */
    fun list(): CompletableFuture<List<String>> = list(RangeParameterListParams.none())

    /** @see list */
    fun list(params: RangeParameterListParams = RangeParameterListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<String>>

    /** @see list */
    fun list(params: RangeParameterListParams = RangeParameterListParams.none()): CompletableFuture<List<String>> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(
          RangeParameterListParams.none(), requestOptions
        )

    /** A view of [RangeParameterServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /scs/listRangeParameters`, but is otherwise the same as [RangeParameterServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<List<String>>> = list(RangeParameterListParams.none())

        /** @see list */
        fun list(params: RangeParameterListParams = RangeParameterListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(params: RangeParameterListParams = RangeParameterListParams.none()): CompletableFuture<HttpResponseFor<List<String>>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> =
            list(
              RangeParameterListParams.none(), requestOptions
            )
    }
}
