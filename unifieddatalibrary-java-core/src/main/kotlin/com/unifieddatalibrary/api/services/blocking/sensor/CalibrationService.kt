// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.sensor

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCountParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateBulkParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.sensor.CalibrationService
import com.unifieddatalibrary.api.services.blocking.sensor.calibration.HistoryService
import java.util.function.Consumer

interface CalibrationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalibrationService

    fun history(): HistoryService

    /** Service operation to take a single SensorCalibration as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: CalibrationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CalibrationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single SensorCalibration by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CalibrationRetrieveResponse =
        retrieve(
          id, CalibrationRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CalibrationRetrieveParams = CalibrationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CalibrationRetrieveResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CalibrationRetrieveParams = CalibrationRetrieveParams.none()): CalibrationRetrieveResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CalibrationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CalibrationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CalibrationRetrieveParams): CalibrationRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CalibrationRetrieveResponse =
        retrieve(
          id,
          CalibrationRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: CalibrationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: CalibrationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of SensorCalibrations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: CalibrationCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: CalibrationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(params: CalibrationQueryParams): List<CalibrationQueryResponse> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(params: CalibrationQueryParams, requestOptions: RequestOptions = RequestOptions.none()): List<CalibrationQueryResponse>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CalibrationQueryHelpResponse = queryHelp(CalibrationQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CalibrationQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none()): CalibrationQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CalibrationQueryHelpResponse =
        queryHelp(
          CalibrationQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CalibrationTupleParams): List<CalibrationTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CalibrationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<CalibrationTupleResponse>

    /** Service operation to take multiple sensorcalibration records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [CalibrationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalibrationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sensorcalibration`, but is otherwise the same as [CalibrationService.create]. */
        @MustBeClosed
        fun create(params: CalibrationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: CalibrationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sensorcalibration/{id}`, but is otherwise the same as [CalibrationService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CalibrationRetrieveResponse> =
            retrieve(
              id, CalibrationRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: CalibrationRetrieveParams = CalibrationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CalibrationRetrieveResponse> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: CalibrationRetrieveParams = CalibrationRetrieveParams.none()): HttpResponseFor<CalibrationRetrieveResponse> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CalibrationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CalibrationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CalibrationRetrieveParams): HttpResponseFor<CalibrationRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CalibrationRetrieveResponse> =
            retrieve(
              id,
              CalibrationRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sensorcalibration/count`, but is otherwise the same as [CalibrationService.count]. */
        @MustBeClosed
        fun count(params: CalibrationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: CalibrationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/sensorcalibration/createBulk`, but is otherwise the same as [CalibrationService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: CalibrationCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: CalibrationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sensorcalibration`, but is otherwise the same as [CalibrationService.query]. */
        @MustBeClosed
        fun query(params: CalibrationQueryParams): HttpResponseFor<List<CalibrationQueryResponse>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        @MustBeClosed
        fun query(params: CalibrationQueryParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<CalibrationQueryResponse>>

        /** Returns a raw HTTP response for `get /udl/sensorcalibration/queryhelp`, but is otherwise the same as [CalibrationService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<CalibrationQueryHelpResponse> = queryHelp(CalibrationQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CalibrationQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: CalibrationQueryHelpParams = CalibrationQueryHelpParams.none()): HttpResponseFor<CalibrationQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<CalibrationQueryHelpResponse> =
            queryHelp(
              CalibrationQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sensorcalibration/tuple`, but is otherwise the same as [CalibrationService.tuple]. */
        @MustBeClosed
        fun tuple(params: CalibrationTupleParams): HttpResponseFor<List<CalibrationTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: CalibrationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<CalibrationTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-sensorcalibration`, but is otherwise the same as [CalibrationService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
