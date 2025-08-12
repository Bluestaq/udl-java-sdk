// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCountParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCreateBulkParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCreateParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportGetParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportGetResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListPageAsync
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportQueryhelpParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportQueryhelpResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportUpdateParams
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsync
import com.unifieddatalibrary.api.services.async.logisticssupport.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LogisticsSupportServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogisticsSupportServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single LogisticsSupport record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: LogisticsSupportCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: LogisticsSupportCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single LogisticsSupport record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: LogisticsSupportUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: LogisticsSupportUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: LogisticsSupportUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: LogisticsSupportUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<LogisticsSupportListPageAsync> = list(LogisticsSupportListParams.none())

    /** @see list */
    fun list(params: LogisticsSupportListParams = LogisticsSupportListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LogisticsSupportListPageAsync>

    /** @see list */
    fun list(params: LogisticsSupportListParams = LogisticsSupportListParams.none()): CompletableFuture<LogisticsSupportListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LogisticsSupportListPageAsync> =
        list(
          LogisticsSupportListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(LogisticsSupportCountParams.none())

    /** @see count */
    fun count(params: LogisticsSupportCountParams = LogisticsSupportCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: LogisticsSupportCountParams = LogisticsSupportCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          LogisticsSupportCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of LogisticsSupport records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: LogisticsSupportCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: LogisticsSupportCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single LogisticsSupport record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<LogisticsSupportGetResponse> =
        get(
          id, LogisticsSupportGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: LogisticsSupportGetParams = LogisticsSupportGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LogisticsSupportGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: LogisticsSupportGetParams = LogisticsSupportGetParams.none()): CompletableFuture<LogisticsSupportGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: LogisticsSupportGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LogisticsSupportGetResponse>

    /** @see get */
    fun get(params: LogisticsSupportGetParams): CompletableFuture<LogisticsSupportGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<LogisticsSupportGetResponse> =
        get(
          id,
          LogisticsSupportGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<LogisticsSupportQueryhelpResponse> = queryhelp(LogisticsSupportQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LogisticsSupportQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none()): CompletableFuture<LogisticsSupportQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<LogisticsSupportQueryhelpResponse> =
        queryhelp(
          LogisticsSupportQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: LogisticsSupportTupleParams): CompletableFuture<List<LogisticsSupportTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: LogisticsSupportTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<LogisticsSupportTupleResponse>>

    /** Service operation to take multiple logisticssupport records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: LogisticsSupportUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: LogisticsSupportUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [LogisticsSupportServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogisticsSupportServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/logisticssupport`, but is otherwise the same as [LogisticsSupportServiceAsync.create]. */
        fun create(params: LogisticsSupportCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: LogisticsSupportCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/logisticssupport/{id}`, but is otherwise the same as [LogisticsSupportServiceAsync.update]. */
        fun update(pathId: String, params: LogisticsSupportUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: LogisticsSupportUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: LogisticsSupportUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: LogisticsSupportUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/logisticssupport`, but is otherwise the same as [LogisticsSupportServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<LogisticsSupportListPageAsync>> = list(LogisticsSupportListParams.none())

        /** @see list */
        fun list(params: LogisticsSupportListParams = LogisticsSupportListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LogisticsSupportListPageAsync>>

        /** @see list */
        fun list(params: LogisticsSupportListParams = LogisticsSupportListParams.none()): CompletableFuture<HttpResponseFor<LogisticsSupportListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LogisticsSupportListPageAsync>> =
            list(
              LogisticsSupportListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/logisticssupport/count`, but is otherwise the same as [LogisticsSupportServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(LogisticsSupportCountParams.none())

        /** @see count */
        fun count(params: LogisticsSupportCountParams = LogisticsSupportCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: LogisticsSupportCountParams = LogisticsSupportCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              LogisticsSupportCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/logisticssupport/createBulk`, but is otherwise the same as [LogisticsSupportServiceAsync.createBulk]. */
        fun createBulk(params: LogisticsSupportCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: LogisticsSupportCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/logisticssupport/{id}`, but is otherwise the same as [LogisticsSupportServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<LogisticsSupportGetResponse>> =
            get(
              id, LogisticsSupportGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: LogisticsSupportGetParams = LogisticsSupportGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LogisticsSupportGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: LogisticsSupportGetParams = LogisticsSupportGetParams.none()): CompletableFuture<HttpResponseFor<LogisticsSupportGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: LogisticsSupportGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LogisticsSupportGetResponse>>

        /** @see get */
        fun get(params: LogisticsSupportGetParams): CompletableFuture<HttpResponseFor<LogisticsSupportGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LogisticsSupportGetResponse>> =
            get(
              id,
              LogisticsSupportGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/logisticssupport/queryhelp`, but is otherwise the same as [LogisticsSupportServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LogisticsSupportQueryhelpResponse>> = queryhelp(LogisticsSupportQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LogisticsSupportQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none()): CompletableFuture<HttpResponseFor<LogisticsSupportQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LogisticsSupportQueryhelpResponse>> =
            queryhelp(
              LogisticsSupportQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/logisticssupport/tuple`, but is otherwise the same as [LogisticsSupportServiceAsync.tuple]. */
        fun tuple(params: LogisticsSupportTupleParams): CompletableFuture<HttpResponseFor<List<LogisticsSupportTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: LogisticsSupportTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<LogisticsSupportTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-logisticssupport`, but is otherwise the same as [LogisticsSupportServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: LogisticsSupportUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: LogisticsSupportUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
