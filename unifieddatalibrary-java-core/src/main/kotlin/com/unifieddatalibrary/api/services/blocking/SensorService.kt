// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensor.SensorCountParams
import com.unifieddatalibrary.api.models.sensor.SensorCreateParams
import com.unifieddatalibrary.api.models.sensor.SensorDeleteParams
import com.unifieddatalibrary.api.models.sensor.SensorGetParams
import com.unifieddatalibrary.api.models.sensor.SensorGetResponse
import com.unifieddatalibrary.api.models.sensor.SensorListPage
import com.unifieddatalibrary.api.models.sensor.SensorListParams
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpParams
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpResponse
import com.unifieddatalibrary.api.models.sensor.SensorTupleParams
import com.unifieddatalibrary.api.models.sensor.SensorTupleResponse
import com.unifieddatalibrary.api.models.sensor.SensorUpdateParams
import com.unifieddatalibrary.api.services.blocking.sensor.CalibrationService
import java.util.function.Consumer

interface SensorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService

    fun calibration(): CalibrationService

    /**
     * Service operation to take a single sensor as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: SensorCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: SensorCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single Sensor. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(id: String, params: SensorUpdateParams) = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: SensorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: SensorUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: SensorUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SensorListPage = list(SensorListParams.none())

    /** @see list */
    fun list(
        params: SensorListParams = SensorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorListPage

    /** @see list */
    fun list(params: SensorListParams = SensorListParams.none()): SensorListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SensorListPage =
        list(SensorListParams.none(), requestOptions)

    /**
     * Service operation to delete a Sensor specified by the passed ID path parameter. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, SensorDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SensorDeleteParams = SensorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: SensorDeleteParams = SensorDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SensorDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SensorDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SensorDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SensorCountParams.none())

    /** @see count */
    fun count(
        params: SensorCountParams = SensorCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: SensorCountParams = SensorCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SensorCountParams.none(), requestOptions)

    /** Service operation to get a single Sensor by its unique ID passed as a path parameter. */
    fun get(id: String): SensorGetResponse = get(id, SensorGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorGetParams = SensorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: SensorGetParams = SensorGetParams.none()): SensorGetResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorGetResponse

    /** @see get */
    fun get(params: SensorGetParams): SensorGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SensorGetResponse =
        get(id, SensorGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SensorQueryhelpResponse = queryhelp(SensorQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorQueryhelpParams = SensorQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SensorQueryhelpParams = SensorQueryhelpParams.none()
    ): SensorQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SensorQueryhelpResponse =
        queryhelp(SensorQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SensorTupleParams): List<SensorTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SensorTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SensorTupleResponse>

    /** A view of [SensorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService.WithRawResponse

        fun calibration(): CalibrationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensor`, but is otherwise the same as
         * [SensorService.create].
         */
        @MustBeClosed
        fun create(params: SensorCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/sensor/{id}`, but is otherwise the same as
         * [SensorService.update].
         */
        @MustBeClosed
        fun update(id: String, params: SensorUpdateParams): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SensorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SensorUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SensorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensor`, but is otherwise the same as
         * [SensorService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SensorListPage> = list(SensorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorListParams = SensorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorListParams = SensorListParams.none()
        ): HttpResponseFor<SensorListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SensorListPage> =
            list(SensorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sensor/{id}`, but is otherwise the same as
         * [SensorService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, SensorDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SensorDeleteParams = SensorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SensorDeleteParams = SensorDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SensorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SensorDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SensorDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensor/count`, but is otherwise the same as
         * [SensorService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(SensorCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SensorCountParams = SensorCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SensorCountParams = SensorCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SensorCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensor/{id}`, but is otherwise the same as
         * [SensorService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SensorGetResponse> = get(id, SensorGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorGetParams = SensorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorGetParams = SensorGetParams.none(),
        ): HttpResponseFor<SensorGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SensorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SensorGetParams): HttpResponseFor<SensorGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SensorGetResponse> =
            get(id, SensorGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensor/queryhelp`, but is otherwise the same as
         * [SensorService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SensorQueryhelpResponse> =
            queryhelp(SensorQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorQueryhelpParams = SensorQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorQueryhelpParams = SensorQueryhelpParams.none()
        ): HttpResponseFor<SensorQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SensorQueryhelpResponse> =
            queryhelp(SensorQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensor/tuple`, but is otherwise the same as
         * [SensorService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SensorTupleParams): HttpResponseFor<List<SensorTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SensorTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SensorTupleResponse>>
    }
}
