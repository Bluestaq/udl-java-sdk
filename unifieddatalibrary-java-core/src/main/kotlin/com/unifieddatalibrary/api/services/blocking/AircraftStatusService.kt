// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftstatusFull
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCountParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCreateParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusDeleteParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListPage
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusTupleParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusUpdateParams
import com.unifieddatalibrary.api.services.blocking.AircraftStatusService
import com.unifieddatalibrary.api.services.blocking.aircraftstatuses.HistoryService
import java.util.function.Consumer

interface AircraftStatusService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusService

    fun history(): HistoryService

    /** Service operation to take a single AircraftStatus as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AircraftStatusCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AircraftStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single AircraftStatus record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AircraftstatusFull =
        retrieve(
          id, AircraftStatusRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AircraftstatusFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none()): AircraftstatusFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AircraftstatusFull

    /** @see retrieve */
    fun retrieve(params: AircraftStatusRetrieveParams): AircraftstatusFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AircraftstatusFull =
        retrieve(
          id,
          AircraftStatusRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single AircraftStatus. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AircraftStatusUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AircraftStatusUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AircraftStatusListPage = list(AircraftStatusListParams.none())

    /** @see list */
    fun list(params: AircraftStatusListParams = AircraftStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AircraftStatusListPage

    /** @see list */
    fun list(params: AircraftStatusListParams = AircraftStatusListParams.none()): AircraftStatusListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AircraftStatusListPage =
        list(
          AircraftStatusListParams.none(), requestOptions
        )

    /** Service operation to delete a Status object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AircraftStatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AircraftStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AircraftStatusDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AircraftStatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AircraftStatusCountParams.none())

    /** @see count */
    fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AircraftStatusCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AircraftStatusQueryhelpResponse = queryhelp(AircraftStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AircraftStatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none()): AircraftStatusQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AircraftStatusQueryhelpResponse =
        queryhelp(
          AircraftStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AircraftStatusTupleParams): List<AircraftstatusFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AircraftStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AircraftstatusFull>

    /** A view of [AircraftStatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/aircraftstatus`, but is otherwise the same as [AircraftStatusService.create]. */
        @MustBeClosed
        fun create(params: AircraftStatusCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AircraftStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/{id}`, but is otherwise the same as [AircraftStatusService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AircraftstatusFull> =
            retrieve(
              id, AircraftStatusRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftstatusFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AircraftStatusRetrieveParams = AircraftStatusRetrieveParams.none()): HttpResponseFor<AircraftstatusFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AircraftStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftstatusFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AircraftStatusRetrieveParams): HttpResponseFor<AircraftstatusFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AircraftstatusFull> =
            retrieve(
              id,
              AircraftStatusRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/aircraftstatus/{id}`, but is otherwise the same as [AircraftStatusService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AircraftStatusUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AircraftStatusUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AircraftStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/aircraftstatus`, but is otherwise the same as [AircraftStatusService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AircraftStatusListPage> = list(AircraftStatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AircraftStatusListParams = AircraftStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftStatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AircraftStatusListParams = AircraftStatusListParams.none()): HttpResponseFor<AircraftStatusListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AircraftStatusListPage> =
            list(
              AircraftStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/aircraftstatus/{id}`, but is otherwise the same as [AircraftStatusService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AircraftStatusDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AircraftStatusDeleteParams = AircraftStatusDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AircraftStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AircraftStatusDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AircraftStatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/count`, but is otherwise the same as [AircraftStatusService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AircraftStatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AircraftStatusCountParams = AircraftStatusCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AircraftStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/queryhelp`, but is otherwise the same as [AircraftStatusService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AircraftStatusQueryhelpResponse> = queryhelp(AircraftStatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftStatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AircraftStatusQueryhelpParams = AircraftStatusQueryhelpParams.none()): HttpResponseFor<AircraftStatusQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AircraftStatusQueryhelpResponse> =
            queryhelp(
              AircraftStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraftstatus/tuple`, but is otherwise the same as [AircraftStatusService.tuple]. */
        @MustBeClosed
        fun tuple(params: AircraftStatusTupleParams): HttpResponseFor<List<AircraftstatusFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AircraftStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AircraftstatusFull>>
    }
}
