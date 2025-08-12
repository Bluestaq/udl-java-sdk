// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.airoperations.diplomaticclearance.DiplomaticClearanceUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.airoperations.DiplomaticClearanceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiplomaticClearanceServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceServiceAsync

    /** Service operation to take multiple Diplomatic Clearance records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [DiplomaticClearanceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /filedrop/udl-diplomaticclearance`, but is otherwise the same as [DiplomaticClearanceServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: DiplomaticClearanceUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
