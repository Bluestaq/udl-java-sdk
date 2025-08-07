// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetResponse
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListPage
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeQueryhelpResponse
import java.util.function.Consumer

interface SensorObservationTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorObservationTypeService

    fun list(): SensorObservationTypeListPage = list(SensorObservationTypeListParams.none())

    /** @see list */
    fun list(
        params: SensorObservationTypeListParams = SensorObservationTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorObservationTypeListPage

    /** @see list */
    fun list(
        params: SensorObservationTypeListParams = SensorObservationTypeListParams.none()
    ): SensorObservationTypeListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SensorObservationTypeListPage =
        list(SensorObservationTypeListParams.none(), requestOptions)

    fun get(id: String): SensorObservationTypeGetResponse =
        get(id, SensorObservationTypeGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorObservationTypeGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
    ): SensorObservationTypeGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorObservationTypeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorObservationTypeGetResponse

    /** @see get */
    fun get(params: SensorObservationTypeGetParams): SensorObservationTypeGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SensorObservationTypeGetResponse =
        get(id, SensorObservationTypeGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SensorObservationTypeQueryhelpResponse =
        queryhelp(SensorObservationTypeQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorObservationTypeQueryhelpParams = SensorObservationTypeQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorObservationTypeQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SensorObservationTypeQueryhelpParams = SensorObservationTypeQueryhelpParams.none()
    ): SensorObservationTypeQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SensorObservationTypeQueryhelpResponse =
        queryhelp(SensorObservationTypeQueryhelpParams.none(), requestOptions)

    /**
     * A view of [SensorObservationTypeService] that provides access to raw HTTP responses for each
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
        ): SensorObservationTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensorobservationtype`, but is otherwise the
         * same as [SensorObservationTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SensorObservationTypeListPage> =
            list(SensorObservationTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorObservationTypeListParams = SensorObservationTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorObservationTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorObservationTypeListParams = SensorObservationTypeListParams.none()
        ): HttpResponseFor<SensorObservationTypeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SensorObservationTypeListPage> =
            list(SensorObservationTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorobservationtype/{id}`, but is otherwise
         * the same as [SensorObservationTypeService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SensorObservationTypeGetResponse> =
            get(id, SensorObservationTypeGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorObservationTypeGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorObservationTypeGetParams = SensorObservationTypeGetParams.none(),
        ): HttpResponseFor<SensorObservationTypeGetResponse> =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SensorObservationTypeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorObservationTypeGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SensorObservationTypeGetParams
        ): HttpResponseFor<SensorObservationTypeGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorObservationTypeGetResponse> =
            get(id, SensorObservationTypeGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorobservationtype/queryhelp`, but is
         * otherwise the same as [SensorObservationTypeService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SensorObservationTypeQueryhelpResponse> =
            queryhelp(SensorObservationTypeQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorObservationTypeQueryhelpParams =
                SensorObservationTypeQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorObservationTypeQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorObservationTypeQueryhelpParams =
                SensorObservationTypeQueryhelpParams.none()
        ): HttpResponseFor<SensorObservationTypeQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SensorObservationTypeQueryhelpResponse> =
            queryhelp(SensorObservationTypeQueryhelpParams.none(), requestOptions)
    }
}
