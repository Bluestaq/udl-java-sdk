// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.reportandactivity

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.reportandactivity.udlh3geo.UdlH3geoUnvalidatedPublishParams
import java.util.function.Consumer

interface UdlH3geoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UdlH3geoService

    /**
     * Service operation to take a single H3Geo record and many associated H3Geo hex cell records as
     * a POST body and ingest into the database. This operation is intended to be used for automated
     * feeds into UDL. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun unvalidatedPublish(params: UdlH3geoUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: UdlH3geoUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [UdlH3geoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UdlH3geoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-h3geo`, but is otherwise the same as
         * [UdlH3geoService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: UdlH3geoUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: UdlH3geoUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
