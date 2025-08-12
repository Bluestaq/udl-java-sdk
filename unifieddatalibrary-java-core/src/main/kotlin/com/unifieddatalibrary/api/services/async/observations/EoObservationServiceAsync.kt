// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EoObservationFull
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCountParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCreateParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationListPageAsync
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationListParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationRetrieveParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationTupleParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.observations.EoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.observations.eoobservations.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EoObservationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EoObservationServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single EO observation as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: EoObservationCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EoObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single EO observation by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<EoObservationFull> =
        retrieve(
          id, EoObservationRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EoObservationFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none()): CompletableFuture<EoObservationFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EoObservationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EoObservationFull>

    /** @see retrieve */
    fun retrieve(params: EoObservationRetrieveParams): CompletableFuture<EoObservationFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EoObservationFull> =
        retrieve(
          id,
          EoObservationRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: EoObservationListParams): CompletableFuture<EoObservationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: EoObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EoObservationListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: EoObservationCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: EoObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of EO observations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EoObservationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EoObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<EoObservationQueryhelpResponse> = queryhelp(EoObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EoObservationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none()): CompletableFuture<EoObservationQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<EoObservationQueryhelpResponse> =
        queryhelp(
          EoObservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EoObservationTupleParams): CompletableFuture<List<EoObservationFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EoObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<EoObservationFull>>

    /** Service operation to take multiple EO observations as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [EoObservationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EoObservationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/eoobservation`, but is otherwise the same as [EoObservationServiceAsync.create]. */
        fun create(params: EoObservationCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: EoObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/eoobservation/{id}`, but is otherwise the same as [EoObservationServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EoObservationFull>> =
            retrieve(
              id, EoObservationRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EoObservationFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none()): CompletableFuture<HttpResponseFor<EoObservationFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: EoObservationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EoObservationFull>>

        /** @see retrieve */
        fun retrieve(params: EoObservationRetrieveParams): CompletableFuture<HttpResponseFor<EoObservationFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EoObservationFull>> =
            retrieve(
              id,
              EoObservationRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/eoobservation`, but is otherwise the same as [EoObservationServiceAsync.list]. */
        fun list(params: EoObservationListParams): CompletableFuture<HttpResponseFor<EoObservationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: EoObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EoObservationListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/eoobservation/count`, but is otherwise the same as [EoObservationServiceAsync.count]. */
        fun count(params: EoObservationCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: EoObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/eoobservation/createBulk`, but is otherwise the same as [EoObservationServiceAsync.createBulk]. */
        fun createBulk(params: EoObservationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: EoObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/eoobservation/queryhelp`, but is otherwise the same as [EoObservationServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<EoObservationQueryhelpResponse>> = queryhelp(EoObservationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EoObservationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none()): CompletableFuture<HttpResponseFor<EoObservationQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EoObservationQueryhelpResponse>> =
            queryhelp(
              EoObservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/eoobservation/tuple`, but is otherwise the same as [EoObservationServiceAsync.tuple]. */
        fun tuple(params: EoObservationTupleParams): CompletableFuture<HttpResponseFor<List<EoObservationFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: EoObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<EoObservationFull>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-eo`, but is otherwise the same as [EoObservationServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
