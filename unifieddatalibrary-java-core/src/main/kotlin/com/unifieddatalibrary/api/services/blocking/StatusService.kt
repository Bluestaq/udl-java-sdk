// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.StatusFull
import com.unifieddatalibrary.api.models.status.StatusCountParams
import com.unifieddatalibrary.api.models.status.StatusCreateParams
import com.unifieddatalibrary.api.models.status.StatusDeleteParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityIdParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityTypeParams
import com.unifieddatalibrary.api.models.status.StatusGetParams
import com.unifieddatalibrary.api.models.status.StatusListPage
import com.unifieddatalibrary.api.models.status.StatusListParams
import com.unifieddatalibrary.api.models.status.StatusQueryhelpParams
import com.unifieddatalibrary.api.models.status.StatusQueryhelpResponse
import com.unifieddatalibrary.api.models.status.StatusTupleParams
import com.unifieddatalibrary.api.models.status.StatusUpdateParams
import com.unifieddatalibrary.api.services.blocking.StatusService
import java.util.function.Consumer

interface StatusService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService

    /** Service operation to take a single Status as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: StatusCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: StatusCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single Status. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: StatusUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: StatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: StatusUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: StatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): StatusListPage = list(StatusListParams.none())

    /** @see list */
    fun list(params: StatusListParams = StatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StatusListPage

    /** @see list */
    fun list(params: StatusListParams = StatusListParams.none()): StatusListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): StatusListPage =
        list(
          StatusListParams.none(), requestOptions
        )

    /** Service operation to delete a Status object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, StatusDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: StatusDeleteParams = StatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: StatusDeleteParams = StatusDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: StatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: StatusDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          StatusDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(StatusCountParams.none())

    /** @see count */
    fun count(params: StatusCountParams = StatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: StatusCountParams = StatusCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          StatusCountParams.none(), requestOptions
        )

    /** Service operation to get a single Status record by its unique ID passed as a path parameter. */
    fun get(id: String): StatusFull =
        get(
          id, StatusGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: StatusGetParams = StatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StatusFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: StatusGetParams = StatusGetParams.none()): StatusFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: StatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): StatusFull

    /** @see get */
    fun get(params: StatusGetParams): StatusFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): StatusFull =
        get(
          id,
          StatusGetParams.none(),
          requestOptions,
        )

    /** Service operation to get all statuses related to a particular entity. */
    fun getByEntityId(idEntity: String): List<StatusFull> =
        getByEntityId(
          idEntity, StatusGetByEntityIdParams.none()
        )

    /** @see getByEntityId */
    fun getByEntityId(idEntity: String, params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<StatusFull> =
        getByEntityId(
          params.toBuilder()
              .idEntity(idEntity)
              .build(), requestOptions
        )

    /** @see getByEntityId */
    fun getByEntityId(idEntity: String, params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none()): List<StatusFull> =
        getByEntityId(
          idEntity,
          params,
          RequestOptions.none(),
        )

    /** @see getByEntityId */
    fun getByEntityId(params: StatusGetByEntityIdParams, requestOptions: RequestOptions = RequestOptions.none()): List<StatusFull>

    /** @see getByEntityId */
    fun getByEntityId(params: StatusGetByEntityIdParams): List<StatusFull> =
        getByEntityId(
          params, RequestOptions.none()
        )

    /** @see getByEntityId */
    fun getByEntityId(idEntity: String, requestOptions: RequestOptions): List<StatusFull> =
        getByEntityId(
          idEntity,
          StatusGetByEntityIdParams.none(),
          requestOptions,
        )

    /** Service operation to get all statuses related to a particular entity type. */
    fun getByEntityType(entityType: String): List<StatusFull> =
        getByEntityType(
          entityType, StatusGetByEntityTypeParams.none()
        )

    /** @see getByEntityType */
    fun getByEntityType(entityType: String, params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<StatusFull> =
        getByEntityType(
          params.toBuilder()
              .entityType(entityType)
              .build(), requestOptions
        )

    /** @see getByEntityType */
    fun getByEntityType(entityType: String, params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none()): List<StatusFull> =
        getByEntityType(
          entityType,
          params,
          RequestOptions.none(),
        )

    /** @see getByEntityType */
    fun getByEntityType(params: StatusGetByEntityTypeParams, requestOptions: RequestOptions = RequestOptions.none()): List<StatusFull>

    /** @see getByEntityType */
    fun getByEntityType(params: StatusGetByEntityTypeParams): List<StatusFull> =
        getByEntityType(
          params, RequestOptions.none()
        )

    /** @see getByEntityType */
    fun getByEntityType(entityType: String, requestOptions: RequestOptions): List<StatusFull> =
        getByEntityType(
          entityType,
          StatusGetByEntityTypeParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): StatusQueryhelpResponse = queryhelp(StatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: StatusQueryhelpParams = StatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): StatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: StatusQueryhelpParams = StatusQueryhelpParams.none()): StatusQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): StatusQueryhelpResponse =
        queryhelp(
          StatusQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: StatusTupleParams): List<StatusFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: StatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<StatusFull>

    /** A view of [StatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/status`, but is otherwise the same as [StatusService.create]. */
        @MustBeClosed
        fun create(params: StatusCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: StatusCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/status/{id}`, but is otherwise the same as [StatusService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: StatusUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: StatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: StatusUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: StatusUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/status`, but is otherwise the same as [StatusService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<StatusListPage> = list(StatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: StatusListParams = StatusListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: StatusListParams = StatusListParams.none()): HttpResponseFor<StatusListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StatusListPage> =
            list(
              StatusListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/status/{id}`, but is otherwise the same as [StatusService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, StatusDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: StatusDeleteParams = StatusDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: StatusDeleteParams = StatusDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: StatusDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: StatusDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              StatusDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/status/count`, but is otherwise the same as [StatusService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(StatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: StatusCountParams = StatusCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: StatusCountParams = StatusCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              StatusCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/status/{id}`, but is otherwise the same as [StatusService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<StatusFull> =
            get(
              id, StatusGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: StatusGetParams = StatusGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StatusFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: StatusGetParams = StatusGetParams.none()): HttpResponseFor<StatusFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: StatusGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StatusFull>

        /** @see get */
        @MustBeClosed
        fun get(params: StatusGetParams): HttpResponseFor<StatusFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<StatusFull> =
            get(
              id,
              StatusGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/status/byIdEntity/{idEntity}`, but is otherwise the same as [StatusService.getByEntityId]. */
        @MustBeClosed
        fun getByEntityId(idEntity: String): HttpResponseFor<List<StatusFull>> =
            getByEntityId(
              idEntity, StatusGetByEntityIdParams.none()
            )

        /** @see getByEntityId */
        @MustBeClosed
        fun getByEntityId(idEntity: String, params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StatusFull>> =
            getByEntityId(
              params.toBuilder()
                  .idEntity(idEntity)
                  .build(), requestOptions
            )

        /** @see getByEntityId */
        @MustBeClosed
        fun getByEntityId(idEntity: String, params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none()): HttpResponseFor<List<StatusFull>> =
            getByEntityId(
              idEntity,
              params,
              RequestOptions.none(),
            )

        /** @see getByEntityId */
        @MustBeClosed
        fun getByEntityId(params: StatusGetByEntityIdParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StatusFull>>

        /** @see getByEntityId */
        @MustBeClosed
        fun getByEntityId(params: StatusGetByEntityIdParams): HttpResponseFor<List<StatusFull>> =
            getByEntityId(
              params, RequestOptions.none()
            )

        /** @see getByEntityId */
        @MustBeClosed
        fun getByEntityId(idEntity: String, requestOptions: RequestOptions): HttpResponseFor<List<StatusFull>> =
            getByEntityId(
              idEntity,
              StatusGetByEntityIdParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/status/byEntityType/{entityType}`, but is otherwise the same as [StatusService.getByEntityType]. */
        @MustBeClosed
        fun getByEntityType(entityType: String): HttpResponseFor<List<StatusFull>> =
            getByEntityType(
              entityType, StatusGetByEntityTypeParams.none()
            )

        /** @see getByEntityType */
        @MustBeClosed
        fun getByEntityType(entityType: String, params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StatusFull>> =
            getByEntityType(
              params.toBuilder()
                  .entityType(entityType)
                  .build(), requestOptions
            )

        /** @see getByEntityType */
        @MustBeClosed
        fun getByEntityType(entityType: String, params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none()): HttpResponseFor<List<StatusFull>> =
            getByEntityType(
              entityType,
              params,
              RequestOptions.none(),
            )

        /** @see getByEntityType */
        @MustBeClosed
        fun getByEntityType(params: StatusGetByEntityTypeParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StatusFull>>

        /** @see getByEntityType */
        @MustBeClosed
        fun getByEntityType(params: StatusGetByEntityTypeParams): HttpResponseFor<List<StatusFull>> =
            getByEntityType(
              params, RequestOptions.none()
            )

        /** @see getByEntityType */
        @MustBeClosed
        fun getByEntityType(entityType: String, requestOptions: RequestOptions): HttpResponseFor<List<StatusFull>> =
            getByEntityType(
              entityType,
              StatusGetByEntityTypeParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/status/queryhelp`, but is otherwise the same as [StatusService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<StatusQueryhelpResponse> = queryhelp(StatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: StatusQueryhelpParams = StatusQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: StatusQueryhelpParams = StatusQueryhelpParams.none()): HttpResponseFor<StatusQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<StatusQueryhelpResponse> =
            queryhelp(
              StatusQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/status/tuple`, but is otherwise the same as [StatusService.tuple]. */
        @MustBeClosed
        fun tuple(params: StatusTupleParams): HttpResponseFor<List<StatusFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: StatusTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<StatusFull>>
    }
}
