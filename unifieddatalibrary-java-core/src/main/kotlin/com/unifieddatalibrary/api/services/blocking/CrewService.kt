// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CrewFull
import com.unifieddatalibrary.api.models.crew.CrewCountParams
import com.unifieddatalibrary.api.models.crew.CrewCreateParams
import com.unifieddatalibrary.api.models.crew.CrewListPage
import com.unifieddatalibrary.api.models.crew.CrewListParams
import com.unifieddatalibrary.api.models.crew.CrewQueryhelpParams
import com.unifieddatalibrary.api.models.crew.CrewQueryhelpResponse
import com.unifieddatalibrary.api.models.crew.CrewRetrieveParams
import com.unifieddatalibrary.api.models.crew.CrewTupleParams
import com.unifieddatalibrary.api.models.crew.CrewUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.crew.CrewUpdateParams
import com.unifieddatalibrary.api.services.blocking.CrewService
import java.util.function.Consumer

interface CrewService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewService

    /** Service operation to take a single Crew object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CrewCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CrewCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Crew record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CrewFull =
        retrieve(
          id, CrewRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CrewFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none()): CrewFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CrewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CrewFull

    /** @see retrieve */
    fun retrieve(params: CrewRetrieveParams): CrewFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CrewFull =
        retrieve(
          id,
          CrewRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Crew record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: CrewUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: CrewUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CrewListPage = list(CrewListParams.none())

    /** @see list */
    fun list(params: CrewListParams = CrewListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CrewListPage

    /** @see list */
    fun list(params: CrewListParams = CrewListParams.none()): CrewListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CrewListPage =
        list(
          CrewListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(CrewCountParams.none())

    /** @see count */
    fun count(params: CrewCountParams = CrewCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: CrewCountParams = CrewCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          CrewCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CrewQueryhelpResponse = queryhelp(CrewQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CrewQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none()): CrewQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CrewQueryhelpResponse =
        queryhelp(
          CrewQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CrewTupleParams): List<CrewFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CrewTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<CrewFull>

    /** Service operation to take multiple Crew objects as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: CrewUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: CrewUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [CrewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/crew`, but is otherwise the same as [CrewService.create]. */
        @MustBeClosed
        fun create(params: CrewCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: CrewCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/crew/{id}`, but is otherwise the same as [CrewService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CrewFull> =
            retrieve(
              id, CrewRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CrewFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none()): HttpResponseFor<CrewFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CrewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CrewFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CrewRetrieveParams): HttpResponseFor<CrewFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CrewFull> =
            retrieve(
              id,
              CrewRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/crew/{id}`, but is otherwise the same as [CrewService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: CrewUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: CrewUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/crew`, but is otherwise the same as [CrewService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<CrewListPage> = list(CrewListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: CrewListParams = CrewListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CrewListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CrewListParams = CrewListParams.none()): HttpResponseFor<CrewListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CrewListPage> =
            list(
              CrewListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/crew/count`, but is otherwise the same as [CrewService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(CrewCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: CrewCountParams = CrewCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: CrewCountParams = CrewCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              CrewCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/crew/queryhelp`, but is otherwise the same as [CrewService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<CrewQueryhelpResponse> = queryhelp(CrewQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CrewQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none()): HttpResponseFor<CrewQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<CrewQueryhelpResponse> =
            queryhelp(
              CrewQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/crew/tuple`, but is otherwise the same as [CrewService.tuple]. */
        @MustBeClosed
        fun tuple(params: CrewTupleParams): HttpResponseFor<List<CrewFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: CrewTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<CrewFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-crew`, but is otherwise the same as [CrewService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: CrewUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: CrewUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
