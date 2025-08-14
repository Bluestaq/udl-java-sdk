// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.airoperations.airspacecontrolorders.AirspaceControlOrderUnvalidatedPublishParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirspaceControlOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirspaceControlOrderServiceAsync

    /**
     * Service operation to take multiple AirspaceControlOrder records as a POST body and ingest
     * into the database. This operation is intended to be used for automated feeds into UDL. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: AirspaceControlOrderUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AirspaceControlOrderUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AirspaceControlOrderServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirspaceControlOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-airspacecontrolorder`, but is
         * otherwise the same as [AirspaceControlOrderServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: AirspaceControlOrderUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: AirspaceControlOrderUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
