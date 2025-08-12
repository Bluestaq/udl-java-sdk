// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCountParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCreateBulkParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCreateParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationGetParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationGetResponse
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListPage
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationQueryhelpParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.sarobservation.SarObservationTupleParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationTupleResponse
import com.unifieddatalibrary.api.models.sarobservation.SarObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.SarObservationService
import com.unifieddatalibrary.api.services.blocking.sarobservation.HistoryService
import java.util.function.Consumer

interface SarObservationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SarObservationService

    fun history(): HistoryService

    /** Service operation to take a single SAR observation as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: SarObservationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: SarObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: SarObservationListParams): SarObservationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: SarObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): SarObservationListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: SarObservationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: SarObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of SAR observations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: SarObservationCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: SarObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single SAR observations by its unique ID passed as a path parameter. */
    fun get(id: String): SarObservationGetResponse =
        get(
          id, SarObservationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SarObservationGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none()): SarObservationGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: SarObservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): SarObservationGetResponse

    /** @see get */
    fun get(params: SarObservationGetParams): SarObservationGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SarObservationGetResponse =
        get(
          id,
          SarObservationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): SarObservationQueryhelpResponse = queryhelp(SarObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SarObservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none()): SarObservationQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SarObservationQueryhelpResponse =
        queryhelp(
          SarObservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: SarObservationTupleParams): List<SarObservationTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: SarObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<SarObservationTupleResponse>

    /** Service operation to take SAR observations as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SarObservationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SarObservationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/sarobservation`, but is otherwise the same as [SarObservationService.create]. */
        @MustBeClosed
        fun create(params: SarObservationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: SarObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sarobservation`, but is otherwise the same as [SarObservationService.list]. */
        @MustBeClosed
        fun list(params: SarObservationListParams): HttpResponseFor<SarObservationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: SarObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SarObservationListPage>

        /** Returns a raw HTTP response for `get /udl/sarobservation/count`, but is otherwise the same as [SarObservationService.count]. */
        @MustBeClosed
        fun count(params: SarObservationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: SarObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/sarobservation/createBulk`, but is otherwise the same as [SarObservationService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: SarObservationCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: SarObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/sarobservation/{id}`, but is otherwise the same as [SarObservationService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SarObservationGetResponse> =
            get(
              id, SarObservationGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SarObservationGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: SarObservationGetParams = SarObservationGetParams.none()): HttpResponseFor<SarObservationGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: SarObservationGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SarObservationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SarObservationGetParams): HttpResponseFor<SarObservationGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SarObservationGetResponse> =
            get(
              id,
              SarObservationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/sarobservation/queryhelp`, but is otherwise the same as [SarObservationService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SarObservationQueryhelpResponse> = queryhelp(SarObservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SarObservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: SarObservationQueryhelpParams = SarObservationQueryhelpParams.none()): HttpResponseFor<SarObservationQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SarObservationQueryhelpResponse> =
            queryhelp(
              SarObservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/sarobservation/tuple`, but is otherwise the same as [SarObservationService.tuple]. */
        @MustBeClosed
        fun tuple(params: SarObservationTupleParams): HttpResponseFor<List<SarObservationTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: SarObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<SarObservationTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-sar`, but is otherwise the same as [SarObservationService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: SarObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
