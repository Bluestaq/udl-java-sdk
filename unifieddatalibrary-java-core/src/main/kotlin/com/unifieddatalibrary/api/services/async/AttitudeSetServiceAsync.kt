// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AttitudesetFull
import com.unifieddatalibrary.api.models.attitudesets.AttitudesetRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttitudesetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudesetServiceAsync

    /**
     * Service operation to get a single AttitudeSet record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<AttitudesetFull> =
        retrieve(id, AttitudesetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttitudesetFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
    ): CompletableFuture<AttitudesetFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AttitudesetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttitudesetFull>

    /** @see retrieve */
    fun retrieve(params: AttitudesetRetrieveParams): CompletableFuture<AttitudesetFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AttitudesetFull> =
        retrieve(id, AttitudesetRetrieveParams.none(), requestOptions)

    /**
     * A view of [AttitudesetServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttitudesetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset/{id}`, but is otherwise the same as
         * [AttitudesetServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(id, AttitudesetRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AttitudesetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttitudesetFull>>

        /** @see retrieve */
        fun retrieve(
            params: AttitudesetRetrieveParams
        ): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttitudesetFull>> =
            retrieve(id, AttitudesetRetrieveParams.none(), requestOptions)
    }
}
