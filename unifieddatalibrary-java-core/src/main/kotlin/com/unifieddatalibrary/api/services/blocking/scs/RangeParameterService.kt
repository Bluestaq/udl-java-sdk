// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.rangeparameters.RangeParameterListParams
import com.unifieddatalibrary.api.services.blocking.scs.RangeParameterService
import java.util.function.Consumer

interface RangeParameterService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterService

    /** Returns a set of File Metadata that can be used for search endpoint. */
    fun list(): List<String> = list(RangeParameterListParams.none())

    /** @see list */
    fun list(params: RangeParameterListParams = RangeParameterListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<String>

    /** @see list */
    fun list(params: RangeParameterListParams = RangeParameterListParams.none()): List<String> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): List<String> =
        list(
          RangeParameterListParams.none(), requestOptions
        )

    /** A view of [RangeParameterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterService.WithRawResponse

        /** Returns a raw HTTP response for `get /scs/listRangeParameters`, but is otherwise the same as [RangeParameterService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<List<String>> = list(RangeParameterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: RangeParameterListParams = RangeParameterListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<String>>

        /** @see list */
        @MustBeClosed
        fun list(params: RangeParameterListParams = RangeParameterListParams.none()): HttpResponseFor<List<String>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            list(
              RangeParameterListParams.none(), requestOptions
            )
    }
}
