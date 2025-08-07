// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AttitudesetFull
import com.unifieddatalibrary.api.models.attitudesets.AttitudesetRetrieveParams
import java.util.function.Consumer

interface AttitudesetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudesetService

    /**
     * Service operation to get a single AttitudeSet record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): AttitudesetFull = retrieve(id, AttitudesetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttitudesetFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
    ): AttitudesetFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AttitudesetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttitudesetFull

    /** @see retrieve */
    fun retrieve(params: AttitudesetRetrieveParams): AttitudesetFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AttitudesetFull =
        retrieve(id, AttitudesetRetrieveParams.none(), requestOptions)

    /**
     * A view of [AttitudesetService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttitudesetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/attitudeset/{id}`, but is otherwise the same as
         * [AttitudesetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AttitudesetFull> =
            retrieve(id, AttitudesetRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttitudesetFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AttitudesetRetrieveParams = AttitudesetRetrieveParams.none(),
        ): HttpResponseFor<AttitudesetFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AttitudesetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttitudesetFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AttitudesetRetrieveParams): HttpResponseFor<AttitudesetFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AttitudesetFull> =
            retrieve(id, AttitudesetRetrieveParams.none(), requestOptions)
    }
}
