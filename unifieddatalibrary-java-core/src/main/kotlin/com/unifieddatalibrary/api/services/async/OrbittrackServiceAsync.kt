// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCountParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCreateBulkParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListPageAsync
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import com.unifieddatalibrary.api.services.async.orbittrack.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrbittrackServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: OrbittrackListParams): CompletableFuture<OrbittrackListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: OrbittrackListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OrbittrackListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: OrbittrackCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: OrbittrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of orbit track records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OrbittrackCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<OrbittrackQueryhelpResponse> = queryhelp(OrbittrackQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OrbittrackQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none()): CompletableFuture<OrbittrackQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<OrbittrackQueryhelpResponse> =
        queryhelp(
          OrbittrackQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OrbittrackTupleParams): CompletableFuture<List<OrbittrackTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OrbittrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<OrbittrackTupleResponse>>

    /** Service operation to take multiple orbit track records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [OrbittrackServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/orbittrack`, but is otherwise the same as [OrbittrackServiceAsync.list]. */
        fun list(params: OrbittrackListParams): CompletableFuture<HttpResponseFor<OrbittrackListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: OrbittrackListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OrbittrackListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/orbittrack/count`, but is otherwise the same as [OrbittrackServiceAsync.count]. */
        fun count(params: OrbittrackCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: OrbittrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/orbittrack/createBulk`, but is otherwise the same as [OrbittrackServiceAsync.createBulk]. */
        fun createBulk(params: OrbittrackCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/orbittrack/queryhelp`, but is otherwise the same as [OrbittrackServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OrbittrackQueryhelpResponse>> = queryhelp(OrbittrackQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OrbittrackQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none()): CompletableFuture<HttpResponseFor<OrbittrackQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrbittrackQueryhelpResponse>> =
            queryhelp(
              OrbittrackQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/orbittrack/tuple`, but is otherwise the same as [OrbittrackServiceAsync.tuple]. */
        fun tuple(params: OrbittrackTupleParams): CompletableFuture<HttpResponseFor<List<OrbittrackTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: OrbittrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<OrbittrackTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-orbittrack`, but is otherwise the same as [OrbittrackServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
