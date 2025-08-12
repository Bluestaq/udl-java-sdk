// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCountParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCreateParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListPageAsync
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadUpdateParams
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeradataSigintPayloadServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSigintPayloadServiceAsync

    /** Service operation to take a single SeradataSigIntPayload as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SeradataSigintPayloadCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SeradataSigintPayloadCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update an SeradataSigIntPayload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SeradataSigintPayloadUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SeradataSigintPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SeradataSigintPayloadUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SeradataSigintPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SeradataSigintPayloadListPageAsync> = list(SeradataSigintPayloadListParams.none())

    /** @see list */
    fun list(params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeradataSigintPayloadListPageAsync>

    /** @see list */
    fun list(params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none()): CompletableFuture<SeradataSigintPayloadListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SeradataSigintPayloadListPageAsync> =
        list(
          SeradataSigintPayloadListParams.none(), requestOptions
        )

    /** Service operation to delete an SeradataSigIntPayload specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SeradataSigintPayloadDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SeradataSigintPayloadDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeradataSigintPayloadDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SeradataSigintPayloadDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SeradataSigintPayloadCountParams.none())

    /** @see count */
    fun count(params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SeradataSigintPayloadCountParams.none(), requestOptions
        )

    /** Service operation to get a single SeradataSigIntPayload by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SeradataSigintPayloadGetResponse> =
        get(
          id, SeradataSigintPayloadGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeradataSigintPayloadGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none()): CompletableFuture<SeradataSigintPayloadGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SeradataSigintPayloadGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeradataSigintPayloadGetResponse>

    /** @see get */
    fun get(params: SeradataSigintPayloadGetParams): CompletableFuture<SeradataSigintPayloadGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SeradataSigintPayloadGetResponse> =
        get(
          id,
          SeradataSigintPayloadGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SeradataSigintPayloadQueryhelpResponse> = queryhelp(SeradataSigintPayloadQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SeradataSigintPayloadQueryhelpParams = SeradataSigintPayloadQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeradataSigintPayloadQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SeradataSigintPayloadQueryhelpParams = SeradataSigintPayloadQueryhelpParams.none()): CompletableFuture<SeradataSigintPayloadQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SeradataSigintPayloadQueryhelpResponse> =
        queryhelp(
          SeradataSigintPayloadQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SeradataSigintPayloadTupleParams): CompletableFuture<List<SeradataSigintPayloadTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SeradataSigintPayloadTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SeradataSigintPayloadTupleResponse>>

    /** A view of [SeradataSigintPayloadServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSigintPayloadServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/seradatasigintpayload`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.create]. */
        fun create(params: SeradataSigintPayloadCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SeradataSigintPayloadCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/seradatasigintpayload/{id}`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.update]. */
        fun update(pathId: String, params: SeradataSigintPayloadUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SeradataSigintPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SeradataSigintPayloadUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SeradataSigintPayloadUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/seradatasigintpayload`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SeradataSigintPayloadListPageAsync>> = list(SeradataSigintPayloadListParams.none())

        /** @see list */
        fun list(params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadListPageAsync>>

        /** @see list */
        fun list(params: SeradataSigintPayloadListParams = SeradataSigintPayloadListParams.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeradataSigintPayloadListPageAsync>> =
            list(
              SeradataSigintPayloadListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/seradatasigintpayload/{id}`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SeradataSigintPayloadDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SeradataSigintPayloadDeleteParams = SeradataSigintPayloadDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SeradataSigintPayloadDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeradataSigintPayloadDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SeradataSigintPayloadDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradatasigintpayload/count`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SeradataSigintPayloadCountParams.none())

        /** @see count */
        fun count(params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SeradataSigintPayloadCountParams = SeradataSigintPayloadCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SeradataSigintPayloadCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradatasigintpayload/{id}`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>> =
            get(
              id, SeradataSigintPayloadGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SeradataSigintPayloadGetParams = SeradataSigintPayloadGetParams.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SeradataSigintPayloadGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>>

        /** @see get */
        fun get(params: SeradataSigintPayloadGetParams): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>> =
            get(
              id,
              SeradataSigintPayloadGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradatasigintpayload/queryhelp`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SeradataSigintPayloadQueryhelpResponse>> = queryhelp(SeradataSigintPayloadQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SeradataSigintPayloadQueryhelpParams = SeradataSigintPayloadQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SeradataSigintPayloadQueryhelpParams = SeradataSigintPayloadQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SeradataSigintPayloadQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeradataSigintPayloadQueryhelpResponse>> =
            queryhelp(
              SeradataSigintPayloadQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradatasigintpayload/tuple`, but is otherwise the same as [SeradataSigintPayloadServiceAsync.tuple]. */
        fun tuple(params: SeradataSigintPayloadTupleParams): CompletableFuture<HttpResponseFor<List<SeradataSigintPayloadTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SeradataSigintPayloadTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SeradataSigintPayloadTupleResponse>>>
    }
}
