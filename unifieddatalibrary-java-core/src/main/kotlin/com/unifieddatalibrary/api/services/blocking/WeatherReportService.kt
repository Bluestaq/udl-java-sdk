// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCountParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCreateParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportGetParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListPage
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportTupleParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherreport.history.WeatherReportFull
import com.unifieddatalibrary.api.services.blocking.WeatherReportService
import com.unifieddatalibrary.api.services.blocking.weatherreport.HistoryService
import java.util.function.Consumer

interface WeatherReportService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherReportService

    fun history(): HistoryService

    /** Service operation to take a single WeatherReport as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: WeatherReportCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: WeatherReportCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: WeatherReportListParams): WeatherReportListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: WeatherReportListParams, requestOptions: RequestOptions = RequestOptions.none()): WeatherReportListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: WeatherReportCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: WeatherReportCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to get a single WeatherReport by its unique ID passed as a path parameter. */
    fun get(id: String): WeatherReportFull =
        get(
          id, WeatherReportGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: WeatherReportGetParams = WeatherReportGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): WeatherReportFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: WeatherReportGetParams = WeatherReportGetParams.none()): WeatherReportFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: WeatherReportGetParams, requestOptions: RequestOptions = RequestOptions.none()): WeatherReportFull

    /** @see get */
    fun get(params: WeatherReportGetParams): WeatherReportFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): WeatherReportFull =
        get(
          id,
          WeatherReportGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): WeatherReportQueryhelpResponse = queryhelp(WeatherReportQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): WeatherReportQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none()): WeatherReportQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): WeatherReportQueryhelpResponse =
        queryhelp(
          WeatherReportQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: WeatherReportTupleParams): List<WeatherReportFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: WeatherReportTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<WeatherReportFull>

    /** Service operation to take a list of WeatherReports as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: WeatherReportUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: WeatherReportUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [WeatherReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherReportService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/weatherreport`, but is otherwise the same as [WeatherReportService.create]. */
        @MustBeClosed
        fun create(params: WeatherReportCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: WeatherReportCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/weatherreport`, but is otherwise the same as [WeatherReportService.list]. */
        @MustBeClosed
        fun list(params: WeatherReportListParams): HttpResponseFor<WeatherReportListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: WeatherReportListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<WeatherReportListPage>

        /** Returns a raw HTTP response for `get /udl/weatherreport/count`, but is otherwise the same as [WeatherReportService.count]. */
        @MustBeClosed
        fun count(params: WeatherReportCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: WeatherReportCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/weatherreport/{id}`, but is otherwise the same as [WeatherReportService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<WeatherReportFull> =
            get(
              id, WeatherReportGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: WeatherReportGetParams = WeatherReportGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<WeatherReportFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: WeatherReportGetParams = WeatherReportGetParams.none()): HttpResponseFor<WeatherReportFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: WeatherReportGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<WeatherReportFull>

        /** @see get */
        @MustBeClosed
        fun get(params: WeatherReportGetParams): HttpResponseFor<WeatherReportFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<WeatherReportFull> =
            get(
              id,
              WeatherReportGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/weatherreport/queryhelp`, but is otherwise the same as [WeatherReportService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<WeatherReportQueryhelpResponse> = queryhelp(WeatherReportQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<WeatherReportQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: WeatherReportQueryhelpParams = WeatherReportQueryhelpParams.none()): HttpResponseFor<WeatherReportQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<WeatherReportQueryhelpResponse> =
            queryhelp(
              WeatherReportQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/weatherreport/tuple`, but is otherwise the same as [WeatherReportService.tuple]. */
        @MustBeClosed
        fun tuple(params: WeatherReportTupleParams): HttpResponseFor<List<WeatherReportFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: WeatherReportTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<WeatherReportFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-weatherreport`, but is otherwise the same as [WeatherReportService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: WeatherReportUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: WeatherReportUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
