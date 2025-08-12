// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanCountParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanCreateParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanGetParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanGetResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListPage
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanTupleParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanTupleResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanUpdateParams
import com.unifieddatalibrary.api.services.blocking.SensorPlanService
import com.unifieddatalibrary.api.services.blocking.sensorplan.HistoryService
import java.util.function.Consumer

interface SensorPlanService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorPlanService

    fun history(): HistoryService

    /** Service operation to take a single sensor plan as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SensorPlanCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SensorPlanCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single SensorPlan. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SensorPlanUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SensorPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SensorPlanUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SensorPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SensorPlanListParams): SensorPlanListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SensorPlanListParams, requestOptions: RequestOptions = RequestOptions.none()): SensorPlanListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SensorPlanCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SensorPlanCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to get a single SensorPlan by its unique ID passed as a path parameter. */
    fun get(id: String): SensorPlanGetResponse =
        get(
          id, SensorPlanGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SensorPlanGetParams = SensorPlanGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SensorPlanGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SensorPlanGetParams = SensorPlanGetParams.none()): SensorPlanGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SensorPlanGetParams, requestOptions: RequestOptions = RequestOptions.none()): SensorPlanGetResponse

    /** @see get */
    fun get(params: SensorPlanGetParams): SensorPlanGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SensorPlanGetResponse =
        get(
          id,
          SensorPlanGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SensorPlanQueryhelpResponse = queryhelp(SensorPlanQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SensorPlanQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none()): SensorPlanQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SensorPlanQueryhelpResponse =
        queryhelp(
          SensorPlanQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SensorPlanTupleParams): List<SensorPlanTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SensorPlanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SensorPlanTupleResponse>

    /** Service operation to take one or more sensorplan record(s) as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SensorPlanUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SensorPlanUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SensorPlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorPlanService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sensorplan`, but is otherwise the same as [SensorPlanService.create]. */
        @MustBeClosed
        fun create(params: SensorPlanCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SensorPlanCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/sensorplan/{id}`, but is otherwise the same as [SensorPlanService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: SensorPlanUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: SensorPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SensorPlanUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: SensorPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sensorplan`, but is otherwise the same as [SensorPlanService.list]. */
        @MustBeClosed
        fun list(params: SensorPlanListParams): HttpResponseFor<SensorPlanListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: SensorPlanListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SensorPlanListPage>

        /** Returns a raw HTTP response for `get /udl/sensorplan/count`, but is otherwise the same as [SensorPlanService.count]. */
        @MustBeClosed
        fun count(params: SensorPlanCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: SensorPlanCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/sensorplan/{id}`, but is otherwise the same as [SensorPlanService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SensorPlanGetResponse> =
            get(
              id, SensorPlanGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SensorPlanGetParams = SensorPlanGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SensorPlanGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SensorPlanGetParams = SensorPlanGetParams.none()): HttpResponseFor<SensorPlanGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SensorPlanGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SensorPlanGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SensorPlanGetParams): HttpResponseFor<SensorPlanGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SensorPlanGetResponse> =
            get(
              id,
              SensorPlanGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sensorplan/queryhelp`, but is otherwise the same as [SensorPlanService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SensorPlanQueryhelpResponse> = queryhelp(SensorPlanQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SensorPlanQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SensorPlanQueryhelpParams = SensorPlanQueryhelpParams.none()): HttpResponseFor<SensorPlanQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SensorPlanQueryhelpResponse> =
            queryhelp(
              SensorPlanQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sensorplan/tuple`, but is otherwise the same as [SensorPlanService.tuple]. */
        @MustBeClosed
        fun tuple(params: SensorPlanTupleParams): HttpResponseFor<List<SensorPlanTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SensorPlanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SensorPlanTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-sensorplan`, but is otherwise the same as [SensorPlanService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: SensorPlanUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: SensorPlanUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
