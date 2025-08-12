// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftFull
import com.unifieddatalibrary.api.models.aircraft.AircraftCountParams
import com.unifieddatalibrary.api.models.aircraft.AircraftCreateParams
import com.unifieddatalibrary.api.models.aircraft.AircraftListPage
import com.unifieddatalibrary.api.models.aircraft.AircraftListParams
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpParams
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraft.AircraftRetrieveParams
import com.unifieddatalibrary.api.models.aircraft.AircraftTupleQueryParams
import com.unifieddatalibrary.api.models.aircraft.AircraftUpdateParams
import com.unifieddatalibrary.api.services.blocking.AircraftService
import java.util.function.Consumer

interface AircraftService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftService

    /** Service operation to take a single Aircraft as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AircraftCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AircraftCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Aircraft record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AircraftFull =
        retrieve(
          id, AircraftRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AircraftFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none()): AircraftFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AircraftRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AircraftFull

    /** @see retrieve */
    fun retrieve(params: AircraftRetrieveParams): AircraftFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AircraftFull =
        retrieve(
          id,
          AircraftRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Aircraft. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AircraftUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AircraftUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AircraftListPage = list(AircraftListParams.none())

    /** @see list */
    fun list(params: AircraftListParams = AircraftListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AircraftListPage

    /** @see list */
    fun list(params: AircraftListParams = AircraftListParams.none()): AircraftListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AircraftListPage =
        list(
          AircraftListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AircraftCountParams.none())

    /** @see count */
    fun count(params: AircraftCountParams = AircraftCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AircraftCountParams = AircraftCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AircraftCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AircraftQueryhelpResponse = queryhelp(AircraftQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AircraftQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none()): AircraftQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AircraftQueryhelpResponse =
        queryhelp(
          AircraftQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tupleQuery(params: AircraftTupleQueryParams): List<AircraftFull> =
        tupleQuery(
          params, RequestOptions.none()
        )

    /** @see tupleQuery */
    fun tupleQuery(params: AircraftTupleQueryParams, requestOptions: RequestOptions = RequestOptions.none()): List<AircraftFull>

    /** A view of [AircraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/aircraft`, but is otherwise the same as [AircraftService.create]. */
        @MustBeClosed
        fun create(params: AircraftCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AircraftCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/aircraft/{id}`, but is otherwise the same as [AircraftService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AircraftFull> =
            retrieve(
              id, AircraftRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AircraftRetrieveParams = AircraftRetrieveParams.none()): HttpResponseFor<AircraftFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AircraftRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AircraftRetrieveParams): HttpResponseFor<AircraftFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AircraftFull> =
            retrieve(
              id,
              AircraftRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/aircraft/{id}`, but is otherwise the same as [AircraftService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AircraftUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AircraftUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AircraftUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/aircraft`, but is otherwise the same as [AircraftService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AircraftListPage> = list(AircraftListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AircraftListParams = AircraftListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AircraftListParams = AircraftListParams.none()): HttpResponseFor<AircraftListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AircraftListPage> =
            list(
              AircraftListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraft/count`, but is otherwise the same as [AircraftService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AircraftCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AircraftCountParams = AircraftCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AircraftCountParams = AircraftCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AircraftCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraft/queryhelp`, but is otherwise the same as [AircraftService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AircraftQueryhelpResponse> = queryhelp(AircraftQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AircraftQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AircraftQueryhelpParams = AircraftQueryhelpParams.none()): HttpResponseFor<AircraftQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AircraftQueryhelpResponse> =
            queryhelp(
              AircraftQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/aircraft/tuple`, but is otherwise the same as [AircraftService.tupleQuery]. */
        @MustBeClosed
        fun tupleQuery(params: AircraftTupleQueryParams): HttpResponseFor<List<AircraftFull>> =
            tupleQuery(
              params, RequestOptions.none()
            )

        /** @see tupleQuery */
        @MustBeClosed
        fun tupleQuery(params: AircraftTupleQueryParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AircraftFull>>
    }
}
