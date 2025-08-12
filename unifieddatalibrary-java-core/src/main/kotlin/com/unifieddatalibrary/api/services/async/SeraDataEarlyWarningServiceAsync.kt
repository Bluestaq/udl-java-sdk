// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCountParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCreateParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningDeleteParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListPageAsync
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningQueryhelpParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningUpdateParams
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeraDataEarlyWarningServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataEarlyWarningServiceAsync

    /** Service operation to take a single SeradataEarlyWarning as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SeraDataEarlyWarningCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SeraDataEarlyWarningCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update an SeradataEarlyWarning. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SeraDataEarlyWarningUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SeraDataEarlyWarningListPageAsync> = list(SeraDataEarlyWarningListParams.none())

    /** @see list */
    fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataEarlyWarningListPageAsync>

    /** @see list */
    fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none()): CompletableFuture<SeraDataEarlyWarningListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SeraDataEarlyWarningListPageAsync> =
        list(
          SeraDataEarlyWarningListParams.none(), requestOptions
        )

    /** Service operation to delete an SeradataEarlyWarning specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SeraDataEarlyWarningDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SeraDataEarlyWarningDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeraDataEarlyWarningDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SeraDataEarlyWarningDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SeraDataEarlyWarningCountParams.none())

    /** @see count */
    fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SeraDataEarlyWarningCountParams.none(), requestOptions
        )

    /** Service operation to get a single SeradataEarlyWarning by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SeraDataEarlyWarningGetResponse> =
        get(
          id, SeraDataEarlyWarningGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataEarlyWarningGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none()): CompletableFuture<SeraDataEarlyWarningGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SeraDataEarlyWarningGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataEarlyWarningGetResponse>

    /** @see get */
    fun get(params: SeraDataEarlyWarningGetParams): CompletableFuture<SeraDataEarlyWarningGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SeraDataEarlyWarningGetResponse> =
        get(
          id,
          SeraDataEarlyWarningGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SeraDataEarlyWarningQueryhelpResponse> = queryhelp(SeraDataEarlyWarningQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataEarlyWarningQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none()): CompletableFuture<SeraDataEarlyWarningQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SeraDataEarlyWarningQueryhelpResponse> =
        queryhelp(
          SeraDataEarlyWarningQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SeraDataEarlyWarningTupleParams): CompletableFuture<List<SeraDataEarlyWarningTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SeraDataEarlyWarningTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SeraDataEarlyWarningTupleResponse>>

    /** A view of [SeraDataEarlyWarningServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataEarlyWarningServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/seradataearlywarning`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.create]. */
        fun create(params: SeraDataEarlyWarningCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SeraDataEarlyWarningCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/seradataearlywarning/{id}`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.update]. */
        fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SeraDataEarlyWarningUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningListPageAsync>> = list(SeraDataEarlyWarningListParams.none())

        /** @see list */
        fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningListPageAsync>>

        /** @see list */
        fun list(params: SeraDataEarlyWarningListParams = SeraDataEarlyWarningListParams.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningListPageAsync>> =
            list(
              SeraDataEarlyWarningListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/seradataearlywarning/{id}`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SeraDataEarlyWarningDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SeraDataEarlyWarningDeleteParams = SeraDataEarlyWarningDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SeraDataEarlyWarningDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeraDataEarlyWarningDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SeraDataEarlyWarningDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/count`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SeraDataEarlyWarningCountParams.none())

        /** @see count */
        fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SeraDataEarlyWarningCountParams = SeraDataEarlyWarningCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SeraDataEarlyWarningCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/{id}`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningGetResponse>> =
            get(
              id, SeraDataEarlyWarningGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SeraDataEarlyWarningGetParams = SeraDataEarlyWarningGetParams.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SeraDataEarlyWarningGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningGetResponse>>

        /** @see get */
        fun get(params: SeraDataEarlyWarningGetParams): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningGetResponse>> =
            get(
              id,
              SeraDataEarlyWarningGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/queryhelp`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse>> = queryhelp(SeraDataEarlyWarningQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams = SeraDataEarlyWarningQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse>> =
            queryhelp(
              SeraDataEarlyWarningQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradataearlywarning/tuple`, but is otherwise the same as [SeraDataEarlyWarningServiceAsync.tuple]. */
        fun tuple(params: SeraDataEarlyWarningTupleParams): CompletableFuture<HttpResponseFor<List<SeraDataEarlyWarningTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SeraDataEarlyWarningTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SeraDataEarlyWarningTupleResponse>>>
    }
}
