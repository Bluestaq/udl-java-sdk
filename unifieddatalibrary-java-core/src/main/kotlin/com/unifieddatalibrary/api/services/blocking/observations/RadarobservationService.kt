// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCountParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCreateParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationGetParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationGetResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationListPage
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationListParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationTupleParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationTupleResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.RadarobservationService
import com.unifieddatalibrary.api.services.blocking.observations.radarobservation.HistoryService
import java.util.function.Consumer

interface RadarobservationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RadarobservationService

    fun history(): HistoryService

    /** Service operation to take a single radar observation as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: RadarobservationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RadarobservationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: RadarobservationListParams): RadarobservationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: RadarobservationListParams, requestOptions: RequestOptions = RequestOptions.none()): RadarobservationListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: RadarobservationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: RadarobservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of radar observations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: RadarobservationCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: RadarobservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single radar observations by its unique ID passed as a path parameter. */
    fun get(id: String): RadarobservationGetResponse =
        get(
          id, RadarobservationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: RadarobservationGetParams = RadarobservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RadarobservationGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: RadarobservationGetParams = RadarobservationGetParams.none()): RadarobservationGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: RadarobservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): RadarobservationGetResponse

    /** @see get */
    fun get(params: RadarobservationGetParams): RadarobservationGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): RadarobservationGetResponse =
        get(
          id,
          RadarobservationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): RadarobservationQueryhelpResponse = queryhelp(RadarobservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: RadarobservationQueryhelpParams = RadarobservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RadarobservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: RadarobservationQueryhelpParams = RadarobservationQueryhelpParams.none()): RadarobservationQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): RadarobservationQueryhelpResponse =
        queryhelp(
          RadarobservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RadarobservationTupleParams): List<RadarobservationTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RadarobservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<RadarobservationTupleResponse>

    /** Service operation to take multiple radar observations as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: RadarobservationUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: RadarobservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [RadarobservationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RadarobservationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/radarobservation`, but is otherwise the same as [RadarobservationService.create]. */
        @MustBeClosed
        fun create(params: RadarobservationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: RadarobservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/radarobservation`, but is otherwise the same as [RadarobservationService.list]. */
        @MustBeClosed
        fun list(params: RadarobservationListParams): HttpResponseFor<RadarobservationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: RadarobservationListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RadarobservationListPage>

        /** Returns a raw HTTP response for `get /udl/radarobservation/count`, but is otherwise the same as [RadarobservationService.count]. */
        @MustBeClosed
        fun count(params: RadarobservationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: RadarobservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/radarobservation/createBulk`, but is otherwise the same as [RadarobservationService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: RadarobservationCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: RadarobservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/radarobservation/{id}`, but is otherwise the same as [RadarobservationService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<RadarobservationGetResponse> =
            get(
              id, RadarobservationGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RadarobservationGetParams = RadarobservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RadarobservationGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RadarobservationGetParams = RadarobservationGetParams.none()): HttpResponseFor<RadarobservationGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: RadarobservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RadarobservationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: RadarobservationGetParams): HttpResponseFor<RadarobservationGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<RadarobservationGetResponse> =
            get(
              id,
              RadarobservationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/radarobservation/queryhelp`, but is otherwise the same as [RadarobservationService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<RadarobservationQueryhelpResponse> = queryhelp(RadarobservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RadarobservationQueryhelpParams = RadarobservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RadarobservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RadarobservationQueryhelpParams = RadarobservationQueryhelpParams.none()): HttpResponseFor<RadarobservationQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<RadarobservationQueryhelpResponse> =
            queryhelp(
              RadarobservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/radarobservation/tuple`, but is otherwise the same as [RadarobservationService.tuple]. */
        @MustBeClosed
        fun tuple(params: RadarobservationTupleParams): HttpResponseFor<List<RadarobservationTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: RadarobservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<RadarobservationTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-radar`, but is otherwise the same as [RadarobservationService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: RadarobservationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: RadarobservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
