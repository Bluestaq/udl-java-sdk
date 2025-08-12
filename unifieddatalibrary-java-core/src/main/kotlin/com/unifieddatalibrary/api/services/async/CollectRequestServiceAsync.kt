// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CollectRequestFull
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCountParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCreateBulkParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCreateParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListPageAsync
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestQueryHelpParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestQueryHelpResponse
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestRetrieveParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestTupleParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.collectrequests.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CollectRequestServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectRequestServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single CollectRequest as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: CollectRequestCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: CollectRequestCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single CollectRequest by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<CollectRequestFull> =
        retrieve(
          id, CollectRequestRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectRequestFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none()): CompletableFuture<CollectRequestFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: CollectRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectRequestFull>

    /** @see retrieve */
    fun retrieve(params: CollectRequestRetrieveParams): CompletableFuture<CollectRequestFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CollectRequestFull> =
        retrieve(
          id,
          CollectRequestRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: CollectRequestListParams): CompletableFuture<CollectRequestListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: CollectRequestListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectRequestListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: CollectRequestCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: CollectRequestCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of CollectRequest as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: CollectRequestCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: CollectRequestCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<CollectRequestQueryHelpResponse> = queryHelp(CollectRequestQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CollectRequestQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none()): CompletableFuture<CollectRequestQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<CollectRequestQueryHelpResponse> =
        queryHelp(
          CollectRequestQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: CollectRequestTupleParams): CompletableFuture<List<CollectRequestFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: CollectRequestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<CollectRequestFull>>

    /** Service operation to take a list of CollectRequest as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [CollectRequestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectRequestServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/collectrequest`, but is otherwise the same as [CollectRequestServiceAsync.create]. */
        fun create(params: CollectRequestCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: CollectRequestCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/collectrequest/{id}`, but is otherwise the same as [CollectRequestServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CollectRequestFull>> =
            retrieve(
              id, CollectRequestRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectRequestFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none()): CompletableFuture<HttpResponseFor<CollectRequestFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: CollectRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectRequestFull>>

        /** @see retrieve */
        fun retrieve(params: CollectRequestRetrieveParams): CompletableFuture<HttpResponseFor<CollectRequestFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectRequestFull>> =
            retrieve(
              id,
              CollectRequestRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/collectrequest`, but is otherwise the same as [CollectRequestServiceAsync.list]. */
        fun list(params: CollectRequestListParams): CompletableFuture<HttpResponseFor<CollectRequestListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: CollectRequestListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectRequestListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/collectrequest/count`, but is otherwise the same as [CollectRequestServiceAsync.count]. */
        fun count(params: CollectRequestCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: CollectRequestCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/collectrequest/createBulk`, but is otherwise the same as [CollectRequestServiceAsync.createBulk]. */
        fun createBulk(params: CollectRequestCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: CollectRequestCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/collectrequest/queryhelp`, but is otherwise the same as [CollectRequestServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<CollectRequestQueryHelpResponse>> = queryHelp(CollectRequestQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CollectRequestQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none()): CompletableFuture<HttpResponseFor<CollectRequestQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectRequestQueryHelpResponse>> =
            queryHelp(
              CollectRequestQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/collectrequest/tuple`, but is otherwise the same as [CollectRequestServiceAsync.tuple]. */
        fun tuple(params: CollectRequestTupleParams): CompletableFuture<HttpResponseFor<List<CollectRequestFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: CollectRequestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<CollectRequestFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-collectrequest`, but is otherwise the same as [CollectRequestServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
