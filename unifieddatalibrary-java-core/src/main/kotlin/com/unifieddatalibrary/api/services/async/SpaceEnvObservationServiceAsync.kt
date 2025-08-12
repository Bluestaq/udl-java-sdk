// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCountParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCreateBulkParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListPageAsync
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationTupleParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.spaceenvobservation.history.SpaceEnvObservationFull
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import com.unifieddatalibrary.api.services.async.spaceenvobservation.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpaceEnvObservationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SpaceEnvObservationListParams): CompletableFuture<SpaceEnvObservationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SpaceEnvObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpaceEnvObservationListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SpaceEnvObservationCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SpaceEnvObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of SpaceEnvObservation records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: SpaceEnvObservationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: SpaceEnvObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SpaceEnvObservationQueryhelpResponse> = queryhelp(SpaceEnvObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpaceEnvObservationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none()): CompletableFuture<SpaceEnvObservationQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SpaceEnvObservationQueryhelpResponse> =
        queryhelp(
          SpaceEnvObservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SpaceEnvObservationTupleParams): CompletableFuture<List<SpaceEnvObservationFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SpaceEnvObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SpaceEnvObservationFull>>

    /** Service operation to accept one or more SpaceEnvObservation(s) as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [SpaceEnvObservationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/spaceenvobservation`, but is otherwise the same as [SpaceEnvObservationServiceAsync.list]. */
        fun list(params: SpaceEnvObservationListParams): CompletableFuture<HttpResponseFor<SpaceEnvObservationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: SpaceEnvObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpaceEnvObservationListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/spaceenvobservation/count`, but is otherwise the same as [SpaceEnvObservationServiceAsync.count]. */
        fun count(params: SpaceEnvObservationCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: SpaceEnvObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/spaceenvobservation/createBulk`, but is otherwise the same as [SpaceEnvObservationServiceAsync.createBulk]. */
        fun createBulk(params: SpaceEnvObservationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: SpaceEnvObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/spaceenvobservation/queryhelp`, but is otherwise the same as [SpaceEnvObservationServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SpaceEnvObservationQueryhelpResponse>> = queryhelp(SpaceEnvObservationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpaceEnvObservationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SpaceEnvObservationQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SpaceEnvObservationQueryhelpResponse>> =
            queryhelp(
              SpaceEnvObservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/spaceenvobservation/tuple`, but is otherwise the same as [SpaceEnvObservationServiceAsync.tuple]. */
        fun tuple(params: SpaceEnvObservationTupleParams): CompletableFuture<HttpResponseFor<List<SpaceEnvObservationFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SpaceEnvObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SpaceEnvObservationFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-spaceenvobs`, but is otherwise the same as [SpaceEnvObservationServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
