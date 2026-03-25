// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetResponse
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListPageAsync
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * This service provides operations for querying and manipulation of sensor data. Sensors are
 * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of on-orbit
 * objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio Frequency
 * (RF). This collection of operations includes 'SensorMaintenance' schedules which define
 * known/planned future maintenance and associated operational impact of sensors as well as
 * 'SensorCalibration' records which contains data about a sensor's overall accuracy and is used to
 * adjust sensor settings.
 */
interface SensorObservationTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorObservationTypeServiceAsync

    fun list(): CompletableFuture<SensorObservationTypeListPageAsync> =
        list(SensorObservationTypeListParams.none())

    /** @see list */
    fun list(
        params: SensorObservationTypeListParams = SensorObservationTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorObservationTypeListPageAsync>

    /** @see list */
    fun list(
        params: SensorObservationTypeListParams = SensorObservationTypeListParams.none()
    ): CompletableFuture<SensorObservationTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<SensorObservationTypeListPageAsync> =
        list(SensorObservationTypeListParams.none(), requestOptions)

    fun get(id: String): CompletableFuture<SensorObservationTypeGetResponse> =
        get(id, SensorObservationTypeGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorObservationTypeGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
    ): CompletableFuture<SensorObservationTypeGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorObservationTypeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorObservationTypeGetResponse>

    /** @see get */
    fun get(
        params: SensorObservationTypeGetParams
    ): CompletableFuture<SensorObservationTypeGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorObservationTypeGetResponse> =
        get(id, SensorObservationTypeGetParams.none(), requestOptions)

    /**
     * A view of [SensorObservationTypeServiceAsync] that provides access to raw HTTP responses for
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
        ): SensorObservationTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensorobservationtype`, but is otherwise the
         * same as [SensorObservationTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SensorObservationTypeListPageAsync>> =
            list(SensorObservationTypeListParams.none())

        /** @see list */
        fun list(
            params: SensorObservationTypeListParams = SensorObservationTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeListPageAsync>>

        /** @see list */
        fun list(
            params: SensorObservationTypeListParams = SensorObservationTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeListPageAsync>> =
            list(SensorObservationTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorobservationtype/{id}`, but is otherwise
         * the same as [SensorObservationTypeServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>> =
            get(id, SensorObservationTypeGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SensorObservationTypeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>>

        /** @see get */
        fun get(
            params: SensorObservationTypeGetParams
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>> =
            get(id, SensorObservationTypeGetParams.none(), requestOptions)
    }
}
