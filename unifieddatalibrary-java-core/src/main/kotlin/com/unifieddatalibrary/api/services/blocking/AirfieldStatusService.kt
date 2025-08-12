// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldstatusFull
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCountParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCreateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusDeleteParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListPage
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusRetrieveParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusTupleParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusService
import com.unifieddatalibrary.api.services.blocking.airfieldstatus.HistoryService
import java.util.function.Consumer

interface AirfieldStatusService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldStatusService

    fun history(): HistoryService

    /** Service operation to take a single airfield status record as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: AirfieldStatusCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirfieldStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single airfield status record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirfieldstatusFull =
        retrieve(
          id, AirfieldStatusRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldstatusFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none()): AirfieldstatusFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirfieldStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirfieldstatusFull

    /** @see retrieve */
    fun retrieve(params: AirfieldStatusRetrieveParams): AirfieldstatusFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirfieldstatusFull =
        retrieve(
          id,
          AirfieldStatusRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single airfield status record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirfieldStatusUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirfieldStatusUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AirfieldStatusListPage = list(AirfieldStatusListParams.none())

    /** @see list */
    fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldStatusListPage

    /** @see list */
    fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none()): AirfieldStatusListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AirfieldStatusListPage =
        list(
          AirfieldStatusListParams.none(), requestOptions
        )

    /** Service operation to delete a Status object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AirfieldStatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirfieldStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AirfieldStatusDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AirfieldStatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AirfieldStatusCountParams.none())

    /** @see count */
    fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AirfieldStatusCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AirfieldStatusQueryhelpResponse = queryhelp(AirfieldStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldStatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none()): AirfieldStatusQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirfieldStatusQueryhelpResponse =
        queryhelp(
          AirfieldStatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirfieldStatusTupleParams): List<AirfieldstatusFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirfieldStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirfieldstatusFull>

    /** A view of [AirfieldStatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldStatusService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airfieldstatus`, but is otherwise the same as [AirfieldStatusService.create]. */
        @MustBeClosed
        fun create(params: AirfieldStatusCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirfieldStatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/{id}`, but is otherwise the same as [AirfieldStatusService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirfieldstatusFull> =
            retrieve(
              id, AirfieldStatusRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldstatusFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirfieldStatusRetrieveParams = AirfieldStatusRetrieveParams.none()): HttpResponseFor<AirfieldstatusFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldStatusRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldstatusFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldStatusRetrieveParams): HttpResponseFor<AirfieldstatusFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirfieldstatusFull> =
            retrieve(
              id,
              AirfieldStatusRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airfieldstatus/{id}`, but is otherwise the same as [AirfieldStatusService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldStatusUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldStatusUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldStatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airfieldstatus`, but is otherwise the same as [AirfieldStatusService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AirfieldStatusListPage> = list(AirfieldStatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldStatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AirfieldStatusListParams = AirfieldStatusListParams.none()): HttpResponseFor<AirfieldStatusListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AirfieldStatusListPage> =
            list(
              AirfieldStatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/airfieldstatus/{id}`, but is otherwise the same as [AirfieldStatusService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AirfieldStatusDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirfieldStatusDeleteParams = AirfieldStatusDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirfieldStatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirfieldStatusDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AirfieldStatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/count`, but is otherwise the same as [AirfieldStatusService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AirfieldStatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AirfieldStatusCountParams = AirfieldStatusCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AirfieldStatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/queryhelp`, but is otherwise the same as [AirfieldStatusService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirfieldStatusQueryhelpResponse> = queryhelp(AirfieldStatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldStatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirfieldStatusQueryhelpParams = AirfieldStatusQueryhelpParams.none()): HttpResponseFor<AirfieldStatusQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AirfieldStatusQueryhelpResponse> =
            queryhelp(
              AirfieldStatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldstatus/tuple`, but is otherwise the same as [AirfieldStatusService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirfieldStatusTupleParams): HttpResponseFor<List<AirfieldstatusFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirfieldStatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirfieldstatusFull>>
    }
}
