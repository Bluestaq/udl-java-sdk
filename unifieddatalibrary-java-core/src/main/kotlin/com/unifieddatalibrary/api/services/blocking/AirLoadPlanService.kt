// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirloadplanFull
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCountParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCreateParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanDeleteParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListPage
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanRetrieveParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanTupleParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirloadPlanService
import java.util.function.Consumer

interface AirloadPlanService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirloadPlanService

    /** Service operation to take a single airloadplan record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirloadPlanCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirloadPlanCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single airloadplan record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirloadplanFull =
        retrieve(
          id, AirloadPlanRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirloadplanFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none()): AirloadplanFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirloadPlanRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirloadplanFull

    /** @see retrieve */
    fun retrieve(params: AirloadPlanRetrieveParams): AirloadplanFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirloadplanFull =
        retrieve(
          id,
          AirloadPlanRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single airloadplan record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirloadPlanUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirloadPlanUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AirloadPlanListParams): AirloadPlanListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AirloadPlanListParams, requestOptions: RequestOptions = RequestOptions.none()): AirloadPlanListPage

    /** Service operation to delete a airloadplan record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AirloadPlanDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirloadPlanDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AirloadPlanDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AirloadPlanDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AirloadPlanCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AirloadPlanCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AirloadPlanQueryhelpResponse = queryhelp(AirloadPlanQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirloadPlanQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none()): AirloadPlanQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirloadPlanQueryhelpResponse =
        queryhelp(
          AirloadPlanQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirloadPlanTupleParams): List<AirloadplanFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirloadPlanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirloadplanFull>

    /** A view of [AirloadPlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirloadPlanService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airloadplan`, but is otherwise the same as [AirloadPlanService.create]. */
        @MustBeClosed
        fun create(params: AirloadPlanCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirloadPlanCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airloadplan/{id}`, but is otherwise the same as [AirloadPlanService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirloadplanFull> =
            retrieve(
              id, AirloadPlanRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirloadplanFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirloadPlanRetrieveParams = AirloadPlanRetrieveParams.none()): HttpResponseFor<AirloadplanFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirloadPlanRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirloadplanFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirloadPlanRetrieveParams): HttpResponseFor<AirloadplanFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirloadplanFull> =
            retrieve(
              id,
              AirloadPlanRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/airloadplan/{id}`, but is otherwise the same as [AirloadPlanService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AirloadPlanUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirloadPlanUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirloadPlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airloadplan`, but is otherwise the same as [AirloadPlanService.list]. */
        @MustBeClosed
        fun list(params: AirloadPlanListParams): HttpResponseFor<AirloadPlanListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: AirloadPlanListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirloadPlanListPage>

        /** Returns a raw HTTP response for `delete /udl/airloadplan/{id}`, but is otherwise the same as [AirloadPlanService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AirloadPlanDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirloadPlanDeleteParams = AirloadPlanDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirloadPlanDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirloadPlanDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AirloadPlanDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airloadplan/count`, but is otherwise the same as [AirloadPlanService.count]. */
        @MustBeClosed
        fun count(params: AirloadPlanCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: AirloadPlanCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/airloadplan/queryhelp`, but is otherwise the same as [AirloadPlanService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirloadPlanQueryhelpResponse> = queryhelp(AirloadPlanQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirloadPlanQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirloadPlanQueryhelpParams = AirloadPlanQueryhelpParams.none()): HttpResponseFor<AirloadPlanQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AirloadPlanQueryhelpResponse> =
            queryhelp(
              AirloadPlanQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airloadplan/tuple`, but is otherwise the same as [AirloadPlanService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirloadPlanTupleParams): HttpResponseFor<List<AirloadplanFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirloadPlanTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirloadplanFull>>
    }
}
