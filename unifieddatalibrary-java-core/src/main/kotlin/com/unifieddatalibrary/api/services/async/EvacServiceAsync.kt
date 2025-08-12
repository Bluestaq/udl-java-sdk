// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EvacFull
import com.unifieddatalibrary.api.models.evac.EvacCountParams
import com.unifieddatalibrary.api.models.evac.EvacCreateBulkParams
import com.unifieddatalibrary.api.models.evac.EvacCreateParams
import com.unifieddatalibrary.api.models.evac.EvacListPageAsync
import com.unifieddatalibrary.api.models.evac.EvacListParams
import com.unifieddatalibrary.api.models.evac.EvacQueryHelpParams
import com.unifieddatalibrary.api.models.evac.EvacQueryHelpResponse
import com.unifieddatalibrary.api.models.evac.EvacRetrieveParams
import com.unifieddatalibrary.api.models.evac.EvacUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.EvacServiceAsync
import com.unifieddatalibrary.api.services.async.evac.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.evac.TupleServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EvacServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvacServiceAsync

    fun history(): HistoryServiceAsync

    fun tuple(): TupleServiceAsync

    /** Service operation to take a single evac as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: EvacCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EvacCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single Evac by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<EvacFull> =
        retrieve(
          id, EvacRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EvacRetrieveParams = EvacRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EvacFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EvacRetrieveParams = EvacRetrieveParams.none()): CompletableFuture<EvacFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EvacRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EvacFull>

    /** @see retrieve */
    fun retrieve(params: EvacRetrieveParams): CompletableFuture<EvacFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EvacFull> =
        retrieve(
          id,
          EvacRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: EvacListParams): CompletableFuture<EvacListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: EvacListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EvacListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: EvacCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: EvacCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of Evac records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EvacCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EvacCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<EvacQueryHelpResponse> = queryHelp(EvacQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: EvacQueryHelpParams = EvacQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EvacQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: EvacQueryHelpParams = EvacQueryHelpParams.none()): CompletableFuture<EvacQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<EvacQueryHelpResponse> =
        queryHelp(
          EvacQueryHelpParams.none(), requestOptions
        )

    /** Service operation to take a list of Evac events as a POST body and ingest into the database. Requires a specific role, please contact the UDL team to gain access. This operation is intended to be used for automated feeds into UDL. */
    fun unvalidatedPublish(params: EvacUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: EvacUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [EvacServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvacServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        fun tuple(): TupleServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/evac`, but is otherwise the same as [EvacServiceAsync.create]. */
        fun create(params: EvacCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: EvacCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/evac/{id}`, but is otherwise the same as [EvacServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EvacFull>> =
            retrieve(
              id, EvacRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EvacRetrieveParams = EvacRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EvacFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EvacRetrieveParams = EvacRetrieveParams.none()): CompletableFuture<HttpResponseFor<EvacFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: EvacRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EvacFull>>

        /** @see retrieve */
        fun retrieve(params: EvacRetrieveParams): CompletableFuture<HttpResponseFor<EvacFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EvacFull>> =
            retrieve(
              id,
              EvacRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/evac`, but is otherwise the same as [EvacServiceAsync.list]. */
        fun list(params: EvacListParams): CompletableFuture<HttpResponseFor<EvacListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: EvacListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EvacListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/evac/count`, but is otherwise the same as [EvacServiceAsync.count]. */
        fun count(params: EvacCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: EvacCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/evac/createBulk`, but is otherwise the same as [EvacServiceAsync.createBulk]. */
        fun createBulk(params: EvacCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: EvacCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/evac/queryhelp`, but is otherwise the same as [EvacServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EvacQueryHelpResponse>> = queryHelp(EvacQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: EvacQueryHelpParams = EvacQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EvacQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: EvacQueryHelpParams = EvacQueryHelpParams.none()): CompletableFuture<HttpResponseFor<EvacQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EvacQueryHelpResponse>> =
            queryHelp(
              EvacQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /filedrop/udl-evac`, but is otherwise the same as [EvacServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: EvacUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: EvacUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
