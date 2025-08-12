// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.airoperations.diplomaticclearance.DiplomaticClearanceUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.airoperations.DiplomaticClearanceService
import java.util.function.Consumer

interface DiplomaticClearanceService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceService

    /** Service operation to take multiple Diplomatic Clearance records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [DiplomaticClearanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceService.WithRawResponse

        /** Returns a raw HTTP response for `post /filedrop/udl-diplomaticclearance`, but is otherwise the same as [DiplomaticClearanceService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
