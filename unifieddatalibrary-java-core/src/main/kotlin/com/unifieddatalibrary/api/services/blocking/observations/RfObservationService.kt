// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCountParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCreateParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationGetParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationGetResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListPage
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationTupleParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationTupleResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationService
import com.unifieddatalibrary.api.services.blocking.observations.rfobservation.HistoryService
import java.util.function.Consumer

interface RfObservationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfObservationService

    fun history(): HistoryService

    /** Service operation to take a single RF observation as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: RfObservationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: RfObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: RfObservationListParams): RfObservationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: RfObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): RfObservationListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: RfObservationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: RfObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of RF observations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: RfObservationCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: RfObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single RF observation by its unique ID passed as a path parameter. */
    fun get(id: String): RfObservationGetResponse =
        get(
          id, RfObservationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: RfObservationGetParams = RfObservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfObservationGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: RfObservationGetParams = RfObservationGetParams.none()): RfObservationGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: RfObservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): RfObservationGetResponse

    /** @see get */
    fun get(params: RfObservationGetParams): RfObservationGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): RfObservationGetResponse =
        get(
          id,
          RfObservationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): RfObservationQueryhelpResponse = queryhelp(RfObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RfObservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none()): RfObservationQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): RfObservationQueryhelpResponse =
        queryhelp(
          RfObservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: RfObservationTupleParams): List<RfObservationTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: RfObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<RfObservationTupleResponse>

    /** Service operation to take multiple RF observations as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: RfObservationUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: RfObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [RfObservationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfObservationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/rfobservation`, but is otherwise the same as [RfObservationService.create]. */
        @MustBeClosed
        fun create(params: RfObservationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: RfObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/rfobservation`, but is otherwise the same as [RfObservationService.list]. */
        @MustBeClosed
        fun list(params: RfObservationListParams): HttpResponseFor<RfObservationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: RfObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfObservationListPage>

        /** Returns a raw HTTP response for `get /udl/rfobservation/count`, but is otherwise the same as [RfObservationService.count]. */
        @MustBeClosed
        fun count(params: RfObservationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: RfObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/rfobservation/createBulk`, but is otherwise the same as [RfObservationService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: RfObservationCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: RfObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/rfobservation/{id}`, but is otherwise the same as [RfObservationService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<RfObservationGetResponse> =
            get(
              id, RfObservationGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfObservationGetParams = RfObservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfObservationGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: RfObservationGetParams = RfObservationGetParams.none()): HttpResponseFor<RfObservationGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: RfObservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfObservationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: RfObservationGetParams): HttpResponseFor<RfObservationGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<RfObservationGetResponse> =
            get(
              id,
              RfObservationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/rfobservation/queryhelp`, but is otherwise the same as [RfObservationService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<RfObservationQueryhelpResponse> = queryhelp(RfObservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RfObservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: RfObservationQueryhelpParams = RfObservationQueryhelpParams.none()): HttpResponseFor<RfObservationQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<RfObservationQueryhelpResponse> =
            queryhelp(
              RfObservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/rfobservation/tuple`, but is otherwise the same as [RfObservationService.tuple]. */
        @MustBeClosed
        fun tuple(params: RfObservationTupleParams): HttpResponseFor<List<RfObservationTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: RfObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<RfObservationTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-rf`, but is otherwise the same as [RfObservationService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: RfObservationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: RfObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
