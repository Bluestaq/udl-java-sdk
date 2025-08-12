// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CollectResponseFull
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCountParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListPageAsync
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseRetrieveParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.collectresponses.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.collectresponses.TupleServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CollectResponseServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectResponseServiceAsync

    fun history(): HistoryServiceAsync

    fun tuple(): TupleServiceAsync

    /** Service operation to take a single Collect Response object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CollectResponseCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CollectResponseCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Collect Response record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<CollectResponseFull> =
        retrieve(
          id, CollectResponseRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectResponseFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none()): CompletableFuture<CollectResponseFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CollectResponseRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectResponseFull>

    /** @see retrieve */
    fun retrieve(params: CollectResponseRetrieveParams): CompletableFuture<CollectResponseFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CollectResponseFull> =
        retrieve(
          id,
          CollectResponseRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: CollectResponseListParams): CompletableFuture<CollectResponseListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: CollectResponseListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectResponseListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: CollectResponseCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: CollectResponseCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of Collect Response objects as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: CollectResponseCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: CollectResponseCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<CollectResponseQueryHelpResponse> = queryHelp(CollectResponseQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectResponseQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none()): CompletableFuture<CollectResponseQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<CollectResponseQueryHelpResponse> =
        queryHelp(
          CollectResponseQueryHelpParams.none(), requestOptions
        )

    /** Service operation to take a list of CollectResponse as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [CollectResponseServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectResponseServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        fun tuple(): TupleServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/collectresponse`, but is otherwise the same as [CollectResponseServiceAsync.create]. */
        fun create(params: CollectResponseCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: CollectResponseCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/collectresponse/{id}`, but is otherwise the same as [CollectResponseServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CollectResponseFull>> =
            retrieve(
              id, CollectResponseRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectResponseFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none()): CompletableFuture<HttpResponseFor<CollectResponseFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: CollectResponseRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectResponseFull>>

        /** @see retrieve */
        fun retrieve(params: CollectResponseRetrieveParams): CompletableFuture<HttpResponseFor<CollectResponseFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectResponseFull>> =
            retrieve(
              id,
              CollectResponseRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/collectresponse`, but is otherwise the same as [CollectResponseServiceAsync.list]. */
        fun list(params: CollectResponseListParams): CompletableFuture<HttpResponseFor<CollectResponseListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: CollectResponseListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectResponseListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/collectresponse/count`, but is otherwise the same as [CollectResponseServiceAsync.count]. */
        fun count(params: CollectResponseCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: CollectResponseCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/collectresponse/createBulk`, but is otherwise the same as [CollectResponseServiceAsync.createBulk]. */
        fun createBulk(params: CollectResponseCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: CollectResponseCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/collectresponse/queryhelp`, but is otherwise the same as [CollectResponseServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<CollectResponseQueryHelpResponse>> = queryHelp(CollectResponseQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectResponseQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none()): CompletableFuture<HttpResponseFor<CollectResponseQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectResponseQueryHelpResponse>> =
            queryHelp(
              CollectResponseQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /filedrop/udl-collectresponse`, but is otherwise the same as [CollectResponseServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
