// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.observations.swir.SwirUnvalidatedPublishParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * This collection of services provides operations for querying and manipulation of electro-optical
 * (EO), radar, radio frequency (RF), Global Navigation Satellite Systems (GNSS), Ionospheric
 * (IONO), Infrared (SWIR), and Space Environment observation data. The J2000 coordinate frame is
 * the preferred frame for all observations, as applicable, but in some cases observations may be in
 * an alternate frame depending on the provider and/or datatype.
 */
interface SwirServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirServiceAsync

    /**
     * Service operation to take a list of SWIR records as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: SwirUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SwirUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<SwirUnvalidatedPublishParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unvalidatedPublish(
            SwirUnvalidatedPublishParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<SwirUnvalidatedPublishParams.Body>
    ): CompletableFuture<Void?> = unvalidatedPublish(body, RequestOptions.none())

    /** A view of [SwirServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /filedrop/swir`, but is otherwise the same as
         * [SwirServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: SwirUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: SwirUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            body: List<SwirUnvalidatedPublishParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
                SwirUnvalidatedPublishParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            body: List<SwirUnvalidatedPublishParams.Body>
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(body, RequestOptions.none())
    }
}
