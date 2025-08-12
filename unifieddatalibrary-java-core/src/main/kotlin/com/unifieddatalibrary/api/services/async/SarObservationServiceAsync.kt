// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCountParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCreateBulkParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCreateParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationGetParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationGetResponse
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListPageAsync
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationQueryhelpParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.sarobservation.SarObservationTupleParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationTupleResponse
import com.unifieddatalibrary.api.models.sarobservation.SarObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.sarobservation.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SarObservationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SarObservationServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single SAR observation as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: SarObservationCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SarObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SarObservationListParams): CompletableFuture<SarObservationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SarObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SarObservationListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SarObservationCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SarObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation intended for initial integration only, to take a list of SAR observations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: SarObservationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: SarObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single SAR observations by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<SarObservationGetResponse> =
        get(
          id, SarObservationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SarObservationGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none()): CompletableFuture<SarObservationGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SarObservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SarObservationGetResponse>

    /** @see get */
    fun get(params: SarObservationGetParams): CompletableFuture<SarObservationGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SarObservationGetResponse> =
        get(
          id,
          SarObservationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<SarObservationQueryhelpResponse> = queryhelp(SarObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SarObservationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none()): CompletableFuture<SarObservationQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SarObservationQueryhelpResponse> =
        queryhelp(
          SarObservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SarObservationTupleParams): CompletableFuture<List<SarObservationTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SarObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<SarObservationTupleResponse>>

    /** Service operation to take SAR observations as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [SarObservationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SarObservationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sarobservation`, but is otherwise the same as [SarObservationServiceAsync.create]. */
        fun create(params: SarObservationCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: SarObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/sarobservation`, but is otherwise the same as [SarObservationServiceAsync.list]. */
        fun list(params: SarObservationListParams): CompletableFuture<HttpResponseFor<SarObservationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: SarObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SarObservationListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/sarobservation/count`, but is otherwise the same as [SarObservationServiceAsync.count]. */
        fun count(params: SarObservationCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: SarObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `post /udl/sarobservation/createBulk`, but is otherwise the same as [SarObservationServiceAsync.createBulk]. */
        fun createBulk(params: SarObservationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: SarObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/sarobservation/{id}`, but is otherwise the same as [SarObservationServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<SarObservationGetResponse>> =
            get(
              id, SarObservationGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SarObservationGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none()): CompletableFuture<HttpResponseFor<SarObservationGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: SarObservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SarObservationGetResponse>>

        /** @see get */
        fun get(params: SarObservationGetParams): CompletableFuture<HttpResponseFor<SarObservationGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SarObservationGetResponse>> =
            get(
              id,
              SarObservationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sarobservation/queryhelp`, but is otherwise the same as [SarObservationServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SarObservationQueryhelpResponse>> = queryhelp(SarObservationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SarObservationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none()): CompletableFuture<HttpResponseFor<SarObservationQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SarObservationQueryhelpResponse>> =
            queryhelp(
              SarObservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sarobservation/tuple`, but is otherwise the same as [SarObservationServiceAsync.tuple]. */
        fun tuple(params: SarObservationTupleParams): CompletableFuture<HttpResponseFor<List<SarObservationTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: SarObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<SarObservationTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-sar`, but is otherwise the same as [SarObservationServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
