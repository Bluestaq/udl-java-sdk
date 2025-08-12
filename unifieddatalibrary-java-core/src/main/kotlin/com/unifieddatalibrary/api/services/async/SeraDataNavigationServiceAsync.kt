// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCountParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCreateParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationDeleteParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListPageAsync
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SeraDataNavigationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataNavigationServiceAsync

    /** Service operation to take a single SeradataNavigation as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: SeraDataNavigationCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SeraDataNavigationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update an SeradataNavigation. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: SeraDataNavigationUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: SeraDataNavigationUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<SeraDataNavigationListPageAsync> = list(SeraDataNavigationListParams.none())

    /** @see list */
    fun list(params: SeraDataNavigationListParams = SeraDataNavigationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataNavigationListPageAsync>

    /** @see list */
    fun list(params: SeraDataNavigationListParams = SeraDataNavigationListParams.none()): CompletableFuture<SeraDataNavigationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SeraDataNavigationListPageAsync> =
        list(
          SeraDataNavigationListParams.none(), requestOptions
        )

    /** Service operation to delete an SeradataNavigation specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, SeraDataNavigationDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: SeraDataNavigationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SeraDataNavigationDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          SeraDataNavigationDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(SeraDataNavigationCountParams.none())

    /** @see count */
    fun count(params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          SeraDataNavigationCountParams.none(), requestOptions
        )

    /** Service operation to get a single SeradataNavigation by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SeraDataNavigationGetResponse> =
        get(
          id, SeraDataNavigationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataNavigationGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none()): CompletableFuture<SeraDataNavigationGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SeraDataNavigationGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataNavigationGetResponse>

    /** @see get */
    fun get(params: SeraDataNavigationGetParams): CompletableFuture<SeraDataNavigationGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SeraDataNavigationGetResponse> =
        get(
          id,
          SeraDataNavigationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SeraDataNavigationQueryhelpResponse> = queryhelp(SeraDataNavigationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SeraDataNavigationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none()): CompletableFuture<SeraDataNavigationQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SeraDataNavigationQueryhelpResponse> =
        queryhelp(
          SeraDataNavigationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SeraDataNavigationTupleParams): CompletableFuture<List<SeraDataNavigationTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SeraDataNavigationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SeraDataNavigationTupleResponse>>

    /** A view of [SeraDataNavigationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataNavigationServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/seradatanavigation`, but is otherwise the same as [SeraDataNavigationServiceAsync.create]. */
        fun create(params: SeraDataNavigationCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SeraDataNavigationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/seradatanavigation/{id}`, but is otherwise the same as [SeraDataNavigationServiceAsync.update]. */
        fun update(pathId: String, params: SeraDataNavigationUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: SeraDataNavigationUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/seradatanavigation`, but is otherwise the same as [SeraDataNavigationServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<SeraDataNavigationListPageAsync>> = list(SeraDataNavigationListParams.none())

        /** @see list */
        fun list(params: SeraDataNavigationListParams = SeraDataNavigationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationListPageAsync>>

        /** @see list */
        fun list(params: SeraDataNavigationListParams = SeraDataNavigationListParams.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataNavigationListPageAsync>> =
            list(
              SeraDataNavigationListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/seradatanavigation/{id}`, but is otherwise the same as [SeraDataNavigationServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, SeraDataNavigationDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: SeraDataNavigationDeleteParams = SeraDataNavigationDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: SeraDataNavigationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SeraDataNavigationDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              SeraDataNavigationDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradatanavigation/count`, but is otherwise the same as [SeraDataNavigationServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SeraDataNavigationCountParams.none())

        /** @see count */
        fun count(params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: SeraDataNavigationCountParams = SeraDataNavigationCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              SeraDataNavigationCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradatanavigation/{id}`, but is otherwise the same as [SeraDataNavigationServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>> =
            get(
              id, SeraDataNavigationGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SeraDataNavigationGetParams = SeraDataNavigationGetParams.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SeraDataNavigationGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>>

        /** @see get */
        fun get(params: SeraDataNavigationGetParams): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>> =
            get(
              id,
              SeraDataNavigationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/seradatanavigation/queryhelp`, but is otherwise the same as [SeraDataNavigationServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SeraDataNavigationQueryhelpResponse>> = queryhelp(SeraDataNavigationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SeraDataNavigationQueryhelpParams = SeraDataNavigationQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SeraDataNavigationQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataNavigationQueryhelpResponse>> =
            queryhelp(
              SeraDataNavigationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/seradatanavigation/tuple`, but is otherwise the same as [SeraDataNavigationServiceAsync.tuple]. */
        fun tuple(params: SeraDataNavigationTupleParams): CompletableFuture<HttpResponseFor<List<SeraDataNavigationTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SeraDataNavigationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SeraDataNavigationTupleResponse>>>
    }
}
