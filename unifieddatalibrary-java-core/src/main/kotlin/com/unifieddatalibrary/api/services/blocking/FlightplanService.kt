// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.FlightPlanFull
import com.unifieddatalibrary.api.models.flightplan.FlightplanCountParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanCreateParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanDeleteParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanListPage
import com.unifieddatalibrary.api.models.flightplan.FlightplanListParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpResponse
import com.unifieddatalibrary.api.models.flightplan.FlightplanRetrieveParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanTupleParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanUpdateParams
import com.unifieddatalibrary.api.services.blocking.FlightplanService
import java.util.function.Consumer

interface FlightplanService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlightplanService

    /** Service operation to take a single FlightPlan object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: FlightplanCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: FlightplanCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single FlightPlan record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): FlightPlanFull =
        retrieve(
          id, FlightplanRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: FlightplanRetrieveParams = FlightplanRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): FlightPlanFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: FlightplanRetrieveParams = FlightplanRetrieveParams.none()): FlightPlanFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: FlightplanRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): FlightPlanFull

    /** @see retrieve */
    fun retrieve(params: FlightplanRetrieveParams): FlightPlanFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FlightPlanFull =
        retrieve(
          id,
          FlightplanRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single flightplan record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: FlightplanUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: FlightplanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: FlightplanUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: FlightplanUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): FlightplanListPage = list(FlightplanListParams.none())

    /** @see list */
    fun list(params: FlightplanListParams = FlightplanListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): FlightplanListPage

    /** @see list */
    fun list(params: FlightplanListParams = FlightplanListParams.none()): FlightplanListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): FlightplanListPage =
        list(
          FlightplanListParams.none(), requestOptions
        )

    /** Service operation to delete a flight plan record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, FlightplanDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: FlightplanDeleteParams = FlightplanDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: FlightplanDeleteParams = FlightplanDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: FlightplanDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FlightplanDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          FlightplanDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(FlightplanCountParams.none())

    /** @see count */
    fun count(params: FlightplanCountParams = FlightplanCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: FlightplanCountParams = FlightplanCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          FlightplanCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): FlightplanQueryhelpResponse = queryhelp(FlightplanQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): FlightplanQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none()): FlightplanQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): FlightplanQueryhelpResponse =
        queryhelp(
          FlightplanQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: FlightplanTupleParams): List<FlightPlanFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: FlightplanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<FlightPlanFull>

    /** Service operation to take one or many flight plan records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: FlightplanUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: FlightplanUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [FlightplanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlightplanService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/flightplan`, but is otherwise the same as [FlightplanService.create]. */
        @MustBeClosed
        fun create(params: FlightplanCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: FlightplanCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/flightplan/{id}`, but is otherwise the same as [FlightplanService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FlightPlanFull> =
            retrieve(
              id, FlightplanRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: FlightplanRetrieveParams = FlightplanRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FlightPlanFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: FlightplanRetrieveParams = FlightplanRetrieveParams.none()): HttpResponseFor<FlightPlanFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FlightplanRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FlightPlanFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FlightplanRetrieveParams): HttpResponseFor<FlightPlanFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<FlightPlanFull> =
            retrieve(
              id,
              FlightplanRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/flightplan/{id}`, but is otherwise the same as [FlightplanService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: FlightplanUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: FlightplanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: FlightplanUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: FlightplanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/flightplan`, but is otherwise the same as [FlightplanService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<FlightplanListPage> = list(FlightplanListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: FlightplanListParams = FlightplanListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FlightplanListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FlightplanListParams = FlightplanListParams.none()): HttpResponseFor<FlightplanListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FlightplanListPage> =
            list(
              FlightplanListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/flightplan/{id}`, but is otherwise the same as [FlightplanService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, FlightplanDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: FlightplanDeleteParams = FlightplanDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: FlightplanDeleteParams = FlightplanDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: FlightplanDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FlightplanDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              FlightplanDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/flightplan/count`, but is otherwise the same as [FlightplanService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(FlightplanCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: FlightplanCountParams = FlightplanCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: FlightplanCountParams = FlightplanCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              FlightplanCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/flightplan/queryhelp`, but is otherwise the same as [FlightplanService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<FlightplanQueryhelpResponse> = queryhelp(FlightplanQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<FlightplanQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: FlightplanQueryhelpParams = FlightplanQueryhelpParams.none()): HttpResponseFor<FlightplanQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<FlightplanQueryhelpResponse> =
            queryhelp(
              FlightplanQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/flightplan/tuple`, but is otherwise the same as [FlightplanService.tuple]. */
        @MustBeClosed
        fun tuple(params: FlightplanTupleParams): HttpResponseFor<List<FlightPlanFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: FlightplanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<FlightPlanFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-flightplan`, but is otherwise the same as [FlightplanService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: FlightplanUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: FlightplanUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
