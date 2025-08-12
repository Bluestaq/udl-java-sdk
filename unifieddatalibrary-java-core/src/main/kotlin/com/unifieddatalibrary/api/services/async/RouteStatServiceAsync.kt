// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.routestats.RouteStatCountParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateBulkParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateParams
import com.unifieddatalibrary.api.models.routestats.RouteStatDeleteParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryHelpParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryHelpResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveParams
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleParams
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.routestats.RouteStatUpdateParams
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RouteStatServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteStatServiceAsync

    /** Service operation to take a single routeStats record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: RouteStatCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RouteStatCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single routeStats record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<RouteStatRetrieveResponse> =
        retrieve(
          id, RouteStatRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: RouteStatRetrieveParams = RouteStatRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RouteStatRetrieveResponse> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: RouteStatRetrieveParams = RouteStatRetrieveParams.none()): CompletableFuture<RouteStatRetrieveResponse> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: RouteStatRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RouteStatRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: RouteStatRetrieveParams): CompletableFuture<RouteStatRetrieveResponse> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<RouteStatRetrieveResponse> =
        retrieve(
          id,
          RouteStatRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single RouteStats. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: RouteStatUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: RouteStatUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: RouteStatUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: RouteStatUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to delete a routeStats record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, RouteStatDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: RouteStatDeleteParams = RouteStatDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: RouteStatDeleteParams = RouteStatDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: RouteStatDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RouteStatDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          RouteStatDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(RouteStatCountParams.none())

    /** @see count */
    fun count(params: RouteStatCountParams = RouteStatCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: RouteStatCountParams = RouteStatCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          RouteStatCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of RouteStats as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: RouteStatCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: RouteStatCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(): CompletableFuture<List<RouteStatQueryResponse>> = query(RouteStatQueryParams.none())

    /** @see query */
    fun query(params: RouteStatQueryParams = RouteStatQueryParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<RouteStatQueryResponse>>

    /** @see query */
    fun query(params: RouteStatQueryParams = RouteStatQueryParams.none()): CompletableFuture<List<RouteStatQueryResponse>> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<List<RouteStatQueryResponse>> =
        query(
          RouteStatQueryParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<RouteStatQueryHelpResponse> = queryHelp(RouteStatQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<RouteStatQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none()): CompletableFuture<RouteStatQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<RouteStatQueryHelpResponse> =
        queryHelp(
          RouteStatQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RouteStatTupleParams): CompletableFuture<List<RouteStatTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RouteStatTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<RouteStatTupleResponse>>

    /** Service operation to take multiple routestats records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: RouteStatUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: RouteStatUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [RouteStatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteStatServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/routestats`, but is otherwise the same as [RouteStatServiceAsync.create]. */
        fun create(params: RouteStatCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: RouteStatCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/routestats/{id}`, but is otherwise the same as [RouteStatServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<RouteStatRetrieveResponse>> =
            retrieve(
              id, RouteStatRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: RouteStatRetrieveParams = RouteStatRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RouteStatRetrieveResponse>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: RouteStatRetrieveParams = RouteStatRetrieveParams.none()): CompletableFuture<HttpResponseFor<RouteStatRetrieveResponse>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: RouteStatRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RouteStatRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(params: RouteStatRetrieveParams): CompletableFuture<HttpResponseFor<RouteStatRetrieveResponse>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RouteStatRetrieveResponse>> =
            retrieve(
              id,
              RouteStatRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/routestats/{id}`, but is otherwise the same as [RouteStatServiceAsync.update]. */
        fun update(pathId: String, params: RouteStatUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: RouteStatUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: RouteStatUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: RouteStatUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `delete /udl/routestats/{id}`, but is otherwise the same as [RouteStatServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, RouteStatDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: RouteStatDeleteParams = RouteStatDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: RouteStatDeleteParams = RouteStatDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: RouteStatDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RouteStatDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              RouteStatDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/routestats/count`, but is otherwise the same as [RouteStatServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(RouteStatCountParams.none())

        /** @see count */
        fun count(params: RouteStatCountParams = RouteStatCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: RouteStatCountParams = RouteStatCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              RouteStatCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/routestats/createBulk`, but is otherwise the same as [RouteStatServiceAsync.createBulk]. */
        fun createBulk(params: RouteStatCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: RouteStatCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/routestats`, but is otherwise the same as [RouteStatServiceAsync.query]. */
        fun query(): CompletableFuture<HttpResponseFor<List<RouteStatQueryResponse>>> = query(RouteStatQueryParams.none())

        /** @see query */
        fun query(params: RouteStatQueryParams = RouteStatQueryParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<RouteStatQueryResponse>>>

        /** @see query */
        fun query(params: RouteStatQueryParams = RouteStatQueryParams.none()): CompletableFuture<HttpResponseFor<List<RouteStatQueryResponse>>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        fun query(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<RouteStatQueryResponse>>> =
            query(
              RouteStatQueryParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/routestats/queryhelp`, but is otherwise the same as [RouteStatServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<RouteStatQueryHelpResponse>> = queryHelp(RouteStatQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<RouteStatQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none()): CompletableFuture<HttpResponseFor<RouteStatQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RouteStatQueryHelpResponse>> =
            queryHelp(
              RouteStatQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/routestats/tuple`, but is otherwise the same as [RouteStatServiceAsync.tuple]. */
        fun tuple(params: RouteStatTupleParams): CompletableFuture<HttpResponseFor<List<RouteStatTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: RouteStatTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<RouteStatTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-routestats`, but is otherwise the same as [RouteStatServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: RouteStatUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: RouteStatUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
