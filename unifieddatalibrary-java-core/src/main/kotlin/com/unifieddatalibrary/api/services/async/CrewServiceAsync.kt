// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CrewFull
import com.unifieddatalibrary.api.models.crew.CrewCountParams
import com.unifieddatalibrary.api.models.crew.CrewCreateParams
import com.unifieddatalibrary.api.models.crew.CrewListPageAsync
import com.unifieddatalibrary.api.models.crew.CrewListParams
import com.unifieddatalibrary.api.models.crew.CrewQueryhelpParams
import com.unifieddatalibrary.api.models.crew.CrewQueryhelpResponse
import com.unifieddatalibrary.api.models.crew.CrewRetrieveParams
import com.unifieddatalibrary.api.models.crew.CrewTupleParams
import com.unifieddatalibrary.api.models.crew.CrewUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.crew.CrewUpdateParams
import com.unifieddatalibrary.api.services.async.CrewServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CrewServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewServiceAsync

    /** Service operation to take a single Crew object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CrewCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CrewCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Crew record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<CrewFull> =
        retrieve(
          id, CrewRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CrewFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none()): CompletableFuture<CrewFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CrewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CrewFull>

    /** @see retrieve */
    fun retrieve(params: CrewRetrieveParams): CompletableFuture<CrewFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CrewFull> =
        retrieve(
          id,
          CrewRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single Crew record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: CrewUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: CrewUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<CrewListPageAsync> = list(CrewListParams.none())

    /** @see list */
    fun list(params: CrewListParams = CrewListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CrewListPageAsync>

    /** @see list */
    fun list(params: CrewListParams = CrewListParams.none()): CompletableFuture<CrewListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CrewListPageAsync> =
        list(
          CrewListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(CrewCountParams.none())

    /** @see count */
    fun count(params: CrewCountParams = CrewCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: CrewCountParams = CrewCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          CrewCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<CrewQueryhelpResponse> = queryhelp(CrewQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CrewQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none()): CompletableFuture<CrewQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<CrewQueryhelpResponse> =
        queryhelp(
          CrewQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CrewTupleParams): CompletableFuture<List<CrewFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CrewTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<CrewFull>>

    /** Service operation to take multiple Crew objects as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: CrewUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: CrewUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [CrewServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/crew`, but is otherwise the same as [CrewServiceAsync.create]. */
        fun create(params: CrewCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: CrewCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/crew/{id}`, but is otherwise the same as [CrewServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CrewFull>> =
            retrieve(
              id, CrewRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CrewFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: CrewRetrieveParams = CrewRetrieveParams.none()): CompletableFuture<HttpResponseFor<CrewFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: CrewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CrewFull>>

        /** @see retrieve */
        fun retrieve(params: CrewRetrieveParams): CompletableFuture<HttpResponseFor<CrewFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CrewFull>> =
            retrieve(
              id,
              CrewRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/crew/{id}`, but is otherwise the same as [CrewServiceAsync.update]. */
        fun update(pathId: String, params: CrewUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: CrewUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: CrewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/crew`, but is otherwise the same as [CrewServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<CrewListPageAsync>> = list(CrewListParams.none())

        /** @see list */
        fun list(params: CrewListParams = CrewListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CrewListPageAsync>>

        /** @see list */
        fun list(params: CrewListParams = CrewListParams.none()): CompletableFuture<HttpResponseFor<CrewListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CrewListPageAsync>> =
            list(
              CrewListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/crew/count`, but is otherwise the same as [CrewServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(CrewCountParams.none())

        /** @see count */
        fun count(params: CrewCountParams = CrewCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: CrewCountParams = CrewCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              CrewCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/crew/queryhelp`, but is otherwise the same as [CrewServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<CrewQueryhelpResponse>> = queryhelp(CrewQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CrewQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: CrewQueryhelpParams = CrewQueryhelpParams.none()): CompletableFuture<HttpResponseFor<CrewQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CrewQueryhelpResponse>> =
            queryhelp(
              CrewQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/crew/tuple`, but is otherwise the same as [CrewServiceAsync.tuple]. */
        fun tuple(params: CrewTupleParams): CompletableFuture<HttpResponseFor<List<CrewFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: CrewTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<CrewFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-crew`, but is otherwise the same as [CrewServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: CrewUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: CrewUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
