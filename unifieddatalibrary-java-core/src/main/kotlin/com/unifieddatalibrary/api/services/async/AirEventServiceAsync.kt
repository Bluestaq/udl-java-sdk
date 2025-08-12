// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.models.airevents.AirEventListPageAsync
import com.unifieddatalibrary.api.models.airevents.AirEventListParams
import com.unifieddatalibrary.api.models.airevents.AirEventQueryhelpParams
import com.unifieddatalibrary.api.models.airevents.AirEventQueryhelpResponse
import com.unifieddatalibrary.api.models.airevents.AirEventTupleParams
import com.unifieddatalibrary.api.models.airevents.AirEventTupleResponse
import com.unifieddatalibrary.api.models.airevents.AirEventUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airevents.AirEventUpdateParams
import com.unifieddatalibrary.api.services.async.AirEventServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirEventServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirEventServiceAsync

    /** Service operation to take a single airevent object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirEventCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirEventCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single airevent record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: AirEventUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: AirEventUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<AirEventListPageAsync> = list(AirEventListParams.none())

    /** @see list */
    fun list(params: AirEventListParams = AirEventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirEventListPageAsync>

    /** @see list */
    fun list(params: AirEventListParams = AirEventListParams.none()): CompletableFuture<AirEventListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AirEventListPageAsync> =
        list(
          AirEventListParams.none(), requestOptions
        )

    /** Service operation to delete an airevent record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, AirEventDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: AirEventDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AirEventDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          AirEventDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(AirEventCountParams.none())

    /** @see count */
    fun count(params: AirEventCountParams = AirEventCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: AirEventCountParams = AirEventCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          AirEventCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list ofService operation intended for initial integration only, to take a list of airevent records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: AirEventCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: AirEventCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single airevent record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<AirEventGetResponse> =
        get(
          id, AirEventGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: AirEventGetParams = AirEventGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirEventGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: AirEventGetParams = AirEventGetParams.none()): CompletableFuture<AirEventGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: AirEventGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirEventGetResponse>

    /** @see get */
    fun get(params: AirEventGetParams): CompletableFuture<AirEventGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<AirEventGetResponse> =
        get(
          id,
          AirEventGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<AirEventQueryhelpResponse> = queryhelp(AirEventQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AirEventQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none()): CompletableFuture<AirEventQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<AirEventQueryhelpResponse> =
        queryhelp(
          AirEventQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirEventTupleParams): CompletableFuture<List<AirEventTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirEventTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<AirEventTupleResponse>>

    /** Service operation to take multiple airevent records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [AirEventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirEventServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airevent`, but is otherwise the same as [AirEventServiceAsync.create]. */
        fun create(params: AirEventCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: AirEventCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/airevent/{id}`, but is otherwise the same as [AirEventServiceAsync.update]. */
        fun update(pathId: String, params: AirEventUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: AirEventUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: AirEventUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airevent`, but is otherwise the same as [AirEventServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<AirEventListPageAsync>> = list(AirEventListParams.none())

        /** @see list */
        fun list(params: AirEventListParams = AirEventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirEventListPageAsync>>

        /** @see list */
        fun list(params: AirEventListParams = AirEventListParams.none()): CompletableFuture<HttpResponseFor<AirEventListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirEventListPageAsync>> =
            list(
              AirEventListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/airevent/{id}`, but is otherwise the same as [AirEventServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, AirEventDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: AirEventDeleteParams = AirEventDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: AirEventDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AirEventDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              AirEventDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airevent/count`, but is otherwise the same as [AirEventServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(AirEventCountParams.none())

        /** @see count */
        fun count(params: AirEventCountParams = AirEventCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: AirEventCountParams = AirEventCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              AirEventCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/airevent/createBulk`, but is otherwise the same as [AirEventServiceAsync.createBulk]. */
        fun createBulk(params: AirEventCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: AirEventCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/airevent/{id}`, but is otherwise the same as [AirEventServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<AirEventGetResponse>> =
            get(
              id, AirEventGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: AirEventGetParams = AirEventGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirEventGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: AirEventGetParams = AirEventGetParams.none()): CompletableFuture<HttpResponseFor<AirEventGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: AirEventGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirEventGetResponse>>

        /** @see get */
        fun get(params: AirEventGetParams): CompletableFuture<HttpResponseFor<AirEventGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirEventGetResponse>> =
            get(
              id,
              AirEventGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airevent/queryhelp`, but is otherwise the same as [AirEventServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AirEventQueryhelpResponse>> = queryhelp(AirEventQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AirEventQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: AirEventQueryhelpParams = AirEventQueryhelpParams.none()): CompletableFuture<HttpResponseFor<AirEventQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirEventQueryhelpResponse>> =
            queryhelp(
              AirEventQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airevent/tuple`, but is otherwise the same as [AirEventServiceAsync.tuple]. */
        fun tuple(params: AirEventTupleParams): CompletableFuture<HttpResponseFor<List<AirEventTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: AirEventTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<AirEventTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-airevent`, but is otherwise the same as [AirEventServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
