// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCountParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCreateParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestDeleteParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListPageAsync
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestQueryhelpParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestQueryhelpResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestUpdateParams
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ObjectOfInterestServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectOfInterestServiceAsync

    /** Service operation to take a single ObjectOfInterest as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ObjectOfInterestCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ObjectOfInterestCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single ObjectOfInterest. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: ObjectOfInterestUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ObjectOfInterestUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<ObjectOfInterestListPageAsync> = list(ObjectOfInterestListParams.none())

    /** @see list */
    fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ObjectOfInterestListPageAsync>

    /** @see list */
    fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none()): CompletableFuture<ObjectOfInterestListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ObjectOfInterestListPageAsync> =
        list(
          ObjectOfInterestListParams.none(), requestOptions
        )

    /** Service operation to delete a ObjectOfInterest object specified by the passed ID path parameter. A ObjectOfInterest is an on-orbit ObjectOfInterestunications payload, including supporting data such as transponders and channels, etc. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, ObjectOfInterestDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ObjectOfInterestDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ObjectOfInterestDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          ObjectOfInterestDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(ObjectOfInterestCountParams.none())

    /** @see count */
    fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          ObjectOfInterestCountParams.none(), requestOptions
        )

    /** Service operation to get a single ObjectOfInterest record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<ObjectOfInterestGetResponse> =
        get(
          id, ObjectOfInterestGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ObjectOfInterestGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none()): CompletableFuture<ObjectOfInterestGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ObjectOfInterestGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ObjectOfInterestGetResponse>

    /** @see get */
    fun get(params: ObjectOfInterestGetParams): CompletableFuture<ObjectOfInterestGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ObjectOfInterestGetResponse> =
        get(
          id,
          ObjectOfInterestGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<ObjectOfInterestQueryhelpResponse> = queryhelp(ObjectOfInterestQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ObjectOfInterestQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none()): CompletableFuture<ObjectOfInterestQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ObjectOfInterestQueryhelpResponse> =
        queryhelp(
          ObjectOfInterestQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ObjectOfInterestTupleParams): CompletableFuture<List<ObjectOfInterestTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ObjectOfInterestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ObjectOfInterestTupleResponse>>

    /** A view of [ObjectOfInterestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectOfInterestServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/objectofinterest`, but is otherwise the same as [ObjectOfInterestServiceAsync.create]. */
        fun create(params: ObjectOfInterestCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: ObjectOfInterestCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/objectofinterest/{id}`, but is otherwise the same as [ObjectOfInterestServiceAsync.update]. */
        fun update(pathId: String, params: ObjectOfInterestUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: ObjectOfInterestUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/objectofinterest`, but is otherwise the same as [ObjectOfInterestServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<ObjectOfInterestListPageAsync>> = list(ObjectOfInterestListParams.none())

        /** @see list */
        fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestListPageAsync>>

        /** @see list */
        fun list(params: ObjectOfInterestListParams = ObjectOfInterestListParams.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ObjectOfInterestListPageAsync>> =
            list(
              ObjectOfInterestListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/objectofinterest/{id}`, but is otherwise the same as [ObjectOfInterestServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, ObjectOfInterestDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: ObjectOfInterestDeleteParams = ObjectOfInterestDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: ObjectOfInterestDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ObjectOfInterestDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              ObjectOfInterestDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/count`, but is otherwise the same as [ObjectOfInterestServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(ObjectOfInterestCountParams.none())

        /** @see count */
        fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: ObjectOfInterestCountParams = ObjectOfInterestCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              ObjectOfInterestCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/{id}`, but is otherwise the same as [ObjectOfInterestServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<ObjectOfInterestGetResponse>> =
            get(
              id, ObjectOfInterestGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: ObjectOfInterestGetParams = ObjectOfInterestGetParams.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: ObjectOfInterestGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestGetResponse>>

        /** @see get */
        fun get(params: ObjectOfInterestGetParams): CompletableFuture<HttpResponseFor<ObjectOfInterestGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ObjectOfInterestGetResponse>> =
            get(
              id,
              ObjectOfInterestGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/queryhelp`, but is otherwise the same as [ObjectOfInterestServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ObjectOfInterestQueryhelpResponse>> = queryhelp(ObjectOfInterestQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: ObjectOfInterestQueryhelpParams = ObjectOfInterestQueryhelpParams.none()): CompletableFuture<HttpResponseFor<ObjectOfInterestQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ObjectOfInterestQueryhelpResponse>> =
            queryhelp(
              ObjectOfInterestQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/objectofinterest/tuple`, but is otherwise the same as [ObjectOfInterestServiceAsync.tuple]. */
        fun tuple(params: ObjectOfInterestTupleParams): CompletableFuture<HttpResponseFor<List<ObjectOfInterestTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: ObjectOfInterestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ObjectOfInterestTupleResponse>>>
    }
}
