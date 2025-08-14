// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.aisobjects.AisObjectUnvalidatedPublishParams
import java.util.function.Consumer

interface AisObjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AisObjectService

    /**
     * Service operation to take multiple AIS objects as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: AisObjectUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: AisObjectUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [AisObjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AisObjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-ais`, but is otherwise the same as
         * [AisObjectService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: AisObjectUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: AisObjectUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
