// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.cots.CotCreateParams
import com.unifieddatalibrary.api.services.blocking.CotService
import java.util.function.Consumer

interface CotService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CotService

    /** This service enables posting CoT messages to the UDL TAK server. CoT data will be persisted in the UDL POI schema as well as federated to connected TAK servers. */
    fun create(params: CotCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CotCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [CotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CotService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/cot`, but is otherwise the same as [CotService.create]. */
        @MustBeClosed
        fun create(params: CotCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: CotCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
