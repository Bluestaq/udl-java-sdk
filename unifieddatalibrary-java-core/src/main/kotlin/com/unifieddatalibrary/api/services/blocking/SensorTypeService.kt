// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetResponse
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListPage
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpResponse
import java.util.function.Consumer

interface SensorTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorTypeService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SensorTypeListPage = list(SensorTypeListParams.none())

    /** @see list */
    fun list(
        params: SensorTypeListParams = SensorTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorTypeListPage

    /** @see list */
    fun list(params: SensorTypeListParams = SensorTypeListParams.none()): SensorTypeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SensorTypeListPage =
        list(SensorTypeListParams.none(), requestOptions)

    /**
     * Service operation to get a single Sensortype record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: Int): SensorTypeGetResponse = get(id, SensorTypeGetParams.none())

    /** @see get */
    fun get(
        id: Int,
        params: SensorTypeGetParams = SensorTypeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorTypeGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: Int,
        params: SensorTypeGetParams = SensorTypeGetParams.none(),
    ): SensorTypeGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorTypeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorTypeGetResponse

    /** @see get */
    fun get(params: SensorTypeGetParams): SensorTypeGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: Int, requestOptions: RequestOptions): SensorTypeGetResponse =
        get(id, SensorTypeGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SensorTypeQueryhelpResponse = queryhelp(SensorTypeQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorTypeQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none()
    ): SensorTypeQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SensorTypeQueryhelpResponse =
        queryhelp(SensorTypeQueryhelpParams.none(), requestOptions)

    /** A view of [SensorTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensortype`, but is otherwise the same as
         * [SensorTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SensorTypeListPage> = list(SensorTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorTypeListParams = SensorTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorTypeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorTypeListParams = SensorTypeListParams.none()
        ): HttpResponseFor<SensorTypeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SensorTypeListPage> =
            list(SensorTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensortype/{id}`, but is otherwise the same as
         * [SensorTypeService.get].
         */
        @MustBeClosed
        fun get(id: Int): HttpResponseFor<SensorTypeGetResponse> =
            get(id, SensorTypeGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: Int,
            params: SensorTypeGetParams = SensorTypeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorTypeGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: Int,
            params: SensorTypeGetParams = SensorTypeGetParams.none(),
        ): HttpResponseFor<SensorTypeGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SensorTypeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorTypeGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SensorTypeGetParams): HttpResponseFor<SensorTypeGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: Int, requestOptions: RequestOptions): HttpResponseFor<SensorTypeGetResponse> =
            get(id, SensorTypeGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensortype/queryhelp`, but is otherwise the
         * same as [SensorTypeService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SensorTypeQueryhelpResponse> =
            queryhelp(SensorTypeQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorTypeQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none()
        ): HttpResponseFor<SensorTypeQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SensorTypeQueryhelpResponse> =
            queryhelp(SensorTypeQueryhelpParams.none(), requestOptions)
    }
}
