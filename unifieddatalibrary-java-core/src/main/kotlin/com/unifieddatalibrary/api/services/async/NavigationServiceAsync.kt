// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.navigation.NavigationCountParams
import com.unifieddatalibrary.api.models.navigation.NavigationCreateParams
import com.unifieddatalibrary.api.models.navigation.NavigationDeleteParams
import com.unifieddatalibrary.api.models.navigation.NavigationGetParams
import com.unifieddatalibrary.api.models.navigation.NavigationGetResponse
import com.unifieddatalibrary.api.models.navigation.NavigationListPageAsync
import com.unifieddatalibrary.api.models.navigation.NavigationListParams
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpParams
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.navigation.NavigationTupleParams
import com.unifieddatalibrary.api.models.navigation.NavigationTupleResponse
import com.unifieddatalibrary.api.models.navigation.NavigationUpdateParams
import com.unifieddatalibrary.api.services.async.NavigationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NavigationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationServiceAsync

    /** Service operation to take a single Navigation as a POST body and ingest into the database. A Navigation is an on-orbit navigation payload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: NavigationCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: NavigationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single Navigation. An Navigation is an on-orbit navigation payload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: NavigationUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: NavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: NavigationUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: NavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<NavigationListPageAsync> = list(NavigationListParams.none())

    /** @see list */
    fun list(params: NavigationListParams = NavigationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<NavigationListPageAsync>

    /** @see list */
    fun list(params: NavigationListParams = NavigationListParams.none()): CompletableFuture<NavigationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NavigationListPageAsync> =
        list(
          NavigationListParams.none(), requestOptions
        )

    /** Service operation to delete a Navigation object specified by the passed ID path parameter. An Navigation is an on-orbit navigation payload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, NavigationDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: NavigationDeleteParams = NavigationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: NavigationDeleteParams = NavigationDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: NavigationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NavigationDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          NavigationDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(NavigationCountParams.none())

    /** @see count */
    fun count(params: NavigationCountParams = NavigationCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: NavigationCountParams = NavigationCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          NavigationCountParams.none(), requestOptions
        )

    /** Service operation to get a single Navigation record by its unique ID passed as a path parameter. An Navigation is an on-orbit navigation payload. */
    fun get(id: String): CompletableFuture<NavigationGetResponse> =
        get(
          id, NavigationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: NavigationGetParams = NavigationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<NavigationGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: NavigationGetParams = NavigationGetParams.none()): CompletableFuture<NavigationGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: NavigationGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<NavigationGetResponse>

    /** @see get */
    fun get(params: NavigationGetParams): CompletableFuture<NavigationGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<NavigationGetResponse> =
        get(
          id,
          NavigationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<NavigationQueryhelpResponse> = queryhelp(NavigationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: NavigationQueryhelpParams = NavigationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<NavigationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: NavigationQueryhelpParams = NavigationQueryhelpParams.none()): CompletableFuture<NavigationQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<NavigationQueryhelpResponse> =
        queryhelp(
          NavigationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: NavigationTupleParams): CompletableFuture<List<NavigationTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: NavigationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<NavigationTupleResponse>>

    /** A view of [NavigationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/navigation`, but is otherwise the same as [NavigationServiceAsync.create]. */
        fun create(params: NavigationCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: NavigationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/navigation/{id}`, but is otherwise the same as [NavigationServiceAsync.update]. */
        fun update(pathId: String, params: NavigationUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: NavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: NavigationUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: NavigationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/navigation`, but is otherwise the same as [NavigationServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<NavigationListPageAsync>> = list(NavigationListParams.none())

        /** @see list */
        fun list(params: NavigationListParams = NavigationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<NavigationListPageAsync>>

        /** @see list */
        fun list(params: NavigationListParams = NavigationListParams.none()): CompletableFuture<HttpResponseFor<NavigationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<NavigationListPageAsync>> =
            list(
              NavigationListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/navigation/{id}`, but is otherwise the same as [NavigationServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, NavigationDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: NavigationDeleteParams = NavigationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: NavigationDeleteParams = NavigationDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: NavigationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NavigationDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              NavigationDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/navigation/count`, but is otherwise the same as [NavigationServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(NavigationCountParams.none())

        /** @see count */
        fun count(params: NavigationCountParams = NavigationCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: NavigationCountParams = NavigationCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              NavigationCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/navigation/{id}`, but is otherwise the same as [NavigationServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<NavigationGetResponse>> =
            get(
              id, NavigationGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: NavigationGetParams = NavigationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<NavigationGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: NavigationGetParams = NavigationGetParams.none()): CompletableFuture<HttpResponseFor<NavigationGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: NavigationGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<NavigationGetResponse>>

        /** @see get */
        fun get(params: NavigationGetParams): CompletableFuture<HttpResponseFor<NavigationGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<NavigationGetResponse>> =
            get(
              id,
              NavigationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/navigation/queryhelp`, but is otherwise the same as [NavigationServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<NavigationQueryhelpResponse>> = queryhelp(NavigationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: NavigationQueryhelpParams = NavigationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<NavigationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: NavigationQueryhelpParams = NavigationQueryhelpParams.none()): CompletableFuture<HttpResponseFor<NavigationQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<NavigationQueryhelpResponse>> =
            queryhelp(
              NavigationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/navigation/tuple`, but is otherwise the same as [NavigationServiceAsync.tuple]. */
        fun tuple(params: NavigationTupleParams): CompletableFuture<HttpResponseFor<List<NavigationTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: NavigationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<NavigationTupleResponse>>>
    }
}
