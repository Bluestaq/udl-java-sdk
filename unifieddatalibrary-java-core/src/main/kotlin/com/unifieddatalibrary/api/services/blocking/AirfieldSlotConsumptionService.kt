// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldslotconsumptionFull
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCountParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCreateParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionDeleteParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListPage
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionTupleParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionService
import java.util.function.Consumer

interface AirfieldSlotConsumptionService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotConsumptionService

    /** Service operation to take a single airfieldslotconsumption record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirfieldSlotConsumptionCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirfieldSlotConsumptionCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single airfieldslotconsumption record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirfieldslotconsumptionFull =
        retrieve(
          id, AirfieldSlotConsumptionRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldSlotConsumptionRetrieveParams = AirfieldSlotConsumptionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldslotconsumptionFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirfieldSlotConsumptionRetrieveParams = AirfieldSlotConsumptionRetrieveParams.none()): AirfieldslotconsumptionFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirfieldSlotConsumptionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirfieldslotconsumptionFull

    /** @see retrieve */
    fun retrieve(params: AirfieldSlotConsumptionRetrieveParams): AirfieldslotconsumptionFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirfieldslotconsumptionFull =
        retrieve(
          id,
          AirfieldSlotConsumptionRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single AirfieldSlotConsumption. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirfieldSlotConsumptionUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirfieldSlotConsumptionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirfieldSlotConsumptionUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirfieldSlotConsumptionUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AirfieldSlotConsumptionListParams): AirfieldSlotConsumptionListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AirfieldSlotConsumptionListParams, requestOptions: RequestOptions = RequestOptions.none()): AirfieldSlotConsumptionListPage

    /** Service operation to delete an airfieldslotconsumption record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AirfieldSlotConsumptionDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirfieldSlotConsumptionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AirfieldSlotConsumptionDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AirfieldSlotConsumptionDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AirfieldSlotConsumptionCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AirfieldSlotConsumptionCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AirfieldSlotConsumptionQueryhelpResponse = queryhelp(AirfieldSlotConsumptionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirfieldSlotConsumptionQueryhelpParams = AirfieldSlotConsumptionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirfieldSlotConsumptionQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AirfieldSlotConsumptionQueryhelpParams = AirfieldSlotConsumptionQueryhelpParams.none()): AirfieldSlotConsumptionQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirfieldSlotConsumptionQueryhelpResponse =
        queryhelp(
          AirfieldSlotConsumptionQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirfieldSlotConsumptionTupleParams): List<AirfieldslotconsumptionFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirfieldSlotConsumptionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirfieldslotconsumptionFull>

    /** A view of [AirfieldSlotConsumptionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotConsumptionService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airfieldslotconsumption`, but is otherwise the same as [AirfieldSlotConsumptionService.create]. */
        @MustBeClosed
        fun create(params: AirfieldSlotConsumptionCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirfieldSlotConsumptionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airfieldslotconsumption/{id}`, but is otherwise the same as [AirfieldSlotConsumptionService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirfieldslotconsumptionFull> =
            retrieve(
              id, AirfieldSlotConsumptionRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirfieldSlotConsumptionRetrieveParams = AirfieldSlotConsumptionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldslotconsumptionFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirfieldSlotConsumptionRetrieveParams = AirfieldSlotConsumptionRetrieveParams.none()): HttpResponseFor<AirfieldslotconsumptionFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldSlotConsumptionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldslotconsumptionFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldSlotConsumptionRetrieveParams): HttpResponseFor<AirfieldslotconsumptionFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirfieldslotconsumptionFull> =
            retrieve(
              id,
              AirfieldSlotConsumptionRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airfieldslotconsumption/{id}`, but is otherwise the same as [AirfieldSlotConsumptionService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldSlotConsumptionUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldSlotConsumptionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldSlotConsumptionUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldSlotConsumptionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airfieldslotconsumption`, but is otherwise the same as [AirfieldSlotConsumptionService.list]. */
        @MustBeClosed
        fun list(params: AirfieldSlotConsumptionListParams): HttpResponseFor<AirfieldSlotConsumptionListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: AirfieldSlotConsumptionListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldSlotConsumptionListPage>

        /** Returns a raw HTTP response for `delete /udl/airfieldslotconsumption/{id}`, but is otherwise the same as [AirfieldSlotConsumptionService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AirfieldSlotConsumptionDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirfieldSlotConsumptionDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirfieldSlotConsumptionDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AirfieldSlotConsumptionDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airfieldslotconsumption/count`, but is otherwise the same as [AirfieldSlotConsumptionService.count]. */
        @MustBeClosed
        fun count(params: AirfieldSlotConsumptionCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: AirfieldSlotConsumptionCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/airfieldslotconsumption/queryhelp`, but is otherwise the same as [AirfieldSlotConsumptionService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse> = queryhelp(AirfieldSlotConsumptionQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirfieldSlotConsumptionQueryhelpParams = AirfieldSlotConsumptionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirfieldSlotConsumptionQueryhelpParams = AirfieldSlotConsumptionQueryhelpParams.none()): HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse> =
            queryhelp(
              AirfieldSlotConsumptionQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airfieldslotconsumption/tuple`, but is otherwise the same as [AirfieldSlotConsumptionService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirfieldSlotConsumptionTupleParams): HttpResponseFor<List<AirfieldslotconsumptionFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirfieldSlotConsumptionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirfieldslotconsumptionFull>>
    }
}
