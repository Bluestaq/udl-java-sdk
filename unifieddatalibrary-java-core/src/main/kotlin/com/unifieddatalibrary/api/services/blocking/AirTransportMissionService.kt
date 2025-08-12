// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirTransportMissionFull
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCountParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCreateParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListPage
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpResponse
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionRetrieveParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionTupleParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirTransportMissionService
import com.unifieddatalibrary.api.services.blocking.airtransportmissions.HistoryService
import java.util.function.Consumer

interface AirTransportMissionService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTransportMissionService

    fun history(): HistoryService

    /** Service operation to take a single AirTransportMission object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirTransportMissionCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirTransportMissionCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Air Transport Mission record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirTransportMissionFull =
        retrieve(
          id, AirTransportMissionRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirTransportMissionFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none()): AirTransportMissionFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirTransportMissionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirTransportMissionFull

    /** @see retrieve */
    fun retrieve(params: AirTransportMissionRetrieveParams): AirTransportMissionFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirTransportMissionFull =
        retrieve(
          id,
          AirTransportMissionRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single AirTransportMission record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirTransportMissionUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirTransportMissionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirTransportMissionUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirTransportMissionUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AirTransportMissionListParams): AirTransportMissionListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AirTransportMissionListParams, requestOptions: RequestOptions = RequestOptions.none()): AirTransportMissionListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AirTransportMissionCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AirTransportMissionCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AirTransportMissionQueryhelpResponse = queryhelp(AirTransportMissionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirTransportMissionQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none()): AirTransportMissionQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirTransportMissionQueryhelpResponse =
        queryhelp(
          AirTransportMissionQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirTransportMissionTupleParams): List<AirTransportMissionFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirTransportMissionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirTransportMissionFull>

    /** A view of [AirTransportMissionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTransportMissionService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airtransportmission`, but is otherwise the same as [AirTransportMissionService.create]. */
        @MustBeClosed
        fun create(params: AirTransportMissionCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirTransportMissionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airtransportmission/{id}`, but is otherwise the same as [AirTransportMissionService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirTransportMissionFull> =
            retrieve(
              id, AirTransportMissionRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTransportMissionFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none()): HttpResponseFor<AirTransportMissionFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirTransportMissionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTransportMissionFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirTransportMissionRetrieveParams): HttpResponseFor<AirTransportMissionFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirTransportMissionFull> =
            retrieve(
              id,
              AirTransportMissionRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airtransportmission/{id}`, but is otherwise the same as [AirTransportMissionService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AirTransportMissionUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AirTransportMissionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirTransportMissionUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirTransportMissionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airtransportmission`, but is otherwise the same as [AirTransportMissionService.list]. */
        @MustBeClosed
        fun list(params: AirTransportMissionListParams): HttpResponseFor<AirTransportMissionListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: AirTransportMissionListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTransportMissionListPage>

        /** Returns a raw HTTP response for `get /udl/airtransportmission/count`, but is otherwise the same as [AirTransportMissionService.count]. */
        @MustBeClosed
        fun count(params: AirTransportMissionCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: AirTransportMissionCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/airtransportmission/queryhelp`, but is otherwise the same as [AirTransportMissionService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirTransportMissionQueryhelpResponse> = queryhelp(AirTransportMissionQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTransportMissionQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none()): HttpResponseFor<AirTransportMissionQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AirTransportMissionQueryhelpResponse> =
            queryhelp(
              AirTransportMissionQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airtransportmission/tuple`, but is otherwise the same as [AirTransportMissionService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirTransportMissionTupleParams): HttpResponseFor<List<AirTransportMissionFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirTransportMissionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirTransportMissionFull>>
    }
}
