// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.transponder.TransponderCountParams
import com.unifieddatalibrary.api.models.transponder.TransponderCreateParams
import com.unifieddatalibrary.api.models.transponder.TransponderDeleteParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetResponse
import com.unifieddatalibrary.api.models.transponder.TransponderListPageAsync
import com.unifieddatalibrary.api.models.transponder.TransponderListParams
import com.unifieddatalibrary.api.models.transponder.TransponderQueryhelpParams
import com.unifieddatalibrary.api.models.transponder.TransponderQueryhelpResponse
import com.unifieddatalibrary.api.models.transponder.TransponderTupleParams
import com.unifieddatalibrary.api.models.transponder.TransponderTupleResponse
import com.unifieddatalibrary.api.models.transponder.TransponderUpdateParams
import com.unifieddatalibrary.api.services.async.TransponderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransponderServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransponderServiceAsync

    /** Service operation to take a single Transponder as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A Comm payload may have multiple transponders and a transponder may have many channels. */
    fun create(params: TransponderCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: TransponderCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single Transponder. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A Comm payload may have multiple transponders and a transponder may have many channels. */
    fun update(pathId: String, params: TransponderUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: TransponderUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: TransponderUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: TransponderUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<TransponderListPageAsync> = list(TransponderListParams.none())

    /** @see list */
    fun list(params: TransponderListParams = TransponderListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TransponderListPageAsync>

    /** @see list */
    fun list(params: TransponderListParams = TransponderListParams.none()): CompletableFuture<TransponderListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransponderListPageAsync> =
        list(
          TransponderListParams.none(), requestOptions
        )

    /** Service operation to delete a Transponder object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. A Comm payload may have multiple transponders and a transponder may have many channels. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, TransponderDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: TransponderDeleteParams = TransponderDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: TransponderDeleteParams = TransponderDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: TransponderDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TransponderDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          TransponderDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(TransponderCountParams.none())

    /** @see count */
    fun count(params: TransponderCountParams = TransponderCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: TransponderCountParams = TransponderCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          TransponderCountParams.none(), requestOptions
        )

    /** Service operation to get a single Transponder record by its unique ID passed as a path parameter. A Comm payload may have multiple transponders and a transponder may have many channels. */
    fun get(id: String): CompletableFuture<TransponderGetResponse> =
        get(
          id, TransponderGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: TransponderGetParams = TransponderGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TransponderGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: TransponderGetParams = TransponderGetParams.none()): CompletableFuture<TransponderGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: TransponderGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TransponderGetResponse>

    /** @see get */
    fun get(params: TransponderGetParams): CompletableFuture<TransponderGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<TransponderGetResponse> =
        get(
          id,
          TransponderGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<TransponderQueryhelpResponse> = queryhelp(TransponderQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: TransponderQueryhelpParams = TransponderQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TransponderQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: TransponderQueryhelpParams = TransponderQueryhelpParams.none()): CompletableFuture<TransponderQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<TransponderQueryhelpResponse> =
        queryhelp(
          TransponderQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: TransponderTupleParams): CompletableFuture<List<TransponderTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: TransponderTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<TransponderTupleResponse>>

    /** A view of [TransponderServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransponderServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/transponder`, but is otherwise the same as [TransponderServiceAsync.create]. */
        fun create(params: TransponderCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: TransponderCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/transponder/{id}`, but is otherwise the same as [TransponderServiceAsync.update]. */
        fun update(pathId: String, params: TransponderUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: TransponderUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: TransponderUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: TransponderUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/transponder`, but is otherwise the same as [TransponderServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<TransponderListPageAsync>> = list(TransponderListParams.none())

        /** @see list */
        fun list(params: TransponderListParams = TransponderListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TransponderListPageAsync>>

        /** @see list */
        fun list(params: TransponderListParams = TransponderListParams.none()): CompletableFuture<HttpResponseFor<TransponderListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TransponderListPageAsync>> =
            list(
              TransponderListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/transponder/{id}`, but is otherwise the same as [TransponderServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, TransponderDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: TransponderDeleteParams = TransponderDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: TransponderDeleteParams = TransponderDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: TransponderDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TransponderDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              TransponderDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/transponder/count`, but is otherwise the same as [TransponderServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(TransponderCountParams.none())

        /** @see count */
        fun count(params: TransponderCountParams = TransponderCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: TransponderCountParams = TransponderCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              TransponderCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/transponder/{id}`, but is otherwise the same as [TransponderServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<TransponderGetResponse>> =
            get(
              id, TransponderGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: TransponderGetParams = TransponderGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TransponderGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: TransponderGetParams = TransponderGetParams.none()): CompletableFuture<HttpResponseFor<TransponderGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: TransponderGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TransponderGetResponse>>

        /** @see get */
        fun get(params: TransponderGetParams): CompletableFuture<HttpResponseFor<TransponderGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TransponderGetResponse>> =
            get(
              id,
              TransponderGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/transponder/queryhelp`, but is otherwise the same as [TransponderServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<TransponderQueryhelpResponse>> = queryhelp(TransponderQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: TransponderQueryhelpParams = TransponderQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TransponderQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: TransponderQueryhelpParams = TransponderQueryhelpParams.none()): CompletableFuture<HttpResponseFor<TransponderQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TransponderQueryhelpResponse>> =
            queryhelp(
              TransponderQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/transponder/tuple`, but is otherwise the same as [TransponderServiceAsync.tuple]. */
        fun tuple(params: TransponderTupleParams): CompletableFuture<HttpResponseFor<List<TransponderTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: TransponderTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<TransponderTupleResponse>>>
    }
}
