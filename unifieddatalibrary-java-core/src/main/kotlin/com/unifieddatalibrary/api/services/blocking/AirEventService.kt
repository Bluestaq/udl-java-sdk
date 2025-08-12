// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.airevents.AirEventCountParams
import com.unifieddatalibrary.api.models.airevents.AirEventCreateBulkParams
import com.unifieddatalibrary.api.models.airevents.AirEventCreateParams
import com.unifieddatalibrary.api.models.airevents.AirEventDeleteParams
import com.unifieddatalibrary.api.models.airevents.AirEventGetParams
import com.unifieddatalibrary.api.models.airevents.AirEventGetResponse
import com.unifieddatalibrary.api.models.airevents.AirEventListPage
import com.unifieddatalibrary.api.models.airevents.AirEventListParams
import com.unifieddatalibrary.api.models.airevents.AirEventQueryhelpParams
import com.unifieddatalibrary.api.models.airevents.AirEventQueryhelpResponse
import com.unifieddatalibrary.api.models.airevents.AirEventTupleParams
import com.unifieddatalibrary.api.models.airevents.AirEventTupleResponse
import com.unifieddatalibrary.api.models.airevents.AirEventUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airevents.AirEventUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirEventService
import java.util.function.Consumer

interface AirEventService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirEventService

    /** Service operation to take a single airevent object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirEventCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirEventCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single airevent record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirEventUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirEventUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AirEventListPage = list(AirEventListParams.none())

    /** @see list */
    fun list(params: AirEventListParams = AirEventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirEventListPage

    /** @see list */
    fun list(params: AirEventListParams = AirEventListParams.none()): AirEventListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AirEventListPage =
        list(
          AirEventListParams.none(), requestOptions
        )

    /** Service operation to delete an airevent record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, AirEventDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirEventDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AirEventDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          AirEventDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AirEventCountParams.none())

    /** @see count */
    fun count(params: AirEventCountParams = AirEventCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AirEventCountParams = AirEventCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AirEventCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list ofService operation intended for initial integration only, to take a list of airevent records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: AirEventCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: AirEventCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single airevent record by its unique ID passed as a path parameter. */
    fun get(id: String): AirEventGetResponse =
        get(
          id, AirEventGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: AirEventGetParams = AirEventGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirEventGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: AirEventGetParams = AirEventGetParams.none()): AirEventGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: AirEventGetParams, requestOptions: RequestOptions = RequestOptions.none()): AirEventGetResponse

    /** @see get */
    fun get(params: AirEventGetParams): AirEventGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): AirEventGetResponse =
        get(
          id,
          AirEventGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): AirEventQueryhelpResponse = queryhelp(AirEventQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirEventQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none()): AirEventQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirEventQueryhelpResponse =
        queryhelp(
          AirEventQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirEventTupleParams): List<AirEventTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirEventTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirEventTupleResponse>

    /** Service operation to take multiple airevent records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AirEventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirEventService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airevent`, but is otherwise the same as [AirEventService.create]. */
        @MustBeClosed
        fun create(params: AirEventCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirEventCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/airevent/{id}`, but is otherwise the same as [AirEventService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: AirEventUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirEventUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airevent`, but is otherwise the same as [AirEventService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AirEventListPage> = list(AirEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AirEventListParams = AirEventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirEventListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AirEventListParams = AirEventListParams.none()): HttpResponseFor<AirEventListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AirEventListPage> =
            list(
              AirEventListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/airevent/{id}`, but is otherwise the same as [AirEventService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, AirEventDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirEventDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirEventDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              AirEventDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airevent/count`, but is otherwise the same as [AirEventService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AirEventCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AirEventCountParams = AirEventCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AirEventCountParams = AirEventCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AirEventCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/airevent/createBulk`, but is otherwise the same as [AirEventService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: AirEventCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: AirEventCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airevent/{id}`, but is otherwise the same as [AirEventService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<AirEventGetResponse> =
            get(
              id, AirEventGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: AirEventGetParams = AirEventGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirEventGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: AirEventGetParams = AirEventGetParams.none()): HttpResponseFor<AirEventGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: AirEventGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirEventGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: AirEventGetParams): HttpResponseFor<AirEventGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<AirEventGetResponse> =
            get(
              id,
              AirEventGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airevent/queryhelp`, but is otherwise the same as [AirEventService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirEventQueryhelpResponse> = queryhelp(AirEventQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirEventQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none()): HttpResponseFor<AirEventQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<AirEventQueryhelpResponse> =
            queryhelp(
              AirEventQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airevent/tuple`, but is otherwise the same as [AirEventService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirEventTupleParams): HttpResponseFor<List<AirEventTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirEventTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirEventTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-airevent`, but is otherwise the same as [AirEventService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
