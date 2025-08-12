// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCountParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateBulkParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogDeleteParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListPageAsync
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogQueryhelpParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogQueryhelpResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUpdateParams
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsync
import com.unifieddatalibrary.api.services.async.starcatalog.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StarCatalogServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StarCatalogServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single StarCatalog record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: StarCatalogCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: StarCatalogCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single starcatalog record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: StarCatalogUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: StarCatalogUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<StarCatalogListPageAsync> = list(StarCatalogListParams.none())

    /** @see list */
    fun list(params: StarCatalogListParams = StarCatalogListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StarCatalogListPageAsync>

    /** @see list */
    fun list(params: StarCatalogListParams = StarCatalogListParams.none()): CompletableFuture<StarCatalogListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<StarCatalogListPageAsync> =
        list(
          StarCatalogListParams.none(), requestOptions
        )

    /** Service operation to delete a dataset specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, StarCatalogDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: StarCatalogDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: StarCatalogDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          StarCatalogDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(StarCatalogCountParams.none())

    /** @see count */
    fun count(params: StarCatalogCountParams = StarCatalogCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: StarCatalogCountParams = StarCatalogCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          StarCatalogCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of StarCatalog records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: StarCatalogCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: StarCatalogCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single StarCatalog record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<StarCatalogGetResponse> =
        get(
          id, StarCatalogGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StarCatalogGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none()): CompletableFuture<StarCatalogGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: StarCatalogGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StarCatalogGetResponse>

    /** @see get */
    fun get(params: StarCatalogGetParams): CompletableFuture<StarCatalogGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<StarCatalogGetResponse> =
        get(
          id,
          StarCatalogGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<StarCatalogQueryhelpResponse> = queryhelp(StarCatalogQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<StarCatalogQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none()): CompletableFuture<StarCatalogQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<StarCatalogQueryhelpResponse> =
        queryhelp(
          StarCatalogQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: StarCatalogTupleParams): CompletableFuture<List<StarCatalogTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: StarCatalogTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<StarCatalogTupleResponse>>

    /** Service operation to take multiple StarCatalog records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [StarCatalogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StarCatalogServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/starcatalog`, but is otherwise the same as [StarCatalogServiceAsync.create]. */
        fun create(params: StarCatalogCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: StarCatalogCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/starcatalog/{id}`, but is otherwise the same as [StarCatalogServiceAsync.update]. */
        fun update(pathId: String, params: StarCatalogUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: StarCatalogUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: StarCatalogUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/starcatalog`, but is otherwise the same as [StarCatalogServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<StarCatalogListPageAsync>> = list(StarCatalogListParams.none())

        /** @see list */
        fun list(params: StarCatalogListParams = StarCatalogListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StarCatalogListPageAsync>>

        /** @see list */
        fun list(params: StarCatalogListParams = StarCatalogListParams.none()): CompletableFuture<HttpResponseFor<StarCatalogListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StarCatalogListPageAsync>> =
            list(
              StarCatalogListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/starcatalog/{id}`, but is otherwise the same as [StarCatalogServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, StarCatalogDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: StarCatalogDeleteParams = StarCatalogDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: StarCatalogDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: StarCatalogDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              StarCatalogDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/starcatalog/count`, but is otherwise the same as [StarCatalogServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(StarCatalogCountParams.none())

        /** @see count */
        fun count(params: StarCatalogCountParams = StarCatalogCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: StarCatalogCountParams = StarCatalogCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              StarCatalogCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/starcatalog/createBulk`, but is otherwise the same as [StarCatalogServiceAsync.createBulk]. */
        fun createBulk(params: StarCatalogCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: StarCatalogCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/starcatalog/{id}`, but is otherwise the same as [StarCatalogServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<StarCatalogGetResponse>> =
            get(
              id, StarCatalogGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StarCatalogGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: StarCatalogGetParams = StarCatalogGetParams.none()): CompletableFuture<HttpResponseFor<StarCatalogGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: StarCatalogGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StarCatalogGetResponse>>

        /** @see get */
        fun get(params: StarCatalogGetParams): CompletableFuture<HttpResponseFor<StarCatalogGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StarCatalogGetResponse>> =
            get(
              id,
              StarCatalogGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/starcatalog/queryhelp`, but is otherwise the same as [StarCatalogServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<StarCatalogQueryhelpResponse>> = queryhelp(StarCatalogQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<StarCatalogQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: StarCatalogQueryhelpParams = StarCatalogQueryhelpParams.none()): CompletableFuture<HttpResponseFor<StarCatalogQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StarCatalogQueryhelpResponse>> =
            queryhelp(
              StarCatalogQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/starcatalog/tuple`, but is otherwise the same as [StarCatalogServiceAsync.tuple]. */
        fun tuple(params: StarCatalogTupleParams): CompletableFuture<HttpResponseFor<List<StarCatalogTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: StarCatalogTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<StarCatalogTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-starcatalog`, but is otherwise the same as [StarCatalogServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: StarCatalogUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
